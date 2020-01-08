package day01;

/*
 연산자03 - 비교연산자
 1. > >= < <= == !=
 2. 비교연산자의 결과값은 boolean이다.
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
    	
    	String string1 = "abc"; //"abc"를 임시로 할당한후, string1은 "abc"의 주소를 가르킴
    	String string2 = new String("abc"); //string2를 힙에 할당후 "abc"값으로 초기화 함.
    	String string3 = "abc";
    	
    	System.out.println(string1 == string2); // false
    	System.out.println(string1 == string3); // true
    	// ==와 !=는 객체를 비교할 경우 주소값을 비교한다.
    	
        System.out.println(string1.equals(string2));
    	System.out.println(string2 = string2.substring(2));
    }
}
