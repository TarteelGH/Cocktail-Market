/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptions;

/**
 *
 * @author tarteel
 */
public class BlenderOverFlowException extends Exception {
   public BlenderOverFlowException(){
       super("Total volume exceeds blender capacity!");
   }
}