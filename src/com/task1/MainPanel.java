package com.task1;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MainPanel extends JPanel{
	public Image image;
	public Myframe myframe;
		
	public MainPanel (Myframe myframe) {
		this.myframe=myframe;
		image=Toolkit.getDefaultToolkit().getImage("image/9.jpg");
		
	}	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image,0,0,900,605,null);
		
		}
}
