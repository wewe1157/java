package day01;
/*�Է�
java���� �Է��� Scanner Ŭ���� ��ü�� ���ؼ� �ϰ� �ȴ�.
int�� �Է¹����� ��ü.nextInt()
double�� �Է¹����� ��ü.nextDouble()
String�� �Է¹����� ��ü.nextLine()
Scanner�� �ܺ� Ŭ�����̱� ������
import java.util.Scanner�� ����Ʈ ����� ��밡��
*/
import java.util.Scanner;
public class Ex08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ȸ����ȣ:");
		int userNumber = scanner.nextInt();
		
		System.out.println("ȸ���̸�:");
		scanner.nextLine();
		String userName = scanner.nextLine();
		
		System.out.println("ȸ�����:");
		String password = scanner.nextLine();
		
		System.out.println("��ȣ:"+userNumber);
		System.out.println("�̸�:"+userName);
		System.out.println("���:"+password);
		
		scanner.close();
	}
}
