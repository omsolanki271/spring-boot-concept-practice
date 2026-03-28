package com.springboot.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.entity.User;

@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;


	/* insert oepration */
	
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

	/* update operation */
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

	
	/* delete operation */
	/* way 1 */
	@Override
	public boolean deleteUser(User user) {
		boolean status = false;

		try {
			String sql = "delete from users where email = ? ";
			int update = this.jdbcTemplate.update(sql, user.getEmail());

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

	/* way 2 */
	
	@Override
	public boolean deleteUser2(String email) {
		
		boolean status = false; 
		try {
			String sql = "delete from users where email = ?";
			int update = this.jdbcTemplate.update(sql, email);
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
