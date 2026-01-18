# KIỂM THỬ PHẦN MỀM

## Báo Cáo Kết Quả Chương 1

### 1. Kết quả thực hành trên "Can't Unsee"

Trong bài tập này, em đã thực hiện kiểm thử khả năng quan sát và nhận diện lỗi giao diện (UI) thông qua thử thách đào tạo thị giác.

* **Thứ hạng:** PLATINUM (Top 5% người chơi)
* **Tổng điểm:** 7,730
* **Thời gian hoàn thành:** 13:20

**Minh chứng kết quả:**

Kết quả Can't Unsee
<img width="1907" height="960" alt="Screenshot 2026-01-05 144755" src="https://github.com/user-attachments/assets/b1242eaa-a78c-4be6-a03e-fe8de94d861d" />



### 2. Phân tích & Bài học rút ra

Việc đạt mức điểm Platinum cho thấy em đã rèn luyện được các kỹ năng kiểm thử giao diện quan trọng:

1.  **Kiểm thử Pixel-Perfect:** Phát hiện sự sai lệch về khoảng cách (margin/padding) dù chỉ 1-2 pixel.
2.  **Kiểm thử Typography:** Nhận diện sự không đồng nhất về font chữ, độ đậm (weight) và khoảng cách dòng.
3.  **Kiểm thử tính nhất quán (Consistency):** Đảm bảo các thành phần giao diện tuân thủ quy tắc thiết kế chung (Design System).

---

## Bài tập thực hành kiểm thử với JUnit

### Chủ đề: Phân tích dữ liệu điểm số học sinh

### 1. Mô tả bài toán

Bài tập yêu cầu xây dựng một chương trình Java để phân tích dữ liệu điểm số của học sinh, đồng thời viết các ca kiểm thử đơn vị (unit test) bằng JUnit nhằm đảm bảo tính đúng đắn của chương trình.

Chương trình gồm lớp `StudentAnalyzer` với hai chức năng chính:

* **Đếm số lượng học sinh đạt loại Giỏi:** Dựa trên các tiêu chí điểm số hợp lệ.
* **Tính điểm trung bình:** Chỉ tính trên các giá trị điểm nằm trong khoảng cho phép (0 - 10).

### 2. Các chức năng chính

#### 2.1. `countExcellentStudents(List<Double> scores)`

* **Mô tả:** Đếm số học sinh có điểm >= 8.0.
* **Xử lý logic:** Bỏ qua các điểm không hợp lệ (< 0 hoặc > 10), bỏ qua giá trị `null`. Trả về `0` nếu danh sách rỗng.

#### 2.2. `calculateValidAverage(List<Double> scores)`

* **Mô tả:** Tính điểm trung bình của các điểm hợp lệ (0–10).
* **Xử lý logic:** Loại bỏ điểm không hợp lệ và `null`. Trả về `0` nếu không có điểm hợp lệ nào.

### 3. Cấu trúc thư mục dự án

```text
unit-test/
├── src/
│   └── StudentAnalyzer.java
├── test/
│   └── StudentAnalyzerTest.java
└── README.md
```
src/: Chứa mã nguồn thực thi chính của chương trình.

test/: Chứa các kịch bản kiểm thử đơn vị bằng JUnit 5.

4. Công cụ và công nghệ sử dụng
Ngôn ngữ: Java JDK 8 trở lên.

Thư viện: JUnit 5.

IDE: Eclipse.

Quản lý mã nguồn: Git & GitHub.

5. Hướng dẫn chạy kiểm thử đơn vị (JUnit)
Thao tác trên Eclipse:

Mở file StudentAnalyzerTest.java trong thư mục test/.

Chuột phải vào file hoặc vùng soạn thảo code.

Chọn Run As → JUnit Test.

Kết quả kiểm thử thực tế:

**Minh chứng kết quả:**

<img width="1044" height="618" alt="Screenshot 2026-01-14 165552" src="https://github.com/user-attachments/assets/7a44c9bd-c7aa-4727-b6b5-683ae525d19f" />




Phân tích kết quả thực hiện:

Thanh màu xanh (Green Bar): Toàn bộ 6/6 ca kiểm thử đã vượt qua thành công.

Trạng thái: Không có lỗi (0 Errors) và không có sai biệt (0 Failures).

Các kịch bản đã bao phủ:

NormalCase: Danh sách điểm hỗn hợp.

AllValid: Danh sách toàn điểm hợp lệ.

EmptyList: Danh sách rỗng.

BoundaryValues: Các giá trị biên và giá trị không hợp lệ.

6. Kết luận
Thông qua bài tập này, em đã nắm vững:

