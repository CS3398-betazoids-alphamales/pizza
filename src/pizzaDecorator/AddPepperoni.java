package patternsexamp;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

// Using Decorator Design Patttern

public class AddPepperoni extends PizzaDecorator {
	private boolean pepperoni;

    public AddPepperoni(Pizza specialPizza, boolean val) {
        super(specialPizza);
        pepperoni = val; 
    }
    
   @Override
    public Pizza addExtras() {
    	specialPizza.toppings.pepperoni = pepperoni;
    	return specialPizza.addExtras();
    }
}
