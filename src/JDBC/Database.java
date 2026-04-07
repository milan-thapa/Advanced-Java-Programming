package JDBC;
import  java.sql.*;

public class Database {



    // create connection

   private static  String url = "jdbc:mysql://localhost:3306/mydb";
   private static String username = "root";
   private static String password = "@Milan2003#mysql";




   public static void main(String[] args) {

       // 1.connect your ide with database using necessary connector
       // 2. load necessary drivers
       // 3. create connection
       // 4. create statement
       // 5. execute query




       // load driver
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");

    }catch (ClassNotFoundException e){
        System.out.println(e.getMessage());

    }





    // create connection - jdbc components - DriverManager class
   try {

       // connection interface

       Connection connection = DriverManager.getConnection(url,username,password);

       // statement
       Statement statement = connection.createStatement();

       // execute query - perform crud operation

       // view the data in database in java cmd

       String query = "select * from students";

       // data retrive from database do executequery method is used
      ResultSet resultSet = statement.executeQuery(query);

      // print table

       while(resultSet.next()){
           //local variable
           int id = resultSet.getInt("id");
           String name = resultSet.getNString("name");
           int age = resultSet.getInt("age");
           double marks = resultSet.getDouble("marks");

           // now print those values
           System.out.println("ID: " + id);
           System.out.println("Name: " + name);
           System.out.println("Age: " + age);
           System.out.println("Marks : " + marks);

       }



   }catch (SQLException e){
       System.out.println(e.getMessage());

   }






    }
}
