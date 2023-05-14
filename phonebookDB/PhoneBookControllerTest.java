package phonebookDB;

import java.sql.SQLException;
import java.util.List;

public class PhoneBookControllerTest {
    static PhoneBookDAO dao = new PhoneBookDAO();
    
    // 실제 출력 
    public static void main(String[] args) throws SQLException {
        PhoneBookDTO dto  = new PhoneBookDTO(1, "Kim Coding", "010-9876-1234", "hello@saram.com", "Busan");
        dao.insert(dto);
        testSelectAll();
    }


    public static void testSelectOne() {
        PhoneBookDTO dto  = new PhoneBookDTO(1, "Kim Coding", "010-9876-1234", "hello@saram.com", "Busan");
        PhoneBookDTO phonebook = dao.selectOne(dto);
        System.out.println(phonebook);
    }

    public static void testSelectAll() throws SQLException {
        List<PhoneBookDTO> list = dao.selectAll();
        System.out.println(list);
    }
}
