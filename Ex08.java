package day01;
/*입력
java에서 입력은 Scanner 클래스 객체를 통해서 하게 된다.
int를 입력받을땐 객체.nextInt()
double을 입력받을땐 객체.nextDouble()
String을 입력받을땐 객체.nextLine()
Scanner는 외부 클래스이기 때문에
import java.util.Scanner를 임포트 해줘야 사용가능
*/
import java.util.Scanner;
public class Ex08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("회원번호:");
		int userNumber = scanner.nextInt();
		
		System.out.println("회원이름:");
		scanner.nextLine();
		String userName = scanner.nextLine();
		
		System.out.println("회원비번:");
		String password = scanner.nextLine();
		
		System.out.println("번호:"+userNumber);
		System.out.println("이름:"+userName);
		System.out.println("비번:"+password);
		
		scanner.close();
	}
}
