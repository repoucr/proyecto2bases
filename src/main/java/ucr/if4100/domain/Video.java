/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucr.if4100.domain;

import java.util.List;

/**
 *
 * @author fabian
 */
public class Video {
    
    private String id;
    private String title;
    private String category;
    private String url;
    private String year;
    private List artistList;

    public Video() {
    }

    public Video(String id, String title, String category, String url, String year, List artistList) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.url = url;
        this.year = year;
        this.artistList = artistList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public List getArtistList() {
        return artistList;
    }

    public void setArtistList(List artistList) {
        this.artistList = artistList;
    }

    @Override
    public String toString() {
        return "Video{" + "id=" + id + ", title=" + title + ", category=" + category + ", url=" + url + ", year=" + year + ", artistList=" + artistList + '}';
    }

    
   
    
    
}
