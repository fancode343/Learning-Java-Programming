package AllInOneSystem;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class PackageScanner {

    public static List<Class<?>> getClasses(String packageName) throws Exception {
        List<Class<?>> classes = new ArrayList<>();
        String path = packageName.replace('.', '/');
        ClassLoader classLoader =
                Thread.currentThread().getContextClassLoader();
        URL resource = classLoader.getResource(path);
        if (resource == null) {
            throw new Exception("Package not found: " + packageName);
        }
        File directory = new File(resource.getFile());
        if (!directory.exists()) {
            throw new Exception("Folder not found: " + directory);
        }
        for (File file : directory.listFiles()) {
            System.out.println("Found file: " + file.getName());
            if (file.getName().endsWith(".class")) {
                String className =
                        packageName + "." +
                        file.getName().replace(".class", "");

                Class<?> cls = Class.forName(className);
                classes.add(cls);
            }
        }
        return classes;
    }
}