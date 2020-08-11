package com.task1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;



public class Backpanel extends JPanel{
	
	public Image image,image2;
	public Myframe myframe;
	public int timer=0;
	public int time=0;
	public PlayerImg playerImg;
	public DrawThread drawThread;
	public Attack	attack;
	public BadPlanes badPlane;
	public int width=50;
	public int height=50;
	public boolean rect;
	public static int grade;
	public int speed=3;
	public JLabel label1;
	public int x=0;
	public String grades="0";
	
	public ArrayList<BadPlanes> badPlanes=new ArrayList<BadPlanes>();
	public ArrayList<Attack> arrayList=new ArrayList<Attack>();
	public Backpanel() {
		image=Toolkit.getDefaultToolkit().getImage("image/3.jpg");
		label1=new JLabel();
		add(label1);
		playerImg=new PlayerImg(this);
		
		drawThread=new DrawThread(this);
		drawThread.start();
		
		
		
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image,0,time,image.getHeight(this),image.getWidth(this),null);
		g.drawImage(image,0,time-image.getHeight(this),image.getHeight(this),image.getWidth(this),null);
		
		
		timer++;
		
		if (timer==10000) {
			timer=0;
		}
		if (timer%10==0) {
			
	
		//图片流动
			time++;
			
			if(time==image.getHeight(this))
					time=0;
		}		
			//玩家添加
			playerImg.drawself(g);
			//添加子弹
			if (timer%100==0) {		
				attack=new Attack(this);
				attack.x=playerImg.x+35;
				attack.y=playerImg.y-20;
				arrayList.add(attack);
			}
			
			
			for (int i = 0; i <arrayList.size(); i++) {
				arrayList.get(i).drawself(g);
			}
			//敌人添加
			if (timer%100==0) {
			badPlane=new BadPlanes();
			
			
			badPlanes.add(badPlane);
			
			}	
			for (int i = 0; i < badPlanes.size(); i++) {
				Rectangle r1=new Rectangle(attack.x,attack.y,width,height);
				Rectangle r2=new Rectangle(this.badPlanes.get(i).x,this.badPlanes.get(i).y,width,height);
				rect=r1.intersects(r2);
				if (rect==true) {
				
				badPlanes.remove(badPlanes.get(i));	
				grade=x++;
				
				}	
				else {
					this.badPlanes.get(i).drawself(g);
				}
				
			}
			
			
			
		
	}
	public static int  getGrade() {
		return grade;
	}
	
	public class BadPlanes {
		public  int x=(int)(Math.random()*605);
		public  int y=-20;
		public int width=50;
		public int height=50;
		 public BadPlanes() {
			 image2=Toolkit.getDefaultToolkit().getImage("image/2.png");
		 }
		 public void drawself(Graphics g) {
			
		
				
				if (timer%10==0) {
					
			
				y+=speed;
				
				
				}
								
				g.drawImage(image2, x, y,width,height,null);
				if (y==Myframe.frameheight) {
					badPlanes.remove(this);
					x=(int)(Math.random()*605);
				}
				
			}
		
		 
	}
}

