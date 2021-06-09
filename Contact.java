import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/**
 * Contact support class
 * Allows a contact to store user info
 * 
 * @Del Huang (your name)
 */
public class Contact
{
   // instance variables 
   private int id;
   private String name;
   private int phoneNum;
   private String photoId;
   static final String DEFAULT_IMG = "ID0.png";
    
   // Placement Coordinates for drawn contact details
   private double xSetName, ySetName;
   private double xSetNum, ySetNum;
   private double xSetImg, ySetImg;
   
   /**
    * Constructor for objects of class Contacts
    */
   public Contact(int id, String nm, int num, String img)
   {
       // initialise instance variables
       this.id = id;
       this.name = nm;
       this.phoneNum = num;
       if (img == null) {
           this.photoId = DEFAULT_IMG; 
       } else {         
           this.photoId = img;
       }
   }
   
   /**
    * Getter method for contact id
    * 
    * @return int Id
    */
   public int getId() {
       return this.id;
   }
   /**
    * Getter method for contact name
    * 
    * @return String name
    */
   public String getName() {
       return this.name;
   }
   /**
    * Getter method for contact phone number
    * 
    * @return int Phone Number
    */
   public int getPhoneNum() {
       return this.phoneNum;
   }
   /**
    * Displays the contact's details on the GUI
    */ 
   public void drawDetails() {
      xSetName = 250;
      ySetName = 70;
      xSetNum = 250;
      ySetNum = 90;

      xSetImg = 50;
      ySetImg = 50;
      final double WIDTH = 164;
      final double HEIGHT = 200;
      
      UI.drawString("Name: " + this.name, xSetName, ySetName);
      UI.drawString("Phone Num: " + this.phoneNum, xSetNum, ySetNum); 
      UI.drawImage(this.photoId, xSetImg, ySetImg, WIDTH, HEIGHT);
   }
   
   
   
   
}
