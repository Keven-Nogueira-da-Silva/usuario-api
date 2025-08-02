package com.keven.usuario_api.controller;


import com.keven.usuario_api.service.Usservice;
import com.keven.usuario_api.usuario.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsController {

    private final Usservice service;

    public UsController(Usservice service) {
        this.service = service;
    }

    @GetMapping
    public List<Model> listaUser() {
        return service.listaDeUsuarios();
    }

    @GetMapping("/{id}")
    public Optional<Model> buscarUser(@PathVariable Long id) {
        return service.buscarUsuario(id);
    }

    @PostMapping
    public Model save(@RequestBody Model user) {
        return service.save(user);
    }

    @PutMapping("/{id}")
    public Model atualizarUser(@PathVariable Long id, @RequestBody Model user) {
        return service.atualizarUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.Deletar(id);
    }





}
