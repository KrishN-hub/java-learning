import java.util.Scanner;

class Callcal {
	public static void main(String args[]){
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter your minites: ");
		
		int mints = Scan.nextInt();
		
		
		if((mints <= 30) && (mints>=1)){
			System.out.println(mints * 2);
		}else if ((mints<=60)&&(mints>30)){
			System.out.println((30 * 2)+ ((mints - 30) *1.5));
		}else if ((mints<=120)&&(mints>60)){
			System.out.println((30 * 2) + (30 * 1.5) + ((mints - 60) * 1));
		}else if (mints>120){
			System.out.println((30 * 2) + (30 * 1.5) + (60*1) + ((mints - 120) * 0.5));
		}else {
			System.out.println("Enter your correct minites");
		}
		
	}
}
		