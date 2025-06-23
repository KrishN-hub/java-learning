public class Userarry {
	public static void main(String args[]){
		int x [][] = new int[3][];
		x[0] = new int[2];
		x[1] = new int[3];
		x[2] = new int[5];
		
		x[0][0] = 5;
		x[0][1] = 10;
		
		x[1][0] = 15;
		x[1][1] = 20;
		x[1][2] = 25;
		
		x[2][0] = 30;
		x[2][1] = 35;
		x[2][2] = 40;
		x[2][3] = 45;
		x[2][4] = 50;
		
		for(int i =0; i < x.length; i++){
			for (int j=0; j < x[i].length; j++){
				System.out.print(x[i][j] +" ");
			}
			
		System.out.println (" ");
		}
	}
}
				