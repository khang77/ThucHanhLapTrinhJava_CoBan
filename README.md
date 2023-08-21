### ThucHanhLapTrinhJava_CoBan

![Eclipse](https://img.shields.io/badge/Eclipse-FE7A16.svg?style=for-the-badge&logo=Eclipse&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

#### ⭐⭐⭐ Bài 1 ⭐⭐⭐

![JAVA COBAN drawio](https://github.com/khang77/ThucHanhLapTrinhJava_CoBan/assets/92577611/6eac43bb-321c-419a-8d30-5efa476a09e5)

💡 _Xử lý ngoại lệ:_
```JAVA
while(true) {
    try {
        System.out.println("Nhập số thứ nhất x = ");
        x = scanner.nextDouble();
        break;
    } catch (InputMismatchException e) {
        System.out.println("Không hợp lệ! Vui lòng nhập lại");
        scanner.nextLine();
    }
}
```
💡 _Thông báo không thể thực hiện phép chia cho 0 và yêu cầu nhập lại:_
```JAVA
try {
    while(true) {
      System.out.println("Nhập lệnh ACTION = ");
      action = scanner.next();
      action = action.trim();
      action = action.toUpperCase();			
        if (y == 0 && action.equalsIgnoreCase("CHIA")) 
            System.out.println("Không thể thực hiện phép CHIA cho 0! Hãy nhập CONG/TRU/NHAN");
        else {
            break;
        } 
    }
}
```
🌻 _Kết quả in ra màn hình:_
```
Nhập số thứ nhất x =  
30  
Nhập số thứ hai y =   
25  
Nhập lệnh ACTION =  
NHAN  
Kết quả: 750.0 
```
***
#### ⭐⭐⭐ Bài 2 ⭐⭐⭐
![JAVA COBAN_2 drawio](https://github.com/khang77/ThucHanhLapTrinhJava_CoBan/assets/92577611/0b64ed34-ee3b-41f6-b123-561a948df28f)

💡 _Xử lý ngoại lệ:_
```JAVA
while(true) {
    try{
      System.out.println("Nhập số nguyên N (N>0): ");
      n = scanner.nextInt();
          if(n > 0)
          break;
    } catch (InputMismatchException e) {
          System.out.println("Nhập không hợp lệ! Hãy nhập lại");
          scanner.nextLine();
    }
```
💡 _Tính tổng các số chẵn:_
```JAVA
for(int i=0; i<=n; i++) {
    if(i%2 == 0) {
      sumEven +=i;
    }
}
```

💡 _Tính tổng các số lẻ:_
```JAVA
for(int i=0; i<=n; i++) {
    if(i%2 != 0) {
      sumOdd +=i;
    }
}
```
💡 _Tính bao nhieu so chia het cho 3 nhung khong chia het cho 2:_
```JAVA
for(int i=0; i<=n; i++) {
    if(i%3 == 0 && i%2 !=0) {
      count ++;
    }
}
```
🌻 _Kết quả in ra màn hình:_
```
Nhập số nguyên N (N>0):  
5  
Tổng các số chẵn từ 0 đến 5 : 6  
Tổng các số lẻ từ 0 đến 5 : 9  
Có [1] số chia hết cho 3 nhưng không chia hết cho 2  
```
***
#### ⭐⭐⭐ Bài 3 ⭐⭐⭐
![JAVA COBAN_3 drawio](https://github.com/khang77/ThucHanhLapTrinhJava_CoBan/assets/92577611/3a0a9e82-7b16-4d8b-8a7c-4cadd75dce8f)
![JAVA COBAN_3_2 drawio](https://github.com/khang77/ThucHanhLapTrinhJava_CoBan/assets/92577611/d330b8ed-8b77-43ac-b60f-56e3921e7167)

🌻 _KẾT QUẢ IN RA MÀN HÌNH:_
```
 Student 1: 
  - FullName: Nguyễn Văn A
  - Address: 123 ABC
  - DOB: 31/12/1999
  - Gender: Nam
  - FinalGrade: 9.0

Student 2: 
  - FullName: Nguyễn Thị B
  - Address: 234 BCD
  - DOB: 29/11/1998
  - Gender: Nữ
  - FinalGrade: 9.5

Học sinh <Nguyễn Văn A> học lực giỏi  
Học sinh <Nguyễn Thị B> học lực giỏi  
Điểm tổng kết trung bình của danh sách học sinh: 9.25  
```
