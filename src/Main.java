import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Main {

    public static void printNameOnScreen() {
        System.out.println("Hello,\nDiana Giurgiu");
    }

    public static int sumOfTwoNumbers(int a, int b) {
        return a + b;
    }

    public static float divisionOfTwoNumbers(int a, int b) {
        return (float) a / (float) b;
    }

    public static float multiplyTwoNumbers(int a, int b) {
        return (float) a * b;
    }

    public static int subbTwoNumbers(int a, int b) {
        return a - b;
    }


    public static void resultOfOperations() {
        int var = -5 + 8 * 6;
        System.out.println(var);
        float var2 = (55 + 9) % 9;
        System.out.println(var2);
        float var3 = 20 + -3 * 5 / 8;
        System.out.println(var3);
        float var4 = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(var4);
    }
//3. Scrieti o metoda java, care sa afiseze urmatorul model:
    public static void displayPatternJava() {
        System.out.println("   J    a    V       V  a");
        System.out.println("   J   a a    V     V  a  a");
        System.out.println("J  J  aaaaa    V   V  aaaaaaa");
        System.out.println(" JJ  a      a    V   a       a");
    }
//5.Scrieti o metoda java, care sa afiseze urmatorul model:
    public static void displayPatternHead()
    {
        System.out.println("  +'''''+");
        System.out.println("[ | o o | ]");
        System.out.println("  |  ^  |  ");
        System.out.println("  | '_' |  ");
        System.out.println("  +-----+  ");

    }

//4.Scrieti o metoda java, care sa primeasca 3 parametrii de tip numar, si sa returneze media numerelor.
    public static float average()
    {
        Scanner in= new Scanner(System.in);
        int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();
        float avg=(a+b+c)/3;

        //in.close();

        return avg;
    }
//6.Scrieti o metoda java, care sa returneze restul impartirii a doua numere
    public static float restNumar()
    {
        Scanner in= new Scanner(System.in);
        int a= in.nextInt();
        int b= in.nextInt();
       // in.close();
        return a%b;
    }
//7.Fahrenheite to celsius
    public static float toCelsius()
    {
        Scanner in= new Scanner(System.in);
        float farh=in.nextFloat();
       // in.close();
        return 5/9*(farh-32);
    }
//8. from inch to meters
    public static double toMeters()
    {
        Scanner in= new Scanner(System.in);
        double inch=in.nextDouble();
      //  in.close();
        return inch*0.0254;
    }
//9. ceva cu fizica si distanta
    public static void distanta()
    {
        Scanner in= new Scanner(System.in);
        int distanta= in.nextInt();
        int ora= in.nextInt();
        int minute=in.nextInt();
        int secunde= in.nextInt();
    //    in.close();
        int calculateTimeInSec= ora*3600+minute*60+secunde;
        int calculateTimeInMin= ora*60+ minute+ secunde/60;
        int calculateTimeInHours=ora+minute/60+secunde/3600;
        double vitezaMetriiSec=(double)distanta/calculateTimeInSec;
        double distanceKm= (double)distanta/1000;
        double kmPerOra=distanceKm/calculateTimeInHours;
        double milaPerOra=kmPerOra/1609;
        System.out.println("VITEZA IN :"+"metrii/sec"+vitezaMetriiSec+"\n km/ora: "+kmPerOra + "\n mila/ora"+milaPerOra);

    }


    public static void main(String[] args)
    {
        //1.
        System.out.println("Hello,\nDiana Giurgiu");
        //2.
        int sum=0;
        int a=56,b=34;
        sum=a+b;
        System.out.println(sum);
        //3.
        float divide= (float)a/(float)b;
        System.out.println(divide);
        //4.
        System.out.println(-5+8*6);
        System.out.println((float)((55+9)%9));
        System.out.println((float)(20+ -3*5/8));
        System.out.println((float)(5+15/3*2-8%3));
        /////Same exercises using methods
        printNameOnScreen();
        //sumOfTwoNumbers(a,b);
       // divisionOfTwoNumbers(a, b);
        resultOfOperations();
        ///exercise2 with variables
        System.out.println(a+"-"+ b +"="+subbTwoNumbers(a,b));
        System.out.println(a+"+"+ b +"="+sumOfTwoNumbers(a,b));
        System.out.println(a+"*"+ b +"="+multiplyTwoNumbers(a,b));
        System.out.println(a+"/"+ b +"="+divisionOfTwoNumbers(a,b));
        ///Exercise 2 with input no from console
        displayPatternJava();
      //  System.out.println(average());
        //displayPatternHead();
       // System.out.println("Restul a 2 nr este "+ restNumar());
        //Citeste un nr in float
       // System.out.println("Temperatura in celsius este"+toCelsius());
        //Citeste un nr in doyuble
       // System.out.println("Distanta in metri este "+ toMeters());

        Scanner in= new Scanner(System.in);
      //  int nr1= in.nextInt();
      //  int nr2= in.nextInt();
        /////Testare calculator

        /*
        Calculator calc= new Calculator();
        System.out.println("Impartirea nr " +nr1+" si  " +nr2 +" este "+calc.divisionOfTwoNumbers(nr1,nr2));
        System.out.println("Inmultire "+calc.multiplyTwoNumbers(nr1,nr2));
        System.out.println("Scadere "+calc.subbTwoNumbers(nr1,nr2));
        System.out.println("Suma " +calc.sumOfTwoNumbers(nr1,nr2));

        LogicalOp log= new LogicalOp();
        int biggest = log.checkBiggerNumber(nr1,nr2);
        System.out.println("The bigger number is: " + biggest);

       // boolean ok=true;
      //  while(ok)
       // {
            String scan= in.next();
            System.out.println(log.checkIfEqualsText(scan));
       // }

        */
        /*
        boolean ok= true;
        LogicalOp operations= new LogicalOp();
        while(ok) {
            String text = in.next();
            int number = in.nextInt();
            System.out.println(operations.checkTextAndNumber(text, number));
        }


*/
        boolean ok= true;
        LogicalOp operations= new LogicalOp();
       // while(ok) {
     //   int number= in.nextInt();
       //     System.out.println(operations.ammountOfSnow( number));
      //  }
       /* while(ok)
        {
            //double dl=in.nextDouble();
           // System.out.println(operations.compareTo3And4(dl));
            int intew=in.nextInt();
            System.out.println("is elibile to vote :"+operations.isEligibleToVote(intew));
            operations.switchCase(intew);
            System.out.println("is number even :"+operations.isNumberEven(intew));
            System.out.println(operations.returnGreatest(a,b,intew));
        }
        */
        operations.countTo(25);
        operations.countToNegative(-36);
        operations.countToBetween(25,36);
        operations.countToBetween(54,36);
        operations.printEven();
        operations.printNotEven();
        System.out.println(operations.sumToHundreds(25));
        System.out.println(operations.averageToHundreds(25));
        operations.drawStars(7,7);
        operations.countToWhileLoop(25);
        operations.countToNegativeWhileLoop(-55);
        operations.countTo100Even();
        operations.countBetweenNumbers(25,36);
        operations.countBetweenNumbers4(54,36);
        operations.countTo100UnEven();
        operations.countInterval();
        System.out.println("media nr divizibile cu 7 din 111 pana la 8899 este :"+ operations.mediaDiv7(25,59));
        operations.fibonacci(0,1,2);
        operations.CozaLozaWoza();
    }


}
