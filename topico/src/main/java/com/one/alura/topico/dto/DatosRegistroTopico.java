package com.one.alura.topico.dto;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistroTopico(@NotBlank String titulo, @NotBlank String mensaje, @NotBlank String autor, @NotBlank String curso) {
}
