package edu.clearivate.springjdbc.dao;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "edu.clearivate")
public class SpringJDBCConfig {
	@Bean
	public JdbcTemplate getJdbcTemplete() {
		return new JdbcTemplate(getDataSouce());
	}

	@Bean
	public DataSource getDataSouce() {
		String dbUrl = "jdbc:mysql://localhost:3306/userapp_springjdbc";
		String userName = "root";
		String password = "root";

		return new DriverManagerDataSource(dbUrl, userName, password);
	}
}
