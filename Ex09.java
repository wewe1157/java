package day01;
import java.util.Scanner;
/*
 ����ڷκ���, �л���ȣ, �̸�, ����, ����, ���� ������ �Է¹޾Ƽ� ����ϴ�
 ���α׷��� �ۼ��ϼ���
 */
public class Ex09 {
  public static void main(String[] args)
 {
	Scanner scanner = new Scanner(System.in);
    String studentName;
    int studentNumber;
    int mathScore, koreanScore, englishScore;
    
    System.out.println("�л��̸� �Է�");
    studentName=scanner.nextLine();
    System.out.println("�л���ȣ �Է�");
    studentNumber=scanner.nextInt();
    System.out.println("�������� �Է�");
    mathScore=scanner.nextInt();
    System.out.println("�������� �Է�");
    koreanScore=scanner.nextInt();
    System.out.println("�������� �Է�");
    englishScore=scanner.nextInt();
    
    System.out.printf("-�л��̸�:%s -�л���ȣ:%d%n",studentName,studentNumber);
    System.out.println("��������:"+mathScore);
    System.out.println("��������:"+koreanScore);
    System.out.println("��������:"+englishScore);
	scanner.close();
 }
}
