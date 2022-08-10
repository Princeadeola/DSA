package Questions.Josephus;

import java.util.ArrayList;
import java.util.Scanner;

import static Questions.Josephus.JosephusProblem.printJosephus;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of persons: ");
        String numbers = input.next();
        int n=Integer.parseInt(args[0]); //takes n value from string
        int m=Integer.parseInt(args[1]); //takes m value from string
//        int n=Integer.parseInt(args[0]); //takes n value from string
//        int m=Integer.parseInt(args[1]); //takes m value from string
        //declares arraylist
        ArrayList<Integer> arr = new ArrayList<Integer>(n);
        //populates arraylist from args
        for(int i=2;i<args.length;i++){
            arr.add(Integer.parseInt(args[i]));
        }
        if(n!=arr.size()){
            System.out.println("Please pass exactly "+n+" values");
            System.exit(1);
        }
        //calls printJosephus method by passing arr and m
        printJosephus(arr,m);
    }
}
