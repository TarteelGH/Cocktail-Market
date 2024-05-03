/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailapp;

import java.util.ArrayList;

/**
 *
 * @author tarteel
 */
public class Cocktail {
    
     private int calories;
    private ArrayList<Ingredients> ingredient;
    private Color color;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public String getInfo(){
        return "Calories:"+this.calories+"Ingredient: "+this.ingredient+"Color: "+this.color;
    }
    
}
