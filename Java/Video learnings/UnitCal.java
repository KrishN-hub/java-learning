import java.util.Scanner;

class UnitCal{
	public static void main(String args[]){
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter Your Unit: ");
		
		int Unit = Scan.nextInt();
		
		if((Unit <= 90) && (Unit >=1)){
            System.out.println(1000);
		}else if ((Unit <= 300)&&(Unit > 90)){
			System.out.println(1000 + (Unit-90)*5);
		}else if ((Unit <= 500) && ( Unit > 300)){
			System.out.println(1000 + 210*5 + (Unit - 300)* 10);
		}else if (Unit > 500){
			System.out.println(1000 + 210*5 + 200*10 + (Unit - 500) *10 + (Unit - 500) *0.03);
		}else{
			System.out.println("Enetr your Correct Unit");
		}
	}
}	
		
		

		