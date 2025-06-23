public class Day11Hw{
	public static void main (String args[]){
		int i = 15;
		int j = 6;
		int k = 3;
	

     	
		i=j++ - k++ - --i;
		System.out.println("i: " + i);//-11
		System.out.println("j: " + j);//4
		System.out.println("k: " + k);//7
		
	
		k= --i - ++j + --k - j--;
		System.out.println("i: " + i);//-12
		System.out.println("j: " + j);//7
		System.out.println("k: " + k);//-25
		
		j= ++i - --i + ++j - k++;
		System.out.println("i: " + i);//-12
		System.out.println("j: " + j);//34
		System.out.println("k: " + k);//-24
		
		k-=j*=i;
		System.out.println("i: " + i);//-12
		System.out.println("j: " + j);//-408
		System.out.println("k: " + k);//384
		
		i=k=j;
		System.out.println("i: " + i);//-408
		System.out.println("j: " + j);//-408
		System.out.println("k: " + k);//-408
		
		
	
	}
}
		
