package AllTest;
import java.util.Scanner;

public class Test4_Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scanner1 = scanner.nextInt();
        int scanner2 = scanner.nextInt();
        int scanner3 = scanner.nextInt();
        System.out.println((scanner1+scanner2+scanner3)/3);//AVG
        double a = Math.floor((scanner1 + scanner2 + scanner3)/3) /2;
        System.out.println(a);//9+9+7=4.16 FACT,  4.0 Answer (Math.floor)
    }
}
