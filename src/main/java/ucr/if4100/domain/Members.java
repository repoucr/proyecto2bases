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
public class Members {
    
    private String artistID;
    private String bandID;

    public Members() {
    }

    public Members(String artistID, String bandID) {
        this.artistID = artistID;
        this.bandID = bandID;
    }

    public String getArtistID() {
        return artistID;
    }

    public void setArtistID(String artistID) {
        this.artistID = artistID;
    }

    public String getBandID() {
        return bandID;
    }

    public void setBandID(String bandID) {
        this.bandID = bandID;
    }

    @Override
    public String toString() {
        return "Member{" + "artistID=" + artistID + ", bandID=" + bandID + '}';
    }
    
    
    
}
