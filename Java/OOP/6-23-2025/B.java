class B extends A{
	//int x = 50; // when we removw it, x value will refer class A(parent) instance variable value
	int y;
	B(){
		this.y =70;
	}
	
	/*void display()
	{
		System.out.println("By: " + this.y);
	}*/                                               // when we remove this code, the output never chage & here overloading will haooen in differnt class 
	//
	void display(int y){
		//int x = 100; // when we remove it x value will refer instance value
		this.display();
		this.y = y;
		System.out.println("By: " + this.y);
		System.out.println("Bx: " + this.x); // this can access B class value of x.
		System.out.println("Ax: " + super.x);// super can access A(parent) class value of x.
		System.out.println("X: " + x); // will access local veriable
	}
}