package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementDatabaseDelete {
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

            String query = "delete from students where id = ?";

            // statement

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,5);





            int rowsAffected = preparedStatement.executeUpdate();


            //

            if(rowsAffected>0){
                System.out.println("succesfully deleted data.");
            }else {
                System.out.println("unable to delete data");
            }


        }catch (Exception e){
            System.out.println(e.getMessage());

        }







    }
}
