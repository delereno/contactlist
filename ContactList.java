import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/**
 * Stores a list of user contacts
 * Allows user to add, view and hide information
 * includes name, phone number and id image
 * contacts class finished in double spell
 * @Del Huang 
 * @1/6/21 
 */
public class ContactList
{
    // instance variables 
    private HashMap<Integer, Contacts> idMap;
    private int idIdx;

    /**
     * Constructor for objects of class ContactList
     */
    public ContactList()
    {
        idMap = new HashMap<Integer, Contacts>();
        
        Contact id1 = new Contacts(1, Del Huang,1234567890, );
        // UI.addButton("Quit", UI::quit);    // Comment out to checkstyle
        // UI.initialise();
    }

    public void addContact() {
    
    }
    
    public static void main (String [] args) {
        ContactList list = new ContactList();
    }
}
