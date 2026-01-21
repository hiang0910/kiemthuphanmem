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
