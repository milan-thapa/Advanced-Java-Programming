package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementDatabaseUpdate {
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

            String query = "update students set name = ? where id = ?";

            // statement

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,"Krishna");
            preparedStatement.setInt(2,5);




            int rowsAffected = preparedStatement.executeUpdate();


            //

            if(rowsAffected>0){
                System.out.println("succesfully Updated data.");
            }else {
                System.out.println("unable to Updated data");
            }


        }catch (Exception e){
            System.out.println(e.getMessage());

        }







    }
}
