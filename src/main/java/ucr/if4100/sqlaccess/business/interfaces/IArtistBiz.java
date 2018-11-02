/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucr.if4100.sqlaccess.business.interfaces;

import java.util.List;
import ucr.if4100.domain.Artist;


/**
 *
 * @author Equipo
 */
public interface IArtistBiz {
    
    List<Artist> getArtists();
    
    Boolean insertArtist(String id,String firstName,String lastName,String nickName,String nationality,String birthday);
    Boolean updateArtist(String id,String firstName,String lastName,String nickName,String nationality,String birthday);
    Boolean deleteArtist(String id);
}
