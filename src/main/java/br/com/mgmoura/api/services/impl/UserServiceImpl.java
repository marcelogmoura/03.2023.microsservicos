package br.com.mgmoura.api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import br.com.mgmoura.api.domain.User;
import br.com.mgmoura.api.repositories.UserRepository;
import br.com.mgmoura.api.services.UserService;
import br.com.mgmoura.api.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repository;
	@Autowired
	private final Environment env;

	@Override
	public User findById(Long id) {
		log.info("USER_SERVICE ::: Get request on " + env.getProperty("local.server.port") + " port");
		return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object Not Found"));
	}

	@Override
	public List<User> findAll() {
		return repository.findAll();
	}

}
