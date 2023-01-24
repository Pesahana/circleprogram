package circle;

public class Circle {
	private  double radius;
	  private String color;
	 
	  
	  public double getRadius(){
	    return radius;
	  }
	  
	  public void setRadius(double r){
	     radius=r;
	  }
	  public String getColor(){
	    return color;
	  }
	  
	  public void setColor(String c){
	    color =c;
	  }
	  
	  public double getArea(){
	    return 3.14 * radius* radius;
	  }
	  
	  public double getPerimeter(){
	    return 3* 3.14 * radius;
	  }
}
