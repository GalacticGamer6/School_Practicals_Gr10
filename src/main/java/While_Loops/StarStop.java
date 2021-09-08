package While_Loops;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.swing.*;

public class StarStop {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("How many characters would you like to enter?"));
        int i = 0;

        while(i < num)
        {
            String current_char_String = JOptionPane.showInputDialog("Enter your char");
            char current_char = current_char_String.charAt(0);
            System.out.print(" " + current_char);
            if(current_char == '*'){
                break;
            }
            i++;
        }
        
    }


}
