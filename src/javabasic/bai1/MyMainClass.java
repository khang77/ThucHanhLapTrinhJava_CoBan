package javabasic.bai1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyMainClass {
	public static void main(String[] args) {
		
		double x;
		double y;
		String action = null;
		
		Scanner scanner = new Scanner(System.in);
		
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
	
		while(true) {
			try {
				System.out.println("Nhập số thứ hai y = ");
				y = scanner.nextDouble();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Không hợp lệ! Vui lòng nhập lại");
				scanner.nextLine();
			}
		}
		
		
		try {
			while(true) {
			System.out.println("Nhập lệnh ACTION = ");
			action = scanner.next();
			action = action.trim();
			action = action.toUpperCase();
				
				if (y == 0 && action.equalsIgnoreCase("CHIA")) 
					System.out.println("Không thể thực hiện phép CHIA cho 0! " 
			            						+ "Hãy nhập CONG/TRU/NHAN");
				else {
					break;
				 	 } 
			}
		} 
				
		catch (InputMismatchException e) {
			System.out.println("Không hợp lệ! Hãy nhập CONG/TRU/NHAN/CHIA");
			scanner.nextLine();
			}

		scanner.close();
		
		double ketQuaTinhCong = CalculateUtils.tinhCong(x, y);
		double ketQuaTinhTru = CalculateUtils.tinhTru(x, y);
		double ketQuaTinhNhan = CalculateUtils.tinhNhan(x, y);
		double ketQuaTinhChia = CalculateUtils.tinhChia(x, y);

		switch(action) {
		case "CONG":
			System.out.println("Kết quả: " + ketQuaTinhCong);
			break;
			
		case "TRU":
			System.out.println("Kết quả: " + ketQuaTinhTru);
			break;
			
		case "NHAN":
			System.out.println("Kết quả: " + ketQuaTinhNhan);
			break;
			
		case "CHIA":
			System.out.println("Kết quả: " + ketQuaTinhChia);
			break;
			
		default:
			System.out.println("Giá trị ACTION không hợp lệ");
			break;
		}
	}
}
