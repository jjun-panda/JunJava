package saramDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SaramJdbcEx {
    public static void main(String[] args) {
        Connection conn = JdbcUtil.getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM SARAM";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while(rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.printf("%s %s %d\n", id, name, age);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
