/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucr.if4100.sqlaccess.business.concrete;

import java.util.List;
import ucr.if4100.domain.Belongs;
import ucr.if4100.sqlaccess.data.BelongsDataProvider;

/**
 *
 * @author Wilmata
 */
public class BelongsBiz {

    private BelongsDataProvider _dataProvider;

    public BelongsBiz() {
        this._dataProvider = new BelongsDataProvider();
    }

    public List<Belongs> getMembers() {
        return this._dataProvider.getBelongs();
    }

    public Boolean insertMembers(String artistID, String bandID) {
        Belongs newBelongs = new Belongs(artistID, bandID);
        return _dataProvider.insertBelongs(newBelongs);
    }

    public Boolean deleteMembers(String artistID) {
        return _dataProvider.deleteBelons(artistID);
    }
}
