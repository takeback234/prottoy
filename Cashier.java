
package resturant.management;

public class Cashier extends Employee {
    
    int terminalno;
    int sesssionno;
    Order order;

    public Cashier(int terminalno, int sesssionno, int id, String firstname, String lastname, String email, Department department, String position, Address adress, Efficiency efficiency) {
        super(id, firstname, lastname, email, department, position, adress, efficiency);
        this.terminalno = terminalno;
        this.sesssionno = sesssionno;
    }
    
    public void takeorder()
    {
        
    }
    public void terminateorder()
    {
        
    }
    public void checkinorder()
    {
        
    }
    public void finishorder()
    {
        
    }
    public void returnexcng()
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
