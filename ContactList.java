import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/**
 * Stores a list of user contacts
 * Allows user to add, view and hide information
 * includes name, phone number and id image
 * jesus this is a lil messy right now
 *
 * @Del Huang (your name)
 * @31/5/21 (a version number or a date)
 */
public class ContactList
{
    // instance variables - none so far
    ArrayList<String> imgs = new ArrayList<String>();
    int imgIdx = 0; //what the current image index is

    /**
     * Constructor for objects of class ContactList
     */
    public ContactList()
    {
        UI.initialise();
        
        UI.addButton("Quit", UI::quit);    // Comment out to checkstyle
        addImage();
        test();
    }

    
    public void addImage(){
        
        for (int i = 0; i <= 1; i++) {
            imgs.add("ID" + i + ".png");
        }
    }
    /**
     * Mr Ny
     * If you're looking over this after submission,
     * this is just a quick test on how i want formatting, nothing final yet
     * like a visual plan kinda
     */
    public void test()
    {
        //draw id photo
        UI.drawImage(imgs.get(imgIdx), 50, 50, 164, 200);
        //write name 
        UI.drawString("Name: Del Huang", 250, 70);
        //phone number
        UI.drawString("Phone Num: 1234567890", 250, 90);
    }
    
    public static void main (String [] args) {
        ContactList list = new ContactList();
    }
}
