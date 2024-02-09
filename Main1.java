import java.util.List;
import java.util.Scanner;

/* https://cote.inflearn.com/contest/10/problem/01-06
6. 중복문자제거
설명

소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.

중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.


입력
첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.


출력
첫 줄에 중복문자가 제거된 문자열을 출력합니다.
 */
//특정 문자 뒤집기
public class Main1 {

    void solution(String strings) {
        String result = "";

        for (int i = 0; i < strings.length(); i++) {
            if (i == strings.indexOf(strings.charAt(i))) {
                result += strings.charAt(i);
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        Main1 main = new Main1();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        main.solution(s);
    }
}
