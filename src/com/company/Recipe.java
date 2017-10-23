package com.company;

import java.util.ArrayList;

public class Recipe {
    private ArrayList<Ingredient> ingredients;
    String description;

    public Recipe() {
        ingredients = new ArrayList<Ingredient>();
        description = "";
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }

    public String toString(){
        String str="Recipe:\n";
        str +="===================================\n";
        str += "Ingredients:\n";
        str+="===================================\n";
        for (Ingredient ingredient:ingredients){
            str += ingredient;
        }
        str+="===================================\nDirections:\n";
        str+="===================================\n";
        str += description;
        return str;
    }
}
