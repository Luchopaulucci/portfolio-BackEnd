package com.backPortfolio.MiPortfolio.repository;
import com.backPortfolio.MiPortfolio.entity.EPersona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersona  extends JpaRepository<EPersona, Long>{
    
    public List <EPersona> findByEmailAndClave(String email, String clave);
    
}
