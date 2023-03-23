package com.backPortfolio.MiPortfolio.repository;

import com.backPortfolio.MiPortfolio.entity.EEducacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacion extends JpaRepository<EEducacion, Long> {
    
}
