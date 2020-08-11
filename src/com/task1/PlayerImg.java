package com.task1;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;

public class PlayerImg extends JPanel{
	
	public Image imgImage;
	public int width=100;
	public int height=100;
	public static int x;
	public static int y;
	public boolean left,down,up,right;
	public Backpanel backpanel;
	public int speed=3;
		public PlayerImg(Backpanel backpanel) {
			this.backpanel=backpanel;
			imgImage=Toolkit.getDefaultToolkit().getImage("image/2.png");
			
			x=Myframe.framewidth-this.width*2;
			
			y=Myframe.frameheight-this.height*5;
		}
		public void drawself(Graphics g) {
			
			
			
			g.drawImage(imgImage,x,y,width,height,null);
			if (left) {
				x-=speed;
			}
			if (right) {
				x+=speed;
			}
			if (down) {
				y+=speed;
			}
			if (up) {
				y-=speed;
			}
			
		}
		public void addLocation(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				left=true;
				break;
			case KeyEvent.VK_RIGHT:
				right=true;
				break;
			case KeyEvent.VK_UP:
				up=true;
				break;
			case KeyEvent.VK_DOWN:
				down=true;
				break;

			}
		}
		public void delLocation(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				left=false;
				break;
			case KeyEvent.VK_RIGHT:
				right=false;
				break;
			case KeyEvent.VK_UP:
				up=false;
				break;
			case KeyEvent.VK_DOWN:
				down=false;
				break;

			}
		}
		
}

