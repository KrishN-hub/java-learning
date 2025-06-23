class C extends B {
	int z;
	
	C(int z){
	    super(30);
		this.z = z;
	}
	
	void Getz(){
		System.out.println("Cz: " + this.z);
	}
	
}