package com.backPortfolio.MiPortfolio.repository;

import com.backPortfolio.MiPortfolio.entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducacion extends JpaRepository<Educacion, Long> {
    public Optional<Educacion> findByTitulo (String titulo);
    public boolean existsByTitulo (String titulo);
    
}
