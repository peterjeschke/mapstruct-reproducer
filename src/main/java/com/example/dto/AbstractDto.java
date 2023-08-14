package com.example.dto;


import lombok.Data;


@Data
public abstract class AbstractDto {
    private String myString;
    private String legacyMyString;
    private ExampleObjectDto exampleObject;
}
