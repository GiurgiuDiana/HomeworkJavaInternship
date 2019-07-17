import Products.Fruits;
import Products.Product;
import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Warehouse {

    private ArrayList<Product>wareH= new ArrayList<Product>();
    private ArrayList<String>fruitList= new ArrayList<String>();
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

    private void fruitName()
    {
        fruitList.add("Apples");
        fruitList.add("Peaches");
        fruitList.add("Oranges");
    }

    private void vegetableName()
    {
        vegetableList.add("Apples");
        vegetableList.add("Peaches");
        vegetableList.add("Oranges");
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
        fruitName();
    }

    private void createProducts(int howManyFruitsWeCreate)
    {
        int count=0;
        for (int i=0; i< howManyFruitsWeCreate; i++)
        {
           Product p ;
           ////hardcodez 1-> fruct 2-> leguma, 3-> others
            int rand= randomNumberGenerator.nextInt();

        }


    }
    private void createProdutcs()
    {

    }

}
