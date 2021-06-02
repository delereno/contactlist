import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/**
 * Contact support class
 * Allows a contact to store user info
 * 
 * @Del Huang (your name)
 * @1/06/21 (a version number or a date)
 */
public class Contacts
{
    // instance variables 
    private int id;
    private String name;
    private int phoneNum;
    private String photoId;

    private double xSet, ySet = 50;
    final double WIDTH = 164;
    final double HEIGHT = 200;
    /**
     * Constructor for objects of class Contacts
     */
    public Contacts(int id, String nm, int num, String img)
    {
        // initialise instance variables
        this.id = id;
        this.name = nm;
        this.phoneNum = num;
        this.photoId = img;
    }

    /**
     * Getter method for num id
     * 
     * @return id int
     */
    public int getId() {
        return this.id;
    }
    /**
     * Getter method for num id
     * 
     * @return id int
     */
    public String getName() {
        return this.name;
    }
    /**
     * Getter method for num id
     * 
     * @return id int
     */
    public int getPhoneNum() {
        return this.phoneNum;
    }
    
    /**
     * Displays the id image on the GUI
     */
    public void displayBook() {
        UI.drawImage(this.photoId, xSet, ySet, WIDTH, HEIGHT);
    }
}
