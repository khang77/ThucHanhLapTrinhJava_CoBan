package javabasic.bai3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainScreen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<>();
		int studentCount = 1;
		
			String fullName = "";
			String address = "";
			Date dateDOB;
			String gender;
			float finalGrade;
			while(true) {
				
				System.out.println("Student " + studentCount + ": ");
				
				// ----- 1/NAME -------
				System.out.println("FullName: ");

				do {
					try {
						fullName = scanner.nextLine();
						if(fullName.trim().isEmpty()) {
							throw new Exception("<You have left the name blank, please fill in again!> \n\nFullName: ");
						}
					}
					catch(Exception e1) {
						System.out.println(e1.getMessage());
					}
				} while(fullName.trim().isEmpty());

				// ----- 2/ADDRESS -------
				System.out.println("Address:");
				do {
					try {
						address = scanner.nextLine();
						if(address.trim().isEmpty()) {
							throw new Exception("<You have left the address blank, please fill in again!> \n\nAddress: ");
						}
					} catch (Exception e2) { 
						System.out.println(e2.getMessage());
					}
				} while(address.trim().isEmpty());
				
				
			
				
				// ----- 3/DATE OF BIRTH -------
				while(true) {
					System.out.println("DOB (dd/mm/yyyy):");
					String stringDOB = scanner.nextLine();
					try {
						SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
						df.setLenient(false);
						dateDOB = df.parse(stringDOB);
						break;
					} catch (ParseException e) {
						System.out.println("Invalid DOB format! Please enter again");
					}
				} 
				
				SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
				String dob = df.format(dateDOB);
				
				// ----- 4/GENDER -------
				while(true) {
						System.out.println("Gender: ");
						gender = scanner.nextLine();
						if(gender.equalsIgnoreCase("Nam") || gender.equalsIgnoreCase("Nữ")) {
							break;
						}
						System.out.println("Invalid Gender! Please enter again");
				}
				
				// ----- 5/FINALGRADE -------
				while(true) {
					boolean isValid = false; 
					finalGrade = -1;
					while(!isValid) {
						try {
							System.out.println("FinalGrade: ");
							finalGrade = scanner.nextFloat(); scanner.nextLine();
							isValid = true;						
						} catch (InputMismatchException e) {
							scanner.nextLine();  // Đọc và bỏ qua dòng văn bản nhập sai
							System.out.println("The FinalGrade must be from 0 to 10! Please enter again");
						}
						
					}
				if(finalGrade >= 0 && finalGrade <=10) {
					break;
					}
				System.out.println("The FinalGrade must be from 0 to 10! Please enter again");
				}
				
			// ------------------------------------------------------------------------------------
				Student student = new Student(fullName, address, dob, gender, finalGrade);
				students.add(student);
			
				String confirm;
				do {
					System.out.println("Do you want to continue (Y/N)?");
					  confirm = scanner.nextLine();
				}while (!confirm.equalsIgnoreCase("N") && !confirm.equalsIgnoreCase("Y"));
				
				if(confirm.equalsIgnoreCase("N")) {
					break;
				}
			
				studentCount ++;
				
			}
			
			for(int i=0; i< students.size(); i++) {
				System.out.println("Student " + (i+1) + ": ");
				System.out.println("  \u25CF FullName: " + students.get(i).getFullName());
				System.out.println("  \u25CF Address: " + students.get(i).getAddress());
				System.out.println("  \u25CF DOB: " + students.get(i).getDob());
				System.out.println("  \u25CF Gender: " + students.get(i).getGender());
				System.out.println("  \u25CF FinalGrade: " + students.get(i).getFinalGrade());
			}

			String hocluc = "";
			float sumGradeAllStudents = 0;
			
			for(int i=0; i< students.size(); i++) {
				float iFinalGrade = students.get(i).getFinalGrade();
				if(iFinalGrade < 4.0) {
					hocluc = "học lực kém";
				} else if(iFinalGrade >=4.0 && iFinalGrade < 5.0) {
					hocluc = "học lực yếu";
				} else if(iFinalGrade >=5.0 && iFinalGrade < 5.5) {
					hocluc = "học lực trung bình yếu";
				} else if(iFinalGrade >=5.5 && iFinalGrade < 6.5) {
					hocluc = "học lực trung bình";
				} else if(iFinalGrade >=6.5 && iFinalGrade < 7) {
					hocluc = "học lực trung bình khá";
				} else if(iFinalGrade >=7.0 && iFinalGrade < 8) {
					hocluc = "học lực khá";
				} else if(iFinalGrade >=8.0 && iFinalGrade < 8.5) {
					hocluc = "học lực khá giỏi";
				} else if(iFinalGrade >=8.5 && iFinalGrade <= 10.0) {
					hocluc = "học lực giỏi";
				}
					
				sumGradeAllStudents += iFinalGrade;
		
			
				System.out.println("Học sinh" + " <" + students.get(i).getFullName() + "> " + hocluc);
			}
	
			float averageGradeAllStudents = sumGradeAllStudents/studentCount;
			System.out.println("Điểm tổng kết trung bình của danh sách học sinh: " + averageGradeAllStudents);
	
			scanner.close();
	}
}
