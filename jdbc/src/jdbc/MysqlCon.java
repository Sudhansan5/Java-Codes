package jdbc;

import java.sql.*;

class MysqlCon {
	public static void main(String args[]) {
		String url = "jdbc:mysql://localhost:3306/school";
		String username = "root";
		String password = "intel";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);

			Statement stmt = con.createStatement();
			System.out.println("Values of table");
			ResultSet rs1 = stmt.executeQuery("select * from student");
			while (rs1.next())
				System.out.println(rs1.getInt(1) + "  " + rs1.getString(2));
			System.out.println();
			
			stmt.executeUpdate("Insert into student values(2,'Niket')"); // Insert
			ResultSet rs2 = stmt.executeQuery("select * from student");
			System.out.println("After inserting table");
			while (rs2.next())
				System.out.println(rs2.getInt(1) + "  " + rs2.getString(2));
			System.out.println();
			
			stmt.executeUpdate("update Student set name ='Tryambkesh' where id=2"); // Update
			ResultSet rs3 = stmt.executeQuery("select * from student");
			System.out.println("After updating");
			while (rs3.next())
				System.out.println(rs3.getInt(1) + "  " + rs3.getString(2));
			System.out.println();
			
			stmt.executeUpdate("delete from Student where id=2"); // Delete
			ResultSet rs4 = stmt.executeQuery("select * from student");
			System.out.println("After deleting");
			while (rs4.next())
				System.out.println(rs4.getInt(1) + "  " + rs4.getString(2));

			stmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}