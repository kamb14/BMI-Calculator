//import statement
import java.util.Scanner;

public class BMI_Brownlow {

    static void calculateBMI(double pounds, double inches){
           
        //calculate bmi

        double BMI = pounds * (703 / Math.pow(inches,2));

        System.out.print("Your BMI: ");

        System.out.format("%.2f", BMI);

        System.out.println();

        //else if gives you your bmi range

    if(BMI < 18.5){
        System.out.println("You are considered underweight.");

    }else if(BMI > 18.5 && BMI < 25){
            
        System.out.println("You are considered to be optimal weight.");

    }else if(BMI > 25){

        System.out.println("You are considered overweight.");

    }


    }

    //main constructor
    public static void main(String[] args){

        // scanner object stores user input

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your weight in pounds: ");
        
        double weight = scan.nextDouble();

        System.out.println("Please enter your height in inches: ");

        double height = scan.nextDouble();

        //close scanner

        scan.close();

        //call method

        calculateBMI(weight, height);

       



    }
    
}
