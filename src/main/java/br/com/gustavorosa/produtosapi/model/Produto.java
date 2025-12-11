package br.com.gustavorosa.produtosapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "produto")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Produto {
	
	@Column
	@Id
	private String id;
	
	@Column
	private String nome;
	
	@Column
	private String descricao;
	
	@Column
	private Double preco;
	
}
