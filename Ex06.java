package day01;
/*
 연산자04 - 논리연산자
 && || !
 &&: AND연산
 ||: OR 연산
 ! : NOT연산 
 */
public class Ex06 {
   public static void main(String[] args)
   {
	   boolean boolean1 = true;
	   boolean boolean2 = true;
	   System.out.println(boolean1 && boolean2);
	   System.out.println(boolean1 || boolean2);
	   boolean1 = true;
	   boolean2 = false;
	   System.out.println(boolean1 && boolean2);
	   System.out.println(boolean1 || boolean2);
	   boolean1 = false;
	   boolean2 = false;
	   System.out.println(boolean1 && boolean2);
	   System.out.println(boolean1 || boolean2);
	   
   }
   
}
