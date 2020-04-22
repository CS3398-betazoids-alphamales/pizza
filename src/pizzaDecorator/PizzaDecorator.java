package patternsexamp;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces

// Using Decorator Design Patttern

public abstract class PizzaDecorator implements PizzaExtras {

    protected Pizza specialPizza;

    public PizzaDecorator(Pizza specialPizza) {
        this.specialPizza = specialPizza;
    }

  @Override
   public Pizza addExtras() {
     return specialPizza.addExtras();
  }

}