/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktail.market;

/**
 *
 * @author tarteel
 */
public class Fruits extends Ingredients {

    private double volume;
    private Color color;

    public Fruits() {
    }

    public Fruits(double volume, Color color) {
        this.volume = volume;
        this.color = color;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Color getColor {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Volume: " + this.getVolume() + " Color: " + this.getColor();
    }
}