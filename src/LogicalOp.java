import java.sql.SQLOutput;

public class LogicalOp {
    public int checkBiggerNumber(int a, int b) {
        if (a > b)
            return a;
        else return b;
    }

    public String checkIfEqualsText(String text) {

        if (text.equals("FastTrackIT")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    /*    5. Creati o metoda de tip String, care sa primeasca un parametru de tip String,
     si un parametru de tip int.
     Daca textul primit ca si parametru este egal cu “FastTrackIT”,
      si numarul primit ca si parametru este mai mic sau egal cu 3,
      returnati textul si numarul, in ordinea asta.
       Daca textul nu este “FastTrackIT” si numarul este mai mare sau egal cu 4,
        returnati numarul si textul,
        in ordinea asta. Apelati metoda in main() pentru a verifica daca functioneaza.
     */
    public String checkTextAndNumber(String text, int number) {
        if (text.equals("FastTrackIT") && number <= 3) {
            String result = text.concat(Integer.toString(number));
            return result;
        } else if ((!text.equals("FastTrackIT")) && number >= 4) {
            String result = Integer.toString(number).concat(text);
            return result;
        } else {
            return "Neither choice";
        }
    }

    /*6. Creati o metoda de tip String, care sa primeasca un parametru de tip int.
    Daca numarul primit este mai mare de 8, SAU egal cu 6,
    atunci sa se returneze “The amount of snow this winter was(cm): “ si numarul.
     Daca nu, sa printeze “The forecast snow is(cm):” si numarul.
    Apelati metoda in main() pentru a verifica daca functioneaza.*/
    public String ammountOfSnow(int number) {
        if (number > 8 || number == 6) {
            String result = "The amount of snow this winter was(cm): " + number;
            return result;
        } else {
            String result = "The forecast snow is(cm): " + number;
            return result;
        }
    }

    /*7. Creati o metoda de tip String, care sa primeasca un parametru de tip numar.
    Daca numarul e mai mare decat 3, SI nu egal cu 4, returnati “The number is greater than 3 and not equal to 4”.
    Daca numarul este egal cu 4, returnati “The number is equal to 4”, iar daca numarul este mai mic de 3 returnati “The number is lower than 3”.
    Apelati metoda in main() pentru a verifica daca functioneaza.*/
    public String compareTo3And4(double number) {
        if (number > 3 && (number != 4)) {
            return "The number is greater than 3 and not equal to 4";
        } else if (number == 4) {
            return "The number is equal to 4";
        } else// if(number<3)
        {
            return "The number is lower than 3";
        }
        // else
        //  {
        //      return "The numerb is between 3 and 4";
        //   }
    }


    public String compareTo3And4Second(int number) {
        if (number > 3 && (number != 4)) {
            return "The number is greater than 3 and not equal to 4";
        } else if (number == 4) {
            return "The number is equal to 4";
        } else {
            return "The number is lower than 3";
        }
    }
    /*
     * 8. Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit.
     *  Folosind constructia Switch-Case, verificati ce numar s-a primit si afisati textul
     *  "The number is:  x !" unde x trebuie sa reprezinte numarul apasat.
     *  Pentru exemplul de fata sa nu se foloseasca concatenarea stringului
     * "The number is:" cu numarul de la parametru,
     *  ci sa se scrie intreg textul cu tot cu numar pentru fiecare caz din Switch-Case.
     *  Apelati metoda in main() pentru a verifica daca functioneaza.
     * */

    public void switchCase(int number) {
        switch (number) {
            case 0:
                System.out.println("The number is 0");
                break;
            case 2:
                System.out.println("The number is 2");
                break;
            case 4:
                System.out.println("The number is 4");
                break;
            case 5:
                System.out.println("The number is 5");
                break;
            case 12:
                System.out.println("The number is 12");
                break;
            default:
                System.out.println("Some other number");
                break;
        }

    }

    /*9. Creati o metoda care sa se numeasca isNumberEven.
     Metoda trebuie sa primeasca ca parametru un numar, si sa returneze adevarat sau fals.
     Daca numarul e par sa returneze true iar daca e impar sa returnese false.
     Apelati metoda in main() pentru a verifica daca functioneaza.
    *
    *
    * */
    public boolean isNumberEven(int nr) {
        if (nr % 2 == 0) return true;
        else return false;
    }

    /*\
     * 10. Creati o metoda care sa se numeasca isEligibleToVote.
     * Metoda sa primeasca ca si parametru un numar, care sa reprezinte varsta, iar metoda sa iti zica daca daca persoana are drept de vot.
     *  Daca varsta e peste 18, sa se returneze true iar daca nu, sa returneze false.
     * Apelati metoda in main() pentru a verifica daca functioneaza.
     * */
    public boolean isEligibleToVote(int nr) {
        if (nr >= 18) return true;
        else return false;
    }

    /*
     * 11. Creati o metoda care sa primeasca 3 numere ca si parametrii si sa returneze cel mai mare numar.
     * Apelati metoda in main() pentru a verifica daca functioneaza.
     * */

    public int greater(int a, int b, int c) {
        if (a > c) {
            if (a > b)
                return a;
            else
                return b;
        } else if (b > c) {
            if (b > a) return b;
            else return a;
        } else return c;
    }

    public int returnGreatest(int a, int b, int c) {
        if ((a > b && b > c) || (a > b && a > c)) {
            return a;
        } else if ((b > a && a > c) || (b > a && b > c)) {
            return b;
        } else if ((c > a && c > b) || (c > a && a > b)) {
            return c;
        } else return 0;

    }


    //Java for loops 1.
    public void countTo(int nr) {
        if (nr < 100) {
            System.out.println("Start counting");
            for (int i = nr; i <= 100; i++) {
                System.out.println(i);
            }
        }
    }

    ////java for loops 2.
    public void countToNegative(int nr) {
        if (nr > -100) {
            System.out.println("Start counting");
            for (int i = nr; i >= -100; i--) {
                System.out.println(i);
            }
        }
    }

    public void countToBetween3(int x, int y) {
        if (x < y) {
            System.out.println("Start counting");
            for (int i = x; i <= y; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Start counting");
            for (int i = x; i <= y; i--) {
                System.out.println(i);
            }
        }

    }
    ////java for loops 4
    public void countToBetween(int x, int y) {
        if (x < y) {
            System.out.println("Start counting");
            for (int i = x; i <= y; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Start counting");
            for (int i = y; i <= x; i++) {
                System.out.println(i);
            }
        }

    }

    ///java for loops 5
    public void printEven() {
        System.out.println("Print even from 1 to 100");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    ///java for loops 6
    public void printNotEven() {
        System.out.println("Print uneven from 1 to 100");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    ////for loops 7
    public int sumToHundreds(int nr) {
        int sum = 0;
        for (int i = nr; i < 100; i++) {
            sum = sum + i;
        }
        return sum;
    }

    ///for loops ex 8
    public double averageToHundreds(int nr) {
        int sum = 0;
        for (int i = nr; i < 100; i++) {
            sum = sum + i;
        }
        double avg = (double) sum / (100 - nr);
        return avg;
    }

    ///for loops drqawing starsss.....
    public void drawStars(int nrL, int nrC) {
        for (int i = nrL; i > 0; i--) {
            for (int j = nrC; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();///SPatiuliber trecem la un rand nou de fiecare data cand terminam de scris un rand de stele
            nrC--;///Decrementam variabila care ne da nr de coloane de stele  de pe o linie
        }
    }

    /*
     * 1. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
     * Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru.
     * Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
     * */
    public void countToWhileLoop(int nr) {
        if (nr < 100) {
            int c = nr;
            System.out.println("Start c0unting to 100 from " + nr);
            while (c < 100) {
                System.out.println(c);
                c++;
            }
        }
    }

    /*
     * 2. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
     * Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru.
     *  Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
     * */
    public void countToNegativeWhileLoop(int nr)
    {
        if(nr>-100)
        {
            int c=nr;
            System.out.println("Start counting to -100 from " + nr);
            while (c > -100) {
                System.out.println(c);
                c--;
            }
        }
    }

    /*
    *3.Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
    * Metoda sa afiseze o numaratoare intre cele doua numere primite,
    *  pornind de la primul parametru primit, pana la cel de-al doilea
    * (ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.
    * */
    public void countBetweenNumbers(int x, int y)
    {

        if(x>y)
        {
            System.out.println("START COUNTING to :" +x+"from"+y);
            while(x>y)
            {
                System.out.println(y);
                y++;
            }
        }
        else
        {
            System.out.println("START COUNTING from :" +y+"to"+x);
            while(x<y)
            {
                System.out.println(y);
                y--;
            }
        }
    }

    /*
    *4. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
    * Metoda trebuie sa verifice care dintre cele doua numere este mai mare,
    * si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
    * (ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).
    * */
    public void countBetweenNumbers4(int x, int y)
    {

        if(x>y)
        {
            System.out.println("START COUNTING to :" +x+"from"+y);
            while(x>y)
            {
                System.out.println(y);
                y++;
            }
        }
        else
        {
            System.out.println("START COUNTING from :" +x+"to"+y);
            while(y>x)
            {
                System.out.println(x);
                x++;
            }
        }
    }


    /*
    *5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
    * */
    public void countTo100Even()
    {
        System.out.println("Even numbers with while loop");
        int i=0;
        while(i<=100)
        {
            if(i%2==0) System.out.println(i);
            i++;
        }
    }

    /*
    *6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
     * */
    public void countTo100UnEven()
    {
        System.out.println("NotEven numbers with while loop");
        int i=0;
        while(i<=100)
        {
            if(i%2!=0) System.out.println(i);
            i++;
        }
    }
    /*
    *7. Creati o metoda care sa adune toate numerele din intervalul 111 si 8899.
    * Sa se afiseze suma totala, iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval.
    * Introduceti o variabila int count in metoda, pentru a numara toate numerele din interval.
    * Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
    * */
    public void countInterval()
    {
        int nr=111;
        double sum=0;
        int countNumbers=0;
        while(nr<8899)
        {
            sum=sum+nr;
            countNumbers++;
            nr++;
        }
        System.out.println("Suma totala :"+sum);
        System.out.println("Media este : "+ sum/countNumbers);
    }
    /*
    * 8. Creati o metoda care sa primeasca doi parametrii de tip numar, si sa returneze media numerelor divizibile cu 7, din acel interval.
    * Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
     * */
    public double mediaDiv7(int nr1, int nr2)
    {
        int media = 0;
        int count=0;
        if (nr1 > nr2)
        {
            while(nr1>nr2)
            {
                if(nr2%7==0)
                {
                    media=media+nr2;
                    count++;
                }
                nr2++;
            }
            return (double)media/count;
        }
        else
        {
            while(nr1<nr2)
            {
                if(nr1%7==0)
                {
                    media=media+nr1;
                    count++;
                }
                nr1++;
            }
            return (double)media/count;
        }

    }

    /*
    * 9. Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.
     * */
    public void fibonacci(int nr1, int nr2, int count)
    {

        int var= nr1+nr2;
        System.out.println(var);
        if(count<20){fibonacci(var, nr1,++count);}
    }

    //10. Creati o metoda numita CozaLozaWoza.
    public void CozaLozaWoza()
    {
        int i=1;
        while(i<=110)
        {
            if(i==12 || i==23 || i==34 || i==45 || i==56 ||i==67|| i==78 || i==89 || i== 100 )
            {System.out.println(" ");}
            if (i % 3 == 0 && i % 7 == 0 && i % 5 == 0) {
                System.out.print(" CozaLozaWoza ");


            } else if (i % 5 == 0 && i % 7 == 0) {
                System.out.print(" WozaLoza ");


            } else if (i % 7 == 0 && i % 3 == 0) {
                System.out.print(" CozaWoza ");


            } else if (i % 5 == 0 && i % 3 == 0) {
                System.out.print(" CozaLoza ");


            } else if (i % 3 == 0) {
                System.out.print(" Coza ");


            } else if (i % 5 == 0) {
                System.out.print(" Loza  ");

            } else if (i % 7 == 0) {
                System.out.print(" Woza   ");


            } else {
                System.out.print(" " + i);

            }
            i++;
        }


    }


}
