package com.task1;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;











public class Myframe extends JFrame{
	public MainPanel mainPanel;
	public Backpanel backpanel;
	public static int framewidth=605;
	public static int frameheight=900;
	public JButton startButton;
	public PlayerImg playerImg;
	public JLabel label1,label2;
	
	


	public Myframe() {
		setTitle("飞机模拟大战");
		setBounds(150,0,frameheight,framewidth);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		mainPanel=new MainPanel(this);
		add(mainPanel);
		startButton=new JButton("开始游戏");
		
		mainPanel.add(startButton);
		startButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource()==startButton) {
					backpanel=new Backpanel();
					
					add(backpanel);
					validate();
				}
			
				
				
			}
		});
		startButton.setFocusable(false);	
		
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				backpanel.playerImg.addLocation(e);
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				backpanel.playerImg.delLocation(e);;
			}
		});
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Myframe().setVisible(true);
	}


	



	
}
