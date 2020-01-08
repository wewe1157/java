package day02;
//switch문의 break를 생략해서 프로그램을 작성해보자

/*
 사용자로 부터 월을 입력 받아서.
 맨 마지막 날짜가 30일인지 31인지 28일인지 출력하는 프로그램.
 */
import java.util.Scanner;
public class ex07 {
 public static void main(String[] args) {
	 
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("월을 입력하세요");
	 int month = scanner.nextInt();
	 
	 switch(month) {
	 case 1:
	 case 3:
	 case 5:
	 case 7:
	 case 8:
	 case 10:
	 case 12:
		 System.out.println("31일까지입니다.");
		 break;
	 
	 case 4:
	 case 6:
	 case 9:
	 case 11:
		 System.out.println("30일까지입니다.");
		 break;
	 case 2:
		 System.out.println("28일까지입니다.");
		 break;
	 default:
		 System.out.println("잘못입력하셨습니다.");
	 }
	 scanner.close();
 }
}
