import java.util.Scanner;

public class p166_ex08 
{
	public static void main(String[] args)	
	{	
		Scanner sc =new Scanner(System.in);
		
		int arrLength = 0;
		do {
			System.out.print("���� �?");
			arrLength = sc.nextInt();
			
		}while(arrLength <=0 || arrLength > 100); // do-while�� ���� �ּ� �ѹ��� ������ �Ѵ�.
//		
		int arr[]= new int [arrLength];
		
		aa:
		for(int i=0; i<arr.length;++i)
		{
			int number = (int)(Math.random()*100+1); // ���� ��� 
			arr[i] = number;
			//���� �ִ� �迭�� �Է��� ������ ��
			for(int j=0 ; j<i ; j++)
			{
				if(arr[j] == number)
				{
					System.out.println("���� ����! " + number);
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