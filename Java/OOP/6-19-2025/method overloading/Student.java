class Student{
	int id;
	String name;
	
	void setStudent(){
		this.id = 1000;
		this.name = "Kavin";
	}
	
	void setStudent(int id){
		this.id = id;
		this.name = "Vinoth";
	}
	
	void setStudent(String name){
		this.id = 1000;
		this.name = name;
	}
	
	void setStudent(String name, int id){
		this.id = id;
		this.name = name;
	}
	
	void setStudent(int id, String name){
		this.name = name;
		this.id = id;
	}
	
	void Display(){
		System.out.println("Id: " + this.id);
		System.out.println("Name: " + this.name);
	}
}
		