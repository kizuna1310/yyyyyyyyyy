import java.util.Scanner;
public class p165_ex05 {

	public static void main(String[] args) {
		
		System.out.println("양의 정수 10개를 입력하시오>>");
		
		int arr[] = new int[10];
		Scanner scanner = new Scanner(System.in);
		
		//배열에 값 입력 (반복으로 길이만큼)
		for(int i=0; i<arr.length; i++)
		arr[i] = scanner.nextInt();
				
		//출력
		for(int i=0; i<arr.length; i++)
		{
			if (arr[i] %3 == 0)
			 System.out.println(arr[i]);
		}
	}
}
