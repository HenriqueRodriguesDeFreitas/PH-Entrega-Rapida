package com.vortex.EntregaRapida.mapper;

import com.vortex.EntregaRapida.dto.request.EstadoRequestDto;
import com.vortex.EntregaRapida.dto.response.EstadoResponseDto;
import com.vortex.EntregaRapida.model.Estado;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EstadoMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "nome", target = "nome")
    EstadoResponseDto toResponse(Estado estado);

    @Mapping(source = "nome", target = "nome")
    Estado toEntity(EstadoRequestDto requestDto);
}
