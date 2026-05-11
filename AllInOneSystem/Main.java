package AllInOneSystem;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        List<Class<?>> classes = PackageScanner.getClasses("AllInOneSystem.Systems");

        SO.Pln("-----------ALL-IN-ONE-SYSTEM-----------");
        Thread.sleep(1000);
        SO.Pln("- Listed Systems: ");
        Thread.sleep(1000);

        int arrlength = 0;
        for (Class<?> cls : classes) {
            try {
                Method method = cls.getMethod("getName");
                method.invoke(null);
                arrlength++;
            } catch (NoSuchMethodException e) {
            }
        }
        Object Systems[][] = new Object[arrlength][4]; // {{classname, System Name, number, Author}}

        int index = 0;
        for (Class<?> cls : classes) {
            try {
                Systems[index][0] = cls.getName();
                // getname
                Method method = cls.getMethod("getName");
                Method method1 = cls.getMethod("getAuthor");
                String name = (String) method.invoke(null);
                String author = (String) method1.invoke(null);
                Systems[index][1] = name;
                Systems[index][2] = index;
                Systems[index][3] = author;
                SO.Pln((index + 1) + " - " + name);
                index++;
            } catch (Exception e) {
            }
        }
        int choice = 0;

        while (choice <= 0 || choice > index) {
            try {
                SO.P("Choose a System Between 1 - " + index + ": ");
                choice = input.nextInt();
                if (choice <= 0 || choice > index) {
                    SO.Pln("Error, Please Select Valid Number");
                }
            } catch (InputMismatchException e) {
                SO.Pln("Error, Please Select Valid Number");
                input.nextLine();
            }
        }
        choice -= 1;
        Class<?> cls = Class.forName((String) Systems[choice][0]);
        Method method = cls.getMethod("main");
        SO.Pln();
        String c = (String) Systems[choice][0];
        String fileName = c.substring(23);
        SO.Pln("Executing " + fileName + "");
        SO.Pln("Name: " + ((String) Systems[choice][1]));
        SO.Pln("Author: " + (String) Systems[choice][3]);
        SO.Pln("---------------------------------------");
        Thread.sleep(2000);
        try {
            method.invoke(null);
        } catch (InvocationTargetException e) {
            SO.Pln("AIOS: Sorry Your System Can't Handle JOptionPane, JFRame and any Graphics");
        } catch (Exception er) {
            SO.Pln("AIOS: " + er);
        }
        SO.Pln("---------------------------------------");
        SO.Pln("Executed " + fileName + "");
        input.close();
    }
}
