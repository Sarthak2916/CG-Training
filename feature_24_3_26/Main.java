package org.example;

public class Main {

    public static void main(String[] args) {

        MySQLOperations.getConnection();
        String tableName= "StudentRecords";
//        MySQLOperations.createTable(tableName);

        Student student1= new Student(1,"Sarthak", "CSE");
//        Student student2= new Student(2,"Jai", "CSE");
//        Student student3= new Student(3,"Jyanshu", "MBA");
//
        MySQLOperations.insertRow(student1, tableName);
//        MySQLOperations.insertRow(student2, tableName);
//        MySQLOperations.insertRow(student3, tableName);

        Student st= MySQLOperations.getRowById(1,tableName);

        System.out.println(st.toString());

        MySQLOperations.updateNameById(st.getId(),"Geralt",tableName);
        st= MySQLOperations.getRowById(1,tableName);
        System.out.println(st.toString());

        MySQLOperations.deleteRowBYId(st.getId(),tableName);

        MySQLOperations.closeConnection();

    }
}