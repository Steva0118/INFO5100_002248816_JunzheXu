package com.example.util;

import com.example.model.ImageAttr;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Photo processing tools
 */
public class ImageUtils {

    // Supported photo extensions
    public static List<String> SUPPORT_IMAGE_EXTENSIONS = Arrays.asList("*.jpeg", "*.jpg", "*.png");

    /**
     * Get photo properties
     */
    public static ImageAttr getImageAttr(File file) throws IOException {
        ImageAttr imageAttr = new ImageAttr();

        if (file == null) {
            return imageAttr;
        }
        // Set photo path
        String absolutePath = file.getAbsolutePath();
        imageAttr.setPath(absolutePath);
        BufferedImage image = ImageIO.read(file);
        // Set thumbnail
        int height = image.getHeight();
        int width = image.getWidth();
        imageAttr.setHeight(height);
        imageAttr.setWidth(width);
        // Setting type
        int type = image.getType();
        String imgType;
        switch (type) {
            case BufferedImage.OPAQUE:
                imgType = "Opaque";
                break;
            case BufferedImage.TYPE_INT_ARGB:
            case BufferedImage.TYPE_INT_ARGB_PRE:
                imgType = "ARGB";
                break;
            case BufferedImage.TYPE_INT_BGR:
            case BufferedImage.TYPE_3BYTE_BGR:
                imgType = "BGR";
                break;
            case BufferedImage.TYPE_4BYTE_ABGR:
            case BufferedImage.TYPE_4BYTE_ABGR_PRE:
                imgType = "ABGR";
                break;
            case BufferedImage.TYPE_USHORT_565_RGB:
            case BufferedImage.TYPE_USHORT_555_RGB:
                imgType = "RGB";
                break;
            case BufferedImage.TYPE_BYTE_GRAY:
            case BufferedImage.TYPE_USHORT_GRAY:
                imgType = "GRAY";
                break;
            default:
                imgType = "Unknown";
                break;
        }
        imageAttr.setType(imgType);
        return imageAttr;
    }

    /**
     * Adjust photo brightness
     *
     * @param image     photo
     * @param lightRate brightness value
     */
    public static BufferedImage adjustLight(BufferedImage image, int lightRate) {
        int height = image.getHeight();
        int width = image.getWidth();
        int r, g, b, rgb;
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                // Traverse each pixel and place the processed pixels in the photo
                rgb = image.getRGB(x, y);
                r = ((rgb >> 16) & 0xFF) + lightRate;
                g = ((rgb >> 8) & 0xFF) + lightRate;
                b = (rgb & 0xFF) + lightRate;
                rgb = (0xFF << 24) | ((clamp(r) & 0xFF) << 16) | ((clamp(g) & 0xFF) << 8)
                        | ((clamp(b) & 0xFF));
                image.setRGB(x, y, rgb);
            }
        }
        return image;
    }

    /**
     * The limit value is between 0-255
     */
    private static int clamp(int value) {
        if (value > 0xff) {
            return 0xff;
        }
        return Math.max(value, 0);
    }

    /**
     * Set up black and white photos
     */
    public static BufferedImage blackWhiteFilter(BufferedImage image) {
        if (image == null) {
            return null;
        }
        // Convert image to black and white
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                int rgb = image.getRGB(x, y);
                int r = (rgb >> 16) & 0xFF;
                int g = (rgb >> 8) & 0xFF;
                int b = rgb & 0xFF;

                //Take the maximum value of the three primary colors of RGB
                int tempMax = Math.max(r, g);
                int max = Math.max(tempMax, b);
                //Take the minimum value of the three primary colors of RGB
                int tempMin = Math.min(r, g);
                int min = Math.min(tempMin, b);
                //Take the average of the maximum and minimum values of the RGB three primary colors
                int avg = (max + min) / 2;
                Color color = new Color(avg, avg, avg);
                rgb = color.getRGB();
                image.setRGB(x, y, rgb);
            }
        }
        return image;
    }

    /**
     * Get extension
     */
    public static String getExtension(String path) {
        // Get source file extension
        int index = path.lastIndexOf(".");
        if (index < 0) {
            throw new IllegalArgumentException("File error");
        }
        return path.substring(index + 1);
    }

}
