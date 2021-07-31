package Unit_7;

import javax.swing.*;

public class Challenge2{
 
   public static void main(String [] args){
   
    String num1_Str = JOptionPane.showInputDialog("ENTER YOUR FIRST NUMBER");
    String num2_Str = JOptionPane.showInputDialog("ENTA UR 2ND NUMBA");
    
    double num1 = Double.parseDouble(num1_Str);
    double num2 = Double.parseDouble(num2_Str);
    
    if(num2 > 0   || num2 < 0){
       double quotient = num1 / num2;
       System.out.print(quotient);
       }else{
       System.out.println("Undefined");
       }
   }
}