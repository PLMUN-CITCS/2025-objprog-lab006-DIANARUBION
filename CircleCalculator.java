import java.util.Scanner; // Import Scanner class for user input

public class CircleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt the user for the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble(); // Read user input

        // Calculate the area of the circle (π * r^2)
        double area = Math.PI * Math.pow(radius, 2);

        // Calculate the circumference of the circle (2 * π * r)
        double circumference = 2 * Math.PI * radius;

        // Output the results with two decimal places
        System.out.printf("Radius: %.2f%n", radius);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Circumference: %.2f%n", circumference);

        // Close the Scanner object to release resources
        input.close();
    }
}
