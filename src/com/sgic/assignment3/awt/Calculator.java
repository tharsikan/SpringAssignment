package com.sgic.assignment3.awt;

import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame{
	Label l1 = new Label("First Number");
	Label l2 = new Label("Secound Number");
	Button b1 = new Button("ADD");
	Button b2 = new Button("SUBTRACT");
	Button b3 = new Button("MULTIPLY");
	Button b4 = new Button("DIVIDE");
	TextField t1 = new TextField();
	TextField t2 = new TextField();
	TextField t3 = new TextField();
	public Calculator(){
		l1.setBounds(30,60,80,30);
		t1.setBounds(120,60,80,30);
		l2.setBounds(240,60,80,30);
		t2.setBounds(340,60,80,30);
		b1.setBounds(30,120,80,30);
		b2.setBounds(120,120,80,30);
		b3.setBounds(240,120,80,30);
		b4.setBounds(340,120,80,30);
		t3.setBounds(120,180,180,30);
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int n1 =Integer.parseInt( t1.getText());
				int n2 =Integer.parseInt( t2.getText());
				int sum = n1+n2;
				t3.setText("Sum of the numbers is :  "+sum);
				
			}
			
		});
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int n1 =Integer.parseInt( t1.getText());
				int n2 =Integer.parseInt( t2.getText());
				int DIVIDE = n1/n2;
				t3.setText("DIVIDE of the numbers is :  "+DIVIDE);
				
			}
			
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int n1 =Integer.parseInt( t1.getText());
				int n2 =Integer.parseInt( t2.getText());
				int SUBTRACT = n1-n2;
				t3.setText("SUB of the numbers is :  "+SUBTRACT);
				
			}
			
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int n1 =Integer.parseInt( t1.getText());
				int n2 =Integer.parseInt( t2.getText());
				int MULTIPLY = n1*n2;
				t3.setText("MULTI of the numbers is :  "+MULTIPLY);
				
			}
			
		});
		
		
		add(l1);add(t1);add(l2);add(t2);add(b1);add(b2);add(b3);add(b4);add(t3);
		setBackground(Color.gray);
		setLayout(null);
		setSize(500,250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Calculator();
	}
}
