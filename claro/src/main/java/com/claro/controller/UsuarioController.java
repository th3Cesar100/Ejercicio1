package com.claro.controller;

import com.claro.entity.Usuario;
import com.claro.repository.UsuarioRepository;
import com.claro.service.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping("list")
    public ResponseEntity<List<Usuario>> listarUsuerario(){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.getAll());
    }
}
