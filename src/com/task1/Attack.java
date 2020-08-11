package com.task1;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class Attack extends JPanel{
	public Backpanel backpanel;
	public int width=20;
	public int height=20;
	public Image imageattack;
	public  int x;
	public  int y;
	public int speed=3;
	public PlayerImg playerImg;
	public Attack(Backpanel backpanel) {
		this.backpanel=backpanel;
		imageattack=Toolkit.getDefaultToolkit().getImage("image/2.png");
	
		
	}
	public void drawself(Graphics g) {
		
		g.drawImage(imageattack,x, y,width,height,null);
		
		if (this.backpanel.timer%1==0) {
			y-=speed;
			if (y<0) {
				this.backpanel.arrayList.remove(this);
			}
		}
		
	}
	 

}
