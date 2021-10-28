package com.demo.unsplash.domain.entity; 

import java.util.Date;


import java.util.List; 
public class CoverPhoto{
    public String id;
    public Date created_at;
    public Date updated_at;
    public Date promoted_at;
    public int width;
    public int height;
    public String color;
    public String blur_hash;
    public String description;
    public String alt_description;
    public Urls urls;
    public Links links;
    public List<Object> categories;
    public int likes;
    public boolean liked_by_user;
    public List<Object> current_user_collections;
    public Object sponsorship;
    public TopicSubmissions topic_submissions;
    public User user;
}
