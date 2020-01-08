package day01;
import java.util.Scanner;
/*
 사용자로부터, 학생번호, 이름, 국어, 영어, 수학 점수를 입력받아서 출력하는
 프로그램을 작성하세요
 */
public class Ex09 {
  public static void main(String[] args)
 {
	Scanner scanner = new Scanner(System.in);
    String studentName;
    int studentNumber;
    int mathScore, koreanScore, englishScore;
    
    System.out.println("학생이름 입력");
    studentName=scanner.nextLine();
    System.out.println("학생번호 입력");
    studentNumber=scanner.nextInt();
    System.out.println("수학점수 입력");
    mathScore=scanner.nextInt();
    System.out.println("국어점수 입력");
    koreanScore=scanner.nextInt();
    System.out.println("영어점수 입력");
    englishScore=scanner.nextInt();
    
    System.out.printf("-학생이름:%s -학생번호:%d%n",studentName,studentNumber);
    System.out.println("수학점수:"+mathScore);
    System.out.println("국어점수:"+koreanScore);
    System.out.println("영어점수:"+englishScore);
	scanner.close();
 }
}
