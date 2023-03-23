package com.backPortfolio.MiPortfolio.repository;
import com.backPortfolio.MiPortfolio.entity.EExperiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperiencia extends JpaRepository<EExperiencia, Long>{
    
}
