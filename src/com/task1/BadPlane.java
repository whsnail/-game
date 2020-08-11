package com.task1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.Random;

public class BadPlane {
	 public Image image;
	 public int width=50;
	 public int height=50;
	 public static int x=(int)(Math.random()*605);;
	 public static int y=-20;
	 public Backpanel backpanel;
	 public int speed=3;
	 public BadPlane(Backpanel backpanel) {
		 this.backpanel=backpanel;
		 image=Toolkit.getDefaultToolkit().getImage("image/2.png");
		 
		
	 }
	 public void drawself(Graphics g) {
		
		g.drawImage(image, x, y,width,height,null);
		if (this.backpanel.timer%10==0) {
			
	
		y+=speed;
		
		if (y==Myframe.frameheight) {
			this.backpanel.badPlanes.remove(this);
			
			System.out.println(y);
		}
		}
	 }
	 
	
	 
}
