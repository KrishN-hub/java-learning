class Day20Hw1 {
	public static void main(String args[]){
		
		int [] x;
		x =  new int[5];
		
		x[0] = 25;
		x[1] = 52;
		x[2] = 70;
		x[3] = 85;
		x[4] = 30;
		
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		System.out.println(x[4]);
		System.out.println("---___________________---");
		
		for(int i=4;i>=0; i--){
			System.out.println(x[i]);
		}
		
		System.out.println("---___________________---");
		
		for( int i=0;i<=5; i++){
		System.out.println(x[i]);
		
		}
		
	}
}
		