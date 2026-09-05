package JavaRefresher.IO_DataTypes_Operators.Problems;

import java.util.Scanner;

// input 
// 25   Java Programming
// 100   200
//    Hello World
// 3.14   Scanner Test
// 999

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String b = sc.nextLine();

        int c = sc.nextInt();
        String d = sc.nextLine();

        String e = sc.next();
        String f = sc.nextLine();

        double g = sc.nextDouble();
        String h = sc.nextLine();

        int i = sc.nextInt();
        String j = sc.nextLine();

        System.out.println("a = [" + a + "]");
        System.out.println("b = [" + b + "]");
        System.out.println("c = [" + c + "]");
        System.out.println("d = [" + d + "]");
        System.out.println("e = [" + e + "]");
        System.out.println("f = [" + f + "]");
        System.out.println("g = [" + g + "]");
        System.out.println("h = [" + h + "]");
        System.out.println("i = [" + i + "]");
        System.out.println("j = [" + j + "]");

        sc.close();
    }
}
