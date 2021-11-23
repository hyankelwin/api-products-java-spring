package com.edu.unifacef.productservicorest.controllers;

import com.edu.unifacef.productservicorest.models.Produto;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@Validated
@RestController
@RequestMapping("/produto")
public class ProdutoController {

    private List<Produto> produtos = new ArrayList<Produto>();

    @GetMapping("/getProduto")
    public List<Produto> getAll() {
        return this.produtos;
    }

    @GetMapping("/getProduto/{codigo}")
    public List<Produto> getAllCode(@PathParam("codigo") String codigo) {
        produtos.forEach((item) -> item.getCodigo().equals(codigo));
        return this.produtos;
    }
}