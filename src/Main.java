import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat standardFormat = new DecimalFormat("$####.00");
        System.out.println("What is the total bill?");
        double bill = scan.nextDouble();
        scan.nextLine();

        System.out.println("What is the tip percentage?");
        double tipPercentage = (scan.nextDouble())/100;
        scan.nextLine();

        System.out.println("What is the number of people?");
        int people = Integer.parseInt(scan.nextLine());
        scan.nextLine();

        double totalTip = (bill * tipPercentage);
        double totalBill = (bill + totalTip);
        double totalPerPerson = (totalBill / people);
        double tipPerPerson = (totalTip / people);
        double pricePerPerson = (bill / people);

        System.out.println("Total bill: " + standardFormat.format(totalBill));
        System.out.println("Price per person: " + standardFormat.format(tipPerPerson));
        System.out.println("Total tip: " + standardFormat.format(totalTip));
        System.out.println("Total tip per person: " + standardFormat.format(tipPerPerson));
        System.out.println("Total Per Person: " + standardFormat.format(totalPerPerson));
    }
}