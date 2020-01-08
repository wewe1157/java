package day02;
/*
 삼항 연산자
 삼항 연산자는 속도가 제일 빠르지만
 코드를 실행하는 용도로는 사용할 수 없다.
 대신 결과값을 할당하는데 사용된다.
*/
public class Ex09 {
   public static void main(String[] args) {
	   int age = 15;
	   //age > 18 ? System.out.println("성인")  : System.out.println("미성년")
	   // (조건) ? (true) : (false) - 결과값을 출력할 순 없다.
	   String result = age > 18 ? "성인" : "미성년";
	   System.out.println(result);
   }
}
