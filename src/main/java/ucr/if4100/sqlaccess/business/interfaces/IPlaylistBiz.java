/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucr.if4100.sqlaccess.business.interfaces;

import java.util.List;
import ucr.if4100.domain.Playlist;


/**
 *
 * @author fabian
 */
public interface IPlaylistBiz {
    
    List<Playlist> getPlaylist();
    
    Boolean insertBand(String id,String title,List videos);
    Boolean updateBand(String id,String title,List videos);
    Boolean deleteBand(String id);
}
