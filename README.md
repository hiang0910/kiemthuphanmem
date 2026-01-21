# BÁO CÁO KIỂM THỬ HIỆU NĂNG (PERFORMANCE TEST REPORT)

**Dự án:** JMETET
**Người thực hiện:** NGUYỄN HOÀNG ÂN - BCS230127
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

![Scenario 2 Result](./images/result_scenario_2.png)
_(Chèn ảnh screenshot Summary Report của kịch bản 2 vào đây)_

#### Kết quả Scenario 3

![Scenario 3 Result](./images/result_scenario_3.png)
_(Chèn ảnh screenshot Summary Report của kịch bản 3 vào đây)_

---

## 4. Phân tích & Đánh giá

### Về thời gian phản hồi (Response Time):

- **Ở mức tải thấp (Scenario 1):** Tốc độ phản hồi trung bình là **578ms**. Đây là mức [Tốt / Chấp nhận được / Chậm] đối với trải nghiệm người dùng.
- **Ở mức tải cao (Scenario 2):** Thời gian phản hồi [Tăng nhẹ / Tăng đột biến] lên mức [....]ms.

### Về tỷ lệ lỗi (Error Rate):

- Hệ thống [Hoạt động mượt mà với 0% lỗi / Bắt đầu xuất hiện lỗi 503, 500...] khi số lượng người dùng tăng lên 50.

### Về khả năng xử lý (Throughput):

- Hệ thống xử lý được khoảng [....] yêu cầu/giây ở mức tải cao nhất.

### ➤ Kết luận chung:

Website [Đạt / Không đạt] yêu cầu về hiệu năng cơ bản. Có thể chịu được khoảng [20-50] người dùng cùng lúc mà không bị sập.

---
