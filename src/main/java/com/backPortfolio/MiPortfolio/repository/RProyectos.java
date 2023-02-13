package com.backPortfolio.MiPortfolio.repository;

import com.backPortfolio.MiPortfolio.entity.Proyectos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyectos extends JpaRepository<Proyectos, Long> {
    public Optional<Proyectos> findByTitulo (String titulo);
    public boolean existsByTitulo (String titulo);
}
