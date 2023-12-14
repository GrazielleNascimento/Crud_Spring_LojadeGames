package com.generation.lojagamesinfinity.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity // indica que esta Classe define uma entidade, ou seja, ela será utilizada para
		// gerar uma tabela no Banco de dados da aplicação.
@Table(name = "tb_categoria")
public class Categoria {

	@Id // indica a chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O atributo nome categoria é obrigatorio !!")
	@Size(min = 5, max = 100, message = "O atributo nome categoria deve conter no mínimo 05 e no máximo 100 caracteres")
	@Column(length = 100)
	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}