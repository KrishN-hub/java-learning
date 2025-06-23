class Relational {
	public static void main (String args[]){
		int a = 10;
		int b = 3;
		int c = 5;
		
		//b++;
		//System.out.println(b);
		
	    a = b++ + c++;
		
		System.out.println("a: " + a);//8
		System.out.println("b: " + b);//4
		System.out.println("c: " + c);//6
		
		// home work day10 video
		b=a-- + --b - c++;
	    System.out.println("a: " + a);//7
		System.out.println("b: " + b);//5
		System.out.println("c: " + c);//7
		
		c=--c - ++a - ++c + --b;
		System.out.println("a: " + a);//8
		System.out.println("b: " + b);//4
		System.out.println("c: " + c);//-5
		
		a+=b=-c;
		System.out.println("a: " + a);//13
		System.out.println("b: " + b);//5
		System.out.println("c: " + c);//-5
		
		c=b=a;
		System.out.println("a: " + a);//13
		System.out.println("b: " + b);//13
		System.out.println("c: " + c);//13
		
		
		
	
	}
}
		