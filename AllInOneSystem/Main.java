package AllInOneSystem;

import java.lang.reflect.Method;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        var classes = PackageScanner.getClasses("AllInOneSystem.Systems");

        for (Class<?> cls : classes) {
            System.out.println(cls.getName());
            Object obj = cls.getDeclaredConstructor().newInstance();
            Method method = cls.getMethod("getName");
            String result = (String) method.invoke(obj);
            System.out.println(result);
            //Testing
        }
    }
}
