package day02;
/*
 1부터 100까지의 소수를 구하는 프로그램 작성
 소수란 1과 자기 자신의 외에는 약수가 없는 숫자
 */

public class ex14 {
  public static void main(String[] args) {
	  
	
	  for(int i = 0 ; i <= 100; i++)
	  {
		  int check = 0;
		  
		  for(int j = 1 ; j <= i; j++)
		  {
			  if((i % j) == 0) {
				  check++;
			  }
		  }
		  if(check == 2) {
			  System.out.println("수 "+i+" 는 소수입니다");
		  }
	  }
	  
  }
}
