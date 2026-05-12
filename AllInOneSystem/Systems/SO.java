package AllInOneSystem.Systems;

import java.util.Scanner;

public class SO {

    public static String getSystemName() {
        return "SOP Shortcut";
    }

    public static String getSystemAuthor() {
        return "fancode343";
    }

    public static void main() {
        Scanner input = new Scanner(System.in);
        SO.P("Enter text to print: ");
        String text = input.nextLine();
        SO.Pln("Using print (SO.P)");
        SO.P(text);
        SO.P(text);
        SO.Pln();
        SO.Pln();
        SO.Pln("Using println (SO.Pln)");
        SO.Pln(text);
        SO.Pln(text);
        input.close();
    }

    public static void P(Object ob) {
        System.out.print(ob);
    }

    public static void Pln(Object ob) {
        System.out.println(ob);
    }

    public static void Pln() {
        System.out.println();
    }
    public static void P_arr(Object[] arr) {
        for (Object ob : arr) {
            System.out.print(ob + " ");
        }
    }

}
