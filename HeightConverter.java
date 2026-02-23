import java.util.Scanner;

class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        double heightInCm = input.nextDouble();

        double cmPerInch = 2.54;
        int inchesPerFoot = 12;

        double totalInches = heightInCm / cmPerInch;
        int heightInFeet = (int) (totalInches / inchesPerFoot);
        double remainingInches = totalInches % inchesPerFoot;

        System.out.println("Your height in cm is " + heightInCm + " while in feet is " + heightInFeet + " and inches is " + remainingInches);
    }
}