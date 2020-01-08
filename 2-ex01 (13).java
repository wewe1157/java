package day02;
//반복문 - 다중 for loop
//다중 for loop의 경우
//바깥쪽 for loop이 1번 돌 동안
//안쪽 for loop은 처음부터 끝까지 다돈다
public class ex13 {
  public static void main(String[] args){
	//char는  
	//ascii 테이블의 코드값과 일치하는 문자를 보여준다.
	//예를 들어 65는 'A'라는 글자가 나오게 된다.
	 
	  for(int a = 0; a < 6 ; a++) {
		  char xPosition = (char)(65+a);
		  
		  for(int b = 0; b < 10; b++) {
			  System.out.println("가로"+xPosition+"세로"+b);
		}
 	  }
	  
	  for(int i = 0 ; i < 5; i++)
	  {
		  for(int j = 0; j <= i; j++)
		  {
			  System.out.print('ㅁ'); 
		  }
		  System.out.println();
	  }
  }
}
