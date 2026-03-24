package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLOperations {

    private static volatile Connection connection;

    public static Connection getConnection(){

        if(connection==null){

            synchronized (MySQLOperations.class){
                if(connection==null){
                    try{
                        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/cgt","root","ss108036**");

                    } catch(SQLException e){
                        e.printStackTrace();
                    }
                }
            }
        }
        return connection;
    }

    public static void closeConnection(){

        if(connection!=null){

            synchronized (MySQLOperations.class){
                if(connection!=null){
                    try{
                        connection.close();
                        System.out.println("Connection closed successfully");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                connection=null;
            }
        }
    }

    public static void createTable(String tableName){

        if(connection!=null) {
            try {
                Statement st= connection.createStatement();
                st.execute("create table "+tableName+"(ID int, Name varchar(40), Course varchar(40))");
                System.out.println("Table "+tableName+" created successfully");

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else{
            getConnection();
            createTable(tableName);
        }
    }

    public static void insertRow(Student student, String tableName){

        if(connection!=null){
            try{
                PreparedStatement ps= connection.prepareStatement("insert into "+tableName+" values(?,?,?)");
                ps.setString(1, Integer.toString(student.getId()));
                ps.setString(2,student.getName());
                ps.setString(3,student.getCourse());

                System.out.println("rows affected: "+ps.executeUpdate());

            } catch(SQLException e){
                e.printStackTrace();
            }
        }
    }

    public static List<Student> getAllRows(String tableName){
        List<Student> ans= new ArrayList<>();
        try{
            Statement st= connection.createStatement();
            ResultSet rs= st.executeQuery("select * from "+tableName);
            while(rs.next()){
                Student student= new Student(Integer.parseInt(rs.getString(1)),rs.getString(2),rs.getString(3));
                ans.add(student);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return ans;
    }

    public static Student getRowById(int id, String tableName){

        Student ans=null;
        try{
            Statement st= connection.createStatement();
            ResultSet rs= st.executeQuery("select * from "+tableName+" where ID="+id);
            while(rs.next()){
                ans= new Student(Integer.parseInt(rs.getString(1)),rs.getString(2),rs.getString(3));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return ans;
    }

    public static void deleteRowBYId(int id, String tableName){
        try{
            Statement st = connection.createStatement();
            int rows_affected = st.executeUpdate("DELETE FROM "+tableName+" where id = " + id);
            if(rows_affected >= 1){
                System.out.println("Row with id " + id + " has been successfully deleted");
            }

        }catch(SQLException e){
            e.printStackTrace();
        }

    }

    public static void updateNameById(int id, String updatedName ,String tableName){
        try{
            PreparedStatement st= connection.prepareStatement("update "+tableName+" set name=? where id=?");
            st.setString(1,updatedName);
            st.setInt(2,id);
           int rows_affected= st.executeUpdate();
            if(rows_affected>=1){
                System.out.println("Row with id "+id+" has been updated successfully");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }





}