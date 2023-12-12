package com.example;

import java.awt.image.BufferedImage;

/**
 * Photo processing interface
 */
@FunctionalInterface
public interface ImageHandler {

    /**
     * Photo processing
     *
     * @param image Photos that need processing
     */
    public BufferedImage handle(BufferedImage image);
}
