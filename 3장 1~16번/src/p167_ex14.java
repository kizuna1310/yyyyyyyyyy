import java.util.Scanner;
public class p167_ex14 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String course [] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score [] = {95, 88, 76, 62, 55}; 
		
		while (true) 
		{
			System.out.println("과목 이름>>");
			String name = scanner.next();
			
			
			if(name.equals("그만")) 
				break;	 //while을 끝내겠다.
			
			int i=0;
			for(i=0;i<course.length;i++)
			{
				if(name.equals(course[i]))
				{	
//					name, course[i]//과목명
//					socre[i]//점수	
					System.out.println(name + "의 점수는" + score[i]);
					break;
				}
			}
			if(i==course.length) //i가 5가 되면 못찾는다.
			{
				System.out.println("없는 과목 입니다.");
			}
		}
	}
}
