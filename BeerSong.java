/*
cit 337
assignment 2 version control
Nicole Cox
 */
package BeerSong;

/**
 *
 * @author Nicky
 */
public class BeerSong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ninety_Nine_Bottles_Of_Beer();
        
    }
    
    public static void Ninety_Nine_Bottles_Of_Beer() {
        int bottles = 99;
        int newBottles;
        while (bottles > 1){
            System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer");
            newBottles = bottles - 1;
            System.out.println("take one down pass it around, " + newBottles + " bottles of beer on the wall.");
            bottles = newBottles;
        }
        System.out.println("1 bottle of beer on the wall, 1 bottle of beer");
        System.out.println("take one down, pass it around, no more bottles of beer on the wall.");
    }
    
}
