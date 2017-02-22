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
public class BigBellyBurger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ingredient chile = new Ingredient("Chile", 4.36);
        Ingredient queso = new Ingredient("Queso", 4.36);
        BasicHamburger hamburguesa = new BasicHamburger("Bolillo", "Normal",45.62);
        HealthyBurger huhu = new HealthyBurger("Bru", "As", 34.00);
        DeluxeBurger hihi = new DeluxeBurger("R", "E", 89.33, chile, queso);
        hamburguesa.setAddition("Catsup", 4.00);
        hamburguesa.setAddition("Tocino", 10.00);
        hamburguesa.setAddition("dede", 5.20);
        hamburguesa.setAddition(chile);
        hamburguesa.setAddition("Er",45.36);
        System.out.println(hamburguesa.toString());
        huhu.setAddition("Catsup", 4.00);
        huhu.setAddition(chile);
        System.out.println(huhu.toString());
        System.out.println(hihi.toString());
    }
    
}
