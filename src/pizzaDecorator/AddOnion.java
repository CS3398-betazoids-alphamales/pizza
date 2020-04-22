package patternsexamp;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

// Using Decorator Design Patttern

public class AddOnion extends PizzaDecorator {
	private boolean onion;

    public AddOnion(Pizza specialPizza, boolean val) {
        super(specialPizza);
        onion = val; 
    }
    
   @Override
    public Pizza addExtras() {
    	specialPizza.toppings.onion = onion;
    	return specialPizza.addExtras();
    }
}
