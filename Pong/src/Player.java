/*
 * Made by creating a new ENUM from te File menu.
 * Since we have two players, it would be useful to be able to distinguish between 
 * them in some way. Using a variable for each one helps but it would be more convenient 
 * if we had a method to refer to a particular player. For example, if the ball touches the 
 * left side of the screen we want to give a point to Player 2. Having a increasePlayer2Score() method 
 * would work but it would be similar code for the Player 1. Instead, we want to 
 * have a single increaseScore() method and be able to pass a parameter of which player scored. 
 */
public enum Player {
      One,
      Two
 }