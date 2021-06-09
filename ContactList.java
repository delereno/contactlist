import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/**
 * Stores a list of user contacts
 * Allows user to add, view and hide information
 * includes name, phone number and id image
 * @Del Huang 
 * @1/6/21 
 */
public class ContactList
{
    // instance variables 
    private HashMap<Integer, Contact> contactMap;   // hashmap for contacts
    private HashMap<String, Contact> nameMap;      // name hashmap for finding contacts
    private int currentId = 0;                      // the idx of current contact
    
    /**
     * Constructor for objects of class ContactList
     */
    public ContactList()
    {
        // initialise instance variables (hashmap for contacts)
        contactMap = new HashMap<Integer, Contact>();
    }
    
    /**
     * Allows the user to add a contact
     */
    public void addContact() {
        int num = 0;                // phone num
        int dgtCount = 0;           // count for phone num digits
        final int DIGIT_MAX = 10;   // max digits for phone num
        final int DIGIT_MIN = 0;    // min digits for phone num
        
        
        String name = UI.askString("Contact Name:");
        do {
            num = UI.askInt("Contact Phone Number:");
            dgtCount = String.valueOf(num).length();
        } while (DIGIT_MIN > dgtCount && dgtCount > DIGIT_MAX);
        
        // Allows the user to add a contact's display image
        String imgFile = UIFileChooser.open("Please select a display image:");
        
        // adds +1 to contact ID counter, adds both to the map
        currentId++;
        contactMap.put(currentId, new Contact(currentId, name, num, imgFile));
    }
    
    /**
     * Finds a specific contact
     * prints its details + image
     */
    public void srchContacts() {
        // ADD A CHECKER FOR IF THERE ARE EXISTING CONTACTS IN THE SYSTEM, IF NONE, GO BACK TO THE MENU
        boolean RUNNING = true;
        while (RUNNING) {
            String input = UI.askString("Please enter the contact's name.");
            for (int i = 1; i <= currentId; i++) {
                if (input.equals(contactMap.get(i).getName())){
                    //draw details PUT THIS IN
                    contactMap.get(i).drawDetails();
                    UI.println("match found!");
                    RUNNING = false;
                } else {
                    UI.println("User contact not found.");
                }
            }
        }
        
    }
    
    /**
     * Prints all user contacts and their info
     */
    public void printAll() {
        // ADD ERROR IF USER HAS NOT ADDED ANY CONTACTS
        for (int contactIdx : contactMap.keySet()) {
            UI.println(contactMap.get(contactIdx).getName() + "|" 
                       + contactMap.get(contactIdx).getPhoneNum());
        }
    }
    
    
    /**
     * Creates menu that user can interact with, call different methods
     */
    public void menu() {
        String choice;
        do {
            UI.println("Please select an option:");
            UI.println("(A)dd contact");
            UI.println("(S)earch contacts");
            UI.println("(P)rint contact list");
            UI.println("(Q)uit program");
            
            choice = UI.askString(""); // gets user input
            
            if (choice.equalsIgnoreCase("A")) {
                addContact();
            } else if (choice.equalsIgnoreCase("S")) {
                srchContacts();
            } else if (choice.equalsIgnoreCase("P")) {
                printAll();
            } else {
                UI.println("Please enter a valid option (A, F, P, Q).");
            }
        } while (!choice.equalsIgnoreCase("Q"));
    }
}
