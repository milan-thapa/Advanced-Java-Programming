package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementDatabaseInsert {
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




            // query

            String query = "INSERT INTO students(name, age, marks) VALUES (?,?,?)";

            // statement

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,"Aswin");
            preparedStatement.setInt(2,22);
            preparedStatement.setInt(3,80);



            int rowsAffected = preparedStatement.executeUpdate();


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
