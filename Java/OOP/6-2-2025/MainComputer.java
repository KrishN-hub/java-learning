public class MainComputer{
	public static void main(String args[]){
		
		Computer C;
		C = new Computer();
		
		C.Color ="Red";
		C.Brand = "Dell";
		C.MadeIn = "India";
		
		C.Study();
		C.Editing();
		C.Gaming();
		
		System.out.println(C.Color);
		System.out.println(C.Brand);
		System.out.println(C.MadeIn);
		
		
	}
}
			