package day02;
/*
 �ڹٿ��� 3���� ��� method�� �ִ�.
 print, printf, println
 print : ��ȣ���� ������ ����ϰ� Ŀ���� �״��
 printf : ��ȣ���� ������ ����ȭ�ؼ� ����Ѵ�.
 println : ��ȣ���� ������ ����ϰ� Ŀ���� �����ٷ� �ű��.
 */

public class ex15 {
   public static void main(String[] args)
   {
	   System.out.print("abcd");
	   System.out.print("efgd");
	   
	   System.out.println("ln����");
	   System.out.println("ln����2");
	   
	   //printf�� %���ڿ� ������Ÿ���� ��ġ�ϴ� ������ ���,
	   //���� ����ϴ� �������� Ÿ���� �����Ѵ�.
	   
	   System.out.printf("%d\n", 25); //%d(decimal) =10�� ���
	   System.out.printf("%5d\n\n", 20); //%�� = ����� ���� �Ҵ�
	                                   //��� = ����������, ���� = ��������
	   System.out.printf("%05d\n\n", 32); //%�� �տ� 0�� ���̸� ������� 0���� ä���.
	   //System.out.printf("%-05d %n", 32); ���� ���Ŀ� ��� �Ұ���
	   
	   System.out.printf("%x\n",74); // %x(hexadecimal) 16����
	   System.out.printf("%08X\n\n",74); // %X
	   
	   float pie = 3.141592f;
       System.out.printf("%f\n", pie); //%f �Ǽ�Ÿ�� 7�ڸ����� ��Ȯ
       System.out.printf("%.4f\n", pie);//a.b :�� a�ڸ� ���
       System.out.printf("%10.6f\n", pie);//�� �Ҽ����� b�ڸ� ���� ���
       
       System.out.printf("%e\n\n", pie*100); //%e �α����� ���·� ���
       
       System.out.printf("%c\n", 'g'); //%c ĳ����(����1��)�� ���
       System.out.printf("%C\n\n", 'g'); //%C �빮�� ���
       
       System.out.printf("%s\n", "String"); // %s ���ڿ� ���
       System.out.printf("%S\n\n", "String"); // %S ���ڿ� �빮�� ���
       
       //printf�� %���ڸ� ������
       //�л��� ��ȣ. �̸� ���� ���������� ���� ����� ����غ���
       //��ȣ�� 2�ڸ� �������ķ� ����
       //�̸��� 5�ڸ� ����
       //���̴� 3�ڸ� �������ķ� ����
       //����, ����, ����, ������
       //3�ڸ� ������ �����ϰ� ���� ���ڸ��� 0����
       //����� �Ҽ��� 2�ڸ� ����
       
       System.out.printf("%-2d��\t�̸�:%5s\t ����:%-3d��\n",1 , "���ǳ�", 45);
       System.out.printf("����:%03d��  ����:%03d��  ����:%03d�� \n", 35,12,50);
       System.out.printf("%.2f", (35+12+50) / (float)3);//�����ϴ� ���ڸ� float���� ĳ�����ϰų�
                                                        //float �����ͷ� ����
       }
}
