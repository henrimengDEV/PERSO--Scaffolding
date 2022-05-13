package henrimeng.service;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public final class CopyService {

    public static void copyDirectory(
        String sourceDirectoryLocation,
        String destinationDirectoryLocation
    ) throws IOException {
        File sourceDirectory = new File(sourceDirectoryLocation);
        File destinationDirectory = new File(destinationDirectoryLocation);
        FileUtils.copyDirectory(sourceDirectory, destinationDirectory);
    }
}
