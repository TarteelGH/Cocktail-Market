/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailapp;
/**
 *
 * @author tarteel
 */
public abstract class Ingredients {
    private String name;
    private int calories;

    public Ingredients(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public Ingredients() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getInfo(){
       return "Ingredients{" + "name=" + name + ", calories=" + calories + '}';
    };
    
    public abstract int getVolume();
    public abstract Color getColor(); 
    
 
}