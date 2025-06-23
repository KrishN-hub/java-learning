class Employee2{
	int id;
	String name;
	double basicSal;
	double bonus;
	
	
	Employee2(int id, String name, double basicSal){
		this.id = id;
		this.name = name;
		this.basicSal = basicSal;

	}
	
	
		
	void CalcBonus(){
		if ( this.basicSal >= 200000){
			this.bonus = this.basicSal*0.02;                  // initialize
		}else{
			this.bonus = this.basicSal*0.01;
			}
	}
		
	void GetEmployee(){
	    System.out.println("ID: " + this.id);
		System.out.println("Name: " + this.name);
		System.out.println("Basic Salary: " + this.basicSal);
		System.out.println("Bonus: " + this.bonus);
		System.out.println("Net Salary: " + (this.basicSal + this.bonus));	
	}
}
			
			
	

	
	
		
		
		