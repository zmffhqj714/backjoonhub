

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int c = sc.nextInt();
        int co =0;
        int result =0;
        sc.nextLine();

        for (int k = 0; k < c; k++) {

           String input = sc.nextLine();

             String allw = input;



            for (int i = 0; i < allw.length(); i++) {

                for (int j = i+1; j < allw.length(); j++) {
                if (allw.charAt(i)!=allw.charAt(j)) {


                    for (int h = j+1; h < allw.length(); h++) {
                        if(allw.charAt(i) == allw.charAt(h)){

                            co +=1;
                        }

                    }



                }
                }

                }


            if(co>=1){
                result +=1;
                co =0;

            }






            }
     
        System.out.println(c-result);



        }




}
























