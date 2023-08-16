package edu.clarivatecarappjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateCarDetalies {
	public static void main(String[] args) {
		Car car = readCarDetails();
		updateCarDetails(car);
	}

	public static Car readCarDetails() {
		Car car = new Car();
		// Take input from the User
		int id = 103;
		double price = 1200000.87;
		car.setId(id);
		car.setPrice(price);
		return car;
	}

	public static void updateCarDetails(Car car) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dbUrl = "jdbc:mysql://localhost:3306";
			String userName = "root";
			String userPassword = "root";

			Connection connection = DriverManager.getConnection(dbUrl, userName, userPassword);
			String query = "UPDATE `carapp_jdbc`.`car` SET `price` = ? WHERE (`id` = ?);" + "";

			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setDouble(1, car.getPrice());
			preparedStatement.setInt(2, car.getId());
			int numberOfRowsAffected = preparedStatement.executeUpdate();
			System.out.println(numberOfRowsAffected);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
