/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailapp;

/**
 *
 * @author tarteel
 */
public class Milk extends Ingredients {

    private double volume;
    private Color color;

    public Milk() {
    }

    public Milk(String name ,double volume, int calories, Color color) {
        super(name, calories);
        this.volume = volume;
        
        this.color = color;
    }

    Milk(String cow_Milk, int i, int i0, Object WHITE) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Color getColor() {
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
