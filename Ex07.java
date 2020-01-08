package day01;
/*
 ������05 - ��Ʈ������
 1.���� : &, |, ^, !, <<, >>
 & : AND ����
 | : OR ���� - �� ��Ʈ���� �ϳ��� 1�̶�� TRUE
 ^ : XOR ���� - �� ��Ʈ���� �ٸ��ٸ�  TRUE ������ FALSE
 ~ : ���� ����
 << : ���ʽ���Ʈ ����
 >> : ������ ����Ʈ ����
*/
public class Ex07 {
 public static void main(String[] args)
 {
	 byte byte1 = 5; // 00000101
	 byte byte2 = 6; // 00000110
	 
	 //�ڹ��� ��� �⺻ �������� ��� int(4����Ʈ)�� ��µȴ�.
	 System.out.println((byte)byte1 & byte2); // 00000100
	 System.out.println((byte)byte1 | byte2); // 00000111
	 System.out.println((byte)byte1 ^ byte2); // 00000011 
	 System.out.println((byte)~byte2); //1111001 == 2������ ��ȣ����
	                                   //0000111 == 7
	 System.out.println((byte)byte2 << 2); // 00011000 = byte2 *4
	 byte2 = -128;
	 
	 System.out.println((byte)byte2 >> 4); // 1111100 = byte2 /4
	                         //�����ʽ���Ʈ ��, ��ȣ ��Ʈ�� �߰��Ǿ� �Ű�����
 }
}
