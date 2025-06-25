public class Operators {
	public static void main (String [] args) {
		int x = 10;
		int y = 3;
	System.out.println (x+y); //13
	System.out.println (x-y); //7
	System.out.println (x*y); //30
	System.out.println (x/y); //3
	System.out.println (x%y); //1

	System.out.println("x+y" + x+y); //x+y103 - "x+y" first one is string , when first on is string sftear that others are consider as sting
	System.out.println(x+y +"x+y"); //13x+y - first one is interger so no problem we will goet out out put as interger 
	System.out.println("x+y" + (x+y));//x+y13 -  this armatic operation will work coz of bracket
	
	//System.out.println("x-y" + x-y); //error first type in string secound type in integer
	System.out.println(x-y + "x-y"); //7x-y
	System.out.println("x-y" + (x-y));//x-y7
	
	System.out.println("x*y" + x*y);//x*y30
	System.out.println(x*y + "x*y");//30x*y
	System.out.println("x*y" + (x*y));//x*y30
	
	System.out.println("x/y" + x/y);// x/y3
	System.out.println(x/y + "x/y");// 3x/y
	System.out.println("x/y" + (x/y));// x/y3
	
	System.out.println("x%y" + x%y);// x%y1
	System.out.println(x%y + "x%y");// 1x%y
	System.out.println("x%y" + (x%y));// x%y1 
	
	
	:--
	
	
	}
}	