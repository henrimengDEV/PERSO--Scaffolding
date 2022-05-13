package henrimeng;

import java.io.File;

public final class FileUtils {

    private final static String KERNEL = "kernel";
    private final static String EXPO = "exposition";
    private final static String APPLICATION = "application";
    private final static String DOMAIN = "domain";
    private final static String INFRA = "infrastructure";

    public static boolean createFile(String path, String name) {
        File file = new File(path + name);
        return file.mkdir();
    }
}
