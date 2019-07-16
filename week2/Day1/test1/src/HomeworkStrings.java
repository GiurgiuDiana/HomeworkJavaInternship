import java.util.ArrayList;

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
/*
* Write a java program to compare two strings lexicographically, ignoring case differences

 * */
    public boolean compare2StringsIgnoringCasses(String s1, String s2)
    {
        String a=s1.toLowerCase();
        String b=s2.toLowerCase();
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

    /*
    * Write a Java program to concatenate a given string to the end of another string

     * */
    public void concat2Strings(String s1, String s2)
    {
       // s1.concat(s2);
        ///sau
         s1=s1+s2;
        System.out.println("Stringurile concatenate sunt "+s1);
    }

    /*
    * Write a Java program to test if a given string contains the specified sequence of char values
     * */
    //// is lexicographically, does not  ignore case differences
    public boolean testSpecificChars(String str, String specificCharacters)
    {
        boolean ok=false;
        if(specificCharacters.length()>str.length())
        {
            return false;
        }
        else if(specificCharacters.length()==str.length())
        {
            return compare2Strings(str,specificCharacters);///daca au aceeasi lungime-> inseamn ca cele 2 str trebuie sa fie egale

        }
        else
            {

            for (int i = 0; i < str.length(); i++)
            {
                if(str.charAt(i)==specificCharacters.charAt(0)) {
                    ///gasim primul caracter
                    for (int j = 1; j < specificCharacters.length(); j++)
                    {
                        if ((str.charAt(i + j) == specificCharacters.charAt(j)))
                        {
                            ok=true;
                        }
                        else
                        {ok=false;break;}
                    }

                }
            }

        }
        if(ok){return true;}
        else {return false;}
    }
/**
 *
 * Write a Java program to compare a given string to the specified string buffer
 *
 */

public boolean testSpecificStringBuffer(String str, StringBuffer specific)
{
  StringBuffer stringB=new StringBuffer(str);
  return str.contentEquals(specific);
}

/**
 *Write a Java program to check whether a given string ends with the contents of another string
 */
public boolean endsWithSpecificString(String str, String str2)
{
    if(str.length()== str2.length())
    {
        return compare2Strings(str,str2);
    }
    else if(str.length()> str2.length())
    {
        return false;
    }
    else
    {
       return str.endsWith(str2);
    }
}

/*Write a Java program to convert all the characters in a string to lowercase
 * */
    public String convertLowercase(String str)
    {
        return str.toLowerCase();
    }

    public String convertUpperCase(String str)
    {
        return str.toUpperCase();
    }
    public String trimString(String str)
    {
        return str.trim();
    }
    /*Write a Java program to divide a string in n equal parts
     * */
    public String[] dividingString(String str, int n)
    {
        String[] st= new String[n];
        int ch= str.length()/n;///number of characters to be in each string
        if(str.length()%n !=0)
        {
            return null;
        }
        else
        {
            int c=0;
            for (int i = 0; i < str.length(); i=i+ch)
            {
                st[c]=str.substring(i,i+ch);
                c++;
            }
        }
        return st;
    }

    public String removeSomeLetters(String str)
    {
       String st= str.replaceAll("b","");
        String end=st.replaceAll("ac","");
     return end;
    }

    /*
    Write a Java program that takes a phone number
     (eg: 0740123456) and then it returns it formatted: (0740)-123-456
    * */
    public String designPN(String nr)
    {
        String newStr="(";
        if(nr.length()!=10){return null;}
        else
        {
            newStr=newStr+nr.substring(0,4)+")-";
          //  System.out.println("phase 1 "+ newStr);
            newStr=newStr+nr.substring(4,7)+"-";
          //  System.out.println("phase 2 "+ newStr);
            newStr=newStr+nr.substring(7,10);
           // System.out.println("phase 3 "+ newStr);
        }
        return newStr;

    }







}
