import java.util.Scanner;

public class Main {

    //! my Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        long sum = (a * b) * c;
      String[] ssum = String.valueOf(sum).split("");

       

    int[] result = new int[10];
      
     for(i = 0;i < ssum.length;i++){
         for(j = 0;j < result.length;j++){
        String k = String.valueOf(j);
           /*  String k = j +"";*/
           if(ssum[i].equals(k)){
               result[j] += 1;
           }
         }
     }
       
        


        for (int e : result
             ) {
            System.out.println(e);
        }



        }}






















