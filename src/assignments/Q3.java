package assignments;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rect1 = new Rectangle(2,3);
		System.out.println("Area of a rectangle is: "+rect1.area());
		System.out.println("Perimeter of a rectangle is: "+rect1.perimeter());
		
		Square sq1 = new Square (7);
		System.out.println("Area of a square is: "+sq1.area());
		System.out.println("Perimeter of a square is: "+sq1.perimeter());


	}

}



class Rectangle{
	int length, breadth;
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public double area() {
		double result = length * breadth;
		//System.out.println("Area of rectangle is: "+result);
		return result;
	}
	
	public double perimeter() {
		double result = 2*(length + breadth);
		//System.out.println("Area of rectangle is: "+result);
		return result;
	}

}


class Square extends Rectangle{

	public Square(int s) {
		super(s, s);
	}
	
	
	
//	public double area(double s) {
//	double result = s * s;
//	//System.out.println("Area of rectangle is: "+result);
//	return result;
//	}
	
	
}