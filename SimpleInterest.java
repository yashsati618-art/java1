import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = input.nextDouble();
        System.out.print("Enter Rate: ");
        double rate = input.nextDouble();
        System.out.print("Enter Time: ");
        double time = input.nextDouble();

        double siResult = (principal * rate * time) / 100.0;

        System.out.println("The Simple Interest is " + siResult + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
    }
}