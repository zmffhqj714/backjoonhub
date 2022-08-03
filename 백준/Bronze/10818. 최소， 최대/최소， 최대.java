import java.util.Scanner;

public class Main {

    //! my Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, k = 0, b=0;
        int c = sc.nextInt();
         int[] userinfo = new int [c];

         int max = -1000000;
        int min = 1000000;
     for(i = 0;i < c;i++){
             userinfo[i] = sc.nextInt();
              if(userinfo[i] >= max){
                 max = userinfo[i];
             }  if (userinfo[i] <= min) {
                  min = userinfo[i];
              }
     }



        System.out.println(min);
             System.out.println(max);




        }}






















