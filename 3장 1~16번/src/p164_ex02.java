
public class p164_ex02 {

	public static void main(String[] args) {
		// 2차원 배열 출력
		int n [][] = {{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};
			
		for (int i=0; i<n.length; i++) //5번 돌것이다.
		{			
			for (int j=0; j<n[i].length;j++) // 한칸의 길이에 대한 식 n1 n2 n3 n4 까지
			{
			System.out.print(n[i][j] +" ");
			}
			System.out.println("");
		}
	}

	}
