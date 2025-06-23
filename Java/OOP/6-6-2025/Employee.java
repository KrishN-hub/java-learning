class Employee{
	int id;
	String name;
	double basicSal;
	
	
	Employee(int id, String name, double basicSal){
		this.id = id;
		this.name = name;
		this.basicSal = basicSal;
	}
	
	void GetEmployee(){
	    System.out.println("ID: " + this.id);
		System.out.println("Name: " + this.name);
	}
		
	void CalcBonus(){
		if ( basicSal >= 200000){
			System.out.println("Bonus:" + (this.basicSal*0.02));
		}else if (basicSal > 100000){
			System.out.println("Bonus:" +(this.basicSal*0.01));
		}else{
			System.out.println("input correct basic salary");
		}
	}
			
			
	
	void GetSalary(){
		if ( basicSal >= 200000){
			System.out.println("Bonus:" + (this.basicSal + this.basicSal*0.02));
		}else if (basicSal > 100000){
			System.out.println("Bonus:" +(this.basicSal + this.basicSal*0.01));
		}else{
			System.out.println("input correct basic salary");
		}
	}
}
	
	
		
		
		