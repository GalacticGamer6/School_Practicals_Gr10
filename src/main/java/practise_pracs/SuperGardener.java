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
public class SuperGardener {
    public static int gardener_pos;
    public static int plant_pos;
    public static boolean has_water;
    public static int round_num;
    public static boolean is_running = true;

    
    public static void one_round(){
        
        int num_moves = 0;
        
        while(is_running){
            
        draw_garden(round_num,has_water);
        
        char choice = JOptionPane.showInputDialog("What do you want you want to do?\nL: Move Left\nR: Move Right\nF: Fill Up\nW: Water Plant\nQ: Quit").charAt(0);
        switch(choice){
            
            case 'L': if(!(gardener_pos <= 1)){
                        gardener_pos -= 1;
                        num_moves++;
                        System.out.println("Gardener Pos: " + gardener_pos);
                        }
                        else if(gardener_pos == 1){
                        //do nothing    
                        }
                        break;
                         
            case 'R': if(!(gardener_pos == 10)){
                        gardener_pos += 1;
                        num_moves++;
                        }
                         break;
                         
            case 'F': if(!(gardener_pos == 1)){
                        }
                        else {
                                has_water = true;
                        }
                         break;
                         
            case 'W': if(has_water == true && gardener_pos == plant_pos){
                        has_water = false;
                        is_running = false;  //breaks the while loop
                        }
            
                         break; // breaks switch                         
            }
        }
    }
    
    public static void draw_garden(int round_number, boolean water_full){
        System.out.println("Round: " + round_number + "\t\tWatering can full: " + water_full );
        System.out.print("W ");
        for(int hole_num = 1 ; hole_num <= 10 ; hole_num++){
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
        }
    
    public static int generate_random_gardener_pos(){
        int pos = (int)(Math.random()*(6 - 1 + 1));
        return pos;
    }
    
    public static int generate_random_plant_pos(){
        int pos = (int)(Math.random()*(11 - 6 + 6));
        return pos;
    }    
    
        public static void main(String[] args) {
        gardener_pos = 3;
        plant_pos = 5;
        has_water = false;
        round_num = 1;
        
        if(round_num > 1){
            gardener_pos = generate_random_gardener_pos();
            plant_pos = generate_random_plant_pos();
        }
        for(int round = 1 ; round < 6 ; round++){
            one_round();
            round_num++;
        }
    }
    
    
}
