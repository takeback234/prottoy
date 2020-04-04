
package resturant.management;


public class waiter extends Employee {

int floorno;
boolean currentlyserving;
int digitizerno;

    public waiter(int floorno, boolean currentlyserving,int digitizerno, int id, String firstname, String lastname, String email, Department department, String position, Address adress, Efficiency efficiency) {
        super(id, firstname, lastname, email, department, position, adress, efficiency);
        this.floorno = floorno;
        this.currentlyserving = currentlyserving;
        this.digitizerno=digitizerno;
    }

public void deliverfood()
{
    
}

public void submitdigitizer()
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
  