
package resturant.management;


public class Chefs extends Employee {

    String speciality;
    boolean occupied;
    String currentorder;

    public Chefs(String speciality, boolean occupied, String currentorder, int id, String firstname, String lastname, String email, Department department, String position, Address adress, Efficiency efficiency) {
        super(id, firstname, lastname, email, department, position, adress, efficiency);
        this.speciality = speciality;
        this.occupied = occupied;
        this.currentorder = currentorder;
    }
    
    public void acceptorder()
    {
        
    }
    public void processorder()
    {
        
    }
    public void finishorder()
    {
        
    }

    @Override
    public void checkednotification() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void login() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void logout() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
    
    
}
