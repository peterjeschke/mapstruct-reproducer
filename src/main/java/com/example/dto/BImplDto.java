package com.example.dto;


import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode( callSuper = true )
public class BImplDto extends AbstractDto {
    private String bExample;
}
