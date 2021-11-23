package com.edu.unifacef.meuprimeiroservicorest.models;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Endereco {
    private String rua;
    private String bairro;
    private String cidade;
    private String cep;

    public Endereco(String rua, String bairro, String cidade, String cep){
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
    }
}
