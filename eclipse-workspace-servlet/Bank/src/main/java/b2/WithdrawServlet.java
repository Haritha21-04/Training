package b2;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/WithdrawServlet")
public class WithdrawServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String userId = (String) session.getAttribute("userId");

        if (userId != null) {
        	double withdrawAmount = Double.parseDouble(request.getParameter("withdrawAmount"));             
            double accountBalance = getAccountBalance(userId);          
            double minimumBalance = 1000.00; 

            if (accountBalance >= withdrawAmount + minimumBalance) {
                
                double newBalance = accountBalance - withdrawAmount;
                
                updateAccountBalance(userId, newBalance);
                
            } else {
                response.sendRedirect("Withdraw.jsp?error=insufficientBalance");
            }

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