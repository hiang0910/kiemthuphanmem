import java.util.List;

public class StudentAnalyzer {

    /**
     * Phân tích điểm số và trả về số lượng học sinh đạt loại Giỏi.
     */
    public int countExcellentStudents(List<Double> scores) {
        if (scores == null || scores.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (Double score : scores) {
            if (score < 0 || score > 10) continue;
            if (score >= 8.0) count++;
        }
        return count;
    }

    /**
     * Tính điểm trung bình hợp lệ (từ 0 đến 10).
     * Bỏ qua các điểm < 0 hoặc > 10.
     */
    public double calculateValidAverage(List<Double> scores) {
        if (scores == null || scores.isEmpty()) {
            return 0.0;
        }

        double sum = 0;
        int validCount = 0;

        for (Double score : scores) {
            // Chỉ cộng điểm hợp lệ
            if (score >= 0 && score <= 10) {
                sum += score;
                validCount++;
            }
        }

        // Tránh lỗi chia cho 0
        if (validCount == 0) {
            return 0.0;
        }

        return sum / validCount;
    }
}