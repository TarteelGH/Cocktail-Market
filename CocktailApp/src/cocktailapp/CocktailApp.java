///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
// */
//package cocktailapp;
//
//import DBloggers.*;
//import Exceptions.BlenderOverFlowException;
//import Exceptions.BlenderEmptyException;
//import java.util.ArrayList;
//
///**
// *
// * @author tarteel
// */
//public class CocktailApp {
//
//    
////        Cocktail cocktail = new Cocktail();
////        String data = cocktail.getInfo();
//          DBcocktailApp db = new DBcocktailApp();
////        db.log(blenderInfo);
////        db.log(data);
//        
//    private static Ingredient[] ingredients;
//        int sizeOfArray = 6;
//        ingredients = new Ingredients[sizeOfArray];
//       ingredients[0]= new Fruits("Strawberry", 31, 100, new Color(252, 90, 141));
//       ingredients[1]= new Fruits("Melon", 34, 100, new Color(253, 188, 180));
//       ingredients[2]= new Fruits("Apple", 60, 100, new Color(44,33,44));
//       ingredients[3]= new Fruits("Orange", 90, 80, new Color(76,5,3));
//      ingredients[4] = new Fruits("Banana", 89, 100, new Color(255, 255, 0));
//      ingredients[5]= new Fruits("Kiwi", 61, 100, new Color(142, 229, 63));
//      ingredients[6]=  new Fruits("Pineapple", 50, 100, new Color(255, 224, 102));
//}
//}
//    
//    
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        
//         public ArrayList <Blender> blender =new ArrayList<>(); 
//
//        //Blender blender = new Blender(1200);    
//        
//        try{
//           blender.add(Strawberry);
//           blender.add(Melon);
//           blender.add(apple);
//           
//           blender.add(orange);
//           blender.add(banana);
//           blender.add(Kiwi);
//           blender.add(Pineapple);
//
//
//        }catch(BlenderOverFlowException ex){
//            System.out.println(ex.getMessage());
//        }
//        
//        Cup cup = new Cup(200);
//        Cup cup1 = new Cup(200);
//        Cup cup2 = new Cup(200);
//        Cup cup3 = new Cup(200);
//        
//        try{
//            blender.pour(cup);
//            blender.pour(cup1);
//            blender.pour(cup2);
//            blender.pour(cup3);
//           System.out.println("Cocktail Volume " + blender.getVolume());
//        }
//        catch(BlenderEmptyException ex){
//            System.out.println(ex.getMessage());
//        }       
//        
//        System.out.println("Calories in cup " + cup.getCalories());
//        
//   
//    }
//    
//}
