/**
 * Author: Wendell Jenkins
 * Date: 2-5-19
 * !All code was developed and approved by the author!
 */
public class CremeCheese extends Toppings
{
	/* Constructor for objects of class CremeCheese*/
	public CremeCheese(Bagel newBagel){
		super(newBagel);
		System.out.println("Adding Creme Cheese");
	}
	public String getDescription(){
		return tempBagel.getDescription() + ", Creme Cheese"; 
	}
	public double getCost(){
		return tempBagel.getCost() + .50; 
	}
}
