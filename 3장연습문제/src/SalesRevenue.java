
public class SalesRevenue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int intArray[][] = {{90, 90, 110, 110}, //1���� 4ĭ
							{120, 110, 100, 110}, //2���� 4ĭ
							{120,140, 130, 150}}; //3���� 4ĭ
		double sum = 0;
		
		for (int i = 0; i < intArray.length; i++) // ; ����� ���� intArray.length=3 , 3�� 4ĭ
			for (int j = 0; j < intArray[i].length; j++) // intArray[i].length=4
				sum += intArray[i][j];
		
				System.out.println("���� 3�Ⱓ ���� �Ѿ���" + sum + "�̸� ����� ������" 
									+ sum/intArray.length + "�Դϴ�.");

	}

}
