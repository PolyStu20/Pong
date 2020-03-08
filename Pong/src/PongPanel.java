import java.awt.Color;
import javax.swing.JPanel;
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
	
    public PongPanel() { // this is a constructor
        setBackground(BACKGROUND_COLOUR);
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
		// TODO Auto-generated method stub
		
	} 
	
	
}
