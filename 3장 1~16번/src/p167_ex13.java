public class p167_ex13 
{

	public static void main(String[] args) 
	{
		int cnt =0; 
		for(int input=1;input<100;input++) 
		{				
				cnt = 0; //3 6 9 ���� �ʱ�ȭ
				int ten;
				int one;
				
				ten = input/10; //���ڸ� ����
				one = input%10; //���ڸ� ����
				

					if(ten % 3 == 0 && ten != 0)		
						cnt++;
				
					
					if((one % 3) == 0 && (one != 0)) 		
						cnt++;
							
						if(cnt == 1)
						{
							System.out.println(input + " �ڼ�¦");
						}	
						
						else if(cnt == 2)
						{
							System.out.println(input + " �ڼ�¦¦");
						}
		}
	}
}
