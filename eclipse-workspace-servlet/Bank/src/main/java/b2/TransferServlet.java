package b2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/TransferServlet")
public class TransferServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String userId = (String) session.getAttribute("userId");

        if (userId != null) {
            String destinationAccount = request.getParameter("destinationAccount");
            double transferAmount = Double.parseDouble(request.getParameter("transferAmount"));

            
            double sourceAccountBalance = getAccountBalance(userId);

            
            if (sourceAccountBalance >= transferAmount) {
                // Retrieve the destination account's balance
                double destinationAccountBalance = getAccountBalance(destinationAccount);

                
                double newSourceBalance = sourceAccountBalance - transferAmount;
                double newDestinationBalance = destinationAccountBalance + transferAmount;

                
                updateAccountBalance(userId, newSourceBalance);
                updateAccountBalance(destinationAccount, newDestinationBalance);
                
                
            } else {
                
                response.sendRedirect("Transfer.jsp?error=insufficientBalance");
            }

            
            response.sendRedirect("Dashboard.jsp");
        } else {
            
            response.sendRedirect("Login.jsp");
        }
    }

	private void updateAccountBalance(String destinationAccount, double newDestinationBalance) {
		// TODO Auto-generated method stub
		
	}

	private double getAccountBalance(String userId) {
		// TODO Auto-generated method stub
		return 0;
	}
}

