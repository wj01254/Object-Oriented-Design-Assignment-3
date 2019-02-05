/**
 * Author: Wendell Jenkins
 * Date: 2-5-19
 * !All code was developed and approved by the author!
 */
public class Original implements Bagel
{
	//This is a Concrete class that will extend pizza and act as a default
	@Override
	public String getDescription(){
		return "Plain Bagel"; }
	@Override
	public double getCost(){
		return 2.00;
	}
}
