# Kachalochka
Chees памаги аааааа нипанимаю)
package helloapp;
// знаю что херь полная но пыпытка не пытка)
public class Program{
public static void main(String[] args){ 
	
	Employee sam = new Employee("Igor", "Iron Gym");
    sam.display();
    Client bob = new Client("Sasha", "Iron Gym");
    bob.display();
}
}
abstract class Person {
 
private String name;
 
public String getName() { return name; }

public Person(String name){
 
    this.name=name;
}

public abstract void display();
}
class Employee extends Person{
	 
    String Gym;
     
    public Employee(String name, String company) {
     
        super(name);
        this.Gym = company;
    }
     
    public void display(){
         
        System.out.printf("Employee Name: %s \t Gym: %s \n", super.getName(), Gym);
    }
}
 
class Client extends Person
{
     String Gym;
     
    public Client(String name, String company) {
     
        super(name);
        this.Gym = company;
    }
     
    public void display(){
         
        System.out.printf("Client Name: %s \t Gym: %s \n", super.getName(), Gym);
    }
}

// класс тренажеров
class equipment{
	  
    String name;
    Type eqType;
    
  
    equipment(String name, Type type){
          
    	eqType = type;
        this.name = name;
        
    }
}
  
enum Type
{
	Weights,
	Elliptical_machine,
	Dumbell,
	Barbell,
	Cable_machine,
	Smith_machine
}
 
// класс графика посещения
class Grafic{
	
	String name1;
	    Type Day;
	    
	 
	    void Type(String name1, Type type){
	          
	    	Day = type;
	        this.name1 = name1;
	        
	    }
	} 
enum Day{
	 
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
	 
	// класс мышц
class muscle{
		String name2;
		Type muscl;
		
		void Type(String name2, Type type){
	          
	    	muscl = type;
	        this.name2 = name2;
		
	}
	}
enum muscl{
	chest,
	triceps,
	back,
	biceps,
	legs,
	deltoids
}