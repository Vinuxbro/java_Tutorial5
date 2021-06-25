package com.company;

import java.util.*;

import static java.util.Arrays.sort;

public class Tutorials {
    public static void main(String[] args){

   /**     //Q1
        int[] tot = new int[10];
        int fail_Num = 0;

        for (int n=0;n<10;n++)
        {
            Scanner mark = new Scanner(System.in);
            System.out.println("Enter your Mark");
            int marks = mark.nextInt();

            if (marks<40){
                fail_Num+=1;
            }
            tot[n]=marks;


        }
        System.out.println((Arrays.toString(tot)));
        System.out.println(fail_Num+" Students are failed");
    **/

   //q2
        /**
        int[] tot = new int[5];
        int fail_Num = 0;
        int final_Num;

        for (int n=0;n<5;n++)
        {
            Scanner mark = new Scanner(System.in);
            System.out.print("Enter your Mark:");
            int marks = mark.nextInt();


            final_Num=marks-((marks*10)/100);

            if (final_Num<40){
                fail_Num+=1;
            }

            tot[n]=final_Num;





        }
        System.out.println("Final Marks Are = "+(Arrays.toString(tot)));
        System.out.println(fail_Num+" Students are failed");



**/
        //q3

     /**
        double[] num=new double[100];

        for (int i=0;i<5;i++) {
            Scanner mark = new Scanner(System.in);
            System.out.print("Enter your Mark:");
            double marks = mark.nextDouble();

            num[i]=marks;




        }
        Arrays.sort(num);
        double x=num[99];

        System.out.println(x);



**/

/**
     //q4
        int[] tot={1,2,3,4,5};
        int[] new_Tot=new int[tot.length];
        for(int n=0;n<tot.length-1;n++){
            new_Tot[n+1]=tot[n];
            new_Tot[0]=tot[tot.length-1];

        }



        System.out.println(Arrays.toString(new_Tot));

 **/

/**

//q5


        double[] num=new double[20];

        for (int i=0;i<20;i++) {
            Scanner mark = new Scanner(System.in);
            System.out.print("Enter your Mark:");
            double marks = mark.nextDouble();

            num[i]=marks;

        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your i:");
        int i = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter your j:");
        int j = input2.nextInt();
        double x=num[i];
        double y=num[j];

        num[i]=y;
        num[j]=x;

        System.out.println(Arrays.toString(num));




**/
 //q6

        double[] num=new double[20];

        for (int i=0;i<5;i++) {
            Scanner mark = new Scanner(System.in);
            System.out.print("Enter your Mark:");
            double marks = mark.nextDouble();

            num[i]=marks;

        }
        swap(num);
        System.out.println(Arrays.toString(num));


    }

    //Q6 method
    static double[] swap(double[] num) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your i:");
        int i = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter your j:");
        int j = input2.nextInt();
        double x = num[i];
        double y = num[j];

        num[i] = y;
        num[j] = x;
        return num;


    }

}
