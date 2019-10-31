package com.sgic.assignment3.awt;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Calculator4 extends JFrame{
	JLabel l1 = new JLabel("First Number");
	JLabel l2 = new JLabel("Secound Number");
	JRadioButton b1 = new JRadioButton("ADD"); 
	JRadioButton b2 = new JRadioButton("SUBTRACT");
	JRadioButton b3 = new JRadioButton("MULTIPLY");
	JRadioButton b4 = new JRadioButton("DIVIDE");
	JTextField t1 = new JTextField();
	JTextField t2 = new JTextField();
	JTextField t3 = new JTextField();
	JButton b5 = new JButton("Action");
	double num = 0;
	public Calculator4(){
		l1.setBounds(30,60,80,30);
		t1.setBounds(120,60,80,30);
		l2.setBounds(240,60,80,30);
		t2.setBounds(340,60,80,30);
		b1.setBounds(30,120,80,30);
		b2.setBounds(120,120,80,30);
		b3.setBounds(240,120,80,30);
		b4.setBounds(340,120,80,30);
		t3.setBounds(120,230,180,30);
		b5.setBounds(170,180,80,30);
		
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				eventListen();
				t3.setText(num+"");	
			}
			
		});
		
		
		add(l1);add(t1);add(l2);add(t2);add(b1);add(b2);add(b3);add(b4);add(t3);add(b5);
		setBackground(Color.gray);
		setLayout(null);
		setSize(500,300);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new Calculator4();
	}
	public void eventListen() {
		double n1 =Double.parseDouble( t1.getText());
		double n2 =Double.parseDouble( t2.getText());
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(b1.isSelected()) {
					num = n1+n2;
				}
			}
			
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(b1.isSelected()) {
					num = n1-n2;
				}
			}
			
		});
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(b1.isSelected()) {
					num = n1*n2;
				}	
			}
			
		});
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(b1.isSelected()) {
					num = n1/n2;
				}
			}
			
		});
	}


}

