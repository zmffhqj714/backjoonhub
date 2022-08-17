
import java.util.ArrayList;

public class Main {

    //! my Code

    public static void main(String[] args) {



        //생성자 i



        ArrayList<Integer> result = new ArrayList<Integer>();


        int index=0;



            makesu(result);


//만든 수열 출력


               /* System.out.println(result+"나는 수열");*/


     //수열아닌거 출력하기


        for (int j = 1; j < 10000; j++) {


                if (!result.contains(j) ) {

                    System.out.println(j);

            }

        }
    }




    public static void makesu( ArrayList result) {



        //수열만들기
        //1~9
        int i = 0;
        int lastIdx = result.size() - 1;

        for ( i = 0; i <=10000 ; i++) {

            if(i <10){
                result.add(i + i);
            } else if(i == 10) {
                result.add(i + 1);
            }



           /* int sang = Integer.parseInt(result.get(lastIdx).toString());*/
          int spli = i;
          /*  int sang = i;*/
            String[] is = String.valueOf(i).split("");
                for (int j = 0; j < is.length; j++) {
                spli += Integer.parseInt(is[j]);
                }
           /* result.add(sang+spli);*/
            result.add(spli);
          /*  System.out.println("여기"+result.get(result.size()-1));*/


            }
        }
    }
























       


























