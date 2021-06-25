package com.company;

public class Main {

    public static void main(String[] args) {

        String[]number={"thousand","hundred"};
        String[]num={"one","two","three","four","five","six","seven","eight","nine","ten"};
        String[]tenth={"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};



        /**  String num1="8576";
         int[] input= new int[4];


         for (int j=0;j<num1.length();j++){
         input[j]=Integer.parseInt(String.valueOf(num1.charAt(j)));

         }
         **/

        String num2 = "999.32";
        String[] input2=new String[num2.length()];
        for (int j=0;j<num2.length();j++){
            input2[j]= String.valueOf(num2.charAt(j));







        }
        for (int k=1;k<num2.length();k++) {
            if (input2[k].equals(".")) {

                String[] before = new String[k];
                for (int i = k; i > 0; i--) {
                    String x = String.valueOf(input2[k - i]);
                    //System.out.println(input2[k - i]);
                    before[k - i] = x;
                    //System.out.println(Arrays.toString(before));


                }
                //System.out.println(Arrays.toString(before));
                if (before.length == 3) {
                    for (int i = 1; i <= num.length; i++) {
                        if (input2[0].equals(String.valueOf(i))) {
                            System.out.print(num[i - 1] + " " + number[1]);


                        }

                    }


                    for (int i = 1; i <= num.length; i++) {
                        if (input2[1].equals(String.valueOf(i))) {
                            System.out.print(" " + tenth[i - 2] + " ");

                        }

                    }
                    for (int i = 1; i <= num.length; i++) {
                        if (input2[2].equals(String.valueOf(i))) {
                            System.out.print(" " + num[i - 1] + " "+"Dollers and ");


                        }

                    }
                }

            }

        }
        for (int k=1;k<num2.length();k++) {
            if (input2[k].equals(".")) {

                for (int i = k + 1; i < num2.length(); i++) {
                    System.out.print(num2.charAt(i));
                }

                System.out.println(" cents");
            }
        }




    }

}
	// write your code here


