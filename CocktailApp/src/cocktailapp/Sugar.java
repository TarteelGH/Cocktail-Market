/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailapp;

/**
 *
 * @author tarteel
 */
public class Sugar extends Ingredients {

    private Color color;
    int volume;
    @Override
     public Color getColor() {
        return color;
    }
     
    

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
 public Sugar(Color color, String name, int calories) {
        super(name, calories);
        this.color = color;
    }
    @Override
 public String getInfo() {
        return super.toString() + "  " + "Color: "+this.color.toString();
    }
 
}