package com.tnc.repositories;

import com.tnc.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure>findByDescription(String description);

    List<UnitOfMeasure>findAllByDescription(String description);
}
