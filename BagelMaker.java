/**
 * Author: Wendell Jenkins
 * Date: 2-5-19
 * !All code was developed and approved by the author!
 */
public class BagelMaker
{  
    public static void main(String[] args){
        Bagel TheBuzzinBagel = new CremeCheese(new ButterGlaze(new Original()));
        System.out.println("Ingredients: " + TheBuzzinBagel.getDescription());
        System.out.println("Creating The Buzzin-Bagel");
        System.out.println("Cost: " + TheBuzzinBagel.getCost() + "\n");
        
        Bagel NaturalSupreme = new StrawberryFilling(new CremeCheese(new Wheat()));
        System.out.println("Ingredients: " + NaturalSupreme.getDescription());
        System.out.println("Creating a Natural Supreme Bagel");
        System.out.println("Cost: " + NaturalSupreme.getCost() + "\n");
        
        Bagel FruitBlend = new StrawberryFilling(new Raisin());
        System.out.println("Ingredients: " + FruitBlend.getDescription());
        System.out.println("Creating a Fruit-Blend Bagel");
        System.out.println("Cost: " + FruitBlend.getCost() + "\n");
    }
}