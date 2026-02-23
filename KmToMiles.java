import java.util.Scanner;

class KmToMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();

        double kmToMilesFactor = 1.6;
        double miles = km / kmToMilesFactor;

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}