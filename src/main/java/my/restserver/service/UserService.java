package my.restserver.service;

import java.util.List;

import org.springframework.stereotype.Service;

import my.restserver.entity.User;
@Service
public interface UserService {
	User addUser(User user);
    void delete(int id);
    User getByName(String name);
    User editUser(User user);
    List<User> getAll();
}
