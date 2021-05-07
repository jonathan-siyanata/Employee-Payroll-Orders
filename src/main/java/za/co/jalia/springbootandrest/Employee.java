package za.co.jalia.springbootandrest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
class Employee {

    private @Id @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private String role;
    private String emailAddress;

    Employee(){}

    Employee(String firstName, String lastName, String role, String emailAddress){

        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.emailAddress = emailAddress;
    }
    public String getName(){
        return this.firstName + " " + this.lastName;
    }
    public void setName(String name){
        String[] parts = name.split(" ");
        this.firstName = parts[0];
        this.lastName = parts[1];
    }
    public Long getId(){
        return this.id;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getRole(){
        return this.role;
    }
    public String getEmailAddress(){
        return this.emailAddress;
    }
    public void setId(Long id){
        this.id = id;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String LastName){
        this.lastName =  lastName;
    }
    public void setRole(String role){
        this.role = role;
    }
    @Override
    public boolean equals(Object o){
       if(this == o)
           return true;
       if(!(o instanceof Employee))
           return false;

       Employee employee = (Employee) o;
       return Objects.equals(this.id, employee.id) && Objects.equals(this.firstName, employee.firstName)
               && Objects.equals(this.lastName, employee.lastName)&& Objects.equals(this.role, employee.role)
               && Objects.equals(this.emailAddress, employee.emailAddress);
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.firstName, this.lastName, this.role, this.emailAddress);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + ", name='" + this.firstName + '\'' + ", lastName='" + this.lastName + '\''  + ", role='" + this.role + '\'' + ", emailAddress='" + this.emailAddress + '\'' +'}';
    }
}
