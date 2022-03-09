


/*REPOSITORY CAMADA DE ACESSO A DADOS*/


package com.devsuperior.dvmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dvmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
