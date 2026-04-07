package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementDatabaseInsert {


    // connection variable

    public static String url= "jdbc:mysql://localhost:3306/mydb";
    public  static  String name = "root";
    public  static  String password = "@Milan2003#mysql";


  public   static void main(String[] args) {


      //load driver
      try{

          Class.forName("com.mysql.cj.jdbc.Driver");


      }catch (ClassNotFoundException e){
          System.out.println(e.getMessage());

      }



      // create connection

      try{

          // connection interface

          Connection connection = DriverManager.getConnection(url,name,password);

          // statement

          Statement statement = connection.createStatement();


          // query

          String query = String.format(
                  "INSERT INTO students(name, age, marks) VALUES ('%s', %d, %f)",
                  "Ram", 22, 86.70
          );


          int rowsAffected = statement.executeUpdate(query);


         //

          if(rowsAffected>0){
              System.out.println("succesfully inserted data.");
          }else {
              System.out.println("unable to insert data");
          }


      }catch (Exception e){
          System.out.println(e.getMessage());

      }







    }
}
