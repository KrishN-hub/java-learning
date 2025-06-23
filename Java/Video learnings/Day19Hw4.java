class Day19Hw4{
	public static void main(String args[]){
		
		int x=1;
		
		do{
			
			for(int y=1;y<=5;y++){
				if(y%2==1){
					System.out.print(y);
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
			x++;
		}while (x<=5);
	}
}