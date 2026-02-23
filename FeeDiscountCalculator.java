import java.util.Scanner;

class FeeDiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the student fee: ");
        double studentFee = input.nextDouble();

        System.out.print("Enter the university discount percentage: ");
        double discountPercent = input.nextDouble();

        double discountAmount = (studentFee * discountPercent) / 100.0;
        double finalFee = studentFee - discountAmount;

        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);
    }
}