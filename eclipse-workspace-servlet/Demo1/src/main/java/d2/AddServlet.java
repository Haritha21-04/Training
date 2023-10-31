package d2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public AddServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
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
            PreparedStatement s = con.prepareStatement("insert into persons(id, name, age) values(?, ?, ?)");
            s.setInt(1, id);
            s.setString(2, name);
            s.setInt(3, age);
            int x = s.executeUpdate();
            if (x != 0) {
                PrintWriter out = response.getWriter();
                out.println("Record Inserted...");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
