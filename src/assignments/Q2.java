package assignments;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee("Gabriel", 22, "0276345055", "1st Street", 5799.33);
		Manager man1 = new Manager("Machael", 35, "0589745636", "43rd Lane", 44884.00);
	     
	    System.out.println(emp1);
	    System.out.println(man1);

	}

}


class Member{
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;
   
    public Member(String name, int age, String phoneNumber, String address, double salary){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
       
    }
   
    public void printSalary(){
        System.out.println ("Salary is: "+this.salary);
    }
   
     public String toString(){
        return "Name: " +name + ", Age: "+age +", Phone number: "+phoneNumber + ", Address: "+address + ", Salary: "+salary;
    }
}

class Employee extends Member{
    String specialization;
    
    public Employee(String name, int age, String phoneNumber, String address, double salary) {
    	super(name, age, phoneNumber, address, salary);
    }
   
    public String toString(){
    	return super.toString();
        //return super.toString() + " Specialization: "+specialization;
    }
   
}

class Manager extends Member{
    String department;
   
    public Manager(String name, int age, String phoneNumber, String address, double salary) {
    	super(name, age, phoneNumber, address, salary);
    }
    
    public String toString(){
    	return super.toString();
        //return super.toString() + " Department: "+department;
    }
}