import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;

public class DemoFiles {
    private static final Logger log = LoggerFactory.getLogger(DemoFiles.class);

    public static void main(String... args) {
        File file = new File("/Users/iulianacosmina/apress/vultures.txt");
        printFileStats(file);
    }

    private static void printFileStats(File f) {
        if (f.exists()) {
            log.info("File Details:");
            log.info("Type : {}", f.isFile() ? "file" : "directory or symlink");
            log.info("Location :{}", f.getAbsolutePath());
            log.info("Parent :{}", f.getParent());
            log.info("Name : {}", f.getName());
            double kilobytes = f.length() / 1024;
            log.info("Size : {} ", kilobytes);
            log.info("Is Hidden : {}", f.isHidden());
            log.info("Is Readable? : {}", f.canRead());
            log.info("Is Writable? : {}", f.canWrite());
        }
    }
}