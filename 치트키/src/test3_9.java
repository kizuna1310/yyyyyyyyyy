package test;

public class test3_9 {

	public static void main(String[] args) {
		int array[][] = new int[5][5];
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				array[i][j] = (int)(Math.random()*25+1);
				for(int k=0; k<j; k++) {
					if(array[i][j] == array[i][k] && j!=k){//2차 배열은 i로 같게하며 1차배열자리를 같은 수로 안두게 한다.
						j--;
                    break;  
					}
				}
				for(int k=0;k<i;k++) {
	                   for(int m=0;m<array[i].length;m++) {//2차 배열의 길이
	                    for( int b=0;b<array[k].length;b++) {//2차 배열의 길이
	                     if(array[i][m]==array[k][b]) {
	                      j--;
	                      break;
	                     }
	                 } 

	                 }
	             }
			}
		}

		for(int a=0; a<array.length; a++) {
			for(int b=0; b<array[a].length; b++) {
				System.out.printf("%2d ",array[a][b]);
			}
			System.out.println();
		}
	}
}

