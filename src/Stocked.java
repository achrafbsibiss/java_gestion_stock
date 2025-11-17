import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Stocked {
    final List<Product> products;

    public Stocked(){
        products = new ArrayList<>();
    }


    public void addProduct(Product p){
        products.add(p);
        System.out.println("The product has been added");
    }

    public void addProducts(List<Product> newProducts) {
        products.addAll(newProducts);
    }


    public void showProducts(){
        if (products.isEmpty())
            System.out.println("There is no products in the stock");


        for (Product p : products){
            System.out.println(p.toString());
        }
    }

    public void updateProduct(Product p){
        System.out.println("Update produce quantity");
        Scanner sn = new Scanner(System.in);
        int quantity = sn.nextInt();
        p.setQuantity(quantity);
    }

    public void removeProduct(Product p) {
        if (products.contains(p)) {
            products.remove(p);
        }else{
            System.out.println("Product not found");
        }
    }
}