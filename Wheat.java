/**
 * Author: Wendell Jenkins
 * Date: 2-5-19
 * !All code was developed and approved by the author!
 */
public class Wheat implements Bagel
{
	//This is a Concrete class that will extend bagel and act as a default
	@Override
	public String getDescription(){
		return "Wheat Bagel";
	}
	@Override
	public double getCost(){
		return 3.00;
	}
}
