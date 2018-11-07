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
    
 
    public List<Members> getMembers() {
        return this._dataProvider.getMember();
    }

   
    public Boolean insertMembers(String artistID, String bandID,String nickname) {
        Members newMembers = new Members(artistID, bandID, nickname);
        return _dataProvider.insertMember(newMembers);
    }
 
    public Boolean deleteMembers(String id) {
        return _dataProvider.deleteMember(id);
    }
}
