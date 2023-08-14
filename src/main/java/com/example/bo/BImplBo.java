package com.example.bo;


import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode( callSuper = true )
public class BImplBo extends AbstractBo {
    private String bExample;
}
