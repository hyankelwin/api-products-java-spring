package com.edu.unifacef.meuprimeiroservicorest.models;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter @Setter
public class Aluno {
    @NotNull private String nome;
    private Integer idade;
    private Endereco endereco;

    public Aluno(String nome, Integer idade, Endereco endereco){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }
}
