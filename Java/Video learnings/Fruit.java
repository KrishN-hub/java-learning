class Fruit {
	String color;
	String name;
	String taste;
	int count;
	float weight;
	
	void Shape (){
		System.out.println("It's a Shape Method");
	}
	
	void Details (String color, String name){
		this.name = name;
		this.color = color;
	}
	
	void getDetails(){
		System.out.println("Fruit NAME: " + this.name);
		System.out.println("Fruit COLOR: " + this.color);
	}
	
	void otherDetails(String tast1, int count, float weight){
		taste = tast1;
		this.count = count;
		this.weight = weight;
	}
	
	void getOtherDetails(){
	    System.out.println("Fruit Taste: " + taste);
		System.out.println("Fruit Count: " + this.count);
		System.out.println("Fruit Weight: " + this.weight);
	}
	

	
}