class Day20Hw2{
	public static void main(String args[]){
		
		int []x;
		x= new int[5];
		
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
		
		int i = 4;
		while(i>=0){
			System.out.println(x[i]);
			i--;
		}
		System.out.println("---___________________---");
		
		int j =0;
		while (j<=4){
			System.out.println(x[j]);
			j++;
		}
	}
	
}