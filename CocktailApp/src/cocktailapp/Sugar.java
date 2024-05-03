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

    private int volume;

    private Color color;
    
    public Sugar(){
        super("Sugar", 200);
        this.volume = 0;
        this.color = new Color(255,255,255);
    }

    @Override
    public String getInfo() {
        return super.toString()+"  "+"volume"+this.volume+"  "+this.color.toString(); 
    }
    
    public Color getColor(){
        return new Color(255,255,255);
    }

    @Override
    public double getVolume() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
