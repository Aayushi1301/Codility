package main;
import solution.ApplesOrchard;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        //variables
        int i,n,k,l;

        //initialization
        ApplesOrchard applesOrchard=new ApplesOrchard();
        System.out.println("enter size of array");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array elements");
        for(i=0;i<n;i++){

           a[i]=input.nextInt();
        }
        System.out.println("enter k and l");
        k=input.nextInt();
        l=input.nextInt();

        //output
        System.out.println("Maximum Sum="+applesOrchard.findMaximumApples(a,k,l));
    }
}
