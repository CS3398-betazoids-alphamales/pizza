package patternsexamp;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

// Using Builder Design Pattern 

public class Pizza implements PizzaExtras{
 
     
    private final String pizza;                             // Name of the pizza
    private int numPizzas;                                  // number of pizzas
    public PizzaToppings toppings = new PizzaToppings();    //The toppings that go on the pizza
     
    public Pizza(Builder builder)
    {
        pizza = builder.pizza;
        numPizzas = builder.numPizzas;
    }
     
    public static class Builder{
        public final String pizza; 
        public int numPizzas = 1;    

        public Builder(String pizza) {
            this.pizza = pizza;
        }

        public Builder pizzas(int numpizzas){
            this.numPizzas = numpizzas;
            return this;
        }
         
        public Pizza build()
        {
            return new Pizza(this);
        }
    }

    @Override
    public Pizza addExtras()
    {
        return this;
    }

    public String getName() {
        return pizza;
    }

    public int getNumber() {
        return numPizzas;
    }

         
}



