package saramDB;

import java.sql.SQLException;
import java.util.List;

public class SaramControllerTest {
    static SaramDAO dao = new SaramDAO();
    
    // 실제 출력 
    public static void main(String[] args) throws SQLException {
        SaramDTO dto  = new SaramDTO("Park", "박코딩", 20);
        dao.insert(dto);
        testSelectAll();
    }

    public static void testSelectTwo() {
        SaramDTO dto  = new SaramDTO("kim3", "김길동3", 30);
        dao.insert(dto);
        // testSelectAll();
    }

    public static void testSelectOne() {
        SaramDTO dto  = new SaramDTO("kim3", "null", 0);
        SaramDTO saram = dao.selectOne(dto);
        System.out.println(saram);
    }

    public static void testSelectAll() throws SQLException {
        List<SaramDTO> list = dao.selectAll();
        System.out.println(list);
    }
}
