package AllInOneSystem;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PackageScanner {

    public static List<Class<?>> getClasses(String packageName) throws Exception {

        List<Class<?>> classes = new ArrayList<>();

        // convert package to path
        String path = packageName.replace('.', '/');

        // get folder from classpath
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        File directory = new File(classLoader.getResource(path).getFile());

        if (!directory.exists()) {
            throw new Exception("Package folder not found: " + directory);
        }

        // scan all files
        for (File file : directory.listFiles()) {

            if (file.getName().endsWith(".class")) {

                String className = packageName + "." +
                        file.getName().replace(".class", "");

                Class<?> cls = Class.forName(className);

                classes.add(cls);
            }
        }

        return classes;
    }
}