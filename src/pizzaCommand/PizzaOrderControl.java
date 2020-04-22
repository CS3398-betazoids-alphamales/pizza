package patternsexamp;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces

// Using Command Design Patttern (code based on DZone Command Pattern)

//Invoker
public class PizzaOrderControl {
  private PizzaCommand command;
  public void setCommand(PizzaCommand command){
    this.command = command;
  }
  public void submitOrder(){
    command.execute();
  }
}