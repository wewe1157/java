package day02;
//�л����� ���� ������ �Է� �޾Ƽ�
//A B C D E F�� ��µǴ� ���� ���� ���α׷��� ���弼��

import java.util.Scanner;
public class ex18 {
   public static void main(String[] args)
   {
	   Scanner scanner = new Scanner(System.in);
	   
	   int score = 0;
	   int kor = 0;
	   int eng = 0;
	   int math = 0; 
	   
	   while(true)
	   {
		 System.out.println("=============");
		 System.out.println("���� �Է� ���α׷�");
		 System.out.println("=============");
		 System.out.println("1.�����Է��ϱ�  2.��� ���. 3.����");
		 
		 int inputNum = scanner.nextInt(); 
		 if(inputNum == 1) 
		 	{
			 System.out.println("�л��� ���� ������ �Է��ϼ���.");
			  kor = scanner.nextInt();
			  System.out.println("�л��� ���� ������ �Է��ϼ���.");
			  eng = scanner.nextInt();
			  System.out.println("�л��� ���� ������ �Է��ϼ���.");
			  math = scanner.nextInt();
			  score = ((kor + eng + math) / 3);
			  System.out.println("�����"+(float)score+"�Դϴ�.");
			  if(!(score > 0 && score <= 100)) 
			  {
				System.out.println("���� ������ϴ�. ������ �ٽ��Է��� �ּ���");
				continue;
			  }
		 	}
		 
		 else if(inputNum == 2) 
		 {
			   if(score > 0 && score <= 100)
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
			    else {
			    	System.out.println("���� ������ϴ�. ������ �ٽ��Է��� �ּ���");
			    	score = 0;
			         }
		 }
		 else {
			 System.out.println("���α׷��� �����մϴ�");
			 break;
			 }
		   
	   }
   }
}
