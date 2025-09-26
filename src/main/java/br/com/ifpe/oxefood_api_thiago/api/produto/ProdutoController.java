package br.com.ifpe.oxefood_api_thiago.api.produto;

import br.com.ifpe.oxefood_api_thiago.api.cliente.ClienteRequest;
import br.com.ifpe.oxefood_api_thiago.modelo.cliente.Cliente;
import br.com.ifpe.oxefood_api_thiago.modelo.cliente.ClienteService;
import br.com.ifpe.oxefood_api_thiago.modelo.produto.Produto;
import br.com.ifpe.oxefood_api_thiago.modelo.produto.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produto")
@CrossOrigin
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<Produto> save(@RequestBody ProdutoRequest request) {

        Produto produto = produtoService.save(request.build());
        return new ResponseEntity<Produto>(produto, HttpStatus.CREATED);
    }
}
