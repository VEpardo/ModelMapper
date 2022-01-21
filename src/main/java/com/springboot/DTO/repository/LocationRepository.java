package com.springboot.DTO.repository;

import com.springboot.DTO.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Long> {
}
