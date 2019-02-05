/**
 * Author: Wendell Jenkins
 * Date: 2-5-19
 * !All code was developed and approved by the author!
 */
abstract class Toppings implements Bagel
{
	protected Bagel tempBagel;
	public Toppings(Bagel newBagel){
		tempBagel = newBagel;
	}
	public String getDescription(){
		return tempBagel.getDescription(); 
	}
	public double getCost(){
		return tempBagel.getCost(); 
	}
}


