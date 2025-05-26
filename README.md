# StudentAnalyzer - Unit Test
## Mô tả
Chương trình Java phân tích điểm số học sinh:
- Đếm số học sinh đạt loại Giỏi (>=8.0, điểm hợp lệ 0-10)
- Tính điểm trung bình hợp lệ

## Yêu cầu chức năng
- Bỏ qua điểm âm hoặc lớn hơn 10 (coi là dữ liệu sai)
- Nếu danh sách rỗng, trả về kết quả mặc định (0)
- Đếm số học sinh giỏi (>=8.0)
- Tính điểm trung bình hợp lệ (0-10)

## Cấu trúc thư mục
- `src/StudentAnalyzer.java`: Mã nguồn chính
- `test/StudentAnalyzerTest.java`: Test JUnit

## Hướng dẫn chạy test với JUnit 5

### 1. Tải JUnit 5 jar (nếu chưa có)
- Tải file: [junit-platform-console-standalone-1.10.2.jar](https://search.maven.org/remotecontent?filepath=org/junit/platform/junit-platform-console-standalone/1.10.2/junit-platform-console-standalone-1.10.2.jar)
- Đặt file này vào thư mục, ví dụ: `F:\unit-test-LeCongDuc\lib\junit-platform-console-standalone-1.10.2.jar`

### 2. Biên dịch mã nguồn và test với encoding UTF-8
```sh
javac -encoding UTF-8 -cp ".;lib\junit-platform-console-standalone-1.10.2.jar" -d out src\StudentAnalyzer.java test\StudentAnalyzerTest.java
```

### 3. Chạy test JUnit
```sh
java -jar lib\junit-platform-console-standalone-1.10.2.jar --class-path out --scan-class-path
```

### Lưu ý
- Đảm bảo đường dẫn tới file `.jar` đúng với vị trí bạn đã lưu.
- Nếu có lỗi về encoding, hãy chắc chắn file `.java` được lưu với UTF-8.

---

## Đo bao phủ kiểm thử với JaCoCo

### 1. Tải JaCoCo Agent
- Tải file:
  - [jacocoagent.jar](https://repo1.maven.org/maven2/org/jacoco/org.jacoco.agent/0.8.11/org.jacoco.agent-0.8.11-runtime.jar)
  - [jacococli.jar](https://repo1.maven.org/maven2/org/jacoco/org.jacoco.cli/0.8.11/org.jacoco.cli-0.8.11-nodeps.jar)
- Đặt vào thư mục, ví dụ:
`F:\unit-test-LeCongDuc\lib\junit-platform-console-standalone-1.10.2.jar`

### 2. Biên dịch mã nguồn và test như bình thường

### 3. Chạy test với JaCoCo agent
```sh
java -javaagent:libs/jacocoagent.jar=destfile=jacoco.exec -jar lib/junit-platform-console-standalone-1.10.2.jar --class-path out --scan-class-path
```
- Sau khi chạy xong sẽ có file `jacoco.exec` chứa dữ liệu coverage.

### 4. Sinh báo cáo coverage
```sh
java -jar libs/jacococli.jar report jacoco.exec --classfiles out --sourcefiles src --html report
```
- Thư mục `report` sẽ chứa file HTML báo cáo coverage chi tiết.

### Lưu ý
- Đảm bảo đường dẫn tới các file `.jar` đúng với vị trí thực tế.
- Bạn có thể mở file `index.html` trong thư mục `report` để xem kết quả bao phủ kiểm thử.

**Kết quả:**  
Báo cáo coverage cho mã nguồn đạt 100%.
