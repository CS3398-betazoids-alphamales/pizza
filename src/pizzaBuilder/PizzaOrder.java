package patternsexamp;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces

// Using Command Design Patttern (code based on DZone Command Pattern)

//Receiver
public class PizzaOrder{
  private boolean orderReady;
  public Pizza.Builder pb;
  public Pizza p;

  public void bakeDeepDish(){
	System.out.format("Baking a deepdish... \n"); 
    pb = new Pizza.Builder("Deep Dish"); 
    p = pb.pizzas(1).build();
    reportOrder();

  }
  public void bakeThinCrust(){
  	System.out.format("Baking a thincrust... \n");
  	pb = new Pizza.Builder("Thin Crust");  
    p = pb.pizzas(1).build();
    reportOrder();
  }

  public void bakeAndrew() {
    
    System.out.format("Baking an AndrewPizza... \n");
    pb = new Pizza.Builder("AndrewPizza");
    p = pb.pizzas(5).build();
    p.addExtras().toppings.pepperoni = true;
    p.addExtras().toppings.capers = true;
    p.addExtras().toppings.blackolives = true;
    
    reportOrder();
  }

  private void reportOrder() {
    
    if ( p.getName() == "AndrewPizza" ) {
      System.out.format("\nBuilt %s - num pies: %d, pepperoni: %b, capers: %b, blackolives %b\n",
      p.getName(),  
      p.getNumber(),
      p.toppings.pepperoni,
      p.toppings.capers,
      p.toppings.blackolives );
    }
      
    else {
      System.out.format("\nBuilt %s - num pies: %d, pepperoni: %b, onion: %b, frenchfries %b\n",
    	p.getName(),  
      p.getNumber(),
      p.toppings.pepperoni,
      p.toppings.onion,
      p.toppings.frenchfries );
    }
      
  }
}