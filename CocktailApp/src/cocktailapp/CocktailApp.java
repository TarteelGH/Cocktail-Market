/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cocktailapp;

import Exceptions.BlenderOverFlowException;
import Exceptions.BlenderEmptyException;

/**
 *
 * @author tarteel
 */
public class CocktailApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Fruits Strawberry = new Fruits("Strawberry", 100, 200, new Color(23,54,4));
        Fruits Strawberry1 = new Fruits("Strawberry", 100, 200, new Color(23,54,4));
        Fruits apple = new Fruits("Apple", 60, 100, new Color(44,33,44));
        Fruits orange = new Fruits("Orange", 90, 80, new Color(76,5,3));
        Fruits banana1 = new Fruits("Banana", 90, 80, new Color(76,5,3));
        Fruits banana2 = new Fruits("Banana", 90, 80, new Color(76,5,3));
        Milk milk = new Milk("milk", 50, 200, new Color(24,5,6));
        Sugar suger = new Sugar();
        
        Blender blender = new Blender(1000);    
        
        try{
           blender.add(Strawberry);
           blender.add(Strawberry1);
           blender.add(apple);
           
           blender.add(orange);
           blender.add(banana1);
           blender.add(banana2);

        }catch(BlenderOverFlowException ex){
            System.out.println(ex.getMessage());
        }
        
        Cup cup = new Cup(200);
        Cup cup1 = new Cup(200);
        Cup cup2 = new Cup(200);
        Cup cup3 = new Cup(200);
        
        try{
            blender.pour(cup);
            blender.pour(cup1);
            blender.pour(cup2);
            blender.pour(cup3);
            System.out.println("Cocktail Volume " + blender.getVolume());
        }
        catch(BlenderEmptyException ex){
            System.out.println(ex.getMessage());
        }       
        
        System.out.println("Calories in cup " + cup.getCalories());
        
   
    }
    
}
