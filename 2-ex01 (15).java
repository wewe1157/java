package day02;
/*
 자바에는 3가지 출력 method가 있다.
 print, printf, println
 print : 괄호안의 내용을 출력하고 커서는 그대로
 printf : 괄호안의 내용을 형식화해서 출력한다.
 println : 괄호안의 내용을 출력하고 커서를 다음줄로 옮긴다.
 */

public class ex15 {
   public static void main(String[] args)
   {
	   System.out.print("abcd");
	   System.out.print("efgd");
	   
	   System.out.println("ln라인");
	   System.out.println("ln라인2");
	   
	   //printf는 %문자와 데이터타입이 일치하는 내용을 출력,
	   //또한 출력하는 데이터의 타입을 정의한다.
	   
	   System.out.printf("%d\n", 25); //%d(decimal) =10진 상수
	   System.out.printf("%5d\n\n", 20); //%수 = 출력할 공간 할당
	                                   //양수 = 오른쪽정렬, 음수 = 왼쪽정렬
	   System.out.printf("%05d\n\n", 32); //%수 앞에 0을 붙이면 빈공간에 0으로 채운다.
	   //System.out.printf("%-05d %n", 32); 왼쪽 정렬엔 사용 불가능
	   
	   System.out.printf("%x\n",74); // %x(hexadecimal) 16진법
	   System.out.printf("%08X\n\n",74); // %X
	   
	   float pie = 3.141592f;
       System.out.printf("%f\n", pie); //%f 실수타입 7자리까지 정확
       System.out.printf("%.4f\n", pie);//a.b :총 a자리 출력
       System.out.printf("%10.6f\n", pie);//중 소수점은 b자리 까지 출력
       
       System.out.printf("%e\n\n", pie*100); //%e 로그지수 형태로 출력
       
       System.out.printf("%c\n", 'g'); //%c 캐릭터(글자1개)값 출력
       System.out.printf("%C\n\n", 'g'); //%C 대문자 출력
       
       System.out.printf("%s\n", "String"); // %s 문자열 출력
       System.out.printf("%S\n\n", "String"); // %S 문자열 대문자 출력
       
       //printf의 %문자를 조합해
       //학생의 번호. 이름 나이 국여수점수 총점 평균을 출력해보자
       //번호는 2자리 왼쪽정렬로 고정
       //이름은 5자리 고정
       //나이는 3자리 왼쪽정렬로 고정
       //국어, 영어, 수학, 총점은
       //3자리 오른쪽 정렬하고 왼쪽 빈자리는 0으로
       //평균은 소숫점 2자리 까지
       
       System.out.printf("%-2d번\t이름:%5s\t 나이:%-3d세\n",1 , "나건녕", 45);
       System.out.printf("국어:%03d점  영어:%03d점  수학:%03d점 \n", 35,12,50);
       System.out.printf("%.2f", (35+12+50) / (float)3);//연산하는 숫자를 float으로 캐스팅하거나
                                                        //float 데이터로 연산
       }
}
