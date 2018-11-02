/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucr.if4100.sqlaccess.business.interfaces;

import java.util.List;
import ucr.if4100.domain.Video;

/**
 *
 * @author fabian
 */
public interface IBandBiz {
    
    List<Video> getBand();
    
    Boolean insertBand(String id,String name,String foundationDate,String country,List members);
    Boolean updateBand(String id,String name,String foundationDate,String country,List members);
    Boolean deleteBand(String id);
}
