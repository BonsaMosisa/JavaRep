class product{
    private String itemN;
    private String name;
    private double price;
    private int quantity;
    public product(String itemNo){
        itemN=itemNo;
    }
    public product(String itemNo,String name){
        itemN=itemNo;
        this.name=name;
    }
    public product(String itemNo,String name,double price,short quantity){
    itemN=itemNo;
    this.name=name;
    setPrice(price);
    setQuantity(quantity);
    }
    public String getItemN(){
        return  itemN;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }

    public void setPrice(double price)
    {
        this.price=price;
    }
    public void setQuantity(short quantity)
    {
        this.quantity=quantity;
    }
}
public class ProductCustomer  {
}
