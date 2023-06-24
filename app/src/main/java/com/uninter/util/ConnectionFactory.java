package com.uninter.util;


import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/taskapp";
    public static final String USER = "root";
    public static final String PASS = "Trycatch#29java";

    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception ex){
            throw new RuntimeException("Erro na conexão com o banco de dados", ex);
        }
    }
}

