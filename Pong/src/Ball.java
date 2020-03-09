import java.awt.Color;
   
   public class Ball extends Sprite { //Create class 'Ball' that inherits from the Sprite class
       private static final int BALL_WIDTH = 25; //final static variables for the width of the ball
       private static final int BALL_HEIGHT = 25; //final static variables for height of the ball
       private static final Color BALL_COLOUR = Color.WHITE;//final static variables for the colour of the ball
   //Makes the width and height 25, colour white
       boolean gameInitialised = false;
       Ball ball;
       public Ball(int panelWidth, int panelHeight) {
          setWidth(BALL_WIDTH);//constructor that sets the width of the ball.
          setHeight(BALL_HEIGHT);// constructor that sets the and height of the ball
          setColour(BALL_COLOUR);//constructor that sets the colour
          setInitialPosition(panelWidth / 2 - (getWidth() / 2), panelHeight / 2 - (getHeight() / 2)); //Set the initial starting position
          resetToInitialPosition(); //set the position of the ball to the initial position we provided
      }
       
 }