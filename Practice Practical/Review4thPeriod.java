import java.util.ArrayList;
import java.util.Scanner;

public class Review4thPeriod
{
    public static void main( String[] args )
    {
       //
        // do-while loop
        //
        
        Scanner in = new Scanner( System.in );
        int value;
        
        do
        {
            System.out.print( "Enter a positive number or -1 to quit: " );
            value = in.nextInt();
        }
        while( value != -1 );

    }
}

