package jdbcdemos;


import java.sql.*;
import java.util.Scanner;
 
public class persons {
    private static Connection con = null;
    private static Statement stmt = null;
	private static int id;
 
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assign", "root", "Nandhini@1975");
            stmt = con.createStatement();
 
            createTable();
 
            System.out.println("Table 'persons' created.");
 
            int userChoice;
            do {
                System.out.println("\n1. Insert Data");
                System.out.println("2. Select Data");
                System.out.println("3. Delete Record");
                System.out.println("0. Exit");
                System.out.println("Enter your choice:");
 
                @SuppressWarnings("resource")
                Scanner scanner = new Scanner(System.in);
                userChoice = scanner.nextInt();
 
                switch (userChoice) {
                    case 1:
                        insertData();
                        break;
                    case 2:
                        selectData();
                        break;
                    case 3:
                        deleteRecord();
                        break;
                    case 0:
                        System.out.println("Exiting the program.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            } while (userChoice != 0);
 
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources();
        }
    }
    private static void createTable() throws SQLException {
        // Create a table for persons
        String createTableSQL = "CREATE TABLE IF NOT EXISTS persons ("
                + "id INT AUTO_INCREMENT PRIMARY KEY ,"
                + "name VARCHAR(255),"
                + "age INT)";
        stmt.executeUpdate(createTableSQL);
    }
 
    private static void insertData() throws SQLException {
        // Insert data into the persons table
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter person's id:");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.println("Enter person's name:");
        String name = scanner.nextLine();
 
        System.out.println("Enter person's age:");
        int age = scanner.nextInt();
 
        String insertDataSQL = "INSERT INTO persons (id, name, age) VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = con.prepareStatement(insertDataSQL)) {
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3, age);
            preparedStatement.executeUpdate();
        }

        System.out.println("Record inserted.");
    }
    private static void selectData() throws SQLException {
        // Select data from the persons table
        System.out.println("Selecting records");
        String selectDataSQL = "SELECT * FROM persons";
        ResultSet resultSet = stmt.executeQuery(selectDataSQL);
 
        // Display the data
        while (resultSet.next()) {
            int resultId = resultSet.getInt("id");
            String resultName = resultSet.getString("name");
            int resultAge = resultSet.getInt("age");
 
            System.out.println("ID: " + resultId + ", Name: " + resultName + ", Age: " + resultAge);
        }
    }
 
    private static void deleteRecord() throws SQLException {
        // Delete a record by providing an ID
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ID of the record you want to delete:");
        int idToDelete = scanner.nextInt();
 
        String deleteRecordSQL = "DELETE FROM persons WHERE id = ?";
        try (PreparedStatement deleteStatement = con.prepareStatement(deleteRecordSQL)) {
            deleteStatement.setInt(1, idToDelete);
            int rowsAffected = deleteStatement.executeUpdate();
 
            if (rowsAffected > 0) {
                System.out.println("Record with ID " + idToDelete + " deleted successfully.");
            } else {
                System.out.println("No record found with ID " + idToDelete + ".");
            }
        }
    }
 
    private static void closeResources() {
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		persons.id = id;
	}
}