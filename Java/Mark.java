public class Mark {
	public static void main (String args []){
	
	    int marks = 75;
	
	    if( marks >= 80){
		System.out.println ("A");
	    }else{
			if(marks <80 && marks >=60) {
				System.out.println ("B");
			}else{
				if((marks <60) && (marks >=40)) {
					System.out.println ("c");
				}else{
					if((marks <40) && (marks >=20)) {
						System.out.println ("D");
					}else{
						if((marks <20) && (marks >=0)) {
							System.out.println ("E");
						}else{
							System.out.println ("not found");
						}
					}
				}
			}
		}
	}
}	