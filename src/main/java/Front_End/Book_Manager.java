import java.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
package Front_End;

/**
 *
 * @author Neeraavr
 */
public class Book_Manager {
    
    private static String File_Path = "data\\bookz.txt";
    private static String output = "";
    
    public static String getBooks(){
        
        try {
            File bookz_File = new File(File_Path);
            Scanner sc = new Scanner(bookz_File);
            
            while(sc.hasNextLine()){
                String line = new Scanner(l)
                Scanner LineSc = new Scanner(sc).useDelimiter("#");
            
            
                
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Book_Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
        }
    }
}
