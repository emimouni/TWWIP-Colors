package com.company;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by emimo on 1/25/2017.
 */
public class ColorName {

    public static String getColorNameFromHexa(String hexa) throws IOException{
        Scanner Colores = new Scanner(new File("C:\\Users\\emimo\\IdeaProjects\\TWIP-Colors\\src\\Colors.txt"));

        String Couleur = hexa;
        String color = "";
        boolean b = true;
        String dummy = "";
        int counter = 0;
        while (b == true) {
            dummy = Colores.nextLine();
            if (dummy.contains(Couleur)) {
                color = dummy.substring(0,dummy.indexOf("-"));
                b = false;
            }
            counter++;
            if (counter==149){
                b = false;
            }
        }
        if (counter==149){
            System.out.println("Sorry, there is no color with the name you specified.");
            return null;
        }else {
            return color;
        }
    }
    }

