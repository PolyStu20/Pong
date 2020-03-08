import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Graphics; // this and the next one lets us paint graphics on the screen
import java.awt.Graphics2D;
import java.awt.Stroke; // this and next one for a dotted line
import java.awt.BasicStroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class PongPanel extends JPanel  implements ActionListener, KeyListener {
	//entering " extends JPanel " means it inherits from 'JPanel'.
	// and entering the code to implement ActionListener and KeyListener
		/*
		 * At first this made an error so we highlight your cursor over PongPanel 
		 * and select Add unimplemented methods from the quick fixes displayed.
		 * 
		 * With instructions to "Add a constructor and.
		 *  Inside the constructor, add setBackground(Color.BLACK)." 
		 *  We added the import for Color at the top
		 *  and the 'constructor' is the public PongPanel(){}
		 */

	private final static Color BACKGROUND_COLOUR = Color.BLACK;
	//makes the colour of the background be a static final variable and so it replaces the "Color.BLACK" in the constructor
	private final static int TIMER_DELAY = 5; // sets the timer
	
    public PongPanel() { // this is a constructor
        setBackground(BACKGROUND_COLOUR);
        Timer timer = new Timer(TIMER_DELAY, this); // adding a timer (also needed "import javax.swing.Timer")
        timer.start();
    }
    
        
	@Override
	public void keyTyped(KeyEvent event) { // change the e or arg0 to 'event'
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
	     update();
	     repaint();
		// The repaint() method gives us a convenient way to update the graphics.
	} 
	private void update() { // this method updates the timer and the program
        
	 }
	/*
	 * This method below will draw a white rectangle onto the screen
	 *  g.setColor(Color.WHITE);
     *  g.fillRect(20, 20, 100, 100);
     *  which is removed afterwards
	 */
	@Override
	 public void paintComponent(Graphics g) { 
	     super.paintComponent(g);
	      paintDottedLine(g);
	 }
	private void paintDottedLine(Graphics g) { // method to paint a dotted line. Only used once and added to the painComponent above
	      Graphics2D g2d = (Graphics2D) g.create();
	         Stroke dashed = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
	         g2d.setStroke(dashed);
	         g2d.setPaint(Color.WHITE);
	         g2d.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
	         g2d.dispose();
	 }
	
}
