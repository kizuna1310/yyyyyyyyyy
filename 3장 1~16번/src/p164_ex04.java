import java.util.Scanner;

public class p164_ex04 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
		
		System.out.println("�ҹ��� �Է��Ͻÿ�>>");
		String s = scanner.next();
		char c = s.charAt(0);
		
		for(char i=c; i>='a'; i--) //5�� �ݺ��Ѵ�. ���ڴ�� c��� ���ڰ� ���� �� ���̴�.
		{
			for(char j='a'; j <=i ; j++)//j����i����
			{
				System.out.print(j);
			}	
			System.out.println();
		}
		
	}
}
