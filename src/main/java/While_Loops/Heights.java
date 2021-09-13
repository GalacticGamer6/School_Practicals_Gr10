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
public class Heights {

    public static void main(String[] args) {
        double height = 0;
        boolean is_Running = true;
        double highest = 0;

        while (is_Running) {
            height = Double.parseDouble(JOptionPane.showInputDialog("Enter yo height shawty!"));
            if (height < 0) {
                is_Running = false;
                break;
            } else {
                if (height > highest) {
                    highest = height;
                }
            }
        }
        System.out.println(highest);
    }
}
