
package resturant.management;


public abstract class Employee {

int id;
String firstname;
String lastname;
String email;
Department department;
String position;
Address adress;
Efficiency efficiency;

    public Employee(int id, String firstname, String lastname, String email, Department department, String position, Address adress, Efficiency efficiency) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.department = department;
        this.position = position;
        this.adress = adress;
        this.efficiency = efficiency;
    }

public abstract void checkednotification();
public abstract void login();
public abstract void logout();
     
}
 

   
