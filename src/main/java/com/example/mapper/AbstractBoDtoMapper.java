package com.example.mapper;


import static org.mapstruct.ReportingPolicy.ERROR;
import static org.mapstruct.SubclassExhaustiveStrategy.RUNTIME_EXCEPTION;

import org.mapstruct.Mapper;
import org.mapstruct.SubclassMapping;

import com.example.bo.AImplBo;
import com.example.bo.AbstractBo;
import com.example.bo.BImplBo;
import com.example.dto.AImplDto;
import com.example.dto.AbstractDto;
import com.example.dto.BImplDto;


@Mapper( uses = { AImplMapper.class, BImplMapper.class },
         subclassExhaustiveStrategy = RUNTIME_EXCEPTION,
         unmappedTargetPolicy = ERROR,
         unmappedSourcePolicy = ERROR )
public interface AbstractBoDtoMapper {

    @SubclassMapping( source = AImplDto.class, target = AImplBo.class )
    @SubclassMapping( source = BImplDto.class, target = BImplBo.class )
    AbstractBo dtoToBo( AbstractDto dto );

    @SubclassMapping( source = AImplBo.class, target = AImplDto.class )
    @SubclassMapping( source = BImplBo.class, target = BImplDto.class )
    AbstractDto boToDto( AbstractBo bo );
}
