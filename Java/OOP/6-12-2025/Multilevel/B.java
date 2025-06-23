class B extends A{
	int y;
	
	B(int y, int x ){
		super (x);
		this.y = y;
	}
	void Gety(){
		System.out.println("By: " + this.y);
	}
}
		