package Unit_5;

import javax.swing.*;

public class idkanymore{

   public static void main(String args[]){
   int total = 0;
   for(int i = 0 ; i < 10 ; i++){
       String i_str = JOptionPane.showInputDialog("�nter 1 num only");
       int i_int = Integer.parseInt(i_str);
       total = total + i_int; 
      }    
      
     int average = total / 10;
     
     System.out.println(average); 
   
   }
}