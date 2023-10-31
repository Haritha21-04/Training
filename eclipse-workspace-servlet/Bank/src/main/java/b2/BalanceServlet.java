package b2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/BalanceServlet")
public class BalanceServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String userId = (String) session.getAttribute("userId");

        if (userId != null) {
            double accountBalance = getAccountBalance(userId);
            request.setAttribute("accountBalance", accountBalance);
            request.getRequestDispatcher("Balance.jsp").forward(request, response);
        } else {
            response.sendRedirect("Login.jsp");
        }
    }

	private double getAccountBalance(String userId) {
		// TODO Auto-generated method stub
		return 0;
	}
}