package phonebookDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhoneBookDAO {

    public static final String SELECT_ALL = "SELECT * FROM PHONEBOOK";
    public static final String SELECT_ONE = "SELECT * FROM PHONEBOOK WHERE NO=?";
    public static final String INSERT = "INSERT INTO PHONEBOOK(NO, NAME, PHONE, EMAIL, REAION) VALUES (?, ?, ?, ?, ?)";
    public static final String UPDATE = "UPDATE PHONEBOOK SET NAME=?, PHONE=?, EMAIL=?, REAION=? WHERE NO=?";
    public static final String DELETE = "DELETE FROM PHONEBOOK WHERE NO=?";

    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;

    // CRUD 기능 구현
    public List<PhoneBookDTO> selectAll() throws SQLException {
        List<PhoneBookDTO> list = new ArrayList<PhoneBookDTO>();
        conn = JdbcUtil.getConnection();
        try {
            stmt = conn.prepareStatement(SELECT_ALL);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int no = rs.getInt("no");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                String email = rs.getString("emill");
                String region = rs.getString("region");
                list.add(new PhoneBookDTO(no, name, phone, email, region));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(conn, stmt, rs);
        }
        return list;
    }

    public PhoneBookDTO selectOne(PhoneBookDTO dto) {
        PhoneBookDTO phonebook = null;

        conn = JdbcUtil.getConnection();
        try {
            stmt = conn.prepareStatement(SELECT_ONE);
            stmt.setInt(1, dto.getNo());
            rs = stmt.executeQuery();
            if (rs.next()) {
                int no = rs.getInt("no");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                String region = rs.getString("region");

                phonebook = new PhoneBookDTO(no, name, phone, email, region);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(conn, stmt, rs);
        }
        return phonebook;
    }

    public void insert(PhoneBookDTO dto) {
        conn = JdbcUtil.getConnection();
        try {
            stmt = conn.prepareStatement(INSERT);
            stmt.setInt(1, dto.getNo());
            stmt.setString(2, dto.getName());
            stmt.setString(3, dto.getPhone());
            stmt.setString(4, dto.getEmail());
            stmt.setString(5, dto.getRegion());
            int cnt = stmt.executeUpdate();
            if (cnt > 0) {
                System.out.println("입력 성공!");
            } else {
                System.out.println("입력 실패!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(conn, stmt, rs);
        }
    }
    public void update(PhoneBookDTO dto) {
        conn = JdbcUtil.getConnection();
        try {
            stmt = conn.prepareStatement(UPDATE);
            stmt.setInt(1, dto.getNo());
            stmt.setString(2, dto.getName());
            stmt.setString(3, dto.getPhone());
            stmt.setString(4, dto.getEmail());
            stmt.setString(5, dto.getRegion());
            int cnt = stmt.executeUpdate();
            if (cnt > 0) {
                System.out.println("수정 성공!");
            } else {
                System.out.println("수정 실패!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(conn, stmt, rs);
        }
    }
    public void delete(PhoneBookDTO dto) {
        conn = JdbcUtil.getConnection();
        try {
            stmt = conn.prepareStatement(DELETE);
            stmt.setInt(1, dto.getNo());
            int cnt = stmt.executeUpdate();
            if (cnt > 0) {
                System.out.println("삭제 성공!");
            } else {
                System.out.println("삭제 실패!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(conn, stmt, rs);
        }
    }
}
