package day01;
/*
 ������04 - ��������
 && || !
 &&: AND����
 ||: OR ����
 ! : NOT���� 
 */
public class Ex06 {
   public static void main(String[] args)
   {
	   boolean boolean1 = true;
	   boolean boolean2 = true;
	   System.out.println(boolean1 && boolean2);
	   System.out.println(boolean1 || boolean2);
	   boolean1 = true;
	   boolean2 = false;
	   System.out.println(boolean1 && boolean2);
	   System.out.println(boolean1 || boolean2);
	   boolean1 = false;
	   boolean2 = false;
	   System.out.println(boolean1 && boolean2);
	   System.out.println(boolean1 || boolean2);
	   
   }
   
}
