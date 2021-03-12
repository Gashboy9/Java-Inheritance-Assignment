package assignments;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Square sq = new Square(5);
		
		double [] fig = new double [10];
		
		int count = 0;
		
		for(double s : fig) {
			count++;
			s = sq.area();
			System.out.println("Square "+count+ " area is: "+s);
		}
	
		
	}

}


	

//class Rectangle{
//	int length, breadth;
//	
//	public Rectangle(int length, int breadth) {
//		this.length = length;
//		this.breadth = breadth;
//	}
//	
//	public double area() {
//		double result = length * breadth;
//		//System.out.println("Area of rectangle is: "+result);
//		return result;
//	}
//	
//	public double perimeter() {
//		double result = 2*(length + breadth);
//		//System.out.println("Area of rectangle is: "+result);
//		return result;
//	}
//
//}
//
//
//class Square extends Rectangle{
//
//	public Square(int s) {
//		super(s, s);
//	}
//
//public double area(int s) {
//double result = s * s;
////System.out.println("Area of rectangle is: "+result);
//return result;
//}
//	
//}
