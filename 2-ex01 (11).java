package day02;
/*
 ����ڷκ��� �Է��� �޾Ƽ�
 1~�Է¹��� ���� ������ ���� ���ϴ� ���α׷��� �ۼ��ϼ���
 */
import java.util.Scanner;

public class ex11 {
 public static void main(String[] args)
 {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("���ڸ� �Է����ּ���");
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
