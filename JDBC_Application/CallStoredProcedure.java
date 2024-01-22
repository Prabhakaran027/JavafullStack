package JDBC_Application;

import java.sql.*;

public class CallStoredProcedure {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sec_DB","root","root");
            CallableStatement callableStatement=connection.prepareCall("{call getEmployeeByID(?)}");
            callableStatement.setInt(1, 3);

            ResultSet resultSet=callableStatement.executeQuery();


            while(resultSet.next())
            {
                System.out.print(resultSet.getInt("id")+" ");
                System.out.print(resultSet.getString("sname")+" ");
                System.out.print(resultSet.getString("class")+" ");
                System.out.print(resultSet.getInt("roll")+" ");
                System.out.print(resultSet.getString("email")+" ");
                System.out.println();
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
