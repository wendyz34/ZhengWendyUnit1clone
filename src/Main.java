import java.util.Scanner;//for user input
import java.math.RoundingMode;//both for rounding
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        final DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.UP);//rounds up
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value: ");
        double totalBill = scan.nextDouble();
        System.out.println("What is the tip in whole number without the percent sign");
        int tipPercent = scan.nextInt();
        System.out.println("How much people were at the party?: ");
        int numPeople = scan.nextInt();
        //prints statement
        System.out.println("The total tip amount is: " + (df.format(totalBill * (tipPercent*0.01))));
        System.out.println("The total bill including tip is: " +  (df.format(totalBill + (totalBill * (tipPercent*0.01)))));
        System.out.println("The tip per person is: " +  (df.format(totalBill * (tipPercent*0.01) / numPeople)));
        System.out.print("The total per person is: " +  (df.format((totalBill * (tipPercent*0.01) / numPeople)+(totalBill/numPeople))));



    }
}