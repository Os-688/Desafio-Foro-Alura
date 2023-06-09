package com.one.alura.topico.dto;

import com.one.alura.topico.modelo.StatusTopico;
import com.one.alura.topico.modelo.Topico;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(Long id, String titulo, String mensaje, LocalDateTime fecha, StatusTopico statusTopico,String autor, String curso) {
    public DatosRespuestaTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFecha_creacion(), topico.getStatus_topico(), topico.getAutor(), topico.getCurso());
    }
}
