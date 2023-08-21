package javabasic.bai2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainScreen {

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
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
			
		}
		scanner.close();
	
		int sumEven = 0;
		int sumOdd = 0;
		int count = 0;
		
		// tong cac so chan
		for(int i=0; i<=n; i++) {
			if(i%2 == 0) {
				sumEven +=i;
			}
		} 
		// tong cac so le
		for(int i=0; i<=n; i++) {
			if(i%2 !=0) {
				sumOdd +=i;
			}
		}
		// bao nhieu so chia het cho 3 nhung khong chia het cho 2
		for(int i=0; i<=n; i++) {
			if(i%3 == 0 && i%2 !=0) {
				count ++;
			}
		}
		
		System.out.println("Tổng các số chẵn từ 0 đến " + n + " : " + sumEven);
		System.out.println("Tổng các số lẻ từ 0 đến " + n + " : " + sumOdd);
		System.out.println("Có " + "[" + count + "]"+ " số chia hết cho 3 nhưng không chia hết cho 2" );
	}
	
}
