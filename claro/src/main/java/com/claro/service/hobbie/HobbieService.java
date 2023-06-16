package com.claro.service.hobbie;

import com.claro.entity.Hobbie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface HobbieService {

    List<Hobbie> getAll();
}
