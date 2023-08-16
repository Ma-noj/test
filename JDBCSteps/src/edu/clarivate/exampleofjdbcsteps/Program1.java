package edu.clarivate.exampleofjdbcsteps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Program1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String dburl = "jdbc:mysql://localhost:3306";
			String userName = "root";
			String userPassword = "root";

			Connection connection = DriverManager.getConnection(dburl, userName, userPassword);

			String query = "INSERT INTO `employee_info`.`employee`"
					+ "(`employee_Id`, `employee_name`, `employee_email`, `employee_phonenumber`, `employee_password`, `employee_salary`)"
					+ "VALUES" + "('104', 'Raki', 'raki@abc.in', '6538293543', 'Raki@123', '25000.8');";

			Statement statement = connection.createStatement();
			statement.execute(query);

			System.out.println("Employee With the Id = 104 inserted");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
