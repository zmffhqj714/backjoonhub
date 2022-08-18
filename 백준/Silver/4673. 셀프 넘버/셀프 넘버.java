public class Main {

    //! my Code

    public static void main(String[] args) {


        boolean[] check = new boolean[10001];
        //값의 유무만을 확인할 때 boolean을 쓰면 메모리를 아낄 수 있고 check를 배열로 설정해줘도
        //bolean의 기본값은 false여서 true로 변경하여 비교할 수 있음



          for (int i = 0; i <= 10000; i++){
            int n = d(i);

            if(n < 10001){	// 넘어온 값은 수열이고 수열은 체크배열에 true로 반환
                check[n] = true;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10000; i++) {
            if(!check[i]){
             System.out.println(i);
            }
           
        }

    }
    public static int d(int number) {
        //!파라미터 받고 변수에 저장해서 고정값을 유지, 보낸 인수에 영향을 미치면 안됨

        int under = number; //합친변수를 따로 지정하지 않아도 다시 쓸수 있음
        int in = 0;
        while(number != 0){ //1~9를 제외한 숫자는 54+4로 return
            //!숫자의 자릿수는 문자로 변경하지말고 % / 로 자리값을 가져오기
            //! while 문을 사용하여 under에는 최종적으로 (들어온값+들어온값의마지막자릿수+첫째자리수)
            // 1 +0 * 54 + 4/ 5* 101 + 1 =102 +1* !!!5428+8+2+4+5
            //!결론은 1~9는 나누면 0이어서 return값이 1+1 ,2+2 로됨, 10이상부터는 10+0+1, 11+1+1
            under = under + (number %10);
            number = number /10; // 첫째자리수 가져오기 5

           /* System.out.println(under+""+in);
            System.out.println(number+""+in);*/
            in ++;



        }


        return under;
    }

}





























       


























