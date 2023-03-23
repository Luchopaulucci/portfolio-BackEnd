package com.backPortfolio.MiPortfolio.repository;

import com.backPortfolio.MiPortfolio.entity.EHabilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHabilidades extends JpaRepository<EHabilidades, Long> {
    
}
