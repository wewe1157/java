package day02;
//무한루프를 이용해서 메뉴를 만들어 보자

import java.util.Scanner;
public class ex17 {
   public static void main(String[] args) {
	   
	   Scanner scanner = new Scanner(System.in);
	   
	   int number = 0 ;
	   int age = 0;
	   String name = "" ;
	   
	   int kor = 0 ;
	   int eng = 0 ;
	   int math = 0 ;
	   
	   while(true){
		   System.out.println("====================");
		   System.out.printf("%-6s%s%6s \n", "ㅣ","비트성적프로그램","ㅣ");
		   System.out.println("===================="
		   		+ "");
		   System.out.println("1.입력 2.출력 3.종료");
		   
		   int inputNumber = scanner.nextInt();
		   if(inputNumber == 1) {
			  System.out.println("학생의 번호를 입력하세요.");
			  number = scanner.nextInt();
			  scanner.nextLine();
			  System.out.println("학생의 이름을 입력하세요.");
			  name = scanner.nextLine();
			  System.out.println("학생의 나이를 입력하세요.");
			  age = scanner.nextInt();
			  System.out.println("학생의 국어 점수를 입력하세요.");
			  kor = scanner.nextInt();
			  System.out.println("학생의 영어 점수를 입력하세요.");
			  eng = scanner.nextInt();
			  System.out.println("학생의 수학 점수를 입력하세요.");
			  math = scanner.nextInt();
		   }
		   else if(inputNumber == 2) {
			    if(name == "")
			    {
			    	System.out.println("입력된 정보가 없습니다.");
			    	continue;
			    }
			   System.out.printf("%-2d번\t이름:%5s\t 나이:%-3d세\n", number , name, age);
		       System.out.printf("국어:%03d점  영어:%03d점  수학:%03d점 \n", kor,eng,math);
		       System.out.printf("%.2f\n", (kor+eng+math) / 3.0);
		   }
		   else if(inputNumber == 3) {
			   System.out.println("사용해 주셔서 감사합니다.");
			   break;
		   }
		   
	   }
	   scanner.close();
   }
}
