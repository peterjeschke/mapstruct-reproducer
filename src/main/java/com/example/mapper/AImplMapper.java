package com.example.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.bo.AImplBo;
import com.example.dto.AImplDto;


@Mapper
public interface AImplMapper {

    @Mapping( target = "myString", defaultExpression = "java(dto.getLegacyMyString())" )
    AImplBo dtoToBo( AImplDto dto );

    @Mapping( target = "legacyMyString", source = "myString" )
    AImplDto boToDto( AImplBo bo );
}
