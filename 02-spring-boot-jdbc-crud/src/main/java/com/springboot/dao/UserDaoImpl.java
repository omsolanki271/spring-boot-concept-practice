package com.springboot.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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

	@Override
	public User getOneUser(String email) {
		User queryForObject = null; 
		try 
		{
			String sql = "select * from users where email = ?";
			queryForObject = this.jdbcTemplate.queryForObject(sql,new RowMapperImp1(), email);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("Email is not Found");
			queryForObject = null;
		}
		return queryForObject;
	}
	
	public static final class  RowMapperImp1 implements RowMapper<User>
	{

		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User();
			user.setName(rs.getString("name"));
			user.setEmail(rs.getString("email"));
			user.setGender(rs.getString("gender"));
			user.setCity(rs.getString("city"));
			return user;
		}
		
	}

	@Override
	public User getOneUser1(String email) {
		
		User queryForObject = null;
		String sql = "select * from users where email = ?";
		queryForObject = this.jdbcTemplate.queryForObject(sql, new RowMapper<User>(){
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException 
			{
				User user = new User();
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setGender(rs.getString("gender"));
				user.setCity(rs.getString("city"));
				return user;
			}
		}, email);
		
		return queryForObject;
	}

	@Override
	public List<User> getAllUser() {
		String sql = "select * from users";
		List<User> list = this.jdbcTemplate.query(sql, new RowMapperImp());
		return list;
	}
	
}
