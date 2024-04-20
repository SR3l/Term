import java.text.DecimalFormat;


public class TermRatio {


    public static void main(String[] args) {
        // declared and initialized variables
        double  numerator = 49, denominator = 2 , ratio = 0, sum = 0;
        int divNum = 1;

        //Expected output shows 2 decimal but the question asks for three decimals
        DecimalFormat dp = new DecimalFormat("#.###");

        // Printing the main categories for the output
        System.out.println("Term" + "\t" + "Ratio" + "\t" + "Sum ");

        // for loop to iterates through the terms
        for(int k = 1; k <= 50; ++k){


            // updating numbers for each iteration numerator+= 2;
            ++denominator;
            ++divNum;

            ratio = (numerator - denominator)/divNum;
            sum += ratio;
            System.out.println( k + "\t\t" + dp.format(ratio) + "\t" + dp.format(sum));
        }
    }
}

