package fr.formation.inti.dao;

import java.util.List;

import fr.formation.inti.model.UserInfo;

public interface UserInfoDAO {

	public UserInfo findUserInfo(String userName);

	// [USER,AMIN,..]
	public List<String> getUserRoles(String userName);
}
