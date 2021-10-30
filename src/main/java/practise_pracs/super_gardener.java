/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise_pracs;

import javax.swing.JOptionPane;

/**
 *
 * @author Neeraav Ranjit
 */
public class super_gardener {
    public static int gardener_pos;
    public static int plant_pos;
    public static boolean has_water;
    public static int round_num;
    public static boolean round_is_over;
    public static int num_moves = 0;
    public static void draw_garden(){
        
        System.out.println("Round: " + round_num + "\t\tWatering can full: " + has_water); 
        
        System.out.print("W "); // prints the position of the well
        for(int hole_num = 1 ; hole_num <= 10; hole_num++ ){
            
            if(hole_num == gardener_pos){
                System.out.print("G ");

            }
            
            else if (hole_num == plant_pos){
                System.out.print("P ");

            }
            
            else{
                System.out.print("- ");     
                    
            }
            
            
            
        }
        
        System.out.println("");
        
    }
    
    
    
    
    public static void one_round(){
        char choice = (97); // just anuthing to initialize 97 is small a
        round_is_over = false;
        num_moves = 0;
        
        draw_garden();
        
        while(choice != 'Q' && round_is_over == false){
        num_moves++;
        choice = (JOptionPane.showInputDialog("What do you want you want to do?\nL: Move Left\nR: Move Right\nF: Fill Up\nW: Water Plant\nQ: Quit").toUpperCase()).charAt(0);
                
                switch(choice){
                        
                        case 'L':     if(gardener_pos != 1){
                                        gardener_pos--;
                                        }
                                        break;
                                        
                                        
                        case 'R':    if(gardener_pos != 10){
                                        gardener_pos++;
                                        }
                                        break;
                                        
                        case 'F':     if(gardener_pos == 1 && has_water == false){
                                        has_water = true;
                                        }                
                                        break;
                                        
                        case 'W':   if(gardener_pos == plant_pos){
                                        has_water = false;
                                        round_is_over = true;
                                        }
                                        break;
                                        
                }

                draw_garden();
                
        }
        
        System.out.println("ROUND OVER");
        System.out.println("NUMBER OF MOVES: " + num_moves );
       
    }
    
    public static int generate_gardener_pos(){
        int pos = (int)(Math.random()*(4) + 1);
        return pos;
    }
    
    public static int generate_plant_pos(){
        int pos = (int)(Math.random()*(5) + 6);
        return pos;
    }    
    
    
    
    
    
    public static void main(String[] args) {
        gardener_pos = 3;
        plant_pos =5;
        has_water = false;
        round_num = 1;
        round_is_over = false;
        
        for(int i = 1 ; i <= 5 ; i++){
            if(i >1){
                gardener_pos = generate_gardener_pos();
                plant_pos = generate_plant_pos();
            }
            
            one_round();
            round_num++;
        }
    }
}
