public class p166_ex10_2 
{

	public static void main(String[] args) 
	{
		int arr[][] = new int[4][4];
		
		for(int i=0; i<arr.length;++i)
			for(int j=0; j<arr[i].length;++j)
				arr[i][j] = 0;
				//arr[i][j] = (int)(Math.random()*10+1);
		
		//1. 10개의 랜덤수 만들기
		//2. 10개의 위치(2차원 인덱스) 랜덤하게
		
		for(int i=0; i<10;++i)
		{	
			int x = (int) (Math.random() * 4); //0~4까지 랜덤
			int y = (int) (Math.random() * 4); //0~4까지 랜덤
			
			if(arr[x][y] == 0)
			arr[x][y] = (int) (Math.random() * 10 + 1); 
			
			else 
				--i;
		}
		
		
		for(int i=0; i<arr.length;++i) 
		{
			for(int j=0; j<arr[i].length;++j)
//			{
				System.out.print(arr[i][j]+" ");
//			}
			System.out.println(" ");
		}
	}
}
