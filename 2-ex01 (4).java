package day02;
//상용자로부터 점수를 입력 받아서
//A B C D E F를 출력하는 프로그램을 작성하세요
import java.util.Scanner;
public class ex04 {
	public static void main(String[] args) {
		
    Scanner scanner = new Scanner(System.in);
    
	System.out.println("학생의 점수를 입력하세요");
    int score = scanner.nextInt();
    
    if(score >= 0 && score <= 100)
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
    else System.out.println("값을 벗어났습니다.");
    
    scanner.close();
	}
}
