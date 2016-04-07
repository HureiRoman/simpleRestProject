package my.restserver.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import my.restserver.entity.User;
import my.restserver.repository.UserRepository;
import my.restserver.service.UserService;
@Service
@ComponentScan(basePackages={"my.restserver.repository"})
public class UserServiceImpl implements UserService {
	 @Autowired
	private UserRepository userRepository;

	@Override
	public User addUser(User user) {
		return userRepository.saveAndFlush(user);
	}

	@Override
	public void delete(int id) {
	userRepository.delete(id);	
	}

	@Override
	public User getByName(String name) {
	return userRepository.findByName(name);
	}

	@Override
	public User editUser(User user) {
		return userRepository.saveAndFlush(user);
	}

	@Override
	public List<User> getAll() {
	return userRepository.findAll();
	}

}
