/*Create a class Item with:

Fields: itemName, quantity, pricePerUnit

Constructor to initialize fields

Method getTotalValue() that returns total value of the item in stock

In main(), create an Item object, call getTotalValue() and display it.

 */
class Item{
    String itemName;
    int quantity;
    double pricePerUnit;

    Item(String i,int q,double pp){
        this.itemName=i;
        this.pricePerUnit=pp;
        this.quantity=q;
    }

    double getTotalValue(){
        return quantity*pricePerUnit;
    }
}

 public class InventorySystem {
    public static void main(String [] args){
        Item i=new Item("beeds", 20, 89.9);
        i.getTotalValue();
        System.out.println("The total value is "+i.getTotalValue());
    }
}
