package b2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/DepositServlet")
public class DepositServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String userId = (String) session.getAttribute("userId");

        if (userId != null) {
            double depositAmount = Double.parseDouble(request.getParameter("depositAmount"));
            double accountBalance = getAccountBalance(userId);
            double newBalance = accountBalance + depositAmount;                        
            updateAccountBalance(userId, newBalance);                    
            response.sendRedirect("login.jsp");
        }
    }

	private void updateAccountBalance(String userId, double newBalance) {
		// TODO Auto-generated method stub
		
	}

	private double getAccountBalance(String userId) {
		// TODO Auto-generated method stub
		return 0;
	}
}
