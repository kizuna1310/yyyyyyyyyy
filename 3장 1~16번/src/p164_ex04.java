import java.util.Scanner;

public class p164_ex04 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
		
		System.out.println("소문자 입력하시오>>");
		String s = scanner.next();
		char c = s.charAt(0);
		
		for(char i=c; i>='a'; i--) //5번 반복한다. 숫자대신 c라는 숫자가 감소 할 것이다.
		{
			for(char j='a'; j <=i ; j++)//j부터i까지
			{
				System.out.print(j);
			}	
			System.out.println();
		}
		
	}
}
