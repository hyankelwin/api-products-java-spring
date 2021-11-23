package com.edu.unifacef.meuprimeiroservicorest.controllers;

import com.edu.unifacef.meuprimeiroservicorest.models.Aluno;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Validated
@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private List<Aluno> alunos = new ArrayList<Aluno>();

    @PostMapping
    public void add(@RequestBody @Valid final Aluno aluno) {
        this.alunos.add(aluno);
    }

    @GetMapping
    public List<Aluno> getAll() {
        return this.alunos;
    }
}