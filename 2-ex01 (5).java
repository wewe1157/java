package day02;

//������ �Է� �޾� �������� ������� ����ϴ� ���α׷�
//������ ���� 1. 4�� ���� ��������.
//������ ���� 2. 400���� ���� ��������.
//������ ���� 3. 4�� �������������� 100���δ� ������������ �ʴ´�.
import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("���� �Է�");
		int year = scanner.nextInt();

		/*
		 * if(year % 4 == 0){ if(year % 100 == 0){ if(year % 400 == 0) {
		 * System.out.println("�����Դϴ�."); } else { System.out.println("����Դϴ�."); } } else
		 * { System.out.println("�����Դϴ�."); } } else { System.out.println("����Դϴ�."); }
		 */
		if ( (year % 400 == 0) ||(year % 4 == 0 && year % 100 != 0)) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("����Դϴ�.");
		}
		scanner.close();
	}
}
