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
public class Release {
    private String artistID;
    private String videoID;
    private String name;

    public Release() {
    }

    public Release(String artistID, String videoID, String name) {
        this.artistID = artistID;
        this.videoID = videoID;
        this.name = name;
    }

    public String getArtistID() {
        return artistID;
    }

    public void setArtistID(String artistID) {
        this.artistID = artistID;
    }

    public String getVideoID() {
        return videoID;
    }

    public void setVideoID(String videoID) {
        this.videoID = videoID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Release{" + "artistID=" + artistID + ", videoID=" + videoID + ", name=" + name + '}';
    }

    
}
