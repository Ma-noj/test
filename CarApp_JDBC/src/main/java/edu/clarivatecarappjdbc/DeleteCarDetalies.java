package edu.clarivatecarappjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteCarDetalies {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the Car Id ");
		int id = read.nextInt();
		deleteCarDetalies(id);
	}

	public static void deleteCarDetalies(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dbUrl = "jdbc:mysql://localhost:3306";
			String userName = "root";
			String userPassword = "root";

			Connection connection = DriverManager.getConnection(dbUrl, userName, userPassword);
			String query = "DELETE FROM `carapp_jdbc`.`car` WHERE (`id` = ?);";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			int numberOfRowsAffected = preparedStatement.executeUpdate();
			System.out.println(numberOfRowsAffected);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
