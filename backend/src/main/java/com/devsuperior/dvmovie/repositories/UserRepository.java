
/*REPOSITORY CAMADA DE ACESSO A DADOS*/

package com.devsuperior.dvmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dvmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
