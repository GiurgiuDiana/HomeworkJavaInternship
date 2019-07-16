public class HomeworkStrings
{

    /*Create an empty StringBuffer
    * */

    public StringBuffer creat(String text)
    {
        StringBuffer sbuff= new StringBuffer( text);
        return  sbuff;
    }
    /*
    * Create a printDetails method,
    *  that takes a StringBuilder parameter,
    *  and prints the content,
    * length and capacity of the StringBuilder, all on a new line
    * */
    public void printDetails (StringBuilder param)
    {
        System.out.println("The stringBuilder is "+ param +" the length is "+ param.length()+" and the capacity is "+ param.capacity());
    }

    /*
    * Write a Java program to get the character at the given index within the String
     * */
    public char givenIndex(String str, int index)
    {
        char a= str.charAt(index);
        return a;
    }
    public boolean comparet2Chars(char a, char b)
    {
        if(a==b)
        {
            return true;
        }
        else return false;
    }

    public boolean compare2Strings(String a, String b)
    {
        if(a.length()!= b.length())
        {
            return false;
        }
        else
        {
           for(int i=0; i<a.length(); i++)
           {
               if(!comparet2Chars(a.charAt(i),b.charAt(i)))
               {
                   return false;
               }
           }
        }
        return true;
    }

    public boolean comparisonWithCompareToFunction(String a, String b)
    {}



}
