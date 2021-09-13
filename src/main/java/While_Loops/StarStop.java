package While_Loops;
import javax.swing.*;

public class StarStop {
    public static void main(String[] args) {
        boolean is_Running = true;
        int count = 0;
        while(is_Running)
        {
            String input = JOptionPane.showInputDialog("Enter in a character bro");
            if(input.equals("*"))
            {
                is_Running = false;
                break;
            }
            else
            {
              System.out.println(input);
              count++;
            }
        }
        System.out.println("Count: " + count);
    }
}
