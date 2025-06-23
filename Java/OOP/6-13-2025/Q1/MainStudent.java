import java.util.Scanner;

public class MainStudent {
    public static void main (String args[]) {
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int total  = 0;

		
        Scanner Scan= new Scanner(System.in);

        int []Stu = new int[10]; 
		
		System.out.println("Please enter ages:"); 
		for (int i = 0; i < 10; i++) { 
            System.out.print("Enter ages " + (i + 1) + ": "); 
            Stu[i] = Scan.nextInt();
			
	    if ( Stu[i]<18 && (Stu[i]>=0)){
			count1++;
		}else if((Stu[i]>=18) && (Stu[i] <=25)){
			count2++;
		}else if (Stu[i]>25){
			count3++;
		}
		
		total+=Stu[i];
		}
	System.out.println("  ");
	System.out.println("Number of Students under  age 18: " + count1);
	System.out.println("Number of students Between age 18 and 25: " + count2);
	System.out.println("Number of student Above age 25: " + count3);
	System.out.println("Average age of the students: " + total/10);
	}
}
		