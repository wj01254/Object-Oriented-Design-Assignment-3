/**
 * Author: Wendell Jenkins
 * Date: 2-5-19
 * !All code was developed and approved by the author!
 */
public class ButterGlaze extends Toppings
{
	/* Constructor for objects of class Butter*/
	public ButterGlaze(Bagel newBagel){
		super(newBagel);
		System.out.println("Adding Butter");
	}
	public String getDescription(){
		return tempBagel.getDescription() + ", Butter Glaze"; 
	}
	public double getCost(){
		return tempBagel.getCost() + .25; 
	}
}
