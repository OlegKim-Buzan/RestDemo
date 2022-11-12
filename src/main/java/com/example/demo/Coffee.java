package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
class Coffee {
    @NonNull
    private final String id;
    private String name;

    public Coffee(String name) {
        this(UUID.randomUUID().toString(), name);
    }

}
