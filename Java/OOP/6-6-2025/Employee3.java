class Employee3{
	int id;
	String name;
	double basicSal;
	
	
	Employee3(int id, String name, double basicSal){
		this.id = id;
		this.name = name;
		this.basicSal = basicSal;

	}
	
	
		
	double CalcBonus(){
		 double bonus = 0.0; // we should initialize local veriables in return method
		
		if ( basicSal >= 200000){
			bonus = this.basicSal*0.02;                  
		}else{
			bonus = this.basicSal*0.01;
			}
			
	    return bonus;
	}
		
	void GetEmployee(){
	    System.out.println("ID: " + this.id);
		System.out.println("Name: " + this.name);
		System.out.println("Basic Salary: " + this.basicSal);
		double bonus = CalcBonus();
		System.out.println("Bonus: " + bonus );
		System.out.println("Net Salary: " + (this.basicSal + bonus));	
	}
}
			
			
	

	
	
		
		
		