import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        int a, b = 0, c = 0, d = 0;
        out.print("Lütfen hesaplanacak sayıyı giriniz : ");
        a = input.nextInt();
        do {
            if ((a % 4 == 0) && (a % 3 == 0)){
                b++;
                c +=a;
            }
            a--;
        } while (a != 0);
        d= c/b;
        out.print(d);

    }
}