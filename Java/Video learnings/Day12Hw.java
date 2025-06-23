public class Day12Hw{
	public static void main(String args[]){
		int Sal = 400000L;
		
		if(Sal<100000){
			System.out.println( "basic salary: " + Sal);
			System.out.println("Tax Amount: " + Sal/100*1);
			System.out.println("Mate Salary: " + (Sal-Sal/100*1));
		}else{
			System.out.println( "basic salary: " + Sal );
			System.out.println("Tax Amount: " + Sal/100*3);
			System.out.println("Mate Salary: " + (Sal-Sal/100*3));
		}
	}
}
			
