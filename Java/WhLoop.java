public class Loop {
	public static void main (String srgs []){
		int x = 1;
		/*while ( x<=5) {
			System.out.println(x);
			x++;
		}
		System.out.println(x);
		*/
		
		/*boolean bool = true;
		while (bool) {
			System.out.println(x);      //we can use break to stop increament
			if (x==5) {
				bool = false;
			}
			x++;
		}
		System.out.println (x);	
		*/
		
		while (x<=5) {
			int y = 1;
		  while (y<=3) {
			  System.out.println(y);
			  y++;
		  }
		  System.out.println(x);
		  x++;
		} 
		
	}
}

