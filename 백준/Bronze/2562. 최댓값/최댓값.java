import java.util.Scanner;
public class Main {

    //! my Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, k = 0, b=0;

//? 배열과 리스트의 차이
         int[] userinfo = new int [9];



        int max = 0;
        int index = 1;
     for(i = 0;i < userinfo.length;i++){
             userinfo[i] = sc.nextInt();
              if(userinfo[i] >= max){
                 max = userinfo[i];
             }
         }


        for(i = 0;i < userinfo.length;i++){

            if(userinfo[i] == max){
               index += i;
            }
        }


             System.out.println(max);
            System.out.println(index);



        }}