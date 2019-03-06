package com.example;

import java.sql.*;

public class TestConnection {
    static final String url = "jdbc:oracle:thin:@192.168.3.199:1521:joyin";
    static final String username = "myjoyin1";
    static final String password = "joyin123";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection conn = DriverManager.getConnection(url, username, password);
        PreparedStatement ps = conn.prepareStatement("select 1 from dual");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1));
        }

    }
}
