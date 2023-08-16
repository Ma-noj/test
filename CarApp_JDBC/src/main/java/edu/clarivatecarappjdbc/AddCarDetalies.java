package edu.clarivatecarappjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddCarDetalies {
	public static void main(String[] args) {
		Car car = readCarDetalies();
		insertCarDetalies(car);
	}

	public static Car readCarDetalies() {
		Scanner read = new Scanner(System.in);
		Car car = new Car();
		System.out.println("Enter the Car Id");
		int id = read.nextInt();
		System.out.println("Enter the Car Name");
		read.nextLine();
		String name = read.nextLine();
		System.out.println("Enter the Car Brand");
		String barnd = read.nextLine();
		System.out.println("Enter the Price Of the Car");
		double price = read.nextDouble();
		System.out.println("Enter the Colour of the Car");
		read.nextLine();
		String colour = read.nextLine();

		car.setId(id);
		car.setName(name);
		car.setBrand(barnd);
		car.setPrice(price);
		car.setColour(colour);

		return car;
	}

	public static void insertCarDetalies(Car car) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String dbUrl = "jdbc:mysql://localhost:3306";
			String userName = "root";
			String userPassword = "root";

			Connection connection = DriverManager.getConnection(dbUrl, userName, userPassword);

			String query = "INSERT INTO `carapp_jdbc`.`car` (`id`, `name`, `brand`, `colour`, `price`) VALUES (?, ?, ?, ?, ?);";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, car.getId());
			preparedStatement.setString(2, car.getName());
			preparedStatement.setString(3, car.getBrand());
			preparedStatement.setString(4, car.getColour());
			preparedStatement.setDouble(5, car.getPrice());

			int numberOfRowsEffact = preparedStatement.executeUpdate();
			System.out.println(numberOfRowsEffact);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
