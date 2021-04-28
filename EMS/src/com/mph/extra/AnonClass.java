package com.mph.extra;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AnonClass {
	
	private Frame f;
	
	public AnonClass() {
		f= new Frame("My WINDOW");
	}
	
	public void launchFrame() {
		f.setSize(250,250);
		f.setBackground(Color.GREEN);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
			System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		AnonClass ac = new AnonClass();
		ac.launchFrame();

	}

}
