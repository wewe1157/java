package day01;
/*
 ������ 02 - ����������
 1.���������ڴ� ������ ���簪�� 1�� ������Ű�ų� ���ҽ�Ų��.
 2.���������ڴ� ��������� ���������� �ִ�.
 3.���� = --,++
 
 */

public class Ex04 {
 
	public static void main(String[] args)
	{
		int number1 = 5;
		int number2 = 3;
		System.out.println(number1++);
		// = ���������� �ش��ٿ��� ���� ������ ���� �������� �ȴ�.
		// ��� ��, 1���� 
		System.out.println(number1);
		System.out.println(--number1);
		// = ���������� �ش��ٿ��� ���� ������ ���� ������ �ȴ�.
		// 1���� �� ���.
		System.out.println(number1);
		
		number1 += ++number2;
		System.out.println(number1);
		number1 += number2++;
		System.out.println(number1);
	}
}
