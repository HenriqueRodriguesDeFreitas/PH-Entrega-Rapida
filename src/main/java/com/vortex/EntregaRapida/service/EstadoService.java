package com.vortex.EntregaRapida.service;

import com.vortex.EntregaRapida.dto.request.EstadoRequestDto;
import com.vortex.EntregaRapida.dto.response.EstadoResponseDto;
import com.vortex.EntregaRapida.mapper.EstadoMapper;
import com.vortex.EntregaRapida.repository.EstadoRepository;
import org.springframework.stereotype.Service;

@Service
public class EstadoService {

    private final EstadoRepository estadoRepository;
    private final EstadoMapper estadoMapper;

    public EstadoService(EstadoRepository estadoRepository,
                         EstadoMapper estadoMapper) {
        this.estadoRepository = estadoRepository;
        this.estadoMapper = estadoMapper;
    }

    public EstadoResponseDto salvarNovoEstado(EstadoRequestDto dto){
        estadoRepository.findByNomeIgnoreCase(dto.nome)
                .ifPresent(e -> {

                });
    }
}
