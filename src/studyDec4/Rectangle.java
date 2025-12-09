package studyDec4;

public class Rectangle extends Shape{
	  private double width;
	    private double height;
	    
	    // Add a constructor that takes the shape's name, width, and height as parameters
	    // Call the base class constructor using the super keyword
	    public Rectangle(String name, double width, double height) {
	        super(name);
	        this.width = width;
	        this.height = height;
	    }
	    
	    // Add getter methods to retrieve the rectangle's width and height
	    public double getWidth() {
	        return width;
	    }
	    
	    public double getHeight() {
	        return height;
	    }
	

}
