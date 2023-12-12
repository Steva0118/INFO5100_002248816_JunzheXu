package com.example.model;

/**
 * Photo properties
 */
public class ImageAttr {

    // Photo pixel type
    private String type;
    // photo width
    private Integer width;
    // photo height
    private Integer height;
    // photo path
    private String path;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
