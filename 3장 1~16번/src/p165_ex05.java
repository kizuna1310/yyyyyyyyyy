import java.util.Scanner;
public class p165_ex05 {

	public static void main(String[] args) {
		
		System.out.println("���� ���� 10���� �Է��Ͻÿ�>>");
		
		int arr[] = new int[10];
		Scanner scanner = new Scanner(System.in);
		
		//�迭�� �� �Է� (�ݺ����� ���̸�ŭ)
		for(int i=0; i<arr.length; i++)
		arr[i] = scanner.nextInt();
				
		//���
		for(int i=0; i<arr.length; i++)
		{
			if (arr[i] %3 == 0)
			 System.out.println(arr[i]);
		}
	}
}
