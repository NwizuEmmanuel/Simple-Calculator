/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinner_hall;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Dinner_hall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner customersInput = new Scanner(System.in);
        System.out.println("Welcome to Dinner hall.");
        System.out.println("\"Match you with the perfect food\".");
        System.out.println("Food menus: ");
        String foodMenu = "1 Plantain Porridge\n2 Balangu jollof\n3 Semovita/Eba with Okra soup\n4 Spaghetti with Beef stew"
                + "\n5 Fish and Yam Stew\n6 jollof Rice\n7 Rice and stew granished with vegetables.";
        System.out.println(foodMenu);
        System.out.println("\nDrinks available: ");
        String beerDrinks = "8 Henikien\n9 Star\n10 Hero\n11 Stout";
        String softdrinks = "\n12 Big cola\n13 RC Cola\n14 RC Apple\n15 RC Orange";
        System.out.println(beerDrinks + softdrinks + "\n");
        System.out.println("Do you suffer from any food related abnomalities i.e. Diabetes etc");
        String customerHealthInput = customersInput.nextLine();

        if (null == customerHealthInput) {
            System.out.println("Syntax Error:\nYou are expected to type only yes/no.");
        }else /*Customer's input analysizer*/ switch (customerHealthInput) {
            case "yes":
                System.out.println("\nWhich one do you suffer from?\n16 Diabetes\n17 Ulcer");
                System.out.println("Type only their corresponding numbers.");
                int customersHealthInput2 = customersInput.nextInt();
                    switch(customersHealthInput2){
                        case 16:
                            System.out.println("Your food must contain 9% sugar for your health purpose.");
                            break;
                        case 17:
                            System.out.println("Your food must contain 9% salt for your health purpose.");
                            break;
                        default:
                            System.out.println("Error, type only the word specified above.");
                            break;
                    }
                break;
            case "no":
                System.out.println("Ok, enjoy Dinner hall.");
                break;
            default:
                System.out.println("Syntax Error:\nYou are expected to type only yes/no.");
                break;
        }
        System.out.println("\nChoose any food from the menu to get started.");
        System.out.println("Simply type the corresponding number of the foods in the menu.\nEnjoy urself.");
        int fdMenuInput = customersInput.nextInt();
        switch(fdMenuInput){
            case 1:
                System.out.println("Have ur Plantain Porridge and enjoy urself.");
                break;
            case 2:
                System.out.println("Have ur Balangu jollof and enjoy urself.");
                break;
            case 3:
                System.out.println("Have ur Semovita/Eba with Okra soup and enjoy urself.");
                break;
            case 4:
                System.out.println("Have ur Spaghetti with Beef stew and enjoy urself.");
                break;
            case 5:
                System.out.println("Have ur Fish and Yam Stew and enjoy urself.");
                break;
            case 6:
                 System.out.println("Have ur jollof Rice and enjoy urself.");
                 break;
            case 7:
                System.out.println("Have ur Rice and stew granished with vegetables and enjoy urself.");
                break;
            default:
            System.out.println("You must type the corresponding numbers in the food menu>");
            break;
        }
        System.out.println("Also choose a drink from the menu.");
        int drinksInput = customersInput.nextInt();
        switch(drinksInput){
            case 8:
                System.out.println("Chill urself with Henikien.");
                break;
            case 9:
                 System.out.println("Chill urself with Star.");
                 break;
            case 10:
                 System.out.println("Chill urself with Hero.");
                 break;
            case 11:
                 System.out.println("Chill urself with Stout.");
                 break;
            case 12:
                 System.out.println("Chill urself with Big cola.");
                 break;
            case 13:
                 System.out.println("Chill urself with RC Cola.");
                 break;
            case 14:
                 System.out.println("Chill urself with RC Apple.");
                 break;
            case 15:
                 System.out.println("Chill urself with RC orange.");
                 break;
            default:
            System.out.println("You must type the corresponding numbers in the food menu>");
            break;
        }
        System.out.println("Feel at home.");
        /*End*/
    } 
}
