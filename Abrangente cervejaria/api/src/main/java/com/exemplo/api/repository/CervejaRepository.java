package com.exemplo.api.repository;

import com.exemplo.api.models.Cerveja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CervejaRepository extends JpaRepository<Cerveja, Long>{

    Cerveja findById(long id);

}
