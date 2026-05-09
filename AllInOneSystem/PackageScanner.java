package AllInOneSystem;

import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class PackageScanner {

    public static void classScan() throws Exception {
        String packageName = "Systems";
        List<Class<?>> classes = getClasses(packageName);

        for (Class<?> clazz : classes) {
            System.out.println("\n Class: " + clazz.getName());
            for (Method method : clazz.getDeclaredMethods()) {
                System.out.println("   -> " + method.getName()
                        + " (" + method.getReturnType().getSimpleName() + ")");
            }
        }
    }

    public static List<Class<?>> getClasses(String packageName) throws Exception {
        List<Class<?>> classes = new ArrayList<>();

        // ✅ Auto-detect the bin/output directory from the running class
        String classPath = new File(
                PackageScanner.class
                        .getProtectionDomain()
                        .getCodeSource()
                        .getLocation()
                        .toURI())
                .getAbsolutePath();

        // Build full path: bin/ + Systems/
        String packagePath = packageName.replace('.', File.separatorChar);
        File directory = new File(classPath + File.separator + packagePath);

        System.out.println("Scanning path: " + directory.getAbsolutePath());

        // ✅ Friendly error if folder not found
        if (!directory.exists()) {
            throw new Exception("Package folder not found: " + directory.getAbsolutePath());
        }

        scanDirectory(directory, packageName, classes);
        return classes;
    }

    private static void scanDirectory(File dir, String packageName,
            List<Class<?>> classes) throws Exception {
        File[] files = dir.listFiles();
        if (files == null)
            return; // ✅ Avoid NullPointerException on empty dirs

        for (File file : files) {
            if (file.isDirectory()) {
                scanDirectory(file, packageName + "." + file.getName(), classes);
            } else if (file.getName().endsWith(".class")) {
                String className = packageName + "."
                        + file.getName().replace(".class", "");
                try {
                    classes.add(Class.forName(className));
                    System.out.println("Loaded: " + className);
                } catch (ClassNotFoundException e) {
                    System.out.println("Skipping (not found): " + className);
                }
            }
        }
    }
}