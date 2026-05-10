package AllInOneSystem;

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
            try{
                Method method = cls.getMethod("getName");
                method.invoke(null);
                arrlength++;
            }catch(NoSuchMethodException e){}
            cls.getNestHost();
        }
        Object Systems[][] = new Object[arrlength][3]; // {{classname, System Name, number}, {classname, System Name,  // number}}

        int index = 0;
        for (Class<?> cls : classes) {
            try{
            Systems[index][0] = cls.getName();
            // getname
            Method method = cls.getMethod("getName");
            String name = (String) method.invoke(null);
            Systems[index][1] = name;
            Systems[index][2] = index;
            SO.Pln((index + 1) + " - " + name);
            index++;
            }catch(NoSuchMethodException e){}
        }
        int choice = 0;

        while (choice <= 0 || choice > index ) {
            try{
                SO.P("Choose a System Between 1 - " + index + ": ");
                choice = input.nextInt();
                if (choice <= 0 || choice > index) {
                    SO.Pln("Error, Please Select Valid Number");
                }
            }catch(InputMismatchException e){
                SO.Pln("Error, Please Select Valid Number");
                input.nextLine();
            }
        }
        choice -= 1;
        Class<?> cls = Class.forName((String) Systems[choice][0]);
        Method method = cls.getMethod("main");
        SO.Pln();
        String c = (String)Systems[choice][0];
        String fileName = c.substring(23);
        SO.Pln("Executing "+fileName+".java");
        SO.Pln("---------------------------------------");
        Thread.sleep(2000);

        method.invoke(null);
        input.close();
    }
}