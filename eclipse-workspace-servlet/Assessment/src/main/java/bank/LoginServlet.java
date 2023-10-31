package bank;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");
        Connection con = null;
		try {
	Class.forName("com.mysql.cj.jdbc.Driver");
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
try {
	 con=DriverManager.getConnection
			("jdbc:mysql://localhost:3306/bank","root","Nandhini@1975");
	System.out.println("Connection Established...");
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

        if (isValidUser(userId, password)) {
            
            HttpSession session = request.getSession();
            session.setAttribute("userId", userId);


            response.sendRedirect("Dashboard.jsp");
        } else {
            
            response.sendRedirect("LoginFailed.jsp");
        }
    }

    
    private boolean isValidUser(String userId, String password) {
        
        return userId.equals("hari") && password.equals("123");
    }
}
