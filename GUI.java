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
        // Initialise instance variables
        UI.initialise();
        ContactList cntcts = new ContactList(); // Create new Contacts list
        
        // Mouse listener
        UI.setMouseListener(this::mouseClick);
        
        // GUI buttons
        UI.addButton("Add Contact", cntcts::addContact);
        UI.addButton("Search for / Display Contact", cntcts::srchContacts);
        UI.addButton("Print List", cntcts::printAll);
        UI.addButton("Hide Details", this::hideDetails);
        UI.addButton("Quit", UI::quit);
    }
    
    /**
     * Checks mouse has been clicked and is on image
     * if true, hides contact details 
     * 
     * @param action mouse action
     * @param x mouse X-coordinate
     * @param y mouse Y-coordinate
     */
    public void mouseClick(String action, double x, double y) {
        if (action.equals("released") && onImage(x, y)) {
            hideDetails();
        }
    }
    
    /**
     * Checks if mouse is on the image
     * @param x mouse X-coordinate
     * @param y mouse Y-coordinate
     * @return true if on image, false if not
     */
    public boolean onImage(double x, double y) {
        int imgOffset = 50;     // X and Y offset for image
        int imgX = 164;         // Image width
        int imgY = 200;         // Image height
        
        // Checks if mouse coords are within image boundary
        if ((x > imgOffset) && (x < imgOffset + imgX) && 
            (y > imgOffset) && (y < imgOffset + imgY)) {
            return true;   
        }
        else {
            return false;   
        }
    }
    
    /**
     * Clears the graphics pane
     */
    public void hideDetails() {
        UI.clearGraphics();
    }
}
