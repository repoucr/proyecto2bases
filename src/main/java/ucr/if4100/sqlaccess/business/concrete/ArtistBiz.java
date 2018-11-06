/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucr.if4100.sqlaccess.business.concrete;

import java.util.List;
import ucr.if4100.domain.Artist;

import ucr.if4100.sqlaccess.data.ArtistDataProvider;
import ucr.if4100.sqlaccess.business.interfaces.IArtistBiz;

/**
 *
 * @author Equipo 
 * para mostrar la info
 * 
 * 
 */
public class ArtistBiz implements IArtistBiz{

    private ArtistDataProvider _dataProvider;
    
    public ArtistBiz(){
        this._dataProvider = new ArtistDataProvider();
    }
    

    @Override
    public List<Artist> getArtists() {
       return this._dataProvider.getArtist();
    }

    @Override
    public Boolean insertArtist(String id, String firstName, String lastName, String nickName, String nationality, String birthday) {
       Artist newArtist = new Artist(id, firstName, lastName, nickName,nationality,birthday);
       return _dataProvider.insertArtist(newArtist);
    }

    @Override
    public Boolean updateArtist(String id, String firstName, String lastName, String nickName, String nationality, String birthday) {
       Artist newArtist = new Artist(id, firstName, lastName, nickName,nationality,birthday);
       return _dataProvider.updateArtist(newArtist);
    }

    @Override
    public Boolean deleteArtist(String id) {
        return _dataProvider.deleteArtist(id);
    }
    
}
