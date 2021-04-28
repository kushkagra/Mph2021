package java8eg;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

public class FuncInterEg {

	/*public boolean test(String un, String pw) {
		if(un.equals("Kush")&& pw.equals("1234")){
			
		}
		
	}*/
	public static void main(String[] args) {
		
		BiPredicate<String, String> pred  = (un,pw)->un.equals(pw);
		System.out.println(pred.test("Kush","1234"));
		
		BiPredicate<Long, Long> p1 =(x,y)->x>y;
		BiPredicate<Long, Long> p2 =(x,y)->x==y;
		System.out.println(p1.and(p2).test(10L,10L));
		System.out.println(p1.or(p2).test(10L,10L));
		
		
		BiConsumer<Integer,Integer> bc =(a,b)-> System.out.println(a+b);
		bc.accept(12, 34);
		
		Supplier<String> s=()->{ return "hello";};
		System.out.println(s.get());
		
		Supplier<Number> s1=()->{ return 500;};
		System.out.println(s1.get());
		
		Function<Integer,String> f=(num)->{
			if(num%2==0) {
				return num +" is even";
			}else {
				return num +" is odd";
			}
		};
		
		System.out.println(f.apply(222));
	}

}
