# BÁO CÁO KẾT QUẢ CHƯƠNG 1

## 1. Kết quả thực hành trên "Can't Unsee"
Trong bài tập này, em đã thực hiện kiểm thử khả năng quan sát và nhận diện lỗi giao diện (UI) thông qua thử thách đào tạo thị giác.

* **Thứ hạng:** PLATINUM (Top 5% người chơi)
* **Tổng điểm:** 7,990
* **Thời gian hoàn thành:** 06:02

**Minh chứng kết quả:**
![Uploading Screenshot 2026-01-05 144755.png…]()



### Phân tích & Bài học rút ra
Việc đạt mức điểm Platinum cho thấy em đã rèn luyện được các kỹ năng kiểm thử giao diện quan trọng:
* **Kiểm thử Pixel-Perfect:** Phát hiện sự sai lệch về khoảng cách (margin/padding) dù chỉ 1-2 pixel.
* **Kiểm thử Typography:** Nhận diện sự không đồng nhất về font chữ, độ đậm (weight) và khoảng cách dòng.
* **Kiểm thử tính nhất quán (Consistency):** Đảm bảo các thành phần giao diện tuân thủ quy tắc thiết kế chung (Design System).

---

## 2. Bài tập thực hành kiểm thử với JUnit

**Chủ đề:** Phân tích dữ liệu điểm số học sinh

### Mô tả bài toán
Bài tập yêu cầu xây dựng một chương trình Java để phân tích dữ liệu điểm số của học sinh, đồng thời viết các ca kiểm thử đơn vị (unit test) bằng JUnit nhằm đảm bảo tính đúng đắn của chương trình.

Chương trình gồm lớp `StudentAnalyzer` với hai chức năng chính:
1.  **Đếm số lượng học sinh đạt loại Giỏi:** Dựa trên các tiêu chí điểm số hợp lệ.
2.  **Tính điểm trung bình:** Chỉ tính trên các giá trị điểm nằm trong khoảng cho phép (0 - 10).

### Các chức năng chính

**2.1. countExcellentStudents(List scores)**
* **Mô tả:** Đếm số học sinh có điểm >= 8.0.
* **Xử lý logic:** Bỏ qua các điểm không hợp lệ (< 0 hoặc > 10), bỏ qua giá trị `null`. Trả về 0 nếu danh sách rỗng.

**2.2. calculateValidAverage(List scores)**
* **Mô tả:** Tính điểm trung bình của các điểm hợp lệ (0–10).
* **Xử lý logic:** Loại bỏ điểm không hợp lệ và `null`. Trả về 0 nếu không có điểm hợp lệ nào.

### 3. Cấu trúc thư mục dự án

```text
unit-test/
├── src/
│   └── StudentAnalyzer.java
├── test/
│   └── StudentAnalyzerTest.java
└── README.md
