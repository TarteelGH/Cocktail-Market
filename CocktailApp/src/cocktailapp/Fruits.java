/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailapp;

/**
 *
 * @author tarteel
 */
public class Fruits extends Ingredients {

    private double volume;
    private Color color;

    public Fruits() {
    }

    public Fruits(String name ,double volume, int calories, Color color) {
        super(name, calories);
        this.volume = volume;
        this.color = color;
    }

    public double getVolume() {
        return this.volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Color getColor() {
        return this.color;
    }

    /*public void setColor(Color color) {
        this.color = color;
    }*/

    @Override
    public String getInfo() {
        return super.getInfo() + " Volume: " + this.getVolume() + " Color: " + this.getColor();
    }
}
