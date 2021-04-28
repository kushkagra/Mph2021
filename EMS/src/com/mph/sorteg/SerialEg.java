package com.mph.sorteg;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialEg {

	public static void main(String[] args) {
		Student s= new Student();
		s.setSid(102);
		s.setAge(22);
		s.setSname("Kushdeep");
		s.setMarks(90);
		FileOutputStream fos =null;
		ObjectOutputStream oos =null;
		
		try {
			fos = new FileOutputStream("myfile.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(s);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
				oos.close();
				
			}
			catch(IOException o){
				o.printStackTrace();
			}
			System.out.println(s.getSid());
			System.out.println(s.getAge());
			System.out.println(s.getMarks());
			System.out.println(s.getSname());
		}
	}

}
