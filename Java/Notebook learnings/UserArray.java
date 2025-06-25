import java.util.Scanner;

public class UserArray {
	public static void main (String args[]){
		Scanner Scan = new Scanner(System.in);
		
		int x[][] = new int[3][];
		
	    x[0] = new int[3];
		x[1] = new int[4];
		x[2] = new int[6];
		
		for( int i=0; i<x.length; i++){
			System.out.println( "Enter" + x[i].length + "value of row" + i);
			for(int j=0; j<x[i].length; j++) {
				x[i][j] = Scan.nextInt();
			}
		}
		
		for( int i=0; i<x.length; i++){
			for(int j=0; j<x[i].length; j++) {
				System.out.print(x[i][j] + "   " );
			}
			System.out.println();
		}
		Scan.close();
		
	}
}
		