class B extends A{
	int y;
	
	B(int y) {
		super(50);
		this.y = y;
	}
	
	void Gety(){
		System.out.println("By: " + this.y);
	}
}
		