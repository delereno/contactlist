import ecs100.*;
/**
 * GUI class that handles ... the GUI
 *
 * @author Del Huang
 * @version 8/6/21
 */
public class GUI
{
   

   /**
    * Constructor for objects of class GUI
    */
   public GUI()
   {
       // initialise instance variables
       UI.initialise();
       ContactList cntcts = new ContactList();
       
       UI.setMouseListener(this::mouseClick);
       UI.addButton("Add Contact", cntcts::addContact);
       UI.addButton("Search for / Display Contact", cntcts::srchContacts);
       UI.addButton("Print List", cntcts::printAll);
       UI.addButton("Hide Details", this::hideDetails);
       UI.addButton("Quit", UI::quit);
   }
   
   public void mouseClick(String action, double x, double y) {
    if (action.equals("released") && onImage(x,y)) {
        hideDetails();
    }
   }
   
   public boolean onImage(double x, double y) {
       if ((x > 50) && (x < 50 + 164) && //put in constants
            (y > 50) && (y < 50 + 200)) {
           return true;    
       } else {
           return false;
       }
   }
   public void hideDetails() {
       UI.clearGraphics();
   }
}
