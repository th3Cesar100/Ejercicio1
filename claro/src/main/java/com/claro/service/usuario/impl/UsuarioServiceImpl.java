package com.claro.service.usuario.impl;

import com.claro.entity.Usuario;
import com.claro.repository.UsuarioRepository;
import com.claro.service.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;
    @Override
    public List<Usuario> getAll() {
        return  usuarioRepository.findAll();
    }
}
