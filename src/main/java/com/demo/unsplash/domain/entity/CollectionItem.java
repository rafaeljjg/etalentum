package com.demo.unsplash.domain.entity; 
import java.util.Date;
import java.util.List; 



public class CollectionItem{
    public String id;
    public String title;
    public String description;
    public Date published_at;
    public Date last_collected_at;
    public Date updated_at;
    public boolean curated;
    public boolean featured;
    public int total_photos;
    public String share_key;
    public List<Tag> tags;
    public Links links;
    public User user;
    public CoverPhoto cover_photo;
    public List<PreviewPhoto> preview_photos;
}
