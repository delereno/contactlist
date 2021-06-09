import ecs100.*;

/**
 * Contact support class
 * Allows a contact to store user info
 * 
 * @author Del Huang
 * @version 8/6/21
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
    private double xSetString; 
    private double ySetName;
    private double ySetNum;
    
    private double imgOffset; 
    private double imgWidth;
    private double imgHeight;
    
    /**
     * Constructor for objects of class Contacts
     * @param id  Contact Id
     * @param nm  Contact name
     * @param num Contact phone num
     * @param img Contact image
     */
    public Contact(int id, String nm, int num, String img)
    {
        // initialise instance variables
        this.id = id;
        this.name = nm;
        this.phoneNum = num;
        
        // if user cancels file select, sets img as default
        if (img == null) {
            this.photoId = DEFAULT_IMG; 
        } 
        else {         
            this.photoId = img;
        }
    }
   
    /**
     * Getter method for contact id
     * @return int Id
     */
    public int getId() {
        return this.id;
    }
    
    /**
    * Getter method for contact name
    * @return String name
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Getter method for contact phone number
    * @return int Phone Number
    */
    public int getPhoneNum() {
        return this.phoneNum;
    }
    
    /**
    * Displays the contact's details on the GUI
    */ 
    public void drawDetails() {
        xSetString = 250;   // X,Y offset for strings
        ySetName = 70;      // Name string Y offset
        ySetNum = 90;       // Num string Y offset
    
        imgOffset = 50;     // X,Y offset for image
        imgWidth = 164;     // Image width
        imgHeight = 200;    // Image height
        
        // Draws contact name, phone number and image on the graphics pane
        UI.drawString("Name: " + this.name, xSetString, ySetName);
        UI.drawString("Phone Num: " + this.phoneNum, xSetString, ySetNum); 
        UI.drawImage(this.photoId, imgOffset, imgOffset, imgWidth, imgHeight);
    }
    
}
