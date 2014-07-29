
import people.*;

public class Manager extends Employee{
	private Employee Assitant;
	
	public Manager(String name, Date birthday, double salary){
		super(name, birthday, salary);
		}
	public void setAssistant(Employee Ass){
		Assitant = Ass;
		}
	public String toString(){
		return (super.toString() + Assitant);
		}
}	