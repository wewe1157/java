package day02;
//���ѷ����� �̿��ؼ� �޴��� ����� ����

import java.util.Scanner;
public class ex17 {
   public static void main(String[] args) {
	   
	   Scanner scanner = new Scanner(System.in);
	   
	   int number = 0 ;
	   int age = 0;
	   String name = "" ;
	   
	   int kor = 0 ;
	   int eng = 0 ;
	   int math = 0 ;
	   
	   while(true){
		   System.out.println("====================");
		   System.out.printf("%-6s%s%6s \n", "��","��Ʈ�������α׷�","��");
		   System.out.println("===================="
		   		+ "");
		   System.out.println("1.�Է� 2.��� 3.����");
		   
		   int inputNumber = scanner.nextInt();
		   if(inputNumber == 1) {
			  System.out.println("�л��� ��ȣ�� �Է��ϼ���.");
			  number = scanner.nextInt();
			  scanner.nextLine();
			  System.out.println("�л��� �̸��� �Է��ϼ���.");
			  name = scanner.nextLine();
			  System.out.println("�л��� ���̸� �Է��ϼ���.");
			  age = scanner.nextInt();
			  System.out.println("�л��� ���� ������ �Է��ϼ���.");
			  kor = scanner.nextInt();
			  System.out.println("�л��� ���� ������ �Է��ϼ���.");
			  eng = scanner.nextInt();
			  System.out.println("�л��� ���� ������ �Է��ϼ���.");
			  math = scanner.nextInt();
		   }
		   else if(inputNumber == 2) {
			    if(name == "")
			    {
			    	System.out.println("�Էµ� ������ �����ϴ�.");
			    	continue;
			    }
			   System.out.printf("%-2d��\t�̸�:%5s\t ����:%-3d��\n", number , name, age);
		       System.out.printf("����:%03d��  ����:%03d��  ����:%03d�� \n", kor,eng,math);
		       System.out.printf("%.2f\n", (kor+eng+math) / 3.0);
		   }
		   else if(inputNumber == 3) {
			   System.out.println("����� �ּż� �����մϴ�.");
			   break;
		   }
		   
	   }
	   scanner.close();
   }
}
