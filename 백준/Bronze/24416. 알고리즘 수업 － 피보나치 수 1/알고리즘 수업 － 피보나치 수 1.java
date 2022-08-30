import java.util.Scanner;


public class Main {

    static int dpCnt = 0;
    //! my code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(fib(n)+" ");
        fibonacci(n);
        System.out.println(dpCnt);


    }
    //재귀호출 : 함수를 자동으로 실행해서 자동적으로 해결하기 위해서 사용 자체실행제어
    //단점: 시간복잡도가 O(n^2) n을 계산하기 위한 함수를 2번씩 부른다, 콜스택을 유발해 메모리에 오버플로우가 발생할 가능성이 높다.
    //하지만 사용이 필요할 때: 퀵정렬, json, xml 파싱 등 루프문으로 구현시 스택자료형이라면 끝없는 for문을 돌려야 하기때문에 재귀함수가 더 좋다.
    public static int  fib(int n) {

        if (n == 1 || n == 2){

            return 1;}
        else {

            return (fib(n - 1) + fib(n - 2));
    }}
    //vs 동적프로그래밍 (이전 수행했던 같은 메모리를 사용함으로써 속도와 메모리를 절약함)
    //시간복잡도가 O(n) 바로 계산됨
    public static int fibonacci(int n) {
        int[] memo = new int[n];

        memo[0] = 1;
        memo[1] = 1;

        for (int i = 2; i < n; i++) {
            dpCnt++;
            memo[i] = memo[i-2] + memo[i-1];
        }
        return memo[n-1];
    }
}
























