package com.example.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.bo.AImplBo;
import com.example.bo.BImplBo;
import com.example.dto.AImplDto;
import com.example.dto.BImplDto;


@Mapper
public interface BImplMapper {

    @Mapping( target = "myString", defaultExpression = "java(dto.getLegacyMyString())" )
    BImplBo dtoToBo( BImplDto dto );

    @Mapping( target = "legacyMyString", source = "myString" )
    BImplDto boToDto( BImplBo bo );
}
