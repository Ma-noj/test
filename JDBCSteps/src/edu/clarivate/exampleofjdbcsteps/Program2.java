package edu.clarivate.exampleofjdbcsteps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Program2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String dburl = "jdbc:mysql://localhost:3306";
			String userName = "root";
			String userPassword = "root";

			Connection connection = DriverManager.getConnection(dburl, userName, userPassword);

			String query = "INSERT INTO `food_app`.`item` (`id`, `name`, `type`, `quantity`, `price`) VALUES ('102', 'Tea', 'Veg', '1', '15');";

			Statement statement = connection.createStatement();
			statement.execute(query);

			System.out.println("Item With the Id = 101 inserted");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
