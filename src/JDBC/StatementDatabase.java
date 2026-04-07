package JDBC;

import java.sql.*;

public class StatementDatabase {


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

            // statement

            Statement statement = connection.createStatement();



            // query execution
            // query statement is same as a mysql query

            String query = "select * from students";


          ResultSet resultSet = statement.executeQuery(query);


          // while loop to get all data from database

            while(resultSet.next()){

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                double marks = resultSet.getDouble("marks");



                // now display the data to the java console

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Marks: " + marks);
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }








    }
}
