import java.util.Scanner;
public class p166_ex08_2 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 몇개?");
		
		int n = scanner.nextInt();
		int intArray [] = new int [n];
		 
		
			for(int i=0;i<intArray.length; i++) // 입력값
			{
				intArray[i] = (int)(Math.random()*100+1);
				for(int j=0; j<i; j++)//비교하기 위해서 필요한 for 문
				{
					if(intArray[i]==intArray[j] && i!=j){
						i--;
					}
				}
			}
		for(int i=0; i<intArray.length; i++) {
			System.out.print(intArray[i]+" ");
		}
	}
}
