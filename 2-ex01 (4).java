package day02;
//����ڷκ��� ������ �Է� �޾Ƽ�
//A B C D E F�� ����ϴ� ���α׷��� �ۼ��ϼ���
import java.util.Scanner;
public class ex04 {
	public static void main(String[] args) {
		
    Scanner scanner = new Scanner(System.in);
    
	System.out.println("�л��� ������ �Է��ϼ���");
    int score = scanner.nextInt();
    
    if(score >= 0 && score <= 100)
    {
    if(score <= 20){
    	System.out.println("���� = "+score+" ���  = F");
     }
    else if(score <= 40) {
    	System.out.println("���� ="+score+" ���  = D");
     }
    else if(score <= 60){
    	System.out.println("���� ="+score+" ���  = C");
     }
    else if(score <= 80) {
    	System.out.println("���� ="+score+" ���  = B");
     }
    else {
    	System.out.println("���� ="+score+" ���  = A");
     }
    }
    else System.out.println("���� ������ϴ�.");
    
    scanner.close();
	}
}
