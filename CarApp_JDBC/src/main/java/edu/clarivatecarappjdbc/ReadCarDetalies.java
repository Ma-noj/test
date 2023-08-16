package edu.clarivatecarappjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadCarDetalies {

	public static void main(String[] args) {
		readCarInfo();
	}

	public static void readCarInfo() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dbUrl = "jdbc:mysql://localhost:3306";
			String userName = "root";
			String password = "root";
			Connection connection = DriverManager.getConnection(dbUrl, userName, password);
			String query = "SELECT * FROM carapp_jdbc.car";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			System.out.println("Car Detalies ");

			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String carName = resultSet.getString(2);
				String carBrandName = resultSet.getString(3);
				String carColour = resultSet.getString(4);
				double carPrice = resultSet.getDouble(5);
				System.out.println("Id = " + id + " CarName = " + carName + " CarBrand = " + carBrandName
						+ " CarColour = " + carColour + " CarPrice = " + carPrice);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}