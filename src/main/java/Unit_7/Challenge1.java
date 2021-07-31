package Unit_7;

import javax.swing.*;

public class Challenge1{

   public static void main(String [] args){

   String name_str = JOptionPane.showInputDialog("Enter Your name");
   int name_length = name_str.length();
   
   if(name_length % 2 == 0){
      System.out.println("YOur name is even numbered");
      }
      else{
      System.out.println("YOu name is odd!");
      }
      
   }
}