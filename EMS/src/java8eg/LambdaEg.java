package java8eg;

interface Compute{
	
	public int add(int a, int b);
	//public int sub(int a, int b);
}

interface Display{
	
	public void show(String s);
}

public class LambdaEg {
	
	public static void main(String args[]) {
		//LambdaEg le = new LambdaEg();
		//System.out.println(le.add(10,20));
		
		Compute com=(a , b) -> {
			return (a+b);
		};
		System.out.println(com.add(45,55));
		
		Display ds=(s) ->{
			System.out.println(s);
		};
		ds.show("Good Morning");
		
	}

	/*@Override
	public int add(int a, int b) {
		return a+b;
	}*/
	
	

}
