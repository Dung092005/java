# Java — Ghi chú luyện tập & lab OOP

Repository tập hợp mã nguồn Java phục vụ học và ôn: **OOP**, **đa hình**, **abstract / interface**, **đóng gói**, **ngoại lệ**, **file I/O**. Thư mục được chia theo chủ đề để đối chiếu lý thuyết với bài code.

**GitHub:** [https://github.com/Dung092005/java](https://github.com/Dung092005/java)

> **Lưu ý:** Nếu trong thư mục gốc chưa có `README.md` (ví dụ OneDrive chưa đồng bộ), bạn có thể copy nội dung file này thành `README.md` ở gốc repo để GitHub hiển thị mặc định.

---

## Môi trường

| Thành phần | Ghi chú |
|------------|---------|
| JDK | Khuyến nghị JDK 11+ |
| Biên dịch | `javac -encoding UTF-8 -d bin ...` |
| Chạy | `java -cp bin package.ClassName` |

Thư mục `bin/` chứa `.class` sau biên dịch (nên không commit — xem `.gitignore`).

---

## Cấu trúc `src/` và kiến thức

### `ex_ab_inter.java` (cùng cấp thư mục `src/`)

Ôn **abstract class** và **interface** trong một ví dụ: `extends`, `implements`, khi nào dùng lớp trừu tượng vs giao diện.

---

### `first_revise/` — Ôn đầu khóa

| File | Nội dung |
|------|----------|
| `test.java`, `test2.java`, `test3.java` | Lớp, `main`, kế thừa cơ bản; theo file `.class` đã biên dịch có thể gồm **Employee**, **car**, **fan**, **airCondition**, **coolingDevice**. |

**Kiến thức:** constructor, phương thức, quan hệ *is-a*, tổ chức nhiều lớp liên quan.

---

### `revise/` — Hình học & đa hình

| File | Nội dung |
|------|----------|
| `revise.java` | **Point**, **Shape**, **Circle**, **Cylinder** — kế thừa, `@Override`, tính toán hình học. |
| `ex17.java` | Bài mở rộng (bài 17 trong phần ôn). |

**Kiến thức:** thiết kế cây kế thừa, ghi đè, đa hình qua biến kiểu cha.

---

### `last_rivise/` — Phân cấp thiết bị / máy tính

| File | Nội dung |
|------|----------|
| `test2.java`, `ex2_test2.java` | Kế thừa **computer**, **desktop**, **laptop**, **equipment**; có thể kèm đọc/ghi `equid.txt`. |

**Kiến thức:** nhiều tầng kế thừa, mô hình miền (domain) gần với thực tế.

---

### `labwork_on_class/` — Lab trên lớp

| File | Nội dung |
|------|----------|
| `Main.java` | Điểm vào chương trình. |
| `labwork.java`, `labwork2.java`, `labwork3.java` | Các phần lab theo buổi. |
| Lớp đi kèm | **Car**, **Motobike**, **Vector** — đối tượng và/hoặc toán vector. |

**Kiến thức:** tách `main` và logic, luyện viết nhiều lớp phối hợp.

---

### `oop_encapsulate/` — Đóng gói (encapsulation)

| File | Nội dung |
|------|----------|
| `Main.java` | Ví dụ với **Sinhvien**, **person** (theo tên class trong project). |
| `access_modifier.java` | Phạm vi **`public`**, **`protected`**, mặc định package, **`private`**. |

**Kiến thức:** ẩn trạng thái nội bộ, getter/setter, lợi ích bảo toàn invariant. Các bài dạng **Ex11** (Vector), **Ex13** (Car) xuất hiện trong output biên dịch.

---

### `polymorphism/` — Đa hình

| File | Nội dung |
|------|----------|
| `CastDemo.java` | **Upcast**, **downcast**, an toàn kiểu trước khi ép. |
| `excercise.java` | **Animal** → Dog/Cat; **vehicle** → car, bus, motobike. |
| `lythuyet.txt`, `upcast_downcast_intanceof.txt` | Ghi chú lý thuyết kèm repo. |

**Kiến thức:** binding động, `instanceof`, thiết kế API nhận tham số kiểu cha.

---

### `myabstract/` — Lớp trừu tượng

| File | Nội dung |
|------|----------|
| `knowledge.java` | Khái niệm `abstract` class/method, phương thức có thân vs chỉ khai báo. |
| `excercise.java` | **Animal**; nhân sự **employee**, **Fulltime_employee**, **parttime_employee**. |

**Kiến thức:** không khởi tạo trực tiếp lớp abstract, buộc lớp con hiện thực phương thức trừu tượng, dùng abstract làm “khung” chung.

---

### `myinterface/` — Giao diện

| File | Nội dung |
|------|----------|
| `knowledge.java` | `interface`, `implements`, hằng và phương thức `default` (Java 8+) nếu có trong bài. |
| `excercise.java` | Hành vi tách interface: **Flyable**, **Swimmable**, **playable**; lớp **Bird**, **Fish**, **Dog** — **một lớp implements nhiều interface**. |

**Kiến thức:** đa kế thừa kiểu interface, tách “hợp đồng” hành vi, so sánh với abstract class.

---

### `exceptionn/`

**`knowledge.java`** — `try` / `catch` / `finally`, ném và khai báo `throws`, phân biệt exception kiểm tra / không kiểm tra, xử lý lỗi có kiểm soát.

---

### `fileIO/` — Vào ra file

| Mục | Nội dung |
|-----|----------|
| `knowledge.java` | Thao tác file cơ bản, đường dẫn, đóng luồng. |
| `buffer_wr.java` | Đọc/ghi có **buffer** (hiệu năng, xử lý theo dòng). |
| `input.txt`, `output.txt`, `printWriter.txt` | Dữ liệu mẫu hoặc kết quả chạy thử. |

**Kiến thức:** `try-with-resources`, encoding, phân biệt luồng byte vs ký tự.

---

## Bảng tổng hợp chủ đề

| STT | Chủ đề | Thư mục / file tiêu biểu |
|-----|--------|-------------------------|
| 1 | Lớp, đối tượng, kế thừa cơ bản | `first_revise`, `revise`, `labwork_on_class` |
| 2 | Đóng gói & access | `oop_encapsulate` |
| 3 | Đa hình & ép kiểu | `polymorphism` |
| 4 | Abstract class | `myabstract`, `ex_ab_inter.java` |
| 5 | Interface | `myinterface`, `ex_ab_inter.java` |
| 6 | Exception | `exceptionn` |
| 7 | File I/O | `fileIO` |

---

## Ví dụ lệnh (PowerShell)

```powershell
Set-Location "c:\Users\admin\OneDrive\Desktop\learn_java"
javac -encoding UTF-8 -d bin src/polymorphism/*.java
java -cp bin polymorphism.CastDemo
```

Thay `polymorphism.CastDemo` bằng lớp có `public static void main` và đúng tên package.

---

## Đồng bộ lên GitHub

```powershell
cd "c:\Users\admin\OneDrive\Desktop\learn_java"
git init
git add .
git commit -m "Initial commit: Java OOP learning project and documentation"
git branch -M main
git remote add origin https://github.com/Dung092005/java.git
git push -u origin main
```

- Nếu remote đã tồn tại: `git remote set-url origin https://github.com/Dung092005/java.git`
- Xác thực HTTPS: dùng [Personal Access Token](https://github.com/settings/tokens) thay cho mật khẩu.

---

## Ghi chú về tên thư mục

`first_revise`, `last_rivise` là tên đặt theo thói quen/bài ôn — phải khớp với câu lệnh `package` trong từng file `.java`. Đổi tên thư mục cần cập nhật đồng bộ `package` và lệnh `javac`/`java`.

---

*Tài liệu cho repository [Dung092005/java](https://github.com/Dung092005/java).*
