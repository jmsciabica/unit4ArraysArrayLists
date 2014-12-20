import java.util.Scanner;
/**
 * Write a description of class ZipTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZipTest
{
    public static void main(String [] args)
    {
        PersonWithZip [] arrayZips = new PersonWithZip[3];
        
        Scanner s = new Scanner(System.in);
        
        for(int i = 0; i < arrayZips.length; i++)
        {
            System.out.println("Enter first name, last name, and zip code for person #" + (i + 1) + 
            "with fields separated by a space");
            String firstName = s.next();
            String lastName = s.next();
            int zipCode = s.nextInt();
            
            arrayZips[i] = new PersonWithZip(firstName,lastName,zipCode);
        }
        
        for( PersonWithZip person : arrayZips )
        {
            System.out.println(person);
        }
        
        System.out.print("The following person has the least numbered zip code: ");
        
        PersonWithZip lowZipPerson = arrayZips[0];
        for (PersonWithZip person : arrayZips)
        {
            if (person.getZip() < lowZipPerson.getZip())
            {
                lowZipPerson = person;
            }
        }
        
        System.out.println(lowZipPerson);
        
        
    
    }
}
