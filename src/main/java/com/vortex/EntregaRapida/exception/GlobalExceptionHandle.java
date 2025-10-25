package com.vortex.EntregaRapida.exception;

import com.vortex.EntregaRapida.dto.response.ErroResponseDto;
import com.vortex.EntregaRapida.exception.custom.ConflitoDeEntidadeException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandle {

    ErroResponseDto response;

    @ExceptionHandler(ConflitoDeEntidadeException.class)
    public ResponseEntity<ErroResponseDto> ConflitoDeEntidadeHandle(
            ConflitoDeEntidadeException ex) {
        response = toResponse(
                ex, HttpStatus.CONFLICT, ex.getMessage());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(response);
    }

    private static ErroResponseDto toResponse(Exception e,
                                              HttpStatus status,
                                              String mensagem) {
        return new ErroResponseDto(LocalDateTime.now(),
                status.value(),
                e.getMessage(),
                mensagem);
    }
}
