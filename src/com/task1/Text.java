package com.task1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Text extends JFrame{
	public PlayerImg playerImg;
	public Text(){
		setTitle("asd");
		setBounds(200, 200, 400, 400);
		JPanel panel=new JPanel();
		setContentPane(panel);
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e.getKeyCode());
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e.getKeyCode());
			}
		});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Text().setVisible(true);
	}

}
