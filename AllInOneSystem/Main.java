package AllInOneSystem;

import java.lang.reflect.Method;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        List<Class<?>> classes = PackageScanner.getClasses("AllInOneSystem.Systems");

        SO.Pln("-----------ALL-IN-ONE-SYSTEM-----------");
        Thread.sleep(1000);
        SO.Pln("-");
        Thread.sleep(1000);


        for (Class<?> cls : classes) {
            SO.Pln("Class: " + cls.getName());

            //getname
            Method method = cls.getMethod("getName");
            String result = (String) method.invoke(null);

            
            SO.Pln("Result: " + result);
            SO.Pln();
        }
    }
}