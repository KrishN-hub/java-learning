class Student{
	int id;
	String name;
	
	Student(){
		this.id = 1000;
		this.name = "Kavin";
	}
	
	Student(int id){
		this.id = id;
		this.name = "Vinoth";
	}
	
	Student(String name){
		this.id = 1000;
		this.name = name;
	}
	
	Student(String name, int id){
		this.id = id;
		this.name = name;
	}
	
	Student(int id, String name){
		this.name = name;
		this.id = id;
	}
	
	void Display(){
		System.out.println("Id: " + this.id);
		System.out.println("Name: " + this.name);
	}
}
		