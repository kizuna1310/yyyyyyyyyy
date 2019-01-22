import java.util.Scanner;

public class p166_ex08 
{
	public static void main(String[] args)	
	{	
		Scanner sc =new Scanner(System.in);
		
		int arrLength = 0;
		do {
			System.out.print("정수 몇개?");
			arrLength = sc.nextInt();
			
		}while(arrLength <=0 || arrLength > 100); // do-while을 통해 최소 한번은 돌리게 한다.
//		
		int arr[]= new int [arrLength];
		
		aa:
		for(int i=0; i<arr.length;++i)
		{
			int number = (int)(Math.random()*100+1); // 랜덤 사용 
			arr[i] = number;
			//현재 있는 배열과 입력할 랜덤값 비교
			for(int j=0 ; j<i ; j++)
			{
				if(arr[j] == number)
				{
					System.out.println("값이 같음! " + number);
					i--;
					continue aa;
				}
			}
			
			arr[i] = number;
		}
		
		
		for(int i=0; i< arr.length;++i) 
		{
			System.out.print(arr[i] + " ");
			if(i % 10 == 0)
				System.out.println("");
		}
	}
}