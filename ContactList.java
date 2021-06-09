import ecs100.*;
import java.util.*;

/**
 * Stores a list of user contacts
 * Allows user to add, view and hide information
 * includes name, phone number and id image
 * @author Del Huang 
 * @version 8/6/21 
 */
public class ContactList
{
    // Instance variables 
    private HashMap<Integer, Contact> contactMap;   // Hashmap for contacts
    private int currentId = 0;                      // Current index
    
    static final int CHAR_LIM = 40;    // Max characters for name
    static final int DIGIT_AMT = 9;    // Set digit amount for phone num
    
    /**
     * Constructor for objects of class ContactList
     */
    public ContactList()
    {
        // Initialise instance variables (hashmap for idx, contacts)
        contactMap = new HashMap<Integer, Contact>();
    }
    
    /**
     * Allows the user to add a contact
     */
    public void addContact() {
        String name = "";   // Contact name
        int num = 0;        // Contact phone number 
        String imgFile;     // Contact image
        
        // Gets contact name input, loops if not under 40 char limit
        do {
            name = UI.askString("Contact Name (40 characters max):");
        } while (name.length() > CHAR_LIM);
        
        // Gets contact phone num, loops if not 9 digits long
        do {
            num = UI.askInt("Contact Phone Number (9 digits):");
        } while (String.valueOf(num).length() != DIGIT_AMT);
        
        // Allows the user to add a contact's display image
        imgFile = UIFileChooser.open("Please select a display image:");
        
        // Adds +1 to contact ID counter, adds both to the map
        currentId++;
        contactMap.put(currentId, new Contact(currentId, name, num, imgFile));
    }
    
    /**
     * Finds a specific contact
     * prints its details + image
     */
    public void srchContacts() {
        // Checks if contacts exist, if not, returns
        if (currentId < 1) {
            UI.println("Please create at least one contact first.");
            return;
        }
        
        boolean running = true;
        
        // Asks for contact name, returns if valid in map, otherwise loops
        while (running) {
            String input = UI.askString("Please enter the contact's name.");
            for (int i = 1; i <= currentId; i++) {
                if (input.equals(contactMap.get(i).getName())) {
                    contactMap.get(i).drawDetails();
                    return; 
                } 
            }
            UI.println("User contact not found."); // if name cannot be found
        }
    }
    
    /**
     * Prints all user contacts and their info
     */
    public void printAll() {
        // Checks if contacts exist, if not, returns
        if (currentId < 1) {
            UI.println("Please create at least one contact first.");
            return;
        }
        
        // Prints contact name and phone number
        for (int contactIdx : contactMap.keySet()) {
            UI.println(contactMap.get(contactIdx).getName() + "|" 
                       + contactMap.get(contactIdx).getPhoneNum());
        }
    }
    
   
}
