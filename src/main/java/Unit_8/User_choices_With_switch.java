/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_8;

import java.util.Scanner;

/**
 *
 * @author CLLB22
 */
public class User_choices_With_switch {
        public static void main(String[] args) {
        System.out.println("PICK BETWEEN THESE 5 TINGS");
        System.out.println("1)Communism\n2)Capitalism\n3)Socialism\n4)Fascism\n5)Bhuddism");
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of your preffered ideology");
        int choice = Integer.parseInt(sc.next());   
        String[] choices = {"Communism" , "capitalism" , "Socialism" , "fascism" , "Buddhism"};
        switch(choice){
            case 1:
                System.out.println("You chose: " + choices[choice]);
                break;
            case 2:
                System.out.println("You chose: " + choices[choice]);
                break;
            case 3:
                System.out.println("You chose: " + choices[choice]);
                break;
            case 4:
                System.out.println("You chose: " + choices[choice]);
                break;
            case 5:
                System.out.println("You chose: " + choices[choice]);
                break;
        }
    }
}
