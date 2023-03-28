package br.com.mgmoura.api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mgmoura.api.domain.User;
import br.com.mgmoura.api.repositories.UserRepository;
import br.com.mgmoura.api.services.UserService;
import br.com.mgmoura.api.services.exceptions.ObjectNotFoundException;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repository;

	@Override
	public User findById(Long id) {
		return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object Not Found"));
	}

	@Override
	public List<User> findAll() {
		return repository.findAll();
	}

}
