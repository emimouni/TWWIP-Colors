package com.company;
import java.io.*;
import java.util.*;
/**
 * Created by emimo on 1/25/2017.
 */
public class Hexadecimal {
    public static String getHexaFromRGB(String RGB){
        Scanner kb = new Scanner(System.in);
        int r1=0,r2=0,r3=0,r4=0,r5=0,r6=0;
        String p1,p2,p3,p4,p5,p6;
        String r = RGB.substring(0,RGB.indexOf(","));
        String g = RGB.substring(RGB.indexOf(",")+1, RGB.lastIndexOf(","));
        String b = RGB.substring(RGB.lastIndexOf(",")+1);
        double red = Double.parseDouble(r);
        double x = (red/16);
        r1 = (int)x;
        r2 = (int)((x-r1)*16);

        double green = Double.parseDouble(g);
        double y = (green/16);
        r3 = (int)y;
        r4 = (int)((y-r3)*16);

        double blue = Double.parseDouble(b);
        double z = (blue/16);
        r5 = (int)z;
        r6 = (int)((z-r5)*16);

        if (r1==10) p1 = "A";
        else if (r1==11) p1 = "B";
        else if (r1==12) p1 = "C";
        else if (r1==13) p1 = "D";
        else if (r1==14) p1 = "E";
        else if (r1==15) p1 = "F";
        else p1 = Integer.toString(r1);

        if (r2==10) p2 = "A";
        else if (r2==11) p2 = "B";
        else if (r2==12) p2 = "C";
        else if (r2==13) p2 = "D";
        else if (r2==14) p2 = "E";
        else if (r2==15) p2 = "F";
        else p2 = Integer.toString(r2);

        if (r3==10) p3 = "A";
        else if (r3==11) p3 = "B";
        else if (r3==12) p3 = "C";
        else if (r3==13) p3 = "D";
        else if (r3==14) p3 = "E";
        else if (r3==15) p3 = "F";
        else p3 = Integer.toString(r3);

        if (r4==10) p4 = "A";
        else if (r4==11) p4 = "B";
        else if (r4==12) p4 = "C";
        else if (r4==13) p4 = "D";
        else if (r4==14) p4 = "E";
        else if (r4==15) p4 = "F";
        else p4 = Integer.toString(r4);

        if (r5==10) p5 = "A";
        else if (r5==11) p5 = "B";
        else if (r5==12) p5 = "C";
        else if (r5==13) p5 = "D";
        else if (r5==14) p5 = "E";
        else if (r5==15) p5 = "F";
        else p5 = Integer.toString(r5);

        if (r6==10) p6 = "A";
        else if (r6==11) p6 = "B";
        else if (r6==12) p6 = "C";
        else if (r6==13) p6 = "D";
        else if (r6==14) p6 = "E";
        else if (r6==15) p6 = "F";
        else p6 = Integer.toString(r6);

        String hexa = p1+p2+p3+p4+p5+p6;
        return hexa;
    }

    public static String getHexaFromColorName(String colorName)throws IOException {
        Scanner Colores = new Scanner(new File("C:\\Users\\emimo\\IdeaProjects\\TWIP-Colors\\src\\Colors.txt"));

        String Couleur = colorName;
        String color = "";
        boolean b = true;
        String dummy = "";
        while (b==true){
            dummy = Colores.nextLine();
            if (dummy.contains(Couleur)){
                color = dummy.substring(dummy.indexOf("#")+1);
                b=false;
            }
        }
        return color;
    }

}
