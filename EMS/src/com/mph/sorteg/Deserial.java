package com.mph.sorteg;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserial {
	public static void main(String args[]) {
		Student st =null;
		try {
			FileInputStream fis = new FileInputStream("myfile.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			st=(Student)ois.readObject();
			fis.close();
			ois.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("From finally..");
			System.out.println(st.getSid());
			System.out.println(st.getAge());
			System.out.println(st.getMarks());
			System.out.println(st.getSname());
		}
		
	}
}
