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
public class Playlist {
    
    private String id;
    private String title;
    private List videos;

    public Playlist() {
    }

    public Playlist(String id, String title, List videos) {
        this.id = id;
        this.title = title;
        this.videos = videos;
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

    public List getVideos() {
        return videos;
    }

    public void setVideos(List videos) {
        this.videos = videos;
    }

    @Override
    public String toString() {
        return "Playlist{" + "id=" + id + ", title=" + title + ", videos=" + videos + '}';
    }

    
    
}
