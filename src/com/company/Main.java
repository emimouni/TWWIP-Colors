package com.company;
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException{
        Scanner kb = new Scanner(System.in);
        System.out.println("Would you like to enter an RGB value (1), a Hexadecimal (2), or a Color Name (3)");
        int choice = kb.nextInt();
        if (choice==1){
            System.out.println("Enter your RGB value in the exact format: 255,255,255");
            String RGB = kb.next();
            String hexa = Hexadecimal.getHexaFromRGB(RGB);
            String color = ColorName.getColorNameFromHexa(hexa);
            if (color == null){
                System.out.println("Sorry, there aren't any colors with that RGB value.");
            }else {
                System.out.println("Your RGB value: (" + RGB + ")");
                System.out.println("Your Hexadecimal: " + hexa);
                System.out.println("Your Color: " + color);
            }
        }
        if (choice==2){
            System.out.println("Enter your Hexadecimal and if you have letters, make sure it is Capitalized");
            String hexa = kb.next();
            String rgb = RGB.getRGBfromHexa(hexa);
            String color = ColorName.getColorNameFromHexa(hexa);
            if (color == null){
                System.out.println("Sorry, there aren't any colors with that Hexadecimal.");
            }else {
                System.out.println("Your RGB value: (" + rgb + ")");
                System.out.println("Your Hexadecimal: " + hexa);
                System.out.println("Your Color: " + color);
            }
        }
        if (choice==3){
            System.out.println("Enter your color name in the exact format: AliceBlue");
            String color = kb.next();
            String hexa = Hexadecimal.getHexaFromColorName(color);
            String rgb = RGB.getRGBfromHexa(hexa);
            System.out.println("Your RGB value: (" + rgb + ")");
            System.out.println("Your Hexadecimal: " + hexa);
            System.out.println("Your Color: " + color);
        }
    }
}
