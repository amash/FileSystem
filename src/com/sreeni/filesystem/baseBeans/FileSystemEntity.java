package com.sreeni.filesystem.baseBeans;

/**
 * Created by ZNE45571 on 3/25/2015.
 */
public abstract class FileSystemEntity {

    private String name;
    private String path;
    private String type;
    private float size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract float getSize();

    public void setSize(float size) {
        this.size = size;
    }
}
