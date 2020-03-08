import javax.swing.JFrame;
// as this needs a graphical interface, we import the JFram and add " extends JFrame" to the class.
public class Pong extends JFrame {
	// creates final static variables for the window:
	private final static String WINDOW_TITLE = "Pong"; //creates permanent variables so they can be referred to and changed in only one place
	private final static int WINDOW_WIDTH = 800;
	private final static int WINDOW_HEIGHT = 600;
	// sets up the display window
	public Pong() { // this is the constructor called Pong
		add(new PongPanel()); // this adds the panel (PongPal.java) to the frame
    	setTitle(WINDOW_TITLE); //this displays on the title of the screen
    	setSize(WINDOW_WIDTH, WINDOW_HEIGHT); //sets the size of the screen
    	setResizable(false); // set this to true if you want the screen to be able to be resized
    	setVisible(true); // set to true to be visible
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
}			// Other options are available, such as DO_NOTHING_ON_CLOSE and HIDE_ON_CLOSE if there are multiple screens
	public static void main(String[] args) {

		new Pong(); // creates the new class Pong

	}

}
