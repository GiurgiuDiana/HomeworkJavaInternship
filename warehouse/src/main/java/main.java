import Products.Product;

import java.util.ArrayList;

public class main {
    public static void main(String[] args)
    {
        Warehouse wh= new Warehouse();

        for(Product p:wh.getWareH())
        {
            System.out.println(p.toString());
        }

    }
}
