package phonebookDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PhoneBookJdbcEx {
    public static void main(String[] args) {
        Connection conn = JdbcUtil.getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM PhoneBook";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while(rs.next()) {
                String no = rs.getString("no");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.printf("%s %s %d\n", no, name, age);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
