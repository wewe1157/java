package day02;

//연도를 입력 받아 유년인지 평년인지 출력하는 프로그램
//윤년의 조건 1. 4로 나눠 떨어진다.
//윤년의 조건 2. 400으로 나눠 떨어진다.
//윤년의 조건 3. 4로 나눠떨어지지만 100으로는 나눠떨어지지 않는다.
import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("연도 입력");
		int year = scanner.nextInt();

		/*
		 * if(year % 4 == 0){ if(year % 100 == 0){ if(year % 400 == 0) {
		 * System.out.println("윤년입니다."); } else { System.out.println("평년입니다."); } } else
		 * { System.out.println("윤년입니다."); } } else { System.out.println("평년입니다."); }
		 */
		if ( (year % 400 == 0) ||(year % 4 == 0 && year % 100 != 0)) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("평년입니다.");
		}
		scanner.close();
	}
}
