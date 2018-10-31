/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucr.if4100.domain;

/**
 *
 * @author fabian
 */
public class Video {
    
    private String title;
    private String category;
    private String url;
    private String artist;

    public Video() {
    }

    public Video(String title, String category, String url, String artist) {
        this.title = title;
        this.category = category;
        this.url = url;
        this.artist = artist;
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

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Playlist{" + "title=" + title + ", category=" + category + ", url=" + url + ", artist=" + artist + '}';
    }
    
    
}
