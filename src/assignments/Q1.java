package assignments;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p = new Parent();
	     Child c = new Child ();
	     
	     p.display();
	     c.display();
	     c.displayParent();

	}

}


class Parent{
    public void display(){
        System.out.println ("This is parent class");
    }
}

class Child extends Parent{
    public void display(){
        System.out.println ("This is child class");
    }
    public void displayParent(){
        super.display();
    }
}
