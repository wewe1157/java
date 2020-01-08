package day02;
/*
 사용자로부터 숫자를 입력받아
 팩토리얼을 구하는 프로그램을 작성하세요
 팩토리얼 : 1~해당 숫자까지의 곱
 */
import java.util.Scanner;
public class ex12 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : 팩토리얼");
		int number = scanner.nextInt();
		int factNumber = 1;
		
		for(int i = 1 ; i <= number ; i ++)
		{
			factNumber *= i; 
		}
		
		System.out.println(factNumber);
		
		scanner.close();
	}

}
