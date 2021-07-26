package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.TypeDeConge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeDeCongeRepository extends JpaRepository<TypeDeConge,Long> {
}
