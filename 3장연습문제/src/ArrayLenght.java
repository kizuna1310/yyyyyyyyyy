import java.util.Scanner;
public class ArrayLenght {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int intArray[] = new int[5]; //�迭�� ����� ����
		int sum = 0; // ��� ����
		
		System.out.println(intArray.length + "���� ������ �Է��ϼ���>>");
		for(int i=0; i<intArray.length;i++)
			intArray[i] = in.nextInt();
		
		for (int i = 0; i < intArray.length;i++)
			sum += intArray[i];
		
		System.out.println("�迭 ������ �����" + sum/intArray.length + "�Դϴ�.");
	}

}
