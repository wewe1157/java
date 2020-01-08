package day02;
/*
 반복문 - while loop
 while loop의 경우
 ()의 조건이 참이면 반복
 false 면 종료 되는 형태.
 * 
 */
public class ex16 {
	public static void main(String[] args)
	{
		int number = 0 ;
		
		while(number <= 5) {
			System.out.println("조건이 참입니다"+number);
			number++;
		}
		//무한루프란 루프문이 무한으로 반복되는 것.
		//1.트루 불린 값을 조건에 대입한다. 
	    //while(true) {
		//   System.out.println("무한루프중");
	    // }
		//2.항상 참이되는 조건을 대입한다.
		//while(0<1){
	    //}
		//
		//3.참이되는 조건을 대입한후 변수에 변화를 주지 않는다.
		//while(b < 5){
		//}
		
		do {
			System.out.println("ok");
		}while(number > 0);
		//블록 실행후 조건 체크
	}

}
