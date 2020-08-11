package com.task1;

import javax.swing.JLabel;

public class DrawThread extends Thread{
	
	public Backpanel backpanel;
	
	public DrawThread(Backpanel backpanel) {
		this.backpanel=backpanel;
	}
	
	public void run() {
		while(true) {
			
		try {
			this.backpanel.repaint();
			add();
			this.currentThread().sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

	public void add() {
		// TODO Auto-generated method stub
		this.backpanel.grade=this.backpanel.getGrade();
		this.backpanel.grades=Integer.toString(this.backpanel.grade);
		this.backpanel.label1.setText(this.backpanel.grades);
		
	}
}
