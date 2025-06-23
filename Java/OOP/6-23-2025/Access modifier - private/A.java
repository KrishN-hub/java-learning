class A {  // modifier private not allowed here - when we use private keyword
	int x; //   Ax: 20 - when we use private keyword
	A(){  //has private access in A - - when we use private keyword
		this.x = 20;
	}
	
	private void getX(){                   // has private access in A - - when we use private keyword
	System.out.println("Ax: " + this.x);
	}
}
