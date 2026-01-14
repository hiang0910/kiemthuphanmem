# BÁO CÁO KẾT QUẢ – CHƯƠNG 1

## 1. Thực hành kiểm thử UI với **Can't Unsee**

### Mục tiêu

Rèn luyện khả năng quan sát và phát hiện lỗi giao diện (UI) thông qua bài tập đào tạo thị giác.

### Kết quả đạt được

* **Thứ hạng:** PLATINUM (Top 5% người chơi)
* **Tổng điểm:** 7,730
* **Thời gian hoàn thành:** 13:20

### Minh chứng
![Kết quả Can't Unsee](![Uploading Screenshot 2026-01-05 144755.png…]()
)



### Phân tích & bài học rút ra

* **Pixel-Perfect Testing:** Phát hiện sai lệch margin/padding chỉ từ 1–2 pixel.
* **Typography Testing:** Nhận diện sự không đồng nhất về font, font-weight và line-height.
* **Consistency Testing:** Kiểm tra tính nhất quán của các thành phần UI theo Design System.

---

## 2. Bài tập kiểm thử đơn vị với **JUnit 5**

### Chủ đề

Phân tích dữ liệu điểm số học sinh bằng Java và kiểm thử đơn vị bằng JUnit.

### Mô tả bài toán

Xây dựng lớp `StudentAnalyzer` để xử lý dữ liệu điểm số và viết các ca kiểm thử nhằm đảm bảo tính đúng đắn của chương trình.

### Chức năng chính

#### 2.1. `countExcellentStudents(List<Double> scores)`

* **Mô tả:** Đếm số học sinh có điểm **>= 8.0**.
* **Xử lý:**

  * Bỏ qua giá trị `null`.
  * Bỏ qua điểm không hợp lệ (**< 0** hoặc **> 10**).
  * Trả về **0** nếu danh sách rỗng hoặc không có điểm hợp lệ.

#### 2.2. `calculateValidAverage(List<Double> scores)`

* **Mô tả:** Tính điểm trung bình của các điểm hợp lệ trong khoảng **0 – 10**.
* **Xử lý:**

  * Loại bỏ `null` và điểm không hợp lệ.
  * Trả về **0** nếu không tồn tại điểm hợp lệ.

---

## 3. Cấu trúc thư mục dự án

```
unit-test/
├── src/
│   └── StudentAnalyzer.java
├── test/
│   └── StudentAnalyzerTest.java
└── README.md
```

---

## 4. Công cụ & công nghệ sử dụng

* **Ngôn ngữ:** Java (JDK 8+)
* **Thư viện kiểm thử:** JUnit 5
* **IDE:** Eclipse
* **Quản lý mã nguồn:** Git & GitHub

---

## 5. Hướng dẫn chạy kiểm thử (JUnit)

Thực hiện trên **Eclipse**:

1. Mở file `StudentAnalyzerTest.java` trong thư mục `test/`.
2. Chuột phải vào file hoặc vùng soạn thảo mã nguồn.
3. Chọn **Run As → JUnit Test**.

### Kết quả mong đợi

* Thanh trạng thái **màu xanh (Green Bar)**.
* **6/6** ca kiểm thử chạy thành công.
* **0 Errors**, **0 Failures**.

### Các kịch bản đã bao phủ

* **NormalCase:** Danh sách điểm hỗn hợp.
* **AllValid:** Tất cả điểm hợp lệ.
* **EmptyList:** Danh sách rỗng.
* **BoundaryValues:** Giá trị biên và điểm không hợp lệ.

---

## 6. Kết luận

Thông qua chương này, em đã đạt được:

* **Kỹ năng kiểm thử UI:** Nâng cao khả năng phát hiện lỗi giao diện chi tiết.
* **Thiết kế Test Suite:** Xây dựng bộ kiểm thử bao phủ cả trường hợp biên và dữ liệu bất thường.
* **Sử dụng JUnit 5:** Thành thạo Assertions và quy trình kiểm thử đơn vị.
* **Tổ chức dự án:** Hiểu và áp dụng cấu trúc chuẩn `src/test` trong Java.
* **Kỹ năng công cụ:** Sử dụng Git/GitHub và AI hỗ trợ hiệu quả trong quá trình học tập và phát triển phần mềm.
