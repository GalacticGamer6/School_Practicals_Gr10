package Scanners_Writers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neeraavr
 */
public class RUn {
    public static void main(String[] args) {
        String name = "HONEY I SHRUNK THE HONEY";
        String author = "Roberty Downey Senior";
        Book_Manager.Add_Book(name, author);
        String wun = Book_Manager.gGet_Books();
        
        
        System.out.println(wun);
        
    }
    
}
