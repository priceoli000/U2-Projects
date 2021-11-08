import javax.swing.*;
import java.text.DecimalFormat;

public class WidgetFactory {
    static double payout = 16.50;


    /*
    Lessons L1 - L3

    You have been asked by the manager of the Widget Factory to create a program which will tell how many days it will take to produce a number of widgets.
    It should also output the cost of the widgets, the cost to produce the widget and the profit.

    Specific Details:
     - 10 Widgets are made each hour
     - Plant runs 2 shifts of 8 hours a day, requiring 5 workers a shift
     - each worker makes $16.50 an hour
     - each widget sells for $10

     Programming Details:
     - prompt the user for the number of widgets using pop-up boxes
     - display # of widgets, # of days, Cost of production, Cost of widgets and profit
     - 2 or more (preferably more) methods - at least 1 to calculate # of day and one to calculate production costs
     - only WHOLE number of days, no half or partial days.
     - Output should be in proper currency form

     Example Run:

     Number of Widgets: 1000
     # of Days: 7
     Cost of Widgets: $10,000.00
     Cost of Production: $9,240.00
     Profit: $760.00

     */
    public static void main(String[] args) {
        int daysWorked = Integer.parseInt(JOptionPane.showInputDialog("How many days were worked?"));
        costOfProduction(daysWorked);
        profit(daysWorked);

        System.exit(0);

    }

    public static void costOfProduction(int daysWorked){
       payout = 16.50 * 8 * 10 * daysWorked;

    }

    public static void profit(int daysWorked){
        DecimalFormat round = new DecimalFormat("#,###.##");
        int numOfWidgets = Integer.parseInt(JOptionPane.showInputDialog("How many widgets were made?"));
        int revenue = numOfWidgets * 10;
        double profit = revenue - payout;

        JOptionPane.showMessageDialog(null,"Number of Widgets: " + round.format(numOfWidgets) + "\n# of Days: " + round.format(daysWorked) + "\nCost of Widgets: $" + round.format(revenue) + "\nCost of Production : $" + round.format(payout) + "\nProfit: $" + round.format(profit));



    }
}
