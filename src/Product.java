public class Product {
    private int id;
    private String name;
    private double price;
    private String type;
    private int quantity;

    public Product(int id, String name, double price, int quantity ,String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.quantity = quantity;
    }


    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        if( name == null || name.isEmpty()){
            System.out.println("name can't not be empty");
        }else{
            this.name = name;
        }
    }

    public double getPrice(){
        return this.price;
    }


    public void setPrice(double price){
        if ( price < 0){
            System.out.println("price can't not be negative");
        }else {
            this.price = price;
        }
    }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setQuantity(int quantity){
        if ( quantity < 0){
            System.out.println("quantity can't not be negative");
        }else {
            this.quantity = quantity;
        }
    }

    @Override
    public String toString(){
        return "this the product is id:" + getId()+ " name: " + getName() + " price: " + getPrice() + " the quantity: "+ getQuantity() +" type: " + getType();
    }
}
