package day02;
/*
 ����ڷκ��� ���ڸ� �Է¹޾�
 ���丮���� ���ϴ� ���α׷��� �ۼ��ϼ���
 ���丮�� : 1~�ش� ���ڱ����� ��
 */
import java.util.Scanner;
public class ex12 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� : ���丮��");
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
