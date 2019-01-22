public class p167_ex13 
{

	public static void main(String[] args) 
	{
		int cnt =0; 
		for(int input=1;input<100;input++) 
		{				
				cnt = 0; //3 6 9 개수 초기화
				int ten;
				int one;
				
				ten = input/10; //십자리 숫자
				one = input%10; //일자리 숫자
				

					if(ten % 3 == 0 && ten != 0)		
						cnt++;
				
					
					if((one % 3) == 0 && (one != 0)) 		
						cnt++;
							
						if(cnt == 1)
						{
							System.out.println(input + " 박수짝");
						}	
						
						else if(cnt == 2)
						{
							System.out.println(input + " 박수짝짝");
						}
		}
	}
}
