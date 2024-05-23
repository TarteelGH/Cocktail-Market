/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailapp;

/**
 *
 * @author tarteel
 */
public class Color {

    static Object WHITE;
    
    public int red;
    public int green;
    public int blue;  
    

    public Color() {
    }
//RGB
    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
       
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

   
    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }
    
    public int getBlue() {
            return blue;
        }

        public void setBlue(int blue) {
            this.blue = blue;
        }
   
//    public static Color blend(Color color1, Color color2);
//    public String getInfo();

    @Override
    public String toString() {
        return "Color{" + "red=" + red + ", blue=" + blue + ", green=" + green + '}';
    }
  
    
    
}