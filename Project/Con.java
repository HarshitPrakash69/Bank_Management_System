package bank.management.system;

import java.sql.*;



public class Con {
    Connection connection;
    Statement statement;
    public Con(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "harshit25");
            statement = connection.createStatement();  //Project database ke saath connect hogya yaha se

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

    }
}
