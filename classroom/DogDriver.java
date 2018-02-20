  /*********************************************************
 * Author: Yamal Marquez Cuevas                             *
 * Project: DogDriver.java                                  *
 * Description: this program dog objects and uses Dog Class *
  *********************************************************/
  import javax.swing.*;
  
  public class DogDriver {
	  public static void main (String [] args) {
		  Dog fido; //This is a new object, a new dog 
		  fido = new Dog();
		  String userDogColor = JoptionPane.showInputDialog("Enter the dog color");
		  fido.setColor(userDogColor);
		  fido.setEyeColor("Blue");
		  
		  //Show the values 
		  JOptionPane.showMessageDialog(null, "The Dog color: " + fido.getColor);
		  JOptionPane.showMessageDialog(null, "The Dog eyes color: " + fido.getEyeColor);
		  
		  fido.eat;
		  fido.sleep;
		  fido.bark;
		  
		  //the Other dog
		  Dog fufi = new Dog();
		  fufi.setColor("Black and white");
		  
		  JOptionPane.showMessageDialog(null, "Fufi´s color is: " + fufi.getColor);
		  fufi.sleep;
	  }// end main 
  }// end class DogDriver