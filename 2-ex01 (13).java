package day02;
//�ݺ��� - ���� for loop
//���� for loop�� ���
//�ٱ��� for loop�� 1�� �� ����
//���� for loop�� ó������ ������ �ٵ���
public class ex13 {
  public static void main(String[] args){
	//char��  
	//ascii ���̺��� �ڵ尪�� ��ġ�ϴ� ���ڸ� �����ش�.
	//���� ��� 65�� 'A'��� ���ڰ� ������ �ȴ�.
	 
	  for(int a = 0; a < 6 ; a++) {
		  char xPosition = (char)(65+a);
		  
		  for(int b = 0; b < 10; b++) {
			  System.out.println("����"+xPosition+"����"+b);
		}
 	  }
	  
	  for(int i = 0 ; i < 5; i++)
	  {
		  for(int j = 0; j <= i; j++)
		  {
			  System.out.print('��'); 
		  }
		  System.out.println();
	  }
  }
}
