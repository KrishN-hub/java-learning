import java.util.Scanner;
class Day20Hw4_2{
	public static void main(String args[]){
		
		Scanner Scan = new Scanner(System.in);
		int[] marks = new int[5];
		int total = 0;
		double avg = 0;
		String res ='\u0000';
		
		for(int i=0;i<marks.length;i++) {
			System.out.println("Enter yor marks" +(i+1)+":");
			marks[i]=Scan.nextInt();			
		}
		
		for(int i=0;i<marks.length;i++){
			System.out.println("Marks" +(i+1)+":" + marks[i]);
			total+=marks[i];
		}
		
		avg=total/marks.length;
		
		if(avg>=50){
			res = 'Pass';
		}else{ 
		  res = 'fail';
		}
		
		System.out.println ("Total: " + total);
		System.out.println("Average: " + avg);
		System.out.println("Result: " + res);
		
	}
}
