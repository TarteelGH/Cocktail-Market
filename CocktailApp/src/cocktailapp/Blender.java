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
    private Cup cup;
    private double calories;
    private Color color;
    private double volume;
    private double caloriesPerMixture;

    public Blender(int capacity) {
        this.capacity = capacity;
        this.ingredients = new ArrayList();
    }

    public ArrayList<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getCaloriesPerMixture() {
        return caloriesPerMixture;
    }

    public void setCaloriesPerMixture(double caloriesPerMixture) {
        this.caloriesPerMixture = caloriesPerMixture;
    }

    public Blender(double calories) {
        this.calories = calories;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Cup getCup() {
        return cup;
    }

    public void setCup(Cup cup) {
        this.cup = cup;
    }

    public Blender(double calories, Color color, int volume) {
        this.calories = calories;
        this.color = color;
        this.volume = volume;
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

    public void add(Ingredients ingredient) throws BlenderOverFlowException {
        if (this.volume + ingredient.getVolume() > this.capacity) {
            throw new BlenderOverFlowException();
        } else {
            this.ingredients.add(ingredient);
        }
        this.volume += ingredient.getVolume();

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

            this.calories += ingredient.getCalories();
            this.color = new Color(totalRed / this.ingredients.size(), totalGreen / this.ingredients.size(), totalBlue / this.ingredients.size());
            this.caloriesPerMixture = (double) (this.calories) / (double) (this.volume);
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
}

//