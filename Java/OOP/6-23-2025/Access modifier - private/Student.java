class Student{
	private int id;
	private String name;
	
	Student (int id, String name){
		this.id = id;
		this.name = name;
	}
	
	void Display(){
		System.out.println("ID: " + this.id);
		System.out.println("Name: " + this.name);
	}
}
	