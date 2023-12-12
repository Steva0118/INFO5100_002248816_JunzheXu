package com.example;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

/**
 *The combination of photo processors uses the combination mode and the chain of responsibility mode.
 *The entity class stores all the processors that need to process the photos, 
 *and then calling process will traverse the processing.
 */
public class ImageHandlerComposition {


    private final List<ImageHandler> imageHandlerList = new ArrayList<>();

    public ImageHandlerComposition() {
    }

    public ImageHandlerComposition(List<ImageHandler> imageHandlerList) {
        this.imageHandlerList.addAll(imageHandlerList);
    }

    /**
     * Add photo processor
     */
    public void addImageHandler(ImageHandler handler) {
        this.imageHandlerList.add(handler);
    }

    /**
     * Add photo processor at specified location
     */
    public void addImageHandler(ImageHandler handler, int index) {
        this.imageHandlerList.add(index, handler);
    }

    /**
     * Process processing of chain of responsibility model
     */
    public BufferedImage process(BufferedImage image) {
        if (imageHandlerList.size() == 0) {
            return image;
        }
        BufferedImage resultImage = null;
        for (ImageHandler imageHandler : imageHandlerList) {
            resultImage = imageHandler.handle(image);
        }
        return resultImage;
    }
}
