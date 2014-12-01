
public class ArrayOperations
{
   private int[] values;

    public ArrayAlgorithms()
    {
        values = new int[10];
    }
    
    public String toString()
    {
        String str = "[";
        
        for (int val : values)
        {
            System.out.print( val + ", " );
        }
        
        str += " ] ";
        return str;
    }
    
}