Thiết kế Test Suite: Biết cách xây dựng các bộ kiểm thử bao phủ các trường hợp biên và dữ liệu bất thường.

Sử dụng JUnit 5: Thành thạo việc sử dụng các Assertions để xác minh tính đúng đắn của logic.

Tổ chức dự án: Hiểu quy trình tổ chức dự án Java theo cấu trúc src/test tiêu chuẩn.

Kỹ năng công nghệ: Biết cách sử dụng Git để quản lý phiên bản mã nguồn và ứng dụng AI hỗ trợ trong quá trình lập trình.


### Hướng dẫn sử dụng:
1.  Tạo một file tên là `README.md` trong thư mục gốc dự án của bạn trên GitHub (hoặc trên máy tính).
2.  Copy toàn bộ nội dung trong khối mã (code block) ở trên.
3.  Paste vào file `README.md`.
4.  **Quan trọng:** Bạn cần thay thế các dòng chữ `link_anh_ket_qua_cant_unsee.png` và `link_anh_ket_qua_junit.png` bằng đường dẫn ảnh thực tế mà bạn đã upload lên repository của bạn để hình ảnh hiển thị đúng.


## Báo Cáo Kết Quả Chương 3

````markdown
# 🚀 Automation Testing with Cypress - SauceDemo

> **Môn học:** Kiểm thử phần mềm
> **Sinh viên:** Nguyễn Hoàng Ân
> **MSSV:** BCS230127

## 📖 Giới thiệu (Overview)

Dự án này thực hiện kiểm thử tự động End-to-End (E2E) cho trang web thương mại điện tử [SauceDemo](https://www.saucedemo.com/). Mục tiêu là đảm bảo tính toàn vẹn của các chức năng quan trọng như Đăng nhập, Quản lý giỏ hàng và Quy trình thanh toán.

## 🛠 Công nghệ sử dụng (Tech Stack)

| Công nghệ              | Phiên bản | Mục đích                       |
| ---------------------- | --------- | ------------------------------ |
| **Cypress**            | v13.x     | Framework kiểm thử tự động E2E |
| **JavaScript**         | ES6+      | Ngôn ngữ kịch bản kiểm thử     |
| **Node.js**            | v14+      | Môi trường chạy                |
| **Visual Studio Code** | Latest    | Trình soạn thảo mã nguồn       |

## ⚙️ Hướng dẫn cài đặt (Installation)

Để chạy dự án này trên máy cục bộ, vui lòng làm theo các bước sau:

1. **Clone dự án:**
   ```bash
   git clone [https://github.com/hiang0910/kiemthuphanmem.git](https://github.com/hiang0910/kiemthuphanmem.git)
   cd kiemthuphanmem
   ```
````

2. **Chuyển nhánh (Quan trọng):**
   Code của phần bài tập này nằm trên nhánh riêng biệt:

```bash
git checkout bai-tap-cypress

```

3. **Cài đặt thư viện:**

```bash
npm install

```

## ▶️ Hướng dẫn chạy kiểm thử (Execution)

Bạn có thể chạy kiểm thử theo 2 cách:

- **Chế độ giao diện (Test Runner):** Dùng để viết và debug test.

```bash
npx cypress open

```

- **Chế độ ngầm (Headless):** Dùng để chạy nhanh và lấy báo cáo.

```bash
npx cypress run

```

## 📂 Cấu trúc thư mục (Folder Structure)

```text
📦 kiemthuphanmem
 ┣ 📂 cypress
 ┃ ┣ 📂 e2e
 ┃ ┃ ┣ 📜 login_spec.cy.js    # Kịch bản Login
 ┃ ┃ ┗ 📜 cart_spec.cy.js     # Kịch bản Cart & Checkout
 ┃ ┗ 📂 support
 ┣ 📜 cypress.config.js
 ┣ 📜 package.json
 ┗ 📜 README.md

```

## ✅ Danh sách Test Case (Checklist)

### 1. Module Đăng nhập (Login)

- [x] **TC01:** Đăng nhập thành công với tài khoản hợp lệ.
- [x] **TC02:** Báo lỗi khi nhập sai Username/Password.

### 2. Module Giỏ hàng (Shopping Cart)

- [x] **TC03:** Thêm sản phẩm vào giỏ hàng thành công.
- [x] **TC04:** Xóa sản phẩm khỏi giỏ hàng -> Giỏ hàng trống.
- [x] **TC05:** Sắp xếp sản phẩm theo giá (Thấp -> Cao).

### 3. Module Thanh toán (Checkout)

- [x] **TC06:** Quy trình thanh toán từ Giỏ hàng -> Hoàn tất đơn hàng.

---

© 2026 Developed by Hoang An


