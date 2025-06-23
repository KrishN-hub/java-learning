public class Students {
	int id;
	String name;
	
	void setStudents(int ids, String names){ //instance variable & parameterized veriables & local veriables
	 //int ids = 10;
	
		id = ids; // this key word for mention instance verables ( if we didnt mention that method's veriable is consider as high)
		name = names;
		//this.ids = id;
		
	}
	
	void getStudents(){
		System.out.println("ID : " + id);
		System.out.println("NAME : " + name);
	}
}
	
		