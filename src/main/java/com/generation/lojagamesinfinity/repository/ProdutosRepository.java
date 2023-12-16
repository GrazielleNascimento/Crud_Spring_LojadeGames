package com.generation.lojagamesinfinity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.lojagamesinfinity.model.Produtos;


@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long> {
    List<Produtos> findByNomeContainingIgnoreCase(@Param("nome")String nome);
    
   
	public List<Produtos>findAllByDescricaoContainingIgnoreCase(@Param("descricao" )String descricao);

}   
    
