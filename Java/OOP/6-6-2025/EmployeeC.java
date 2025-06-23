
class EmployeeC{
	int id;
	String name;
	double basicSal;
	double bonus;
	
	
	EmployeeC(int id, String name, double basicSal){
		this.id = id;
		this.name = name;
		this.basicSal = basicSal;

	}
	
	// return method
		
	int CalcBonus(){
		int x = 10;
		
		return x;
		
	}
		
	void GetEmployee(){
	    System.out.println("ID: " + this.id);
		System.out.println("Name: " + this.name);
		System.out.println("Basic Salary: " + this.basicSal);
		System.out.println("Bonus: " + this.bonus);
		System.out.println("Net Salary: " + (this.basicSal + this.bonus));	
		
		int y = CalcBonus();
		System.out.println(y);
	}
}
			
			
	

	
	
		
		
		