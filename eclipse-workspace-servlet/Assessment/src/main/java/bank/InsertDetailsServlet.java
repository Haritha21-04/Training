package bank;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InsertDetailsServlet")
public class InsertDetailsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");
        String accountName = request.getParameter("accountName");
        
        Connection con = null;
        
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish a database connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Nandhini@1975");
            System.out.println("Connection Established...");

            // Define the SQL query to insert user details
            String insertQuery = "INSERT INTO UserAccounts (UserId, Password, AccountName) VALUES (?, ?, ?)";

            // Create a prepared statement
            PreparedStatement preparedStatement = con.prepareStatement(insertQuery);
            preparedStatement.setString(1, userId);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, accountName);

            // Execute the SQL query to insert data
            int rowsInserted = preparedStatement.executeUpdate();
            preparedStatement.close();

            if (rowsInserted > 0) {
                // Insertion was successful
                response.sendRedirect("success.jsp"); 
            } else {
                // Insertion failed
                response.sendRedirect("error.jsp");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            
            response.sendRedirect("error.jsp");
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
