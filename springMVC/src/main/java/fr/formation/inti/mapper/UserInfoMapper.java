package fr.formation.inti.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fr.formation.inti.model.UserInfo;

public class UserInfoMapper implements RowMapper<UserInfo> {

	@Override
	public UserInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		String userName = rs.getString("Username");
		String password = rs.getString("Password");
		
		return new UserInfo(userName, password);
	}

}
