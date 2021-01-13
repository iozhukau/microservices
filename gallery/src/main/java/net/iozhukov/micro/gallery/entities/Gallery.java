package net.iozhukov.micro.gallery.entities;

import java.util.List;

public class Gallery {
    private Integer id;
    private List<Object> images;

    public void setImages(List<Object> images) {
        this.images = images;
    }

    public List<Object> getImages() {
        return images;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
