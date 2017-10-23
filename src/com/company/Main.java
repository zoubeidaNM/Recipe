package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        Recipe recipe = new Recipe();

        String answer = "";
        System.out.println("Enter your recipe items.");

        do {
            displayMenu();

            answer = keyboard.next();
            keyboard.nextLine();

            if (answer.equalsIgnoreCase("I")) {
                String answer2="";
                do {
                    System.out.print("Enter ingredient name or enter (Q) to quit: ");
                    answer2 = keyboard.nextLine();
                    if(!answer2.equalsIgnoreCase("Q")) {
                        String name = answer2;
                        System.out.print("Enter ingredient quantity: ");
                        String quantity = keyboard.nextLine();

                        Ingredient ingredient = new Ingredient(name, quantity);
                        recipe.addIngredient(ingredient);
                    }
                }while(!answer2.equalsIgnoreCase("Q"));


            } else if (answer.equalsIgnoreCase("D")) {
                System.out.print("Enter recipe description: ");
                recipe.setDescription(keyboard.nextLine());
            }
        } while (!answer.equalsIgnoreCase("Q"));


        System.out.println(recipe);

    }

    public static void displayMenu() {
        System.out.print("Press (I) to enter a new (I)ngredient.");
        System.out.println("Press (D) to Enter recipe (D)escription.");
        System.out.println("Press (Q) to (Q)uit.");

    }


}
