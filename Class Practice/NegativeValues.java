public class NegativeValues
{
    int[] values=new int [10];
    int currentSize=0;
    public void insertElement( int val )
    {
        if (currentSize < values.length)
        {
             values[currentSize] = val;
             currentSize++;

        }
    }
    
    public void removeElementAtIndex(int index)
    {
        values[index] = values[currentSize - 1];
        currentSize--;
    }
    
    public String toString()
    {
        String str = insertVal;
        return str;
    }
    
    public static void main(String [] args)
    {   int []values = new int[10];
        NegativeValues insertVal = new NegativeValues();
        int val=-5;
        for(int i=0; i<values.length; i++)
        {
            insertVal.insertElement(val); 
            val++;
        }
        
        System.out.print("Original: " + insertVal.toString());
        int indexVal=0;
        for(int i=0; i<values.length; i++)
        {
            insertVal.removeElementAtIndex(indexVal);            
        }
        System.out.println("New: "+ insertVal);
        
    }
}
