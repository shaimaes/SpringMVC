package fr.formation.inti.dao;

import fr.formation.inti.model.User;

public interface UserDao extends GenericDao<User, Integer> {
	
	User findUserBy(String email, String password);
	User findByEmail(String email);

}
