public class TArry {
	public static void main (String args[]){
			int[][] a = new int[3][2];
			
			a[0][0] = 15;
			a[0][1] = 25;
			
			a[1][0] = 5;
			a[1][1] = 6;
	
			
			a[2][0] = 21;
			a[2][1] = 22;
			
			//System.out.println (a[1][1]);
			
			/*for( int i=0; i<3; i++){
				for(int j=0; j<2; j++){
				System.out.println(a[i][j]);
				}
			}
			*/
			
			for (int[]i:a) {
				for (int j:i){
					System.out.println (j);
				}
			}
	}
}
			
	
	