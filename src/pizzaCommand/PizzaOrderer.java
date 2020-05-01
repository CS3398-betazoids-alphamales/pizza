package patternsexamp;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces

// Using Command Design Patttern (code based on DZone Command Pattern)

//Client
public class PizzaOrderer{
  public static void main(String[] args)    {

    PizzaOrderControl control = new PizzaOrderControl();
    PizzaOrder order = new PizzaOrder();
    PizzaCommand deepDish = new DeepDishCommand(order);
    PizzaCommand thinCrust = new ThinCrustCommand(order);

    PizzaCommand andrew = new AndrewCommand(order);
    PizzaCommand evan = new EvanCommand(order);
    PizzaCommand benPizza = new BenPizza(order);
    PizzaCommand jonathanPizza = new JonathanPizzaCommand(order);

    // Order a deep Dish pizza
    control.setCommand(deepDish);
    control.submitOrder();

    // Order a thinCrust pizza
    control.setCommand(thinCrust);
    control.submitOrder();


    // Order an Andrew pizza
    control.setCommand(andrew);
    control.submitOrder();
      
    // Order an Evan pizza
    control.setCommand(evan);
    control.submitOrder();

    // Order a Ben Pizza
    control.setCommand(benPizza);
    control.submitOrder();

    // Order a jonathanPizza pizza
    control.setCommand(jonathanPizza);
    control.submitOrder();

  }
}
