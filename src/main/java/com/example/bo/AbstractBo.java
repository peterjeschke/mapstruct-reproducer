package com.example.bo;


import lombok.Data;


@Data
public abstract class AbstractBo {
    private String myString;
    private ExampleObjectBo exampleObject;
}
