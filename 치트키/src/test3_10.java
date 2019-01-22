package test;

public class test3_10 {

	public static void main(String[] args) {
		int array[][] = new int[4][4];
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				array[i][j] = (int)(Math.random()*10+1);
			}
		}
		
		for(int x=0; x<6; x++) {
			int a = (int)(Math.random()*4),b = (int)(Math.random()*4);
			if(array[a][b]!=0) {
				array[a][b] = 0;
			}else {
				x--;
			}
		}
		for(int c=0; c<array.length; c++) {
			for(int d=0; d<array[c].length; d++) {
				System.out.printf("%2d ",array[c][d]);
			}
			System.out.println();
		}
	}

}
