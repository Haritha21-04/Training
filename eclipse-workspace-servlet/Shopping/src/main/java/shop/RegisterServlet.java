package shop;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data from the request
        @SuppressWarnings("unused")
		String username = request.getParameter("username");
        @SuppressWarnings("unused")
		String password = request.getParameter("password");
        @SuppressWarnings("unused")
		String email = request.getParameter("email");

        @SuppressWarnings("unused")
		boolean registrationSuccessful = saveUserToDatabase(username, password, email);

        // Redirect to a confirmation or login page
        response.sendRedirect("RegisterSuccess.jsp");
    }

	private boolean saveUserToDatabase(String username, String password, String email) {
		// TODO Auto-generated method stub
		return false;
	}
}
