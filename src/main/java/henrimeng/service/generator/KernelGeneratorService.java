package henrimeng.service.generator;

import henrimeng.service.GeneratorService;

import java.io.IOException;

import static henrimeng.service.CopyService.copyDirectory;

public final class KernelGeneratorService implements GeneratorService {

    @Override
    public void run(String path) {
        try {
            copyDirectory("TODO", path);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
