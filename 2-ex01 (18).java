package day02;
//학생으로 부터 점수를 입력 받아서
//A B C D E F가 출력되는 무한 루프 프로그램을 만드세요

import java.util.Scanner;
public class ex18 {
   public static void main(String[] args)
   {
	   Scanner scanner = new Scanner(System.in);
	   
	   int score = 0;
	   int kor = 0;
	   int eng = 0;
	   int math = 0; 
	   
	   while(true)
	   {
		 System.out.println("=============");
		 System.out.println("점수 입력 프로그램");
		 System.out.println("=============");
		 System.out.println("1.점수입력하기  2.평균 출력. 3.종료");
		 
		 int inputNum = scanner.nextInt(); 
		 if(inputNum == 1) 
		 	{
			 System.out.println("학생의 국어 점수를 입력하세요.");
			  kor = scanner.nextInt();
			  System.out.println("학생의 영어 점수를 입력하세요.");
			  eng = scanner.nextInt();
			  System.out.println("학생의 수학 점수를 입력하세요.");
			  math = scanner.nextInt();
			  score = ((kor + eng + math) / 3);
			  System.out.println("평균은"+(float)score+"입니다.");
			  if(!(score > 0 && score <= 100)) 
			  {
				System.out.println("값을 벗어났습니다. 점수를 다시입력해 주세요");
				continue;
			  }
		 	}
		 
		 else if(inputNum == 2) 
		 {
			   if(score > 0 && score <= 100)
			    {
			    if(score <= 20){
			    	System.out.println("점수 = "+score+" 등급  = F");
			     }
			    else if(score <= 40) {
			    	System.out.println("점수 ="+score+" 등급  = D");
			     }
			    else if(score <= 60){
			    	System.out.println("점수 ="+score+" 등급  = C");
			     }
			    else if(score <= 80) {
			    	System.out.println("점수 ="+score+" 등급  = B");
			     }
			    else {
			    	System.out.println("점수 ="+score+" 등급  = A");
			     }
			    }
			    else {
			    	System.out.println("값을 벗어났습니다. 점수를 다시입력해 주세요");
			    	score = 0;
			         }
		 }
		 else {
			 System.out.println("프로그램을 종료합니다");
			 break;
			 }
		   
	   }
   }
}
