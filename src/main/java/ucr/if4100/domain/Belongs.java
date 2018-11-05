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
public class Belongs {
    
    private String playlistID;
    private String videoID;

    public Belongs() {
    }

    public Belongs(String playlistID, String videoID) {
        this.playlistID = playlistID;
        this.videoID = videoID;
    }

    public String getPlaylistID() {
        return playlistID;
    }

    public void setPlaylistID(String playlistID) {
        this.playlistID = playlistID;
    }

    public String getVideoID() {
        return videoID;
    }

    public void setVideoID(String videoID) {
        this.videoID = videoID;
    }

    @Override
    public String toString() {
        return "Belongs{" + "playlistID=" + playlistID + ", videoID=" + videoID + '}';
    }
    
    
    
}
