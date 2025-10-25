package com.vortex.EntregaRapida.dto.request;

import jakarta.validation.constraints.NotBlank;

public record EstadoRequestDto(@NotBlank String nome) {
}
