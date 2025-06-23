class Day19Hw2{
	public static void main(String args[]){
		
		for(int x=1;x<=5;x++){
			int y=1;
			if(x%2==1){
				while (y<=5){
					System.out.print(y);
					y++;
				}
			}else{
				while(y<=5){
					System.out.print("*");
					y++;
				}
			}
			System.out.println();
		}
	}
}