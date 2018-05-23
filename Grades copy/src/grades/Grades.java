package grades;

import static java.lang.Integer.compare;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*ArrayList<Double> grades = new ArrayList<Double>();
        System.out.println("Enter first grade: ");
        double value = in.nextDouble();
        while (value >= 0) {
            grades.add(value);
            System.out.println("Enter next grade: ");
            value = in.nextDouble();
        }
        grades.add(new Double(99));
        double total = 0, count = 0;
        for(double s: grades) {
            total += s;
            count++;
        }
        System.out.printf("\nThe average scores is: %.2f \n", (total/count));
        Collections.sort(grades);
        System.out.println(grades);
       */
       
    double price = 12.50;
    String input = "15.70";
    Double price2 = Double.parseDouble(input);
    Integer cost = 15;
    double cost2 = cost.doubleValue();
        System.out.println(Double.compare(price2,cost2));
        Double dbl = Double.valueOf(price);
        System.out.println(dbl);
        Double dblprice = price;

    }
}
