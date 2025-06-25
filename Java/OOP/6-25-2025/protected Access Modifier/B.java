
package PackB;
import PackA.A;
public class B extends A {
	public int y;
	
	public B( int y){
		super(30);
		this.y = y;
	}
	
	public void getY(){
		super.getX();
		System.out.println("By: " + this.y);
	}
}
	
	