import java.util.Scanner;


public class Main {


    //! other person Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //문자, 숫자 비교시 아스키코드를 사용한다. (메모리절약)

        int[] asciicode = new int[26]; //대문자가 몇개있는지 배열로 가지고 옴
        String c = sc.next();


        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) >= 65 && c.charAt(i) <= 90){

                asciicode[c.charAt(i) - 65]++; // 아스키코드를 가지고 와서 배열 인덱스를 이런식으로 조정할 수 있다.
            } else {
                asciicode[c.charAt(i) - 97]++;
            }

        }
         int max = -1;
        char ch = '?'; // 기본 변수를 선언하고 조건에 따라 return 값을 변수에 저장해서 달리하는 게 좋다.
        for (int i = 0; i < asciicode.length; i++) {
           if(asciicode[i] > max ){
               max = asciicode[i];
               ch = (char) (i + 65);  // 변수 인덱스를 다시 원하는 아스키 코드값으로 변경할 수 있다.
           }else if(asciicode[i] == max ){
               ch = '?';
           }

        }

        System.out.println(ch);


    }
}