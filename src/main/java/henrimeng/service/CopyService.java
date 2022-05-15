package henrimeng.service;

import org.apache.commons.io.FileUtils;

import java.io.*;

public final class CopyService {

    public static void copyDirectory(
        String sourceDirectoryLocation,
        String destinationDirectoryLocation
    ) throws IOException {
        File sourceDirectory = new File(sourceDirectoryLocation);
        File destinationDirectory = new File(destinationDirectoryLocation);
        FileUtils.copyDirectory(sourceDirectory, destinationDirectory);
    }

    public static void listFilesForFolder(final File folder, String prefix, String path, String name) {
        String nameWithLowerCase = name.substring(0, 1).toLowerCase() + name.substring(1);

        for (final File currentFile : folder.listFiles()) {
            if (currentFile.isDirectory()) {
                File file = new File(path + currentFile.getName()
                    .replace("Chinoiseriz", name)
                    .replace("chinoiseriz", nameWithLowerCase)
                );
                file.mkdir();
                listFilesForFolder(
                    currentFile,
                    prefix + "\t",
                    path + file.getName() + "/",
                    name
                );
            }
            else {
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(path + currentFile.getName()
                        .replace("Chinoiseriz", name)
                        .replace("chinoiseriz", nameWithLowerCase)
                        .replace(".tmp", ".java")
                    ));
                    BufferedReader reader = new BufferedReader(new FileReader(currentFile));
                    String currentLine = reader.readLine();

                    while (currentLine != null) {
                        StringBuilder value = new StringBuilder();
                        value
                            .append(currentLine
                                        .replace("Chinoiseriz", name)
                                        .replace("chinoiseriz", nameWithLowerCase)
                            ).append("\n");
                        writer.write(value.toString());
                        currentLine = reader.readLine();
                    }

                    writer.close();
                }
                catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
