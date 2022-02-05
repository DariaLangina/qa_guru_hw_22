package dlangina.utils;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;

public class FileUtils {
    public static String getAbsolutePath(String filePath) {
        File file = new File(filePath);
        assertTrue(file.exists(), filePath + " not found");

        return file.getAbsolutePath();
    }
}
