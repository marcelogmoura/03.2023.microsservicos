package br.com.mgmoura.api.services;

import java.util.List;

import br.com.mgmoura.api.domain.User;

public interface UserService {
	
	User findById(Long id);
	List<User> findAll();

}
