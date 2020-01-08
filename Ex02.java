package day01;
/*
자바의 이름규칙
1. 자바는 낙타등(camel back notation) 표기법을 따른다.

2. 첫번째 단어는 모두 다 소문자, 두번째 단어부터 첫글자만 대문자
예) firstNumber. secondNumber
 
3. 클래스는 대문자로 시작하는 명사이다
예) Ex, String, Scanner.

4. 메소드는 소문자로 시작하는 동사.
예) println, main

5. 변수 소문자로 시작하는 명사.
예) number

6. 상수는 모두다 대문자로 적어주고 단어 사이에 _를 넣어준다.(상수는 final 접두로 선언)
예) PI, UNIT_PRICE

7. 자바에서 시스템적으로 사용하기 위해 미리 정해놓은 예약어 36개는 이름으로
    사용할 수 없다.
    
8. 이름엔 특수문자를 쓰면 안된다.

9. 한글로 이름을 지어줄 수 있지만, 사용하지 않는다.

10. 약어로 적지 않고. 명확하게 명시한다.
예) num -> number 

11. 변수명에 숫자가 포함될 수 있지만, 맨 앞에 적어줄 수 없다.
예) num1 - o, 1num - x

*/
public class Ex02 {
	
	static final int SIZE = 5;
    public static void main(String[] args)
    {
    	// SIZE = 10 초기화 안됨;
    	
    }
}
