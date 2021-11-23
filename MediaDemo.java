import org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BaseMultiResolutionImage;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.List;

public class MediaDemo {
    private static final Logger log = LoggerFactory.getLogger(MediaDemo.class);

 public static void main(String... args) {
 File src = new File("2.png");
 try {
 log.info(" --- Removing EXIF info ---");
 File destNoExif = new File("2.png");
 removeExifTag(destNoExif, src);
 } catch (Exception e) {
 log.error("Something bad happened.", e);
 }
 }

    private static void removeExifTag(final File dest, final File src) throws Exception {
        new ExifRewriter().removeExifMetadata(src, new FileOutputStream(dest));
    }
}