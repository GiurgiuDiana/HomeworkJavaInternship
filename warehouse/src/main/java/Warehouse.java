import MU.Bag;
import MU.Box;
import MU.Kilograms;
import MU.MeasurableUnit;
import MU.Package;
import Products.Fruits;
import Products.Others;
import Products.Product;
import Products.Vegetables;

import java.time.LocalDate;
import java.util.*;

public class Warehouse {

    private ArrayList<Product>wareH= new ArrayList<Product>();
    private ArrayList<String>fruitList= new ArrayList<String>();
    private HashMap<String, Integer> fruits= new HashMap<String, Integer>();
    private ArrayList<String>vegetableList= new ArrayList<String>();

    private Random randomNumberGenerator= new Random();
    private void addProduct(Product p)
    {
        wareH.add(p);
    }

    private boolean deleteProduct(Product p)
    {
        return wareH.remove(p);
    }


    public ArrayList<Product> getWareH() {
        return wareH;
    }

    public void setWareH(ArrayList<Product> wareH) {
        this.wareH = wareH;
    }

    private void fruitInit()
    {
        fruitList.add("Apples");
        fruitList.add("Peaches");
        fruitList.add("Oranges");
        fruits.put("Apples",6);
        fruits.put("Peaches",30);
        fruits.put("Oranges",13);
    }

    private void vegetableName()
    {
        vegetableList.add("Onions");
        vegetableList.add("Potatoes");
}

    public ArrayList<String> getFruitList() {
        return fruitList;
    }

    public void setFruitList(ArrayList<String> fruitList) {
        this.fruitList = fruitList;
    }

    public ArrayList<String> getVegetableList() {
        return vegetableList;
    }

    public void setVegetableList(ArrayList<String> vegetableList) {
        this.vegetableList = vegetableList;
    }
    public Warehouse()
    {
        vegetableName();
        fruitInit();
        createProducts(200);
    }

    private void createProducts(int howManyFruitsWeCreate)
    {
        int count=0;
        for (int i=0; i< howManyFruitsWeCreate; i++) {
            Product p;
            ////hardcodez 1-> fruct 2-> leguma, 3-> others
            int rand = randBetween(1,3);
            if (rand  == 1)
            {
                LocalDate randomDate = createRandomDate(2018, 2019);
                LocalDate expiDate= randomDate.plusWeeks(6);
                int rand2= randBetween(1,3);
                if(rand2==1)
                {
                    MeasurableUnit mu= new Kilograms("Kg",0);
                    p=new Fruits("Apples",6,expiDate,randomDate,mu,250);

                }
                else if(rand2==2)
                {
                    MeasurableUnit mu= new Box("Box",6);
                    p=new Fruits("Peaches",30,expiDate,randomDate,mu,250);
                }
                else
                {
                    MeasurableUnit mu= new Bag("Bag",2);
                    p=new Fruits("Oranges",13,expiDate,randomDate,mu,250);
                }
            }
            else if(rand==2)
            {
                LocalDate randomDate = createRandomDate(2018, 2019);
                LocalDate expiDate= randomDate.plusWeeks(6);
                int rand2= randBetween(1,2);
                if(rand2==1)
                {
                    MeasurableUnit mu= new Bag("Bag",10);
                    p=new Vegetables("Potatoes",15,expiDate,randomDate,mu,15,"Produc");

                }
                else
                {
                    MeasurableUnit mu= new Bag("Bag",4);
                    p=new Vegetables("Onions",2,expiDate,randomDate,mu,2,"Produceer");
                }
            }
            else
            {
                LocalDate randomDate = createRandomDate(2018, 2019);
                LocalDate expiDate= randomDate.plusWeeks(6);
                MeasurableUnit mu= new Package("Pack");
                p=new Others("Crackers",2,randomDate,expiDate,mu);
            }
            wareH.add(p);
            }

        }


    public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }
    public static LocalDate createRandomDate(int startYear, int endYear) {
        int day = randBetween(1, 28);
        int month = randBetween(1, 12);
        int year = randBetween(startYear, endYear);
        return LocalDate.of(year, month, day);

    }

}
