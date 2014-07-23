
package people;
import java.util.*;

public class Employee extends Person{
   private double salary;
   public Employee(String name, String birthday, double salary){
	  super(name, birthday);
	  salary = salary;
	}
   public double getSalary(){
      return salary;
   }
   public String toString(){
      return (super.toString() + "\t" + salary);
   }
}