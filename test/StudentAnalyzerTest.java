import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentAnalyzerTest {

    // Khởi tạo đối tượng cần test
    StudentAnalyzer analyzer = new StudentAnalyzer();

    // --- Test case cho hàm đếm HS Giỏi ---
    @Test
    public void testCountExcellentStudents() {
        // 1. Test trường hợp thường: Có giỏi, khá, và điểm sai
        List<Double> scores = Arrays.asList(9.0, 8.0, 7.5, 11.0, -2.0);
        // Kỳ vọng: 2 người (9.0 và 8.0). Điểm 11.0 và -2.0 bị bỏ qua.
        assertEquals(2, analyzer.countExcellentStudents(scores));

        // 2. Test trường hợp danh sách rỗng
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));

        // 3. Test biên: 7.9 (không giỏi) và 8.0 (giỏi)
        assertEquals(1, analyzer.countExcellentStudents(Arrays.asList(7.9, 8.0)));
    }

    // --- Test case cho hàm tính Trung bình ---
    @Test
    public void testCalculateValidAverage() {
        // 1. Test tính toán chuẩn
        // (8.0 + 9.0 + 10.0) / 3 = 9.0
        assertEquals(9.0, analyzer.calculateValidAverage(Arrays.asList(8.0, 9.0, 10.0)), 0.01);

        // 2. Test bỏ qua điểm sai
        // (10.0 + 20.0 + -5.0) -> Chỉ tính 10.0 -> Trung bình = 10.0
        assertEquals(10.0, analyzer.calculateValidAverage(Arrays.asList(10.0, 20.0, -5.0)), 0.01);

        // 3. Test không có điểm nào hợp lệ -> Trả về 0
        assertEquals(0.0, analyzer.calculateValidAverage(Arrays.asList(-1.0, 100.0)), 0.01);
    }
}