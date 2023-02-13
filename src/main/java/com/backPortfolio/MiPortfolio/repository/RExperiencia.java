package com.backPortfolio.MiPortfolio.repository;

import com.backPortfolio.MiPortfolio.entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia extends JpaRepository<Experiencia, Long>{
    public Optional<Experiencia> findByTitulo (String titulo);
    public boolean existsByTitulo (String titulo);
    
}
