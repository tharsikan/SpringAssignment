package com.sgic.assignment3.awt;

import java.awt.*;
import java.awt.event.*;


public class Calculator3 extends Frame{
	Label l1 = new Label("First Number");
	Label l2 = new Label("Secound Number");
	CheckboxGroup cbg = new CheckboxGroup();
	Checkbox b1 = new Checkbox("ADD", cbg, false); 
	Checkbox b2 = new Checkbox("SUBTRACT", cbg, false);
	Checkbox b3 = new Checkbox("MULTIPLY", cbg, false);
	Checkbox b4 = new Checkbox("DIVIDE", cbg, false);
	TextField t1 = new TextField();
	TextField t2 = new TextField();
	TextField t3 = new TextField();
	Button b5 = new Button("Action");
	double num = 0;
	public Calculator3(){
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
		new Calculator3();
	}
	public void eventListen() {
		double n1 =Double.parseDouble( t1.getText());
		double n2 =Double.parseDouble( t2.getText());
		b1.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {                 
               if(e.getStateChange()==1) {
            	   num = n1+n2; 
               }
            }  
         });
		b2.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {                 
               if(e.getStateChange()==1) {
            	   num = n1-n2; 
               }
            }  
         });
		b3.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {                 
               if(e.getStateChange()==1) {
            	   num = n1*n2; 
               }
            }  
         });
		b4.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {                 
               if(e.getStateChange()==1) {
            	   num = n1/n2; 
               }
            }  
         });
	}


}

