import PackA.A;
package PackB;
//import PackA.A;
public class B extends A {
	int y;
	
	public B( int y){
		super(30);
		this.y = y;
	}
	
	public void getY(){
		System.out.println("By: " + this.y);
	}
}
	
	