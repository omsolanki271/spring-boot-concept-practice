package com.springboot.dao;

import com.springboot.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.entity.User;

@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;


	@Override
	public boolean insert(User user) {
		boolean status = false;
		try {
			String sql = "INSERT INTO users(name,email,gender,city) values(?,?,?,?)";
			int update = this.jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getGender(), user.getCity());
			if (update > 0) {	
				status = true;
			}
			else
			{
			   status = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public boolean updateUser(User user) {
		boolean status = false;

		try {
			String sql = "update users set name=?, gender=? , city=? where email=? ";
			int update = this.jdbcTemplate.update(sql, user.getName(),user.getGender(),user.getCity(),user.getEmail());

			if(update > 0)
			{
				status = true;
			}
			else
			{
				status = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return status;
	}
	
}
