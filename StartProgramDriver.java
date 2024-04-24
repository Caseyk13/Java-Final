package driver;

import javax.swing.JFrame;
import javax.swing.JPanel;
import view.PaintPanel;

import model.bussinessLogicPaint;

/**  
* Casey Kluesner  - cjkluesner1@dmacc.edu  
* CIS171 <20432>
* Apr 16, 2024  
*/
public class StartProgramDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bussinessLogicPaint casey = new bussinessLogicPaint();
		JFrame frame = new JFrame();
		PaintPanel panel = new PaintPanel();
		frame.add(panel);
		
		frame.setSize(250,250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
