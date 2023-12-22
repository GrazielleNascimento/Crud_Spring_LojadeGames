package com.generation.lojagamesinfinity.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

//definir comportamentos para classes e metodos (ANOTACOES))
//AGORA AS ANOTACOES IRAO VIR DE BIBLIOTECAS ESPECIFICAS
@Entity// define que sera uma tabela
@Table(name = "tb_produtos")//nomeia a tabela

public class Produtos {
    @Id// Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO INCREMENT
	private Long id;
		
    
	@Column(length= 1000)//sobrescrevendo a quantidade padrao de caracteres maximo
	@NotBlank(message = "O atributo texto é Obrigatório!")
	@Size(min = 10, max = 1000, message = "O atributo texto deve conter no mínimo 10 e no máximo 1000 caracteres")
	private String nome;
   
	
    //Atributo plataforma tem q ter no minimo 5 caracteres e no maximo 100
	@NotBlank(message = "O atributo plataforma é Obrigatório!") 
	@Size(min = 5, max = 100, message = "O atributo plataforma deve conter no mínimo 05 e no máximo 100 caracteres")
	@Column(length= 100) 
	private String plataforma;
	
    //Atributo descricao tem q ter no minimo 5 caracteres e no maximo 100
	@NotBlank(message = "O atributo descrição é Obrigatório!") 
	@Size(min = 5, max = 100, message = "O atributo descrição deve conter no mínimo 05 e no máximo 100 caracteres")
	@Column(length= 100) 
	private String descricao;
	
   
	private LocalDate lancamento;
    
	@ManyToOne //postagem sera o lado N:1 e tera um objeto tema
	@JsonIgnoreProperties("produtos") 
	private Categoria categoria;
	
	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Usuario usuario;
	

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

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

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public LocalDate getLancamento() {
		return lancamento;
	}

	public void setLancamento(LocalDate lancamento) {
		this.lancamento = lancamento;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
