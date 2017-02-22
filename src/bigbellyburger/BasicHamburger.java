/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigbellyburger;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class BasicHamburger {
    //Atributos
    private String breadType;
    private String meatType;
    private double price;
    private ArrayList<Ingredient> additions = new ArrayList<Ingredient>();
    protected int limAdditions;
    protected String hamburgerType;
    //Constructor
    public BasicHamburger(String breadType, String meatType, double price) {
        this.breadType = breadType;
        this.meatType = meatType;
        this.price = price;
        this.limAdditions = 4;
        this.hamburgerType = "Basic Burger";
    }
    //Get &  Set
    public String getBreadType() {
        return breadType;
    }
    public String getMeatType() {
        return meatType;
    }
    public double getPrice() {
        return price;
    }
    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }
    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean setAddition(Ingredient addition){
        if(this.additions.size()<this.limAdditions){
            return this.additions.add(addition);
        }else{
            System.out.println("Limit of additions exceeded");
            return false;
        }
    }
    public boolean setAddition(String name, double price){
        if(this.additions.size()<this.limAdditions){
            return this.additions.add(new Ingredient(name, price));
        }else{
            System.out.println("Limit of additions exceeded");
            return false;
        }
    }
    public double getTotal(){
        double total = this.price;
        for(Ingredient temp: this.additions){
            total += temp.getPrice();
        }
        return total;
    }
    @Override
    public String toString() {
        String ingredients = "";
        for(Ingredient temp: this.additions){
            ingredients += "*" + temp.getName() + "----------" + temp.getPrice() + "\n";
        }
        return "***** Big Belly Burger *****\n" + this.hamburgerType + ":" +  
                "\n*" + this.meatType + "\n*" + this.breadType + 
                "\n**Price----------" + this.price + "\nAdditions:\n" + ingredients
                + "---------------------" + "\nTotal: " +  getTotal();
    }
    
}
