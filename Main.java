import java.util.List;
import java.util.Scanner;

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
