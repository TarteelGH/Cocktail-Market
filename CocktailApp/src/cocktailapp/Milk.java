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

    private int volume;
    private Color color;

    public Milk() {
    }

    public Milk(String name , int calories,int volume) {
        super(name, calories);
        this.volume = volume;
        this.color = color;
    }

   

    @Override
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
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