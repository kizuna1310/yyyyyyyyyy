import java.util.Scanner;
public class p166_ex08_2 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �?");
		
		int n = scanner.nextInt();
		int intArray [] = new int [n];
		 
		
			for(int i=0;i<intArray.length; i++) // �Է°�
			{
				intArray[i] = (int)(Math.random()*100+1);
				for(int j=0; j<i; j++)//���ϱ� ���ؼ� �ʿ��� for ��
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
