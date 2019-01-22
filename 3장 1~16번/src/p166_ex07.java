public class p166_ex07 {

	public static void main(String[] args) {
		int n[] = new int[10];
		
		int sum=0;
		for(int i=0;i<n.length;++i)
			{
				int a = (int)(Math.random()*10 +1);
				n[i] =a;
				if( i == 0)
					System.out.print("·£´ýÇÑ Á¤¼öµé : " );
				
				System.out.print(n[i] +" ");
				
				sum = sum + n[i];
				//sum += n[i];
			}
		
		System.out.println("");
		System.out.println("Æò±ÕÀº "+ sum/n.length);
	}

}
