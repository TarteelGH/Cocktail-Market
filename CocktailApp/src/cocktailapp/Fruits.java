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

    private int volume;
    private Color color;

    public Fruits() {
    }

    public Fruits(String name , int calories,int volume, Color color) {
        super(name, calories);
        this.volume = volume;
        this.color = color;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
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
