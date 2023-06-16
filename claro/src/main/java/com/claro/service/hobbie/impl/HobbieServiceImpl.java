package com.claro.service.hobbie.impl;

import com.claro.entity.Hobbie;
import com.claro.repository.HobbieRepository;
import com.claro.service.hobbie.HobbieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HobbieServiceImpl implements HobbieService {

    @Autowired
    HobbieRepository hobbieRepository;
    @Override
    public List<Hobbie> getAll() {
        return hobbieRepository.findAll();
    }
}
