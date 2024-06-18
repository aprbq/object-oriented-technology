package week03.lab.lab3;

import java.util.Scanner;

public class TemperatureConverterWithSwitch {
    public static void main(String[] args) {
        System.out.print("Please enter a temperature value in the Celsius scale: ");
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        double convertedTemp = 0;
        System.out.print("Please enter a temperature scale for conversion (K/F/R): ");
        char tempScale = sc.next().charAt(0);
        sc.close();
        String scaleName = "";
        switch (tempScale) {
            case 'K': case 'k' :
                convertedTemp = celsius + 273.15;
                scaleName = "Kevin";
                break;
            case 'F': case 'f':
                convertedTemp = (celsius * 9 / 5) + 32;
                scaleName = "Fahrenheit";
                break;
            case 'R': case 'r':
                convertedTemp = (celsius + 273.15) * 1.8;
                scaleName = "Rankine";
                break;
            default:
                scaleName = "Invalid temperature scale!";
                break;
            }
            
        if (convertedTemp>0) {
            System.out.print(scaleName + ": " + convertedTemp); 
        } else {
            System.out.print(scaleName); 
        }
    }
}