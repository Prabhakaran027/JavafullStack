package JDBC_Application;

import java.sql.*;

public class TableInfoUsingResultSetMetaData {
    public static void main(String[] args) {

        try {
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/thriddb", "root", "root");
            PreparedStatement preparedStatement=connection.prepareStatement("select * from books");
            ResultSet resultSet=preparedStatement.executeQuery();

            ResultSetMetaData metaData=resultSet.getMetaData();

            System.out.println("Number of columns: "+metaData.getColumnCount());
            System.out.println("Column Name: "+metaData.getColumnName(3));
            System.out.println("Column Type: "+metaData.getColumnType(3));
            System.out.println("Display Size: "+metaData.getColumnDisplaySize(3));
            System.out.println("label: "+metaData.getColumnLabel(3));
            System.out.println("Column class Name: "+metaData.getColumnClassName(3));
            System.out.println("Schema Name: "+metaData.getSchemaName(2));


        }

        catch (SQLException e) {

            e.printStackTrace();
        }


    }

}
