/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucr.if4100.sqlaccess.business.concrete;

/**
 *
 * @author fabian
 */
public class MemberBiz {
    
    private BandDataProvider _dataProvider;
    
    public BandBiz(){
        this._dataProvider = new BandDataProvider();
    }
    
 
    public List<Band> getBand() {
        return this._dataProvider.getBand();
    }

   
    public Boolean insertBand(String id, String name, String foundationDate, String country) {
        Band newBand = new Band(id, name, foundationDate, country);
        return _dataProvider.insertBand(newBand);
    }

   
    public Boolean updateBand(String id, String name, String foundationDate, String country) {
        Band newBand = new Band(id, name, foundationDate, country);
        return _dataProvider.updateBand(newBand);
    }

 
    public Boolean deleteBand(String id) {
        return _dataProvider.deleteBand(id);
    }
}
