import java.util.Scanner;
public class ArrayAccess {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("양수 5개를 입력하세요>>");
		
		int intArray[] = new int[5]; // 0 1 2 3 4 
		int max = 0;
		
		for (int i = 0; i < 5;i++) 
		{
			intArray[i] = in.nextInt();
			if (intArray[i] > max)
				max = intArray[i];
		}
		System.out.println("입력된 수에서 가장 큰 수는" + max + "입니다.");
		

	}

}
