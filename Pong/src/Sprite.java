 import java.awt.Color;
 import java.awt.Rectangle;
 //This Sprite class provides a good example of abstraction and encapsulation.
/*
 * By keeping the coordinates and velocity variables private, 
 * we ensure that the variables are only modified within the class. 
 * The class provides the necessary methods for other classes to access or 
 * modify these variables – these methods are referred to as getter and setter methods.
 */
public class Sprite {
	private int xPosition, yPosition;
	private int xVelocity, yVelocity;
	private int width, height; // create variables INSIDE the class
	private int initialXPosition, initialYPosition;
    private Color colour;
// Creates public methods to get and set these variables:
    public int getXPosition() { return xPosition; }
    public int getYPosition() { return yPosition; }
    public int getXVelocity() { return xVelocity; }
    public int getYVelocity() { return yVelocity; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }
    public Color getColour() { return colour; }
    
    public void setXPosition(int newX) {
        xPosition = newX;
    }
    public void setYPosition(int newY) {
        yPosition = newY;
    }
    public void setXPosition(int newX, int panelWidth) { //adds the new int panelWidth to use in the calc below
        xPosition = newX;
        if(xPosition < 0) { // using if conditional statements to check panel is not outside the screen width
            xPosition = 0;
        } else if(xPosition + width > panelWidth) {
            xPosition = panelWidth - width;
        }
    }
    public void setYPosition(int newY, int panelHeight) {//adds the new int panelHeight to use in the calc below
        yPosition = newY;
        if(yPosition < 0) { // using if conditional statements to check panel is not outside the screen height
            yPosition = 0;
        } else if(yPosition + height > panelHeight) {
            yPosition = panelHeight - height;
        }
    }
    
    public void setXVelocity(int newXVelocity) {
        xVelocity = newXVelocity;
    }
    
    public void setYVelocity(int newYVelocity) {
        yVelocity = newYVelocity;
    }
    
    public void setWidth(int newWidth) {
        width = newWidth;
    }
    
    public void setHeight(int newHeight) {
        height = newHeight;
    }

    public void setColour(Color newColour) {
        colour = newColour;
    }
    
    public void setInitialPosition(int initialX, int initialY) {
        initialXPosition = initialX;
        initialYPosition = initialY;
    }

    public void resetToInitialPosition() {
        setXPosition(initialXPosition);
        setYPosition(initialYPosition);
    }

    public Rectangle getRectangle() {
        return new Rectangle(getXPosition(), getYPosition(), getWidth(), getHeight());
    }

}
