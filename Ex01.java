package day01;
//�ּ� - ����1
//�ּ����� ó���� �ؽ�Ʈ�� ������ �ܰ迡�� ���õȴ�.
/*
 ���� �ٷ� �ּ� ó���ϱ� 
*/

/*
1. �⺻���� �ش� �ּҿ� ���� ����Ǿ��ִ� ����.primitive datatype (stack)
2. �������� �ش� �ּҿ� ���� �ƴ϶� ������ ����Ǿ� �ִ� �ּҰ��� ����Ǿ� �ִ�.(heap)

3. �⺻���� 8���� ������ Ÿ��
byte, short, int, long, float, double, char, boolean
byte, shor, int, long : ������ ������ Ÿ��
   8,   16,  32, 64, ��Ʈ
float, double : �Ǽ��� ������ Ÿ��
   32,     64��Ʈ
char: ������ ������Ÿ��
boolean : ��/���� ������Ÿ�� (1��Ʈ) 

4.�������� 3���� Ÿ��
 class, interface, array.
 */

public class Ex01 {

 public static void main(String[] args) {
	 
	 int Number;
	 Number = 5;
	 System.out.println(Number);
	 Number = 10;
	 System.out.println(Number);
	 
	 int Number2 = 20;
	 System.out.printf("%d%n",Number2);
	 
	 //type casting
	 
	 //1.�Ͻ��� ����ȯ(implicit type casting)
	 double dNum = Number2;
	 System.out.println(dNum);
	 
	 //2.����� ����ȯ(explicit type casting)
	 int Number3 = (int)dNum; 
	 System.out.println(Number3);
	 
	 //�ٿ�ĳ���ý� 0000 0000
	 byte myByte = (byte)-129;
	 System.out.println(myByte);
 }
	
}
