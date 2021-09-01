
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neeraavr
 */
public class Book_Manager {
    
    public static String file_Path = "data\\bookz.txt";
    
    public static String gGet_Books(){
        String output = "";
        
        try{
        File f = new File(file_Path);
        Scanner file_Sc = new Scanner(f);
        
        while(file_Sc.hasNext()){
            String line = file_Sc.nextLine();
            
            Scanner LineSc = new Scanner(line).useDelimiter("#");
            String name = LineSc.next();
            String author = LineSc.next();
            
            output += "BOOK: " + name + " AUNTHOR: " + author + "\n";
            LineSc.close();
        }
        file_Sc.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("FILE NOT FOUND");
        }
        return output;
    }
}
