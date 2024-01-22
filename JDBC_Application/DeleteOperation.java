package JDBC_Application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteOperation {
    public static void main(String[] args) {

        try {
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/Sec_DB","root","root");
            String sql="delete from employee where id=?";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);

            preparedStatement.setInt(1, 3);

            if(preparedStatement.executeUpdate()>0)
            {
                System.out.println("delete Updated!!");
            }
            else
            {
                System.out.println("Problem in delete operation!!");
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }


    }
}
