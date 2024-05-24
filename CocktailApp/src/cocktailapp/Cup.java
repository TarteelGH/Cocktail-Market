/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailapp;

/**
 *
 * @author tarteel
 */
public class Cup {

    private final int smallCup=100;
    private final int mediumCup=150;
    private final int largeCup=200;
    private int capacity;
    private int calories;

    public Cup() {
    }

   
    public int getSmallCup() {
        return smallCup;
    }

    public int getMediumCup() {
        return mediumCup;
    }

    public int getLargeCup() {
        return largeCup;
    }

    public Cup(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}