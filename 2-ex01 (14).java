package day02;
/*
 1���� 100������ �Ҽ��� ���ϴ� ���α׷� �ۼ�
 �Ҽ��� 1�� �ڱ� �ڽ��� �ܿ��� ����� ���� ����
 */

public class ex14 {
  public static void main(String[] args) {
	  
	
	  for(int i = 0 ; i <= 100; i++)
	  {
		  int check = 0;
		  
		  for(int j = 1 ; j <= i; j++)
		  {
			  if((i % j) == 0) {
				  check++;
			  }
		  }
		  if(check == 2) {
			  System.out.println("�� "+i+" �� �Ҽ��Դϴ�");
		  }
	  }
	  
  }
}
