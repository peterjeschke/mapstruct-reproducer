package com.example.dto;


import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode( callSuper = true )
public class AImplDto extends AbstractDto {
    private String aExample;
}
