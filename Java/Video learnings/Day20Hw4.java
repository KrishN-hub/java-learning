import java.util.Scanner;
class Day20Hw4{
	public static void main (String args[]){
		Scanner Scan = new Scanner(System.in);
		int [][]marks;
		marks = new int[5][];
		
		marks[0] = new int[1];
		marks[1] = new int[1];
		marks[2] = new int[1];
		marks[3] = new int[1];
		marks[4] = new int[1];
		
		for(int i=0; i<marks.length; i++){
			System.out.println("Enter your marks" + (i+1));
			for(int j=0; j<marks[i].length; j++){
				marks[i][j] = Scan.nextInt();
			}
		}
		for( int i=0; i<marks.length; i++){
			for(int j=0; j<marks[i].length; j++) {
				System.out.print("Your Marks: '" + marks[i][j] + "   " );
			}
			System.out.println();
		}
	}
}
		
		