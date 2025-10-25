package com.vortex.EntregaRapida.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public record ErroResponseDto(
        @JsonProperty("data_hora") LocalDateTime timestamp,
        int httpsValue,
        String erro,
        String descricao) {
}
