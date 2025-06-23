class Car{
    String color;
    String name;
    String brand;
    String carno;
    int speed;
   
    void setDetails (String color, String name, String brand){
	    this.color = color;
	    this.name = name;
	    this.brand = brand;
    }
    void getDetails (){
        System.out.println("Car Color: " + color);
	    System.out.println("Car Name: " + name);
	    System.out.println("Car Brand: " + brand);
	}
	
	void setCarNo (String carno){
	    this.carno = carno;
	}
	
	void getCarNo (){
		System.out.println("Car Number: " + this.carno);
	}
	
	void setSpeed (int speed){
		this.speed = speed;
	}
	
	void getSpeed (){
		System.out.println("Car Speed: " + this.speed +" km/h");
	}
		
}

     
        
   
   
