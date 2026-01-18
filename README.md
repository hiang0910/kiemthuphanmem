

##Báo cáo bài tập chương 3

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

© 2026 Developed by [Tên của bạn]






