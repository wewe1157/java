package day01;
/*
 연산자05 - 비트연산자
 1.종류 : &, |, ^, !, <<, >>
 & : AND 연산
 | : OR 연산 - 두 비트값중 하나라도 1이라면 TRUE
 ^ : XOR 연산 - 두 비트값이 다르다면  TRUE 같으면 FALSE
 ~ : 반전 연산
 << : 왼쪽쉬프트 연산
 >> : 오른쪽 쉬프트 연산
*/
public class Ex07 {
 public static void main(String[] args)
 {
	 byte byte1 = 5; // 00000101
	 byte byte2 = 6; // 00000110
	 
	 //자바의 경우 기본 정수형은 모두 int(4바이트)로 출력된다.
	 System.out.println((byte)byte1 & byte2); // 00000100
	 System.out.println((byte)byte1 | byte2); // 00000111
	 System.out.println((byte)byte1 ^ byte2); // 00000011 
	 System.out.println((byte)~byte2); //1111001 == 2보수의 부호봐꿈
	                                   //0000111 == 7
	 System.out.println((byte)byte2 << 2); // 00011000 = byte2 *4
	 byte2 = -128;
	 
	 System.out.println((byte)byte2 >> 4); // 1111100 = byte2 /4
	                         //오른쪽쉬프트 시, 부호 비트도 추가되어 옮겨진다
 }
}
