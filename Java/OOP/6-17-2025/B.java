class B extends A {
	
	int y;
	
	B(){
		this.y = 70;
	}
	
	void Getx() {
		super.Getx();
		System.out.println("By: " + this.y);
	}
}