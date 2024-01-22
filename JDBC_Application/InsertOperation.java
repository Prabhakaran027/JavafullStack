package JDBC_Application;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertOperation {

    public static void main(String[] args) {
        try
        {

            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Sec_DB", "root", "root");

            String  sql="insert into employee values(?,?,?,?,?)";

            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1, 4);
            preparedStatement.setString(2, "sandy");
            preparedStatement.setString(3,"X");
            preparedStatement.setInt(4, 7);
            preparedStatement.setString(5, "sandy@gmail.com");


            if(preparedStatement.executeUpdate()>0)
            {
                System.out.println("Record inserted!!");
            }
            else
            {
                System.out.println("Problem in data insertion!!");
            }

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

}
