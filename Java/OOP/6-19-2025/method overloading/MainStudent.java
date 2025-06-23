class MainStudent{
	public static void main(String args[]){
		Student Stu1 = new Student();
		Stu1.setStudent();
		Stu1.Display();
		
		Student Stu2 = new Student();
		Stu2.setStudent(1003);
		Stu2.Display();
		
		Student Stu3 = new Student();
		Stu3.setStudent("Mahi");
		Stu3.Display();
		
		Student Stu4 = new Student();		
		Stu4.setStudent(1001,"Vaanan");
		Stu4.Display();
		
			Student Stu5 = new Student();
		Stu5.setStudent("Nila", 1002);
		Stu5.Display();
	}
	
}