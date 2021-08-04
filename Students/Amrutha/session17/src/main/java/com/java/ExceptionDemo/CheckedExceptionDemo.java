package com.java.ExceptionDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.*;

public class CheckedExceptionDemo {
    static final String QUERY = "{call getEmpName (?, ?)}";
    public static void main(String[] args)
    {

        try
        {
            try {
                FileReader file = new FileReader("somefile.txt");
            } catch (FileNotFoundException e) {
                System.out.println(e);
            }
            try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
                CallableStatement stmt = conn.prepareCall(QUERY);
                ) {
                stmt.registerOutParameter(2, java.sql.Types.VARCHAR);
                stmt.execute();

            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        catch (Exception e)
        {

        }
    }
}
