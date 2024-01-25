
package _06_Console_Store;

import java.util.Scanner;

import _02_Generics_Store.*;

public class ConsoleStore {
	

    /*
     * Write a program that simulates shopping in a store using the Scanner and
     * the classes in Generics_Store.
     * 
     * Note: You may need to modify existing code in Generics Store and/or add
     * additional items and pictures to fulfill all the requirements. You are
     * also free to add any additional methods or classes in Console Store that
     * might be helpful to you.
     * 
     * Requirements:
     * 
     * -Use Ternary operators in place of simple if/else statements and do-while
     * loops instead of while loops where appropriate.
     * 
     * - There should be at least four unique items the user can buy. These can
     * be food items, nonfood items or both.
     * 
     * - The user should have a stipend of money to spend and each item should
     * have its own price.
     * 
     * -The user should have the ability to add items to their cart, remove
     * items, view items or check out.
     * 
     * -The program should continue until the user chooses to check out.
     * 
     * -When the user checks out you should let them know if they do not have
     * enough money to purchase all their items and offer to put items back.
     * 
     * -If the user successfully purchases the items you should remove the
     * amount from their stipend, show them the pictures of what they bought and
     * print out a receipt showing their name, the individual prices of the
     * items and their total.
     */
	
	static Cart<Food> cart = new Cart<Food>();
	static Scanner s = new Scanner(System.in);
	static int mainInput = 0;
	static int money = 100;
	
    public static void main(String[] args) {
    	start();
    }
    
    public static void start () {
    	Scanner subScanner = new Scanner(System.in);
    	int subInput = 0;
    	do {
    		System.out.println("\n");
    		System.out.println("You have $" + money + "\nWhat would you like to do?\n1. Check out\n2. Add items to cart\n3. Remove items from cart\n4. View items in cart");
    		mainInput = s.nextInt();
    		if (mainInput == 2) {
    			System.out.println("What item do you want to add?\n1. Fried Chicken $10\n2. Sandwitch $6\n3. Chips $2\n4. Soda $2");
    			subInput = subScanner.nextInt();
    			switch (subInput) {
    			case 1:
    				cart.add(new FriedChicken());
    				break;
    			case 2:
    				cart.add(new Sandwitch());
    				break;
    			case 3:
    				cart.add(new Chips());
    				break;
    			case 4:
    				cart.add(new Soda());
    				break;
    			}
    			start();
    		} else if (mainInput == 3) {
    			System.out.println("Here is what is in your cart:");
    			if (cart.length() == 0) {
    				System.out.println("nothing.");
    				start();
    			} else {
    				for (int i = 0; i < cart.length(); i++) {
    					System.out.println((i + 1) + ". " + cart.get(i).getClass().getName());
    				}
    				System.out.println("Which one you you want to remove?");
    			}
    		}
    	} while (mainInput != 1);
    }

}
