import java.util.List;
import java.util.Scanner;

/* https://cote.inflearn.com/contest/10/problem/01-05
5. 특정 문자 뒤집기
설명
영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

입력
첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.

출력
첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 */

//특정 문자 뒤집기
public class Main {
    void solution(String strings) {
        int lt = 0;
        int rt = strings.length() -1;
        char[] charArray = strings.toCharArray();

        while (lt < rt) {
            if (!Character.isAlphabetic(strings.charAt(lt))) lt ++;
            else if (!Character.isAlphabetic(strings.charAt(rt))) rt --;
            else {
                char temp = strings.charAt(lt);
                charArray[lt] = charArray[rt];
                charArray[rt] = temp;
                rt--;lt++;
            }
        }

        List.of(charArray).forEach(System.out::println);
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        main.solution(s);
    }
}
