package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");

        //System.out.println(colors.get(1));

        Scanner sc = new Scanner(System.in);
        String userInput = " ";
// prompt the user and to enter colors and add it
        do{
            System.out.println("Enter color or q to quit");
            userInput = sc.nextLine();

            if(!userInput.equalsIgnoreCase("q")){
                colors.add(userInput);
            }

        }while(!userInput .equalsIgnoreCase("q"));
    for (String x : colors) {
        System.out.println(x);
    }






    }
}
