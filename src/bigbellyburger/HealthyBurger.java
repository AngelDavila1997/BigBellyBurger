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
public class HealthyBurger extends BasicHamburger{

    public HealthyBurger(String breadType, String meatType, double price) {
        super(breadType, meatType, price);
        this.limAdditions = 6;
        this.hamburgerType = "Healthy Burger";
    }
    
}
