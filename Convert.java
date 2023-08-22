import java.util.Scanner;
public class Convert{
    static Scanner sc = new Scanner(System.in);

    static double Celcius_to_Fahrenheit(double Celcius){
        double Fahrenheit = (Celcius * 9/5) + 32;
        return Fahrenheit;
    }

    static double Fahrenheit_to_Celcius(double Farenheit) {
        double Celcius = (Farenheit - 32) * 5/9;
        return Celcius;
    }
    static double Input_Temperature(String Temperature){
        System.out.println("Enter the " + Temperature +" value:");
        double val = sc.nextDouble();
        return val;
    }

    
    static void Output_Temperature(double Value, String Temperature){
        System.out.println("The " + Temperature + " value is: " + Value);
    }

    public static void main(String[] args) {
        System.out.println("Enter 1 to convert Farenheit to celsius");

        do{
            System.out.println("\nEnter number one please: ");
            int Temperature_Choice = sc.nextInt();
            double Choice_Number = 0;
            switch(Temperature_Choice){
                case 1: Choice_Number = Input_Temperature("Fahrenheit");
                    Output_Temperature(Fahrenheit_to_Celcius(Choice_Number), "Celcius");
                    break;
                case 2: Choice_Number = Input_Temperature("Celcius");
                Output_Temperature(Celcius_to_Fahrenheit(Choice_Number), "Fahrenheit");
                break;
                case 7: System.exit(0);
                    break;
                default: System.out.println("Invalid Input");
            }
        }
        while(true);

    }
}