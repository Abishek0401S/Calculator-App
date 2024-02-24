
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Calculator implements ActionListener{
	public static void main(String args[]){
		Calculator c = new Calculator();
	}
	JLabel displayLabel;
	JButton sevenbutton;
	JButton eightbutton;
	JButton ninebutton;
	JButton fourbutton;
	JButton fivebutton;
	JButton sixbutton;
	JButton onebutton;
	JButton twobutton;
	JButton threebutton;
	JButton dotbutton;
	JButton zerobutton;
	JButton equalbutton;
	JButton divbutton;
	JButton multibutton;
	JButton subbutton;
	JButton addbutton;
	JButton clearbutton;
	
	boolean isOperatorClicked = false;
	
	boolean isAddOperatoreClicked = false;
	boolean isSubOperatoreClicked = false;
	boolean isMutiOperatoreClicked = false;
	boolean isDivOperatoreClicked = false;
	
	String oldValue;
	String newValue;
	float newValueF;
	float oldValueF;
	float result;
	
	Calculator(){
		JFrame jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(450, 600);
		//jf.setLocation(300,200);
		jf.getContentPane().setBackground(Color.WHITE);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		displayLabel = new JLabel("");
		displayLabel.setBounds(20, 40, 400, 40);
		displayLabel.setBackground(Color.DARK_GRAY);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(java.awt.Color.white);
		
		jf.add(displayLabel);
		
	    sevenbutton = new JButton("7");
		sevenbutton.setBounds(30, 130, 80, 80);
		sevenbutton.addActionListener(this);
		sevenbutton.setBackground(Color.LIGHT_GRAY);
		sevenbutton.setOpaque(true);
		jf.add(sevenbutton);
		
	    eightbutton = new JButton("8");
		eightbutton.setBounds(130, 130, 80, 80);
		eightbutton.addActionListener(this);
		eightbutton.setBackground(Color.LIGHT_GRAY);
		eightbutton.setOpaque(true);
		jf.add(eightbutton);
		
		ninebutton = new JButton("9");
		ninebutton.setBounds(230, 130, 80, 80);
		ninebutton.addActionListener(this);
		ninebutton.setBackground(Color.LIGHT_GRAY);
		ninebutton.setOpaque(true);
		jf.add(ninebutton);
		
		fourbutton = new JButton("4");
		fourbutton.setBounds(30, 230, 80, 80);
		fourbutton.addActionListener(this);
		fourbutton.setBackground(Color.LIGHT_GRAY);
		fourbutton.setOpaque(true);
		jf.add(fourbutton);
		
		fivebutton = new JButton("5");
		fivebutton.setBounds(130, 230, 80, 80);
		fivebutton.addActionListener(this);
		fivebutton.setBackground(Color.LIGHT_GRAY);
		fivebutton.setOpaque(true);
		jf.add(fivebutton);
		
		sixbutton = new JButton("6");
		sixbutton.setBounds(230, 230, 80, 80);
		sixbutton.addActionListener(this);
		sixbutton.setBackground(Color.LIGHT_GRAY);
		sixbutton.setOpaque(true);
		jf.add(sixbutton);
		
		onebutton = new JButton("1");
		onebutton.setBounds(30, 330, 80, 80);
		onebutton.addActionListener(this);
		onebutton.setBackground(Color.LIGHT_GRAY);
		onebutton.setOpaque(true);
		jf.add(onebutton);
		
		twobutton = new JButton("2");
		twobutton.setBounds(130, 330, 80, 80);
		twobutton.addActionListener(this);
		twobutton.setBackground(Color.LIGHT_GRAY);
		twobutton.setOpaque(true);
		jf.add(twobutton);
		
		threebutton = new JButton("3");
		threebutton.setBounds(230, 330, 80, 80);
		threebutton.addActionListener(this);
		threebutton.setBackground(Color.LIGHT_GRAY);
		threebutton.setOpaque(true);
		jf.add(threebutton);
		
		dotbutton = new JButton(".");
		dotbutton.setBounds(30, 430, 80, 80);
		dotbutton.addActionListener(this);
		dotbutton.setBackground(Color.LIGHT_GRAY);
		dotbutton.setOpaque(true);
		jf.add(dotbutton);
		
		zerobutton = new JButton("0");
		zerobutton.setBounds(130, 430, 80, 80);
		zerobutton.addActionListener(this);
		zerobutton.setBackground(Color.LIGHT_GRAY);
		zerobutton.setOpaque(true);
		jf.add(zerobutton);
		
		equalbutton = new JButton("=");
		equalbutton.setBounds(230, 430, 80, 80);
		equalbutton.addActionListener(this);
		equalbutton.setBackground(Color.WHITE);
		equalbutton.setOpaque(true);
		jf.add(equalbutton);
		
		divbutton = new JButton("÷");
		divbutton.setFont(new Font("Arial", Font.PLAIN, 30));
		divbutton.setBounds(330, 130, 80, 80);
		divbutton.addActionListener(this);
		divbutton.setBackground(new Color(0, 51, 102));
		divbutton.setForeground(Color.WHITE);
		divbutton.setOpaque(true);
		jf.add(divbutton);
		
		multibutton = new JButton("X");
		multibutton.setBounds(330, 230, 80, 80);
		multibutton.addActionListener(this);
		multibutton.setBackground(Color.YELLOW);
		multibutton.setOpaque(true);
		jf.add(multibutton);
		
		subbutton = new JButton("-");
		subbutton.setFont(new Font("Arial", Font.PLAIN, 30));
		subbutton.setBounds(330, 330, 80, 80);
		subbutton.addActionListener(this);
		subbutton.setBackground(Color.PINK);
		subbutton.setOpaque(true);
		jf.add(subbutton);
		
		addbutton = new JButton("+");
		addbutton.setFont(new Font("Arial", Font.PLAIN, 30));
		addbutton.setBounds(330, 430, 80, 80);
		addbutton.addActionListener(this);
		addbutton.setBackground(Color.GREEN);
		addbutton.setOpaque(true);
		jf.add(addbutton);
		
		clearbutton = new JButton("Clear");
		clearbutton.setBounds(330,85, 80, 40);
		clearbutton.addActionListener(this);
		clearbutton.setBackground(Color.CYAN);
		clearbutton.setOpaque(true);
		jf.add(clearbutton);
	}
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		if(e.getSource()==sevenbutton){
			if(isOperatorClicked){
				displayLabel.setText("7");
				isOperatorClicked = false;
			}else{
				displayLabel.setText(displayLabel.getText()+"7");
			}
		}else if(e.getSource() ==eightbutton){
			if(isOperatorClicked){
				displayLabel.setText("8");
				isOperatorClicked = false;
			}else{
				displayLabel.setText(displayLabel.getText()+"8");
			}
		}else if(e.getSource() ==ninebutton){
			if(isOperatorClicked){
				displayLabel.setText("9");
				isOperatorClicked = false;
			}else{
				displayLabel.setText(displayLabel.getText()+"9");
			}
		}else if(e.getSource() == fourbutton){
			if(isOperatorClicked){
				displayLabel.setText("4");
				isOperatorClicked = false;
			}else{
				displayLabel.setText(displayLabel.getText()+"4");
			}
		}else if(e.getSource() == fivebutton){
			if(isOperatorClicked){
				displayLabel.setText("5");
				isOperatorClicked = false;
			}else{
				displayLabel.setText(displayLabel.getText()+"5");
			}
		}else if(e.getSource() == sixbutton){
			if(isOperatorClicked){
				displayLabel.setText("6");
				isOperatorClicked = false;
			}else{
				displayLabel.setText(displayLabel.getText()+"6");
			}
		}else if(e.getSource() == onebutton){
			if(isOperatorClicked){
				displayLabel.setText("1");
				isOperatorClicked = false;
			}else{
				displayLabel.setText(displayLabel.getText()+"1");
			}
		}else if(e.getSource() == twobutton){
			if(isOperatorClicked){
				displayLabel.setText("2");
				isOperatorClicked = false;
			}else{
				displayLabel.setText(displayLabel.getText()+"2");
			}
		}else if(e.getSource() == threebutton){
			if(isOperatorClicked){
				displayLabel.setText("3");
				isOperatorClicked = false;
			}else{
				displayLabel.setText(displayLabel.getText()+"3");
			}
		}else if(e.getSource() == zerobutton){
			if(isOperatorClicked){
				displayLabel.setText("0");
				isOperatorClicked = false;
			}else{
				displayLabel.setText(displayLabel.getText()+"0");
			}
		}else if(e.getSource() == divbutton){
			isOperatorClicked = true;
			isDivOperatoreClicked = true;
			oldValue = displayLabel.getText();
			oldValueF = Float.parseFloat(oldValue);
			
			displayLabel.setText("÷");
			
		}else if(e.getSource() == multibutton){
			isOperatorClicked = true;
			isMutiOperatoreClicked = true;
			
			oldValue = displayLabel.getText();
			oldValueF = Float.parseFloat(oldValue);
			
			displayLabel.setText("X");
						
		}else if(e.getSource() == subbutton){
			isOperatorClicked = true;
			isSubOperatoreClicked = true;
			
			oldValue = displayLabel.getText();
			oldValueF = Float.parseFloat(oldValue);
			
			displayLabel.setText("-");
			
			
		}else if(e.getSource() == addbutton){
			isOperatorClicked = true;
			isAddOperatoreClicked = true;
			
			oldValue = displayLabel.getText();
			oldValueF = Float.parseFloat(oldValue);

			displayLabel.setText("+");
			
			
		}else if(e.getSource() == dotbutton){
			displayLabel.setText(displayLabel.getText()+".");
			
		}else if(e.getSource() == equalbutton){
			newValue = displayLabel.getText();
			newValueF = Float.parseFloat(newValue);
			
			if(isAddOperatoreClicked) {
				result = oldValueF + newValueF;
			    isAddOperatoreClicked = false;
			}
			else if(isSubOperatoreClicked) {
				result = oldValueF - newValueF;
				isSubOperatoreClicked = false;
			}
			else if(isMutiOperatoreClicked) {
				result = oldValueF * newValueF;
				isMutiOperatoreClicked = false;
			}
			else if(isDivOperatoreClicked) {
				result = oldValueF / newValueF;
				isDivOperatoreClicked = false;
			}	
			displayLabel.setText(result + " ");
		}
          else{
			displayLabel.setText("");
		}
	}
}