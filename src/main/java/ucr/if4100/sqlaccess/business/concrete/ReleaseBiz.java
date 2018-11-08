/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucr.if4100.sqlaccess.business.concrete;

import java.util.List;
import ucr.if4100.domain.Members;
import ucr.if4100.domain.Release;
import ucr.if4100.sqlaccess.data.MemberDataProvider;
import ucr.if4100.sqlaccess.data.ReleaseDataProvider;

/**
 *
 * @author fabian
 */
public class ReleaseBiz {
     
    private ReleaseDataProvider _dataProvider;
    
    public ReleaseBiz(){
        this._dataProvider = new ReleaseDataProvider();
    }
    
 
    public List<Release> getRelease() {
        return this._dataProvider.getRelease();
    }

   
    public Boolean insertRelease(String artistID, String videoID,String name) {
        Release newRelease = new Release(artistID, videoID, name);
        return _dataProvider.insertRelease(newRelease);
    }
 
    public Boolean deleteRelease(String id) {
        return _dataProvider.deleteRelease(id);
    }
}
