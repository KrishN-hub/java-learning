class Subject extends Student{
	
	private int marks1;
	private int marks2;
	private int marks3;
	
   private Subject(int id, String name, int marks1, int marks2, int marks3){  //when we use private key words, error will occar we can't access 
		super(id,name);
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}
	
	private int calTotal(){
	int	total = this.marks1 + this.marks2 + this.marks3;
	
	return total;
	}
	
	private double calAvg(int t){
		double	 Avg = t/3.0;
		
		return Avg;
	}
	
	private char getResult(double a){
	    char Res = '\u0000';
	    if((a>=75) && (a<=100)){
		    Res='A';
	    }else if (a>=60){
		    Res = 'B';
	    }else if (a>=40){
		    Res = 'C';
	    }else{
		   Res = 'F';
	    }
	    return Res;
	}
	
	void Display(){
		super.Display();
		System.out.println("Marks1: " + marks1);
		System.out.println("Marks2: " + marks2);
		System.out.println("Marks3: " + marks3);
		
		int Tot = this.calTotal();
		double Avg = this.calAvg(Tot);
		char Res = this.getResult(Avg);
		
		System.out.println("Total: "  + Tot);
		System.out.println("Average: " + Avg);
		System.out.println("Result: " + Res);
	}
	
	/*public static void main (String atgs[]){
		Subject Sbj = new Subject(101, "Karanan",45,90,80);
		Sbj.Display();
	}*/
}