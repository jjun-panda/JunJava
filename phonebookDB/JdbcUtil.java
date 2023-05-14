package phonebookDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcUtil {
    public static Connection getConnection() {
        String url = "jdbc:mariadb://localhost:3306/jjun";
        String user = "jjun";
        String password = "jjun";
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 검색 실패!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("DB접속 실패!");
            e.printStackTrace();
        }
        return null;
    }

    public static void close(Connection conn) {
        if(conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(PreparedStatement o) {
        if(o != null) {
            try {
                o.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void close(ResultSet o) {
        if(o != null) {
            try {
                o.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(getConnection());
    }

    public static void close(Connection conn, PreparedStatement stmt, ResultSet rs) {
        close(conn);
        close(stmt);
        close(rs);
    }
}