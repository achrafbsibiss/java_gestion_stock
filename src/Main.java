import java.util.Scanner;

public class Main {
    public void menu(){
        Scanner input = new Scanner(System.in);
        Stocked S1 = new Stocked();

        System.out.println("Enter the number for the action you one to make:\n" +
                "1- Creat product\n"+
                "2- list product\n" +
                "3- update quantity for product\n"+
                "4- Remove producte \n"+
                "5- Exit");

        switch(input.nextLine()){
            case 1:
                S1.createProduct();

        }
    }
    public static void main(String[] args) {
        Product p1 = new Product(1,"to", 12, 100,"eat");

        Stocked s1 = new Stocked();

        s1.addProduct(p1);
        s1.addProduct(p1);
        s1.addProduct(p1);


        s1.showProducts();


    }
}
