package com.backPortfolio.MiPortfolio.repository;

import com.backPortfolio.MiPortfolio.entity.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RPersona extends JpaRepository<Persona, Long>{
    public Optional<Persona> findByNombre (String nombre);
    public boolean existsByNombre (String nombre);
}
