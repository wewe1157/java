package day02;
/*
 ���ǹ�03 = if, else if, else
 1.���� ������ ���� ���� �����Ѵٸ�
 2.if, else if�� ������ ������ �� üũ�� �� �ִ�.
 */

public class ex03 {
 public static void main(String[] args)
 {
	 int age = 25;
	 if(age < 8) {
		System.out.println("��ġ����");
	 }
	 else if(age < 13) {
		System.out.println("�ʵ��л�");
	 }
	 else if(age < 17) {
			System.out.println("���л�");
		 }
	 else if(age < 19) {
			System.out.println("����л�");
		 }
	 else {
			System.out.println("���л�");
		 }
		 
 }
}
