public class Variables {
	public static void main (String args[]){
		int x;
		x = 10;
	System.out.println (x);  //10
	System.out.println ("x"); //x 
	
	
	// int y = 10;
	//int y = 20;  //( it's output shows error, coz  we can declare a variable for only one time)
	
	
	
	int z = 10;
	 z = 30;  //(we can change z's value using this way output will be 30)
	 
	System.out.println (z);// 30
	
	byte b;
	b = 20;
	System.out.println (b); // 20 but if b = 150;, output should be error,coz -128 to 127 (1 bye = 8 bit)
	
	long l;
	l = 56345879L; // when we didn't use L at the last the out put will show erorr ( l,L - can use both type)
	System.out.println (l); // output 56345879
	
	float f = 10.5555555555555f;  // when we didn't use F at the last the out put will show erorr ( f,F - can use both type)
	System.out.println (f); // 10.555555
	
	double d =25.33333333d; // when we did'nt use d ate the last error will not occour but we use the d at the last is best practices
	System.out.println (d); 	// 25.33333333
	
	char ch1 = 'A'; // if it is one letter we can use '', mote the one letter we can use ""
	System.out.println (ch1); //A
	
	char ch2 = 65;
	System.out.println (ch2); //A	( out put will shows based on ascii table value)
	
	char ch3 = 0101;
	System.out.println (ch3); // A - base 8
	
	char ch4 = 0x41;
	System.out.println (ch4); //A -  base 16
	
	char ch5 = '\u0041';
	System.out.println (ch5); // A - unicode
	
	char ch6 = 0b1000001;
	System.out.println (ch6); //A - binary
	
	int ic1 = 65;
	System.out.println (ic1); //65
	int ic2 = 0101;
	System.out.println (ic2); //65
	int ic3 = 0x41;
	System.out.println (ic3); //65
	int ic4 = '\u0041'; //65 
	System.out.println (ic4);
	int ic5 = 0b1000001; //65
	System.out.println (ic5);
	
	
	boolean bool1 = true;
	System.out.println (bool1); //true
	boolean bool2 = false;
	System.out.println (bool2); // false
	
	
	/*
	
	boolean bool3 = 1;
	System.out.println (bool3);
	boolean bool4 = 0;
	System.out.println (bool4);  //error(int cannot convert to boolean)
	
	boolean bool5 = No;
	System.out.println (bool5);
	boolean bool6 = Yes;
	System.out.println (bool6); // erorr(Sting cannot convert to boolean)
	
	*/
	
	
	
	}
}	
	