
package resturant.management;


public class Drinkitem extends Menuitem{
    String drinktype;
    String size;

    public Drinkitem(String drinktype, String size, int itemid, double itemprice, int quantity, String itemdescription) {
        super(itemid, itemprice, quantity, itemdescription);
        this.drinktype = drinktype;
        this.size = size;
    }
    
    public void display()
    {
        System.out.println("Drink type="+drinktype);
        System.out.println("Size="+size);
        super.display();
    }
    
}
