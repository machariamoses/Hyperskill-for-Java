package studyDec4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the shape's name, width, and height from the user input
        String name = scanner.nextLine();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();

        // Create a Rectangle object using the user input
        Rectangle rectangle = new Rectangle(name, width, height);

        // Print out the rectangle's name, width, and height
        System.out.println("Name: " + rectangle.getName());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        
        scanner.close();
    }

}
//Create a base class called Shape with a constructor that takes the shape's name as a parameter.
//Then create a derived class called Rectangle that inherits from Shape and has a constructor that
//takes the shape's name, width, and height as parameters. The Rectangle constructor 
//should call the base class constructor using the super keyword. 
//Finally, create a Rectangle object and print out its name, width, and height.