package br.com.gustavorosa.produtosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gustavorosa.produtosapi.model.Produto;
import java.util.List;


public interface ProdutoRepository extends JpaRepository<Produto, String> {
	
	List<Produto> findByNome(String nome);

}
