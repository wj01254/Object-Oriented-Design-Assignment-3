/**
 * Author: Wendell Jenkins
 * Date: 2-5-19
 * !All code was developed and approved by the author!
 */
public class StrawberryFilling extends Toppings
{
	/* Constructor for objects of class StrawberryFilling*/
	public StrawberryFilling(Bagel newBagel){
		super(newBagel);
		System.out.println("Adding Strawberry Filling");
	}
	public String getDescription(){
		return tempBagel.getDescription() + ", Strawberry Filling"; 
	}
	public double getCost(){
		return tempBagel.getCost() + 1.00; 
	}
}
