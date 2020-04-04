
package resturant.management;


public class Manager extends Employee {
    
    String branchno;
    String branchname;
    String corporatereport;

    public Manager(String branchno, String branchname, String corporatereport, int id, String firstname, String lastname, String email, Department department, String position, Address adress, Efficiency efficiency) {
        super(id, firstname, lastname, email, department, position, adress, efficiency);
        this.branchno = branchno;
        this.branchname = branchname;
        this.corporatereport = corporatereport;
    }
    
    public void reporttocorporate()
    {
        
    }
    public void hireemployee()
    {
        
    }
    public void fireemployee()
    {
        
    }
    public void checkstock()
    {
        
    }
    public void editstock()
    {
        
    }
    public void editmenu()
    {
        
    }
    public void checkefficiency()
    {
        
    }
    public void cngststus()
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
