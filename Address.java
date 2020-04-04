
package resturant.management;

public class Address {
    
    String streetname;
    String streetnum;
    String zipcode;
    Region region;
    String town;

    public Address(String streetname, String streetnum, String zipcode, Region region, String town) {
        this.streetname = streetname;
        this.streetnum = streetnum;
        this.zipcode = zipcode;
        this.region = region;
        this.town = town;
    }
    
}
