import java.util.Scanner;
public class ArrayAccess {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("��� 5���� �Է��ϼ���>>");
		
		int intArray[] = new int[5]; // 0 1 2 3 4 
		int max = 0;
		
		for (int i = 0; i < 5;i++) 
		{
			intArray[i] = in.nextInt();
			if (intArray[i] > max)
				max = intArray[i];
		}
		System.out.println("�Էµ� ������ ���� ū ����" + max + "�Դϴ�.");
		

	}

}
