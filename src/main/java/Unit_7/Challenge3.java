package Unit_7;

import java.util.Scanner;

public class Challenge3{

   public static void main(String [] args){

   Scanner Sc = new Scanner(System.in);
   System.out.println("Do you choose rock paper or scissors?\n(Enter with your choice in all caps)");
   
   
   String user_choice = Sc.next();
   int cpu = (int)(Math.random() * ((3 - 1) + 1)) + 1;
   System.out.println(user_choice);
   System.out.println(cpu);

   }
}