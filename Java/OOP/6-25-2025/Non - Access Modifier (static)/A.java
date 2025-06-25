class A {  // modifier static not allowed here
     int x ; // modifier static allowed here
	
    A(){ // modifier static not allowed here
		x = 70;  // non-static variable this cannot be referenced from a static context - when we use this key word
	}
	
   static void display(){
		System.out.println("Ax : " + x); //  non-static variable this cannot be referenced from a static context - - when we use this key word
	}
}

