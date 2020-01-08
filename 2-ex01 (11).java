package day02;
/*
 사용자로부터 입력을 받아서
 1~입력받은 숫자 까지의 합을 구하는 프로그램을 작성하세요
 */
import java.util.Scanner;

public class ex11 {
 public static void main(String[] args)
 {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("숫자를 입력해주세요");
	 int number = scanner.nextInt();
	 int sumNumber = 0;
	 
	 for(int i = 0 ; i <= number ; i++)
	 {
		 sumNumber += i;
	 }
	 System.out.println(sumNumber);
	 scanner.close();
 }
}
