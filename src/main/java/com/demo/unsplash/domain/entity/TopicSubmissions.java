package com.demo.unsplash.domain.entity; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class TopicSubmissions{
    @JsonProperty("textures-patterns") 
    public TexturesPatterns texturesPatterns;
    public Architecture architecture;
    public Wallpapers wallpapers;
    public Nature nature;
    @JsonProperty("arts-culture") 
    public ArtsCulture artsCulture;
    public Fashion fashion;
    public Experimental experimental;
    public Animals animals;
    public Travel travel;
    public Health health;
    public Athletics athletics;
}
