package day02;
/*
 �ݺ��� - while loop
 while loop�� ���
 ()�� ������ ���̸� �ݺ�
 false �� ���� �Ǵ� ����.
 * 
 */
public class ex16 {
	public static void main(String[] args)
	{
		int number = 0 ;
		
		while(number <= 5) {
			System.out.println("������ ���Դϴ�"+number);
			number++;
		}
		//���ѷ����� �������� �������� �ݺ��Ǵ� ��.
		//1.Ʈ�� �Ҹ� ���� ���ǿ� �����Ѵ�. 
	    //while(true) {
		//   System.out.println("���ѷ�����");
	    // }
		//2.�׻� ���̵Ǵ� ������ �����Ѵ�.
		//while(0<1){
	    //}
		//
		//3.���̵Ǵ� ������ �������� ������ ��ȭ�� ���� �ʴ´�.
		//while(b < 5){
		//}
		
		do {
			System.out.println("ok");
		}while(number > 0);
		//��� ������ ���� üũ
	}

}
