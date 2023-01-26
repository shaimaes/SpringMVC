package fr.formation.inti.dao;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import fr.formation.inti.model.User;

@Repository
public class UserDaoImpl extends GenericDaoImpl<User, Integer> implements UserDao{

	@Override
	public User findUserBy(String email, String password) {
		
		String hql ="from User U WHERE U.email =:email and password =:password";
		//String hql ="from" +User.class.getName() + "WHERE U.email =:email and U.password =:password";
		Query <User> query = getSession().createQuery(hql);
		query.setParameter("email",email);
		query.setParameter("password",password);
		User user = query.uniqueResult();
		return user;
	}

	@Override
	public User findByEmail(String email) {
		User user = null;
		// get an user object
		String hql = "FROM User where email =:email";
		Query query = getSession().createQuery(hql).setParameter("email", email);
		user = (User) query.uniqueResult();
		return user;
	}

}
