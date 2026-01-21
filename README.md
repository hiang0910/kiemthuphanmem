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

# BÁO CÁO KẾT QUẢ CHƯƠNG 4

**Dự án:** Jmeter
**Người thực hiện:** Nguyễn Hoàng Ân - BCS230127
**Công cụ:** Apache JMeter 5.6.3

---

## 1. Mục tiêu kiểm thử

Thực hiện kiểm thử hiệu năng đối với website **https://the-internet.herokuapp.com/** nhằm:

- Đánh giá khả năng chịu tải của hệ thống dưới các mức độ truy cập khác nhau.
- Đo lường thời gian phản hồi (Response Time) trung bình.
- Xác định điểm gãy (Breaking point) hoặc lỗi khi hệ thống chịu tải cao.

---

## 2. Thiết kế kịch bản (Test Scenarios)

File kịch bản: `performance_test.jmx`

### 🟢 Scenario 1: Truy cập cơ bản (Baseline Test)

_Mục đích: Kiểm tra độ ổn định của hệ thống với lượng truy cập nhỏ._

- **Số lượng người dùng (Threads):** 10
- **Thời gian khởi động (Ramp-up):** 1 giây
- **Số lần lặp (Loop Count):** 5
- **Hành vi:** Truy cập Trang chủ (Homepage).

### 🟡 Scenario 2: Tải nặng (Stress/Load Test)

_Mục đích: Mô phỏng giờ cao điểm để xem hệ thống xử lý ra sao._

- **Số lượng người dùng:** 50
- **Thời gian khởi động:** 30 giây
- **Số lần lặp:** 1
- **Hành vi:** Truy cập Trang chủ + [Tên trang con, ví dụ: Trang Đăng nhập/Sản phẩm].

### 🔴 Scenario 3: Độ bền (Endurance/Soak Test)

_Mục đích: Kiểm tra sự ổn định của server khi chạy liên tục trong một khoảng thời gian._

- **Số lượng người dùng:** 20
- **Thời gian chạy (Duration):** 60 giây (Constant Load)
- **Hành vi:** Truy cập ngẫu nhiên các trang con.

---

## 3. Kết quả thực nghiệm

### Bảng tóm tắt số liệu (Summary Report)

| Kịch bản       | Samples (Số mẫu) | Avg Response Time (ms) | Min (ms)  | Max (ms)  | Error Rate (%) | Throughput (req/sec) |
| :------------- | :--------------: | :--------------------: | :-------: | :-------: | :------------: | :------------------: |
| **Scenario 1** |        50        |          578           |    312    |   1924    |     0.00%      |         14.8         |
| **Scenario 2** |        100       |          810           |    308    |   1401    |     0.00%      |         3.2          |
| **Scenario 3** |        3320      |          333           |    299    |   1395    |   0.00  %      |         55.1         |

_(Lưu ý: Đơn vị thời gian là mili-giây. 1000ms = 1 giây)_
 
---

### Minh chứng kết quả (Evidence)

#### Kết quả Scenario 1


![Scenario 1 Result]<img width="1513" height="850" alt="Screenshot 2026-01-21 134029" src="https://github.com/user-attachments/assets/c1418912-3e83-4b3e-8fbc-bbe05e6aac63" />
_Nhận xét nhanh: Hệ thống phản hồi ổn định, không có lỗi._

#### Kết quả Scenario 2


![Scenario 2 Result] <img width="1512" height="852" alt="Screenshot 2026-01-21 134444" src="https://github.com/user-attachments/assets/c2cefe16-b5c4-4d4a-a91b-babcbb1b24d6" />
_(Chèn ảnh screenshot Summary Report của kịch bản 2 vào đây)_

#### Kết quả Scenario 3

![Scenario 3 Result]<img width="1919" height="1020" alt="Screenshot 2026-01-21 134718" src="https://github.com/user-attachments/assets/76e449f3-0753-4ce5-85b3-0cb3fea8b221" />

_(Chèn ảnh screenshot Summary Report của kịch bản 3 vào đây)_

---

## 4. Phân tích & Đánh giá

Dựa trên số liệu thu thập được:

### 1. Thời gian phản hồi (Response Time)
- **Scenario 1 (578ms):** Tốc độ phản hồi ở mức tốt (< 1 giây).
- **Scenario 2 (810ms):** Khi tăng lên 50 người dùng, thời gian phản hồi trung bình tăng lên nhưng vẫn nằm trong giới hạn chấp nhận được (< 2 giây).
    - *Lưu ý:* Trang chủ (Homepage) trong kịch bản 2 có độ trễ cao hơn (1292ms) so với trang con (329ms), cho thấy trang chủ có thể chứa nhiều tài nguyên nặng hơn.
- **Scenario 3 (333ms):** Khi duy trì 20 người dùng liên tục, hệ thống hoạt động rất mượt mà với độ trễ thấp nhất.

### 2. Độ ổn định & Tỷ lệ lỗi (Error Rate)
- **Tỷ lệ lỗi:** **0.00%** trong cả 3 kịch bản.
- Điều này chứng tỏ server cấu hình tốt, không bị quá tải (Overload) hay từ chối dịch vụ (Denial of Service) ở mức test hiện tại.

### 3. Khả năng xử lý (Throughput)
- Hệ thống đạt hiệu suất cao nhất ở Scenario 3 với **55.1 yêu cầu/giây**. Đây là con số ấn tượng cho thấy khả năng xử lý đồng thời (concurrency) của server rất tốt với các tác vụ nhẹ.

### ➤ Kết luận:
Website hoạt động **Ổn định** và **Đạt yêu cầu** về hiệu năng. Hệ thống có khả năng chịu tải tốt với 50 người dùng đồng thời mà không phát sinh lỗi.
---



