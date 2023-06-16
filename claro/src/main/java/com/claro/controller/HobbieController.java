package com.claro.controller;

import com.claro.entity.Hobbie;
import com.claro.service.hobbie.HobbieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/hobbie")
public class HobbieController {

    @Autowired
    HobbieService hobbieService;

    @GetMapping( "list")
    public ResponseEntity<List<Hobbie>> listarHobbie(){
        return  ResponseEntity.status(HttpStatus.OK).body(hobbieService.getAll());
    }
}
