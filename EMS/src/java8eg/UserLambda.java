package java8eg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class UserLambda {

	public static void main(String[] args) {
		
		User u1 = new User("Kush","kush@gmail.com",23);
		User u2 = new User("Bunty","bunty@gmail.com",22);
		User u3 = new User("KK","kk@gmail.com",21);
		
		List<User> li = new ArrayList<User>();
		li.add(u1);
		li.add(u2);
		li.add(u3);
		
		System.out.println("List of Users:" + li);
		
		Iterator<User> i = li.iterator();
		/*while(i.hasNext()) {
			System.out.println(i.next());
			
		}*/
		
		
		
		li.forEach(lis -> System.out.println(lis));
		
		Collections.sort(li,User.nameComparator);
		li.forEach(lis -> System.out.println(lis));
		
		Collections.sort(li,User.ageComparator);
		li.forEach(lis -> System.out.println(lis));
		
	}
		
		
}


