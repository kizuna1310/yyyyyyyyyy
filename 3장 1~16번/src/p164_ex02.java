
public class p164_ex02 {

	public static void main(String[] args) {
		// 2���� �迭 ���
		int n [][] = {{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};
			
		for (int i=0; i<n.length; i++) //5�� �����̴�.
		{			
			for (int j=0; j<n[i].length;j++) // ��ĭ�� ���̿� ���� �� n1 n2 n3 n4 ����
			{
			System.out.print(n[i][j] +" ");
			}
			System.out.println("");
		}
	}

	}
