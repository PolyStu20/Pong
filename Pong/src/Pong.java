import javax.swing.JFrame;
// as this needs a graphical interface, we import the JFram and add " extends JFrame" to the class.
public class Pong extends JFrame {
	// sets up the display window
	public Pong() {
    	setTitle("Pong"); //this displays on the title of the screen
    	setSize(800, 600); //sets the size of the screen
    	setResizable(false); // set this to true if you want the screen to be able to be resized
    	setVisible(true); // set to true to be visible
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
}			// Other options are available, such as DO_NOTHING_ON_CLOSE and HIDE_ON_CLOSE if there are multiple screens
	public static void main(String[] args) {

		new Pong(); // creates the new class Pong

	}

}
