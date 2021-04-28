package java8eg;

import java.util.Comparator;

import com.mph.sorteg.Student;

public class User {
	
	private String name;
	private String email;
	private int age;
	public User() {
		super();
	}
	public User(String name, String email, int age) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", age=" + age + "]";
	}
	
	
	//Anonymous class
	public static Comparator<User> nameComparator= new Comparator<User>() {

		@Override
		public int compare(User u1, User u2) {

			return (u1.getName().compareTo(u2.getName()));
		}		
	};
	
		
	public static Comparator<User> ageComparator= new Comparator<User>() {

			@Override
			public int compare(User u1, User u2) {

				return (u1.getAge() - u2.getAge());
			}
	
		
		
		
	};
	
	
}
