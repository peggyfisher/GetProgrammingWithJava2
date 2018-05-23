package acmepublishing;
public class Author {
    public static int nextAuthorID = 001;
    private String lName, fName, address, email, phone;
    private int authorID; 
    public Author(String fName, String lName, String address, 
            String email, String phone) {
        this.lName = lName;
        this.fName = fName;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.authorID = nextAuthorID++;
    }
    public int getID() {
        return authorID;
    }
    //Add other getter and setter methods here
    @Override
    public String toString() {
        return "\n\nAuthor Information\n===================\n" + fName + " " +
                lName + "\n" + address + "\nemail: "+email + "\nAuthor ID: " + authorID;
    }    
}
