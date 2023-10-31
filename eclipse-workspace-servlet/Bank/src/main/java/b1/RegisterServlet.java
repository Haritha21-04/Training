package b1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");
        String accountName = request.getParameter("accountName");

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

        if (isValidUser(userId, password, accountName)) {
            
            HttpSession session = request.getSession();
            session.setAttribute("userId", userId);
            session.setAttribute("password", password);
            session.setAttribute("accountName", accountName);
            response.sendRedirect("login.jsp");
        }
    }

	private boolean isValidUser(String userId, String password, String accountName) {
		// TODO Auto-generated method stub
		return false;
	}
	


        
    
}
