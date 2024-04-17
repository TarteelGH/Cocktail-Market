/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktail.market;

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
    public String toString() {
        return super.toString()+"  "+"volume"+this.volume+"  "+this.color.toString(); 
    }
    
    public int getInfo(){
        return 0;
    }
 
    public Color getColor(){
        return new Color(255,255,255);
    }

}
