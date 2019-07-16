import java.util.InputMismatchException;
import java.util.Scanner;

public class Read {

    public int metodaTRATAT()
    {
        Scanner scr= new Scanner(System.in);
        int newInteger = 0;
        try
        {
            newInteger=scr.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("That's not an integer");

        }
        return newInteger;
    }

    public float metodaTRATATFLOAT()
    {
        Scanner scr= new Scanner(System.in);
        float newInteger = 0.f;
        try
        {
            newInteger=scr.nextFloat();
        } catch (InputMismatchException e) {
            System.err.println("That's not an integer");
        }
        return newInteger;
    }

    public Double metodaTRATATDouble()
    {
        Scanner scr= new Scanner(System.in);
        Double newInteger = 0.0;
        try
        {
            newInteger=scr.nextDouble();
        } catch (InputMismatchException e) {
            System.err.println("That's not an integer");
        }
        return newInteger;
    }

    public Long metodaTRATATLong()
    {
        Scanner scr= new Scanner(System.in);
        Long newInteger = null;
        try
        {
            newInteger=scr.nextLong();
        } catch (InputMismatchException e) {
            System.err.println("That's not an integer");
        }
        return newInteger;
    }

    public int[] arrayNr()
    {
        Scanner scr= new Scanner(System.in);
        int n=0;
        try
        {
            n=scr.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("That's not an integer");
        }
        int array[]= new int[n];

            int i=0;
            while(i<n)
            {
                try
                {

                array[i]=scr.nextInt();
                    i++;
                } catch (InputMismatchException e) {
                    e.printStackTrace();}


             }
        return array;

    }
}
