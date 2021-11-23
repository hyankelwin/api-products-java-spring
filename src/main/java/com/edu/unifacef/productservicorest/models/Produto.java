package com.edu.unifacef.productservicorest.models;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter @Setter
public class Produto {
    @NotNull private String codigo;
    @NotNull private String nome;
    private String descricao;
    private String marca;
    private String[] imagens;
    private Date dataCriacao;
    private Date ultimaModificacao;
    // private Preco preco;
    // private Estoque estoque;

    public Produto(){
        // controller
    }
    public Produto(String codigo, String nome, String descricao,
                   String marca, String[] imagens, Date dataCriacao, Date ultimaModificacao){
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.marca = marca;
        this.imagens = imagens;
        this.dataCriacao = dataCriacao;
        this.ultimaModificacao = ultimaModificacao;
    }

}
