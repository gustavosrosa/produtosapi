package br.com.gustavorosa.produtosapi.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gustavorosa.produtosapi.model.Produto;
import br.com.gustavorosa.produtosapi.repository.ProdutoRepository;

@RestController
@RequestMapping("produtos")
public class ProdutoController {
	
	private ProdutoRepository produtoRepository;
	
	public ProdutoController(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}

	@PostMapping
	public Produto salvar(@RequestBody Produto produto) {
	
		String id = UUID.randomUUID().toString();
		produto.setId(id);
		
		produtoRepository.save(produto);
		return produto;
	}

}
