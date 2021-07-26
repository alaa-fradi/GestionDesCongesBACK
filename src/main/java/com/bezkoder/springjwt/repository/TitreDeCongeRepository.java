package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.TitreDeConge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TitreDeCongeRepository extends JpaRepository<TitreDeConge,Long> {
}
