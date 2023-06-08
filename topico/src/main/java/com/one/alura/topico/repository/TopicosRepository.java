package com.one.alura.topico.repository;

import com.one.alura.topico.modelo.Topico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicosRepository extends JpaRepository <Topico, Long> {

    Page <Topico> findByActivoTrue(Pageable paginacion);
}
