package d2;

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
 
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    public UpdateServlet() {
        super();
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String newName = request.getParameter("newName");
        int newAge = Integer.parseInt(request.getParameter("newAge"));
        Connection con = null;
 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
 
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assign", "root", "Nandhini@1975");
            System.out.println("Connection Established...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
 
        try {
            PreparedStatement s = con.prepareStatement("UPDATE persons SET name = ?, age = ? WHERE id = ?");
            s.setString(1, newName);
            s.setInt(2, newAge);
            s.setInt(3, id);
            int x = s.executeUpdate();
            if (x != 0) {
                response.getWriter().println("Record Updated...");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
 