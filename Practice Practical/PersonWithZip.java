
public class PersonWithZip
{
    //instance variables for first name, last name, and zip code
    private String firstName;
    private String lastName;
    private int zipCode;
    
    //Constructor that sets the first name, last name, and zipcode based on the parameter values
    public PersonWithZip(String firstName, String lastName, int zipCode)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
        
    }
    
    //method that returns the value of the zip code
    public int getZip()
    {
        return zipCode;
    }
    
    //return a string of all the instance variables with labels 
    public String toString()
    {
        return ("First Name: " + firstName + " Last Name: " + lastName + " ZipCode: " + zipCode);
    }
}
