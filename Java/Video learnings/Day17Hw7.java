class Day17Hw7{
	public static void main(String args[]){
		int x = 1;
		while(x<=5){
			int y = 1;
			if(x%2==1){
				while(y<=5){
				System.out.print("*");
				y++;
				}
				
			}else{
				while(y<=5){
					System.out.print(y);
					y++;
				}
				
			}
			System.out.println();
			x++;
		}
	}
}