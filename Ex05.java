package day01;

/*
 ������03 - �񱳿�����
 1. > >= < <= == !=
 2. �񱳿������� ������� boolean�̴�.
*/
public class Ex05 {
    public static void main(String[] args)
    {
    	int number1 = 10;
    	int number2 = 15;
    	System.out.println(number1 > number2);
    	System.out.println(number1 >= number2);
    	System.out.println(number1 < number2);
    	System.out.println(number1 <= number2);
    	System.out.println(number1 == number2);
    	System.out.println(number1 != number2);
    	
    	String string1 = "abc"; //"abc"�� �ӽ÷� �Ҵ�����, string1�� "abc"�� �ּҸ� ����Ŵ
    	String string2 = new String("abc"); //string2�� ���� �Ҵ��� "abc"������ �ʱ�ȭ ��.
    	String string3 = "abc";
    	
    	System.out.println(string1 == string2); // false
    	System.out.println(string1 == string3); // true
    	// ==�� !=�� ��ü�� ���� ��� �ּҰ��� ���Ѵ�.
    	
        System.out.println(string1.equals(string2));
    	System.out.println(string2 = string2.substring(2));
    }
}
