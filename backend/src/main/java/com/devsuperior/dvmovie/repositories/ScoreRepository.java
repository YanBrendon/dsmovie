


/*REPOSITORY CAMADA DE ACESSO A DADOS*/


package com.devsuperior.dvmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dvmovie.entities.Score;
import com.devsuperior.dvmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
