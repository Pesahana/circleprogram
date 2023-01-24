package circle;

public class TestCircle {
	
	public static void main(String args[]){
		
		Circle c1 = new Circle();
	    c1.setRadius(2.0);
	    c1.setColor("Blue");
	    
	    Circle c2 = new Circle();
	    c2.setRadius(2.0);
	    c2.setColor("Red");
	    
	    Circle c3 = new Circle();
	    c3.setRadius(1.0);
	    c3.setColor("Red");
	    
	    System.out.println("Area of c1:" + c1.getArea());
	    System.out.println("Area of c2:" + c2.getArea());
	    System.out.println("Area of c3:" + c3.getArea());
	     
	    System.out.println("perimeter of c1:" + c1.getPerimeter());
	    System.out.println("perimeter of c2:" + c2.getPerimeter());
	    System.out.println("perimeter of c3:" + c3.getPerimeter());
		   
	   
	    c1.setColor("Blue");
	    System.out.println("c1 color:" + c1.getColor());
	    
	    c2.setRadius(2.0);
	    System.out.println("Area of c2:" + c2.getArea());

	}
}
