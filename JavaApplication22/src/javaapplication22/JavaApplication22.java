/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;
abstract class Pizza {
    public abstract void prepare();
}

class MargheritaPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Margherita Pizza...");
    }
}

class PepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Pepperoni Pizza...");
    }
}

abstract class PizzaFactory {
    public abstract Pizza createPizza();
}

class MargheritaPizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new MargheritaPizza();
    }
}

class PepperoniPizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new PepperoniPizza();
    }
}

// Usage
public class JavaApplication22 {
    public static void main(String[] args) {
        PizzaFactory margheritaFactory = new MargheritaPizzaFactory();
        PizzaFactory pepperoniFactory = new PepperoniPizzaFactory();
        
        Pizza margherita = margheritaFactory.createPizza();
        Pizza pepperoni = pepperoniFactory.createPizza();
        
        margherita.prepare();
        pepperoni.prepare();
    }
}