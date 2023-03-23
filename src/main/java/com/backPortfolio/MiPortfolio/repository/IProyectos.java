package com.backPortfolio.MiPortfolio.repository;

import com.backPortfolio.MiPortfolio.entity.EProyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectos extends JpaRepository<EProyectos, Long> {
    
}
