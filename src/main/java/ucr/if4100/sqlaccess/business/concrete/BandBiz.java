/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucr.if4100.sqlaccess.business.concrete;

import java.util.List;
import ucr.if4100.domain.Artist;
import ucr.if4100.domain.Band;
import ucr.if4100.domain.Video;
import ucr.if4100.sqlaccess.business.interfaces.IBandBiz;
import ucr.if4100.sqlaccess.data.ArtistDataProvider;
import ucr.if4100.sqlaccess.data.BandDataProvider;

/**
 *
 * @author fabian
 */
public class BandBiz implements IBandBiz {

    private BandDataProvider _dataProvider;
    
    public BandBiz(){
        this._dataProvider = new BandDataProvider();
    }
    
    @Override
    public List<Band> getBand() {
        return this._dataProvider.getBand();
    }

    @Override
    public Boolean insertBand(String id, String name, String foundationDate, String country) {
        Band newBand = new Band(id, name, foundationDate, country);
        return _dataProvider.insertBand(newBand);
    }

    @Override
    public Boolean updateBand(String id, String name, String foundationDate, String country) {
        Band newBand = new Band(id, name, foundationDate, country);
        return _dataProvider.updateBand(newBand);
    }

    @Override
    public Boolean deleteBand(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
