class Student{
	int id;
	String name;
	int marks;
	String address;
	int  age;
	
	Student(int id, String name, int marks, String address, int age){
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.address = address;
		this.age = age;
	}
	
	String checkResult(){
		String Res = "";
		
		if (( this.marks>= 50 )&&(this.marks <= 100)){
			Res = "pass";
		}else{
			Res = "fail";
		}
		return Res;
	}
	
	void Display(){
		System.out.println("Id: " + this.id);
		System.out.println("Name: " + this.name);
		System.out.println("Address: " + this.address);
		System.out.println("Age: " + this.age);
		System.out.println("Marks: " + this.marks);
		
		String Res = this.checkResult();
		System.out.println("Result: " + Res);
		
		System.out.println("           ");
		
	}
}
		
		
			
		