import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener,KeyListener {
	
	boolean isOperatorclicked=false;
	int add=0,sub=0,mult=0,div=0;
	
	
	String oldValue,newValue;
	
	JFrame js;
	JLabel displaylabel;
	JButton sevenButton,EightButton,nineButton,fourButton,fiveButton,sixButton;
	JButton twoButton,threeButton,zeroButton,dotButton,clearButton,oneButton;
	JButton additionButton,multiplyButton,divButton,subButton,equalButton,backspaceButton;

public static void main(String[] args) {
	new Calculator();
	
}

	
	public Calculator() {
		js=new JFrame("Calculator");
		js.setLayout(null);
		js.setSize(300,400);
		js.setVisible(true);
		js.setLocation(50,100);
		js.getContentPane().setBackground(Color.lightGray);
		js.addKeyListener(this);
		
		displaylabel=new JLabel("");
		displaylabel.setBounds(10,20,260,35);
		displaylabel.setBackground(Color.gray);
		displaylabel.setOpaque(true);
		displaylabel.setForeground(Color.white);
		displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displaylabel.addKeyListener(this);
		js.add(displaylabel);
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(10, 65, 55, 55);
		sevenButton.addActionListener(this);
		sevenButton.setFont(new Font("Arial", Font.BOLD, 25));
		sevenButton.setFocusable(false);
		js.add(sevenButton);
		
		EightButton=new JButton("8");
		EightButton.setBounds(75, 65, 55,55);
		EightButton.addActionListener(this);
		EightButton.setFont(new Font("Arial", Font.BOLD, 25));
		EightButton.setFocusable(false);
		js.add(EightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(140, 65, 55, 55);
		nineButton.addActionListener(this);
		nineButton.setFont(new Font("Arial", Font.BOLD, 25));
		nineButton.setFocusable(false);
		js.add(nineButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(10, 130, 55, 55);
		fourButton.addActionListener(this);
		fourButton.setFont(new Font("Arial", Font.BOLD, 25));
		fourButton.setFocusable(false);
		js.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(75, 130, 55,55);
		fiveButton.addActionListener(this);
		fiveButton.setFont(new Font("Arial", Font.BOLD, 25));
		fiveButton.setFocusable(false);
		js.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(140, 130, 55, 55);
		sixButton.addActionListener(this);
		sixButton.setFont(new Font("Arial", Font.BOLD, 25));
		sixButton.setFocusable(false);
		js.add(sixButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(10, 195, 55, 55);
		oneButton.addActionListener(this);
		oneButton.setFont(new Font("Arial", Font.BOLD, 25));
		oneButton.setFocusable(false);
		js.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(75, 195, 55,55);
		twoButton.addActionListener(this);
		twoButton.setFont(new Font("Arial", Font.BOLD, 25));
		twoButton.setFocusable(false);
		js.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(140, 195, 55, 55);
		threeButton.addActionListener(this);
		threeButton.setFont(new Font("Arial", Font.BOLD, 25));
		threeButton.setFocusable(false);
		js.add(threeButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(10, 260, 55, 55);
		zeroButton.addActionListener(this);
		zeroButton.setFont(new Font("Arial", Font.BOLD, 25));
		zeroButton.setFocusable(false);
		js.add(zeroButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(75, 260, 55,55);
		dotButton.addActionListener(this);
		dotButton.setFont(new Font("Arial", Font.BOLD, 25));
		dotButton.setFocusable(false);
		js.add(dotButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(140, 260, 55, 55);
		equalButton.addActionListener(this);
		equalButton.setFont(new Font("Arial", Font.BOLD, 25));
		equalButton.setFocusable(false);
		js.add(equalButton);
		
		divButton=new JButton("/");
		divButton.setBounds(205, 65, 65, 55);
		divButton.addActionListener(this);
		divButton.setFont(new Font("Arial", Font.BOLD, 25));
		divButton.setFocusable(false);
		js.add(divButton);
		
		multiplyButton=new JButton("*");
		multiplyButton.setBounds(205, 130, 65, 55);
		multiplyButton.addActionListener(this);
		multiplyButton.setFont(new Font("Arial", Font.BOLD, 25));
		multiplyButton.setFocusable(false);
		js.add(multiplyButton);
		
		subButton=new JButton("-");
		subButton.setBounds(205, 195, 65, 55);
		subButton.addActionListener(this);
		subButton.setFont(new Font("Arial", Font.BOLD, 25));
		subButton.setFocusable(false);
		js.add(subButton);
		
		additionButton=new JButton("+");
		additionButton.setBounds(205, 260, 65, 55);
		additionButton.addActionListener(this);
		additionButton.setFont(new Font("Arial", Font.BOLD, 25));
		additionButton.setFocusable(false);
		js.add(additionButton);
		
		clearButton=new JButton("c");
		clearButton.setBounds(205, 325, 65, 35);
		clearButton.addActionListener(this);
		clearButton.setFont(new Font("Arial", Font.BOLD, 25));
		clearButton.setFocusable(false);
		js.add(clearButton);
		
		backspaceButton=new JButton("Back");
		backspaceButton.setBounds(10,325,65,35);
		backspaceButton.addActionListener(this);
		backspaceButton.setFocusable(false);
		backspaceButton.setFont(new Font("Arial", Font.BOLD, 10));
		
		js.add(backspaceButton);
		
		js.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenButton) {
			
			if(isOperatorclicked) {
				displaylabel.setText("7");
				isOperatorclicked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"7");
			}
			
			
	
		}else if (e.getSource()==EightButton) {
			if(isOperatorclicked) {
				displaylabel.setText("8");
				isOperatorclicked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"8");
			}
			
			
		}else if (e.getSource()==nineButton) {
			if(isOperatorclicked) {
				displaylabel.setText("9");
				isOperatorclicked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"9");
			}
			
			
		}else if (e.getSource()==fourButton) {
			if(isOperatorclicked) {
				displaylabel.setText("4");
				isOperatorclicked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"4");
			}
		
			
		}else if (e.getSource()==fiveButton) {
			if(isOperatorclicked) {
				displaylabel.setText("5");
				isOperatorclicked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"5");
			}
			
			
		}else if (e.getSource()==sixButton) {
			if(isOperatorclicked) {
				displaylabel.setText("6");
				isOperatorclicked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"6");
			}
			
			
		}else if (e.getSource()==oneButton) {
			if(isOperatorclicked) {
				displaylabel.setText("1");
				isOperatorclicked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"1");
			}
			
			
		}else if (e.getSource()==twoButton) {
			if(isOperatorclicked) {
				displaylabel.setText("2");
				isOperatorclicked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"2");
			}
		
			
		}else if (e.getSource()==threeButton) {
			if(isOperatorclicked) {
				displaylabel.setText("3");
				isOperatorclicked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"3");
			}
			
			
		}else if (e.getSource()==zeroButton) {
			if(isOperatorclicked) {
				displaylabel.setText("0");
				isOperatorclicked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"0");
			}
			
			
		}else if (e.getSource()==dotButton) {
			
			
			
			//if(isOperatorclicked) {
				//displaylabel.setText(".");
				//isOperatorclicked=false;
			//}else{
				//displaylabel.setText(displaylabel.getText()+".");
			//}
			
			
			int count=0;
			
			char string[]=displaylabel.getText().toCharArray();
			
			for(int i=0;i<displaylabel.getText().length();i++) {
				
				if(string[i]=='.') {
				
				count=1;
				
				
			}
					
			}if (count==1) {
				displaylabel.setText(displaylabel.getText());
			
			}else  {
				displaylabel.setText(displaylabel.getText()+".");
			}
		
		
		
		
		
		
		
		}else if (e.getSource()==clearButton) {
			displaylabel.setText("");
			
		}else if (e.getSource()==backspaceButton) {
			if (displaylabel.getText()=="") {
				displaylabel.setText("");
			
			}else {
				displaylabel.setText (displaylabel.getText ().substring (0, displaylabel.getText ().length () - 1));
			}
				
						
		}else if (e.getSource()==equalButton) {
			
			if(add==1) {
			
			newValue=displaylabel.getText();
			
			float oldValuef=Float.parseFloat(oldValue);
			float newValuef=Float.parseFloat(newValue);
			
			float Result=oldValuef+newValuef;
			
			displaylabel.setText(Result+"");
			add=0;
			isOperatorclicked=true;
			
			}else if(sub==1) {
				newValue=displaylabel.getText();
				
				float oldValuef=Float.parseFloat(oldValue);
				float newValuef=Float.parseFloat(newValue);
				
				float Result=oldValuef-newValuef;
				
				displaylabel.setText(Result+"");
				sub=0;
				
			}else if (mult==1) {
				newValue=displaylabel.getText();
				
				float oldValuef=Float.parseFloat(oldValue);
				float newValuef=Float.parseFloat(newValue);
				
				float Result=oldValuef*newValuef;
				
				displaylabel.setText(Result+"");
				mult=0;
				
			}else if (div==1) {
				newValue=displaylabel.getText();
				
				float oldValuef=Float.parseFloat(oldValue);
				float newValuef=Float.parseFloat(newValue);
				
				float Result=oldValuef/newValuef;
				
				displaylabel.setText(Result+"");
				div=0;
			}
			
		
		}else if (e.getSource()==additionButton) {
			isOperatorclicked=true;
			add=1;
			oldValue=displaylabel.getText();
			
		
		}else if (e.getSource()==subButton) {
			isOperatorclicked=true;
			sub=1;
			oldValue=displaylabel.getText();
		}else if (e.getSource()==multiplyButton) {
			isOperatorclicked=true;
			mult=1;
			oldValue=displaylabel.getText();
		
		}else if (e.getSource()==divButton) {
			isOperatorclicked=true;
			div=1;
			oldValue=displaylabel.getText();
			
		}
		
		
	
		
		}


	@Override
	public void keyTyped(KeyEvent e) {
	if(e.getKeyChar()=='7') {
		if(isOperatorclicked) {
			displaylabel.setText("7");
			isOperatorclicked=false;
		}else {
			displaylabel.setText(displaylabel.getText()+"7");
		}
		
	}else if (e.getKeyChar()=='8') {
		if(isOperatorclicked) {
			displaylabel.setText("8");
			isOperatorclicked=false;
		}else {
			displaylabel.setText(displaylabel.getText()+"8");
		}
		
		
	}else if (e.getKeyChar()=='9') {
		if(isOperatorclicked) {
			displaylabel.setText("9");
			isOperatorclicked=false;
		}else {
			displaylabel.setText(displaylabel.getText()+"9");
		}
		
		
	}else if (e.getKeyChar()=='4') {
		if(isOperatorclicked) {
			displaylabel.setText("4");
			isOperatorclicked=false;
		}else {
			displaylabel.setText(displaylabel.getText()+"4");
		}
	
		
	}else if (e.getKeyChar()=='5') {
		if(isOperatorclicked) {
			displaylabel.setText("5");
			isOperatorclicked=false;
		}else {
			displaylabel.setText(displaylabel.getText()+"5");
		}
		
		
	}else if (e.getKeyChar()=='6') {
		if(isOperatorclicked) {
			displaylabel.setText("6");
			isOperatorclicked=false;
		}else {
			displaylabel.setText(displaylabel.getText()+"6");
		}
		
		
	}else if (e.getKeyChar()=='1') {
		if(isOperatorclicked) {
			displaylabel.setText("1");
			isOperatorclicked=false;
		}else {
			displaylabel.setText(displaylabel.getText()+"1");
		}
		
		
	}else if (e.getKeyChar()=='2') {
		if(isOperatorclicked) {
			displaylabel.setText("2");
			isOperatorclicked=false;
		}else {
			displaylabel.setText(displaylabel.getText()+"2");
		}
	
		
	}else if (e.getKeyChar()=='3') {
		if(isOperatorclicked) {
			displaylabel.setText("3");
			isOperatorclicked=false;
		}else {
			displaylabel.setText(displaylabel.getText()+"3");
		}
		
		
	}else if (e.getKeyChar()=='0') {
		if(isOperatorclicked) {
			displaylabel.setText("0");
			isOperatorclicked=false;
		}else {
			displaylabel.setText(displaylabel.getText()+"0");
		}
		
		
	}else if (e.getKeyChar()=='.') {
		//if(isOperatorclicked) {
			//displaylabel.setText(".");
			//isOperatorclicked=false;
		//}else {
			//displaylabel.setText(displaylabel.getText()+".");
		//}
		
		int count=0;
		
		char string[]=displaylabel.getText().toCharArray();
		
		for(int i=0;i<displaylabel.getText().length();i++) {
			
			if(string[i]=='.') {
			
			count=1;
			
			
		}
				
		}if (count==1) {
			displaylabel.setText(displaylabel.getText());
		
		}else  {
			displaylabel.setText(displaylabel.getText()+".");
		}
		
		
		
	}else if (e.getKeyChar()=='=') {
		
		if(add==1) {
		
		newValue=displaylabel.getText();
		
		float oldValuef=Float.parseFloat(oldValue);
		float newValuef=Float.parseFloat(newValue);
		
		float Result=oldValuef+newValuef;
		
		displaylabel.setText(Result+"");
		add=0;
		isOperatorclicked=true;
		
		}else if(sub==1) {
			newValue=displaylabel.getText();
			
			float oldValuef=Float.parseFloat(oldValue);
			float newValuef=Float.parseFloat(newValue);
			
			float Result=oldValuef-newValuef;
			
			displaylabel.setText(Result+"");
			sub=0;
			
		}else if (mult==1) {
			newValue=displaylabel.getText();
			
			float oldValuef=Float.parseFloat(oldValue);
			float newValuef=Float.parseFloat(newValue);
			
			float Result=oldValuef*newValuef;
			
			displaylabel.setText(Result+"");
			mult=0;
			
		}else if (div==1) {
			newValue=displaylabel.getText();
			
			float oldValuef=Float.parseFloat(oldValue);
			float newValuef=Float.parseFloat(newValue);
			
			float Result=oldValuef/newValuef;
			
			displaylabel.setText(Result+"");
			div=0;
		}
		
	
	}else if (e.getKeyChar()=='+') {
		isOperatorclicked=true;
		add=1;
		oldValue=displaylabel.getText();
		
	
	}else if (e.getKeyChar()=='-') {
		isOperatorclicked=true;
		sub=1;
		oldValue=displaylabel.getText();
	}else if (e.getKeyChar()=='*') {
		isOperatorclicked=true;
		mult=1;
		oldValue=displaylabel.getText();
	
	}else if (e.getKeyChar()=='/') {
		isOperatorclicked=true;
		div=1;
		oldValue=displaylabel.getText();
		
	}else if (e.getKeyChar()==KeyEvent.VK_BACK_SPACE) {
		if (displaylabel.getText()=="") {
			displaylabel.setText("");
		
		}else {
			displaylabel.setText (displaylabel.getText ().substring (0, displaylabel.getText ().length () - 1));
		}
		
	
	}else if (e.getKeyChar()==KeyEvent.VK_ENTER) {
		
		if(add==1) {
		
		newValue=displaylabel.getText();
		
		float oldValuef=Float.parseFloat(oldValue);
		float newValuef=Float.parseFloat(newValue);
		
		float Result=oldValuef+newValuef;
		
		displaylabel.setText(Result+"");
		add=0;
		isOperatorclicked=true;
		
		}else if(sub==1) {
			newValue=displaylabel.getText();
			
			float oldValuef=Float.parseFloat(oldValue);
			float newValuef=Float.parseFloat(newValue);
			
			float Result=oldValuef-newValuef;
			
			displaylabel.setText(Result+"");
			sub=0;
			
		}else if (mult==1) {
			newValue=displaylabel.getText();
			
			float oldValuef=Float.parseFloat(oldValue);
			float newValuef=Float.parseFloat(newValue);
			
			float Result=oldValuef*newValuef;
			
			displaylabel.setText(Result+"");
			mult=0;
			
		}else if (div==1) {
			newValue=displaylabel.getText();
			
			float oldValuef=Float.parseFloat(oldValue);
			float newValuef=Float.parseFloat(newValue);
			
			float Result=oldValuef/newValuef;
			
			displaylabel.setText(Result+"");
			div=0;
		}
	}else if (e.getKeyChar()==KeyEvent.VK_ESCAPE) {
			displaylabel.setText("");
	}
	}
	
	

	@Override
	public void keyPressed(KeyEvent e) {

	
		}
		
	


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
		
 
}




