package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.Format;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


import model.bussinessLogicPaint;

/**  
* Casey Kluesner  - cjkluesner1@dmacc.edu  
* CIS171 <20432>
* Apr 16, 2024  
*/
public class PaintPanel extends JPanel {
 bussinessLogicPaint paint;
 private JLabel title = new JLabel("````````Paint Calculator````````");
 

 
 private JLabel type = new JLabel("Please Input Wall's , Ceiling's , Or Trim");
 private JTextField typeText = new JTextField(10);
 
 private JLabel sqFeet = new JLabel("Please Input Your Room's Square Feet");
 private JTextField sqText = new JTextField(10);
 
 private JLabel total = new JLabel("``````````````````Total```````````````````");
 private JTextField totalTxt = new JTextField(5);
 
 private JButton calc = new JButton("Calculate");
 
 
 private JButton clear = new JButton("Clear");
 DecimalFormat df = new DecimalFormat(".00");
 
 
 
 
 
 
 
  public PaintPanel()  {
	  super();
	  add(title);
	 
	  add(type);
	  add(typeText);
	  
	  add(sqFeet);
	  add(sqText);
	  
	  add(total);
	  add(totalTxt);
	  
	  CalculateButtonListner ab = new CalculateButtonListner();
	  calc.addActionListener(ab);
	  
	  add(calc);
	  	
	  ClearButtonListner clearButton = new ClearButtonListner();
	  clear.addActionListener(clearButton);
	  add(clear);
	  
  }
  
 
  
	class ClearButtonListner implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			reset();
		}
	}
	
	 class CalculateButtonListner implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try{
				String type = typeText.getText();
				double sqfeet = Double.parseDouble(sqText.getText()); 
				bussinessLogicPaint paint = new bussinessLogicPaint(type,sqfeet);
				if(typeText.getText().equalsIgnoreCase("trim")) {
					totalTxt.setText("$"+df.format(paint.getTrimTotal()));
					
				}
				else if(typeText.getText().equalsIgnoreCase(paint.getWall())) {
					totalTxt.setText("$"+df.format(paint.getWallTotal()));
					
				}
				else if(typeText.getText().equalsIgnoreCase(paint.getCeiling())) {
					totalTxt.setText("S"+df.format(paint.getCeilingTotal()));
					
				}

				
				
				}
				catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(calc, "Im sorry we didn't catch that please call 515 - 867-5309 and Tommy Tutone will book your apt.",
							"error!!!!!!",JOptionPane.ERROR_MESSAGE);
					reset();
				}
			}
	 }
  
		
  public void reset() {
		typeText.setText("");
		sqText.setText("");
		totalTxt.setText("");
		}
}
