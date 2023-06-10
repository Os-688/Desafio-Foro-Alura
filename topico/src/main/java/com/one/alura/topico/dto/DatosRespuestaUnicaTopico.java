package com.one.alura.topico.dto;

import com.one.alura.topico.modelo.StatusTopico;
import com.one.alura.topico.modelo.Topico;

import java.time.LocalDateTime;

public record DatosRespuestaUnicaTopico(String titulo, String mensaje, LocalDateTime fecha, StatusTopico topico, String autor, String curso) {
    public DatosRespuestaUnicaTopico(Topico topico){
        this(topico.getTitulo(), topico.getMensaje(), topico.getFecha_creacion(), topico.getStatus_topico(), topico.getAutor(), topico.getCurso());
    }
}
