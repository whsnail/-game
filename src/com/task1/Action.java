package com.task1;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;







public class Action extends KeyAdapter{
	public Myframe myframe;
	public PlayerImg playerImg;
	public Backpanel backpanel;
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		playerImg.addLocation(e);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		playerImg.delLocation(e);
	}

	
	
}
