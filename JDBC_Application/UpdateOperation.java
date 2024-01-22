package JDBC_Application;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UpdateOperation {

    public static void main(String[] args) {

        try {
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Sec_DB","root","root");
            String sql="update employee set sname=?, email=?, roll=?, class=? where id=?";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1, "Arun");
            preparedStatement.setString(2, "arun@gmail.com");
            preparedStatement.setInt(3, 9);
            preparedStatement.setString(4, "XII");
            preparedStatement.setInt(5, 3);

            if(preparedStatement.executeUpdate()>0)
            {
                System.out.println("Record Updated!!");
            }
            else
            {
                System.out.println("Problem in update operation!!");
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }


    }

}
