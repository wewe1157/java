package day01;

/*
  ������01 - ��� ������
  1. ������ = ������ ���� �̿��Ͽ� ����ϴ� Ư�����ڵ�  
  2. ��� �����ڴ� + - * %(������) /(������) �� �ִ�.
 */

public class Ex03 { 
	
	public static void main(String[] args)
	{
		int number1 = 5;
		int number2 = 6;
		System.out.println(number1 + number2);
		System.out.println(number1 - number2);
		System.out.println(number1 * number2);
		System.out.println(number1 % number2);
		System.out.println(number1 / number2);
		//���� �������� ������ ������� �ε����� �����ϱ� ������ ���� �������  
		//�Ǽ� �κ��� ������� ���Ѵ�.
		System.out.println((float)number1 / number2);
	}
}
