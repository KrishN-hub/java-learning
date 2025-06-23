class Day18Hw7{
	public static void main(String args[]){
		
		for(int x=1;x<=5;x++){
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
		}
	}
}