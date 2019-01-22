public class p166_ex10 
{
	public static void main(String[] args) 
	{ 
	    int[][] array = new int[4][4]; 
	    int i = 0; 
	    int j = 0; 
	    for (int num = 0; num < 10;) 
	    { 
	      i = (int) (Math.random() * 4); 
	      j = (int) (Math.random() * 4); 
	      if (array[i][j] == 0) { 
	        array[i][j] = (int) (Math.random() * 10 + 1); 
	        num++; 
	      } 
	      else  
	     { 
	        continue; 
	     } 
	      
	  } 
	  for (int a = 0; a < array.length; a++) 
	  for (int b = 0; b < array[a].length; b++) 
	  System.out.print(array[a][b] + " "); 
	  System.out.println(" "); 
	} 
} 