import java.util.Scanner;
public class TipsCalc {
    public static void main (String[] args)
    {
        Scanner scan=new Scanner (System.in); //5-10 scans
        System.out.println("what is your bill?");
        double bill= scan.nextDouble();
        System.out.println("How much would you like to tip?");
        double tip=scan.nextDouble();
        System.out.println("How many people do you have?");
        int people=scan.nextInt();
        double tiptotal=(tip/100)*bill; //math
        double tipperson=tiptotal/people;
        double total=bill+tiptotal;
        double totalperson=total/people;
        System.out.println("Total: "+String.format("%.2f", total)); //print
        System.out.println("Tip: "+String.format("%.2f",tiptotal));
        System.out.println("Here is your total per person: "+String.format("%.2f",totalperson));
        System.out.println("Here is your tips per person: "+String.format("%.2f",tipperson));

    }
}
