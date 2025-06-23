class Employee{
	int id;
	String name;
	int basic_salary;
	
	void setEmployee(){
		id = 25001;
		name = "Krishnakumar";
		basic_salary = 60000;
	}
	void getEmployee(){
		System.out.println("ID:"+ id);
		System.out.println("NAME:"+ name);
		System.out.println("BASIC SALARY:" + basic_salary);
	}
}