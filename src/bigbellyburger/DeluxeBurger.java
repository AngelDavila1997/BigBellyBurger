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
public class DeluxeBurger extends BasicHamburger{

    public DeluxeBurger(String breadType, String meatType, double price, Ingredient addition1, Ingredient addition2) {
        super(breadType, meatType, price);
        this.limAdditions = 2;
        this.hamburgerType = "Deluxe Burger";
        this.setAddition(addition1);
        this.setAddition(addition2);
    }
    public DeluxeBurger(String breadType, String meatType, double price, String name1, double price1, String name2, double price2) {
        super(breadType, meatType, price);
        this.limAdditions = 2;
        this.hamburgerType = "Deluxe Burger";
        this.setAddition(name1, price1);
        this.setAddition(name2, price2);
    }
}
