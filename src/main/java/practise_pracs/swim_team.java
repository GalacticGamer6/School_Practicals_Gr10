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
public class swim_team {
    
        public static String name = "";
        public static String team_list_a = "";    
        public static String team_list_b = "";    
        public static String team_list_reserve = ""; 
        public static int count_a;
        public static int count_b;
        public static int count_reserve;
        public static double avg_time;

        
        public static void main(String[] args) {
            
                team_list_a = "Team A\n";
                team_list_b = "Team B\n";
                team_list_reserve = "Team Reserve\n";
            
                name = JOptionPane.showInputDialog("Please Enter Participants name");
                one_swim(name);
        }
        
        public static void one_swim(String swimmer_name){
                int sum_of_times = 0;
                
                System.out.println("Swimmer Name: " + swimmer_name);
                
                for(int round = 1 ; round <= 4 ; round++){
                    
                int swim_minutes = (int)(Math.random()*(5-2+2));
                int swim_seconds = (int)(Math.random()*(60 - 0 + 0));
                
                int swim_time = (swim_minutes * 60) + swim_seconds;
                
                System.out.print("Swimmer Time: " + swim_minutes + " min " + swim_seconds + " seconds"); //time in minutes and seconds
                System.out.println("\t\tTotal Time in seconds is: " + swim_time + " seconds"); // total time in seconds
                
                sum_of_times += swim_time; 
                }
                
                avg_time = sum_of_times / 4.0;
                i
                switch(avg)
        }
        
}
