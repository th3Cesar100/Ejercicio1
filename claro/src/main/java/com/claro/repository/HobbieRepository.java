package com.claro.repository;

import com.claro.entity.Hobbie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HobbieRepository extends JpaRepository<Hobbie, Long> {
}
