package fr.formation.inti.service;

import java.util.List;

import fr.formation.inti.model.User;

public interface UserService {
	
	User findById(Integer id);

	List<User> findAll();

	Integer save(User c);

	void delete(User entiy);

	void deleteById(Integer id);

	User findUserBy(String email, String password);

	User findByEmail(String email);

}
