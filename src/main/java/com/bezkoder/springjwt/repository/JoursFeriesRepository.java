package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.JoursFeries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JoursFeriesRepository extends JpaRepository<JoursFeries,Long> {
}
