public class Operators2 {
	public static void main (String [] args){
		int x = 10;
		int y = 5;
		System.out.println(x); //10
		
		x = x+5;
		System.out.println(x);//15
		
		x+= 5; //x=x+5
		System.out.println(x);//20
		
		x-= 15; //x=x-15
		System.out.println(x);//5
		
		x*= 3; //x=x*3
		System.out.println(x);//15
		
		x/=5; //x=x/5
		System.out.println(x);//3
		
		x%= 2; //x=x%2
		System.out.println(x);//1
		
		
		
		
		// Increment and decrement operator
		
		x++;
		System.out.println(x);//2
		
		++x;
		System.out.println(x);//3
		
		
		x--;
		System.out.println(x);//2
		
		--x;
		System.out.println(x);//1
		
		System.out.println(x++);//1
		System.out.println(x);//2
		System.out.println(++x);//3
		
		
		/*
		post 
		  x++
		  x--
		pre
		  ++x
		  --x
		  
	*/

		//-- (relational operators)--
	 	 
	System.out.println (x==y); // false
	System.out.println (x!=y); //true
	System.out.println (x<y); //true
	System.out.println (x>y); //false
	System.out.println (x<=y); //true
	System.out.println (x>=y); //false
	System.out.println (!(x==y)); //true
	System.out.println ("x==y" + (x==y)); // x==yfasle
	//System.out.println ("x==y" + x==y); // error - bad operend types for binary operator
	
	// -- Logical OPerators --
	
	System.out.println (true && true); //true
	System.out.println (false && true); //false
	System.out.println (true && false); //false
	System.out.println (false && true); //false
	
	System.out.println (true || true); //true
	System.out.println (false || true); //true
	System.out.println (true || false); //true
	System.out.println (false || false); //false
	
	
	
	

	}
}	