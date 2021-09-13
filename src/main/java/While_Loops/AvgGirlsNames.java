/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package While_Loops;

import javax.swing.JOptionPane;

/**
 *
 * @author Neeraavr
 */
public class AvgGirlsNames {
    public static void main(String[] args) {
        boolean is_Running = true;
        int total_Length = 0;
        double avg_Length = 0;
        int count = 0;
        while(is_Running){
            String names = JOptionPane.showInputDialog("Enter a name of a female but plese be cautoius in order not to offend any gender groups for this is the 21st centiry and we dont judge on appearance , intelleigence, emotonal compassionance, chemical bonding, the unfair laws of magnetism, communism, the harry potter series and lastly, your messy pancakes.");
            if(names.equals("*")){
                break;
                
            }
            else{
                count++;
                 int names_Length = names.length();
                 total_Length+= names_Length;
            }
        }
        System.out.println("Average length of girls names: " + (int)(total_Length/count));
    }
}
