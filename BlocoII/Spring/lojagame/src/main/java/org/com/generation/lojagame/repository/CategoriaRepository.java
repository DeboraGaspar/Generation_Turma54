package org.com.generation.lojagame.repository;

import java.util.List;

import org.com.generation.lojagame.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);

	

}
