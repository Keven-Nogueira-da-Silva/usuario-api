package com.keven.usuario_api.service;

import com.keven.usuario_api.Repository.UsRepository;
import com.keven.usuario_api.usuario.Model;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Usservice {


    private final UsRepository repository;


    public Usservice(UsRepository repository) {
        this.repository = repository;
    }

    public List<Model> listaDeUsuarios() {
        return repository.findAll();
    }

    public Optional<Model> buscarUsuario(Long id) {
        return repository.findById(id);
    }

    public Model save(Model user) {
        return repository.save(user);
    }

    public Model atualizarUser(Long id,Model user) {
        user.setId(id);
        return repository.save(user);
    }

    public void Deletar(Long id) {
        repository.deleteById(id);
    }





}
