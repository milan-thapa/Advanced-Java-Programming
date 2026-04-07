package JDBC;

import java.sql.*;

public class PreparedStatementDatabaseRetrieve {

    // connection variables

    public static String url = "jdbc:mysql://localhost:3306/mydb";
    public static String username = "root";
    public static String password = "@Milan2003#mysql";

    public  static  void main(String[] args){


        // load driver

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

        }catch(ClassNotFoundException e){

            System.out.println(e.getMessage());

        }



        // create connection


        try {

            // connection interface

            Connection connection = DriverManager.getConnection(url,username,password);





            // query execution
            // query statement is same as a mysql query

            String query = "select marks from students where id = ?";


            // statement

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1,1);


            ResultSet resultSet = preparedStatement.executeQuery();


            // while loop to get all data from database

            while(resultSet.next()){

                double marks = resultSet.getDouble("marks");



                // now display the data to the java console


                System.out.println("Marks: " + marks);
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }








    }
}
