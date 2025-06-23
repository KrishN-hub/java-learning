class Subject extends Student{
	
	int marks1;
	int marks2;
	int marks3;
	
	Subject(int id, String name, int marks1, int marks2, int marks3){
		super(id,name);
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}
	
	int calTotal(){
	int	total = this.marks1 + this.marks2 + this.marks3;
	
	return total;
	}
	
	double calAvg(int t){
		double	 Avg = t/3.0;
		
		return Avg;
	}
	
	char getResult(double a){
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
}