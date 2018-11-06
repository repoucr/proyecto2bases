/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucr.if4100.sqlaccess.business.concrete;

import java.util.List;
import ucr.if4100.domain.Members;
import ucr.if4100.sqlaccess.data.MemberDataProvider;



/**
 *
 * @author fabian
 */
public class MemberBiz {
    
    private MemberDataProvider _dataProvider;
    
    public MemberBiz(){
        this._dataProvider = new MemberDataProvider();
    }
    
 
    public List<Members> getMembers(String id) {
        return this._dataProvider.getMember(id);
    }

   
    public Boolean insertMembers(String artistID, String bandID) {
        Members newMembers = new Members(artistID, bandID);
        return _dataProvider.insertMember(newMembers);
    }
 
    public Boolean deleteMembers(String id) {
        return _dataProvider.deleteMember(id);
    }
}