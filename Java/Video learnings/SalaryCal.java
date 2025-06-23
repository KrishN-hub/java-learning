class SalaryCal {
	public static void main(String args[]){
		int salary = 145000;
		double tax;
		double netSalary;
		
		if(salary>=150000) {
			tax = salary*0.03;
		}else{
			tax = salary*0.01;
		}
		netSalary = salary - tax;
		System.out.println( "basic salary: " + salary );
		System.out.println("Tax Amount: " + tax);
		System.out.println("Net Salary: " + netSalary);
	}
}