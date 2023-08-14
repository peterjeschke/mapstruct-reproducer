package com.example.bo;


import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode( callSuper = true )
public class AImplBo extends AbstractBo {
    private String aExample;
}
