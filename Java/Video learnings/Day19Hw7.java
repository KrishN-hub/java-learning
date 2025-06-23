class Day19Hw7{
	public static void main(String args[]){
		int x=5;
		while(x>=1){
			if(x%2==1){
				for(int y=1;y<=5;y++){
					System.out.print("*");
					
				}
			}else{
				for(int y=1;y<=5;y++){
				System.out.print(x);
				
				}
			}
			System.out.println();
			x--;
		}
	}
}
		

