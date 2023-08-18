package edu.clearivate.springjdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import edu.clearivate.springjdbc.entity.User;

@Component
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private UserMapper mapper;

//	public int saveUser(User user) {
//
//		String sql = "INSERT INTO `userapp_springjdbc`.`user` (`id`, `name`, `email`, `password`) VALUES ('"
//				+ user.getId() + "', '" + user.getName() + "', '" + user.getEmail() + "', '" + user.getPassword()
//				+ "')";
//		return jdbcTemplate.update(sql);
//	}

	public int saveUser(User user) {
		String sql = "INSERT INTO `userapp_springjdbc`.`user` (`id`, `name`, `email`, `password`) VALUES (?, ?, ?, ?)";
		return jdbcTemplate.update(sql, user.getId(), user.getName(), user.getEmail(), user.getPassword());
	}

	public int updateUser(int id, String email) {

		String sql = "UPDATE `userapp_springjdbc`.`user` SET email=? WHERE id = ?";
		return jdbcTemplate.update(sql, email, id);

	}

	public int deleteUser(int id) {
		String sql = "DELETE FROM `userapp_springjdbc`.`user` WHERE id = ?";

		return jdbcTemplate.update(sql, id);
	}

	public User findUserById(int id) {
		String sql = "SELECT * FROM `userapp_springjdbc`.`user`  WHERE id=" + id;
		return jdbcTemplate.queryForObject(sql, mapper);
	}

	public List<User> findAllUser() {
		String sql = "SELECT * FROM `userapp_springjdbc`.`user` ";
		return jdbcTemplate.query(sql, mapper);
	}

}
