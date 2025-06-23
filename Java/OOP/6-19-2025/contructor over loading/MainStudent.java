class MainStudent{
	public static void main(String args[]){
		Student Stu1 = new Student();
		Stu1.Display();
		
		Student Stu2 = new Student(1003);
		Stu2.Display();
		
		Student Stu3 = new Student("Mahi");
		Stu3.Display();
		
		Student Stu4 = new Student(1001,"Vaanan");		
		Stu4.Display();
		
		Student Stu5 = new Student("Nila", 1002);
		Stu5.Display();
	}
	
}