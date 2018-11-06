/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucr.if4100.sqlaccess.business.concrete;

import java.util.List;
import ucr.if4100.domain.Playlist;
import ucr.if4100.sqlaccess.business.interfaces.IPlaylistBiz;
import ucr.if4100.sqlaccess.data.PlaylistDataProvider;

/**
 *
 */
public class PlaylistBiz implements IPlaylistBiz {

    private PlaylistDataProvider _dataProvider;

    public PlaylistBiz() {
        this._dataProvider = new PlaylistDataProvider();
    }

    @Override
    public List<Playlist> getPlaylist() {
        return this._dataProvider.getPlaylist();
    }

    @Override
    public Boolean insertPlaylist(String id, String title) {
        Playlist newPlaylist = new Playlist(id, title);
        return _dataProvider.insertPlaylist(newPlaylist);
    }

    @Override
    public Boolean updatePlaylist(String id, String title) {
        Playlist newPlaylist = new Playlist(id, title);
        return _dataProvider.updatePlaylist(newPlaylist);
    }

    @Override
    public Boolean deletePlaylist(String id) {
        return _dataProvider.deletePlaylist(id);
    }

}
