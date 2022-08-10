package Questions.Josephus;

import java.util.ArrayList;

public class JosephusProblem {

    public static void printJosephus(ArrayList<Integer> arr, int m){

        ArrayList<Integer> dup = new ArrayList<Integer>(arr.size());
        for(int i=0;i<arr.size();i++){
            dup.add(arr.get(i));
        }

        int count=1,i=0;
        System.out.println("Elimination order");
        while(arr.size()>1){ //loop continues until array size greater than 1
            if(count==m){
                System.out.println(arr.get(i));
                arr.remove(i);
                count=0;
                i--;
            }
            count++;
            i++;
            i = i%arr.size(); //if i reaches arr.size() then i get assigned to 0.
        }

        System.out.println("\nRemaining person: "+arr.get(0));
        for(i=0;i<dup.size();i++){
            if(dup.get(i)==arr.get(0))
                System.out.println("Josephus has to sit in "+i+" position");
        }

    }

//    public static void main(String[] args){
//        int n=Integer.parseInt(args[0]); //takes n value from string
//        int m=Integer.parseInt(args[1]); //takes m value from string
//    //declares arraylist
//        ArrayList<Integer> arr = new ArrayList<Integer>(n);
//    //populates arraylist from args
//        for(int i=2;i<args.length;i++){
//            arr.add(Integer.parseInt(args[i]));
//        }
//        if(n!=arr.size()){
//            System.out.println("Please pass exactly "+n+" values");
//            System.exit(1);
//        }
//    //calls printJosephus method by passing arr and m
//        printJosephus(arr,m);
//    }
}