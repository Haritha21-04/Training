package jdbcdemos;
import java.sql.*;
import java.util.Scanner;
public class JDBCDemo {

	public static void main(String[] ar) {

		// TODO Auto-generated method stub

		@SuppressWarnings("unused")
		Connection con=null;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

		} catch (ClassNotFoundException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		try {

			 con=DriverManager.getConnection

					("jdbc:mysql://localhost:3306/abc","root","Nandhini@1975");

			System.out.println("Connection Established...");

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		Statement s;

		try {

			s = con.createStatement();

			int res=s.executeUpdate("insert into students(student_id,first_name) values(2,'xcvb')");

			System.out.println(res + " record(s) inserted..");

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}
}

		/*PreparedStatement s;
		try {
			System.out.println("Enter the data to search ");
			int empid=sc.nextInt();
			s = con.prepareStatement("select student_id,first_name from students where student_id=?");
			s.setInt(1, empid);
			ResultSet rs=s.executeQuery();
			while(rs.next()) {
				System.out.println("Student Id "+rs.getInt("student_id"));
				System.out.println("Name " +rs.getString(2));
			
				System.out.println("-----------------");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}*/

 