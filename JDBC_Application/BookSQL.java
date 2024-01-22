package JDBC_Application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BookSQL {
    public static void main(String[] args) {
        try
        {

            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/thriddb", "root", "root");

            String  sql="insert into books values(?,?,?,?,?)";

            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1, 3);
            preparedStatement.setString(2, "Book3");
            preparedStatement.setString(3,"sandy");
            preparedStatement.setString(4, "horror");
            preparedStatement.setInt(5, 300);


            PreparedStatement preparedStatement1=connection.prepareStatement(sql);

            preparedStatement1.setInt(1, 4);
            preparedStatement1.setString(2, "Book4");
            preparedStatement1.setString(3,"yav");
            preparedStatement1.setString(4, "love");
            preparedStatement1.setInt(5, 1200);


            PreparedStatement preparedStatement2=connection.prepareStatement(sql);

            preparedStatement2.setInt(1, 5);
            preparedStatement2.setString(2, "Book5");
            preparedStatement2.setString(3,"hari");
            preparedStatement2.setString(4, "love");
            preparedStatement2.setInt(5, 500);


            if(preparedStatement.executeUpdate()>0)
            {
                System.out.println("Record inserted!!");
            }if (preparedStatement1.executeUpdate()>0)
            {
                System.out.println("Record inserted!!");
            }
            if(preparedStatement2.executeUpdate()>0)
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
