/* ******************************************************
*	Rectangle.java										*
*	Randall Marquez Cuevas								*
*	This class implements a rectangle with constructors *
****************************************************** */
import javax.swing.*;
public class Rectangle{
	//attributes or properties
	private double height;
	private double width;
	
	//constructor
	public Rectangle(){
		this.height = 10;
		this.width = 20;
	}
	//constructor overload
		public Rectangle(double height, double width){
		this.height = height;
		this.width = width;
	}
	
	public double getArea(){
		return this.width * this.height;
	}
	
	public static void main(String[]args){
		Rectangle rectangle = new Rectangle();
		JOptionPane.showMessageDialog(null, "The area is " + rectangle.getArea());
		
		Rectangle rectangle2 = new Rectangle(5, 10);
		JOptionPane.showMessageDialog(null, "The rectangle 2's area is " + rectangle2.getArea());
	}
}