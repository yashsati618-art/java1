import java.util.Scanner;

class ChocolateDistributor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter total chocolates: ");
        int numberOfChocolates = input.nextInt();
        System.out.print("Enter number of children: ");
        int numberOfChildren = input.nextInt();

        int perChild = numberOfChocolates / numberOfChildren;
        int remaining = numberOfChocolates % numberOfChildren;

        System.out.println("The number of chocolates each child gets is " + perChild + " and the remaining chocolates are " + remaining);
    }
}