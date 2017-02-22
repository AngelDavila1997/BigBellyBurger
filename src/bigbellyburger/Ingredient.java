/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigbellyburger;

/**
 *
 * @author PC
 */
public class Ingredient {
    //Atributos
    private String name;
    private double price;
    //Constructor
    public Ingredient(String name, double price) {
        this.name = name;
        this.price = price;
    }
    //Get & Set
    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
