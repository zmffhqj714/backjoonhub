import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //! my Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j,k,scoresum = 0, snum =0,reverage =0;

        float a = sc.nextInt();

        ArrayList<Integer> score = new ArrayList<>();




     for(i = 0;i < a;i++){
        int student = sc.nextInt();
         for(j = 0;j < student;j++){
                int num =  sc.nextInt(); //Scanner는 함수여서 변수에 담아줘야 한다.
                 score.add(num);
                 scoresum += num;
             }
              reverage =  (scoresum/student);


             for(k = 0;k < score.size();k++) {
                if(score.get(k) > reverage){
                    snum += 1;
                }
             }
        double result =  snum*100.0/student;

         String  rdresult = String.format("%.3f", result);
         System.out.println(rdresult+"%");


         scoresum = 0;
         snum =0;
         score.clear();

         }



     }}


       


























