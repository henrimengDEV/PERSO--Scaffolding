package henrimeng;

import henrimeng.service.CopyService;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        final String path = args[0];
        final String name = args[1];

        System.out.println("path = " + path);
        System.out.println("name = " + name);

        CopyService.listFilesForFolder(
            new File(System.getProperty("user.dir") + "/src/main/java/henrimeng/template/usecase2/"),
            "", path, name
        );
    }

}