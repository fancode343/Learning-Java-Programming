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
        scanDirectory(directory, packageName, classes);
        return classes;
    }
    private static void scanDirectory(
            File directory,
            String packageName,
            List<Class<?>> classes
    ) throws Exception {
        File[] files = directory.listFiles();
        if (files == null) return;
        for (File file : files) {
            // If folder/subpackage
            if (file.isDirectory()) {
                String subPackage =
                        packageName + "." + file.getName();
                scanDirectory(file, subPackage, classes);
            }
            // If class file
            else if (file.getName().endsWith(".class")) {
                String className =
                        packageName + "." +
                        file.getName().replace(".class", "");
                try {
                    Class<?> cls = Class.forName(className);
                    classes.add(cls);
                    System.out.println("Loaded class: " + className);
                } catch (Throwable e) {
                    System.out.println(
                            "Failed to load: " + className
                    );
                }
            }
        }
    }
}