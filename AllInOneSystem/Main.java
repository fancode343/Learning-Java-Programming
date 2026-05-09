package AllInOneSystem;

import java.lang.reflect.Method;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        List<Class<?>> classes = PackageScanner.getClasses("AllInOneSystem.Systems");

        for (Class<?> cls : classes) {
            SO.Pln("Class: " + cls.getName());
            Method method = cls.getMethod("getName");
            String result = (String) method.invoke(null);
            SO.Pln("Result: " + result);
            SO.Pln();
        }
    }
}