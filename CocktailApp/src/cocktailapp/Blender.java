/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailapp;

import Exceptions.BlenderOverFlowException;
import Exceptions.BlenderEmptyException;
import java.util.ArrayList;

/**
 *
 * @author tarteel
 */
public class Blender {

    private ArrayList<Ingredients> ingredients;
    private int capacity;
    private Color color;
    private int volume;
    private double caloriesPerMixture;

    public Blender(int capacity) {
        this.capacity = capacity;
        this.ingredients = new ArrayList();
    }
public Blender(ArrayList<Ingredients> ingredients, int capacity, Color color, int volume, double caloriesPerMixture) {
        this.ingredients = ingredients;
        this.capacity = capacity;
        this.color = color;
        this.volume = volume;
        this.caloriesPerMixture = caloriesPerMixture;
    }
    public ArrayList<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }


    public double getCaloriesPerMixture() {
        return caloriesPerMixture;
    }

    public void setCaloriesPerMixture(double caloriesPerMixture) {
        this.caloriesPerMixture = caloriesPerMixture;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int Volume) {
        this.volume = Volume;
    }

    public void addIngredient(Ingredients ingredient) throws BlenderOverFlowException {
        
        if (getVolume() + ingredient.getVolume() <= getCapacity()) {
            ingredients.add(ingredient);
             
        } else {
            throw new BlenderOverFlowException();
        }
    }

    public void blend() throws BlenderOverFlowException {
        if (ingredients.isEmpty()) {
            throw new BlenderOverFlowException();
        }

        int totalRed = 0;
        int totalGreen = 0;
        int totalBlue = 0;

        for (Ingredients ingredient : this.ingredients) {
            totalRed += ingredient.getColor().getRed();
            totalGreen += ingredient.getColor().getGreen();
            totalBlue += ingredient.getColor().getBlue();
            this.color = new Color(totalRed / this.ingredients.size(), totalGreen / this.ingredients.size(), totalBlue / this.ingredients.size());
            this.caloriesPerMixture +=caloriesPerMixture;
            ingredients.clear();

        }
    }

    public void pour(Cup cup) throws BlenderEmptyException {
        if (this.volume > 0) {
            if (this.volume < cup.getCapacity()) {
                cup.setCalories((int) (this.volume * this.caloriesPerMixture));
                this.volume = 0;
            } else {
                this.volume -= cup.getCapacity();
                cup.setCalories((int) (cup.getCapacity() * this.caloriesPerMixture));
            }
        } else 
            throw new BlenderEmptyException();
        
    }
//    public void clear(Cocktail cocktail, Blender blender) {
//
//        blender.setColor(new Color(0, 0, 0));
//        blender.setCaloriesPerMixture(0);
//        blender.setVolume(0);
//
//    }
}

//