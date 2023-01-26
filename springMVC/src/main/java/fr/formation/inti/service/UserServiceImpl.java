package fr.formation.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.formation.inti.dao.UserDaoImpl;
import fr.formation.inti.model.User;

@Service("serviceUser")
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDaoImpl dao;
	
	public UserServiceImpl() {
		dao = new UserDaoImpl();
	}

	@Override
	public User findById(Integer id) {
		//dao.beginTransaction();
		User c = dao.findById(id);
		//dao.commit(true);
		return c;
	}

	@Override
	public List<User> findAll() {
		//dao.beginTransaction();
		List<User> list = dao.findAll();
		//dao.commit(true);
		return list;
	}

	@Override
	public Integer save(User c) {
		//dao.beginTransaction();
		User cust = dao.save(c);
		
		//dao.commit(true);
		return cust.getIdUser();
	}

	@Override
	public void delete(User entiy) {
		//dao.beginTransaction();
		dao.delete(entiy);
		//dao.commit(true);
		
	}

	@Override
	public void deleteById(Integer id) {
		//dao.beginTransaction();
		dao.deleteById(id);
		//dao.commit(true);
		
	}

	@Override
	public User findUserBy(String email, String password) {
		//dao.beginTransaction();
		User user = dao.findUserBy(email, password);
		//dao.commit(true);
		return user;
	}

	@Override
	public User findByEmail(String email) {
		//dao.beginTransaction();
		//User user = dao.findByEmail(email);
		//dao.commit(true);
		return dao.findByEmail(email);
	}
	
}
