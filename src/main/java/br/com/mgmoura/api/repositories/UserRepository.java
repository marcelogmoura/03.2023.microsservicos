package br.com.mgmoura.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mgmoura.api.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
