/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucr.if4100.sqlaccess.business.concrete;

import java.util.List;
import ucr.if4100.domain.Artist;
import ucr.if4100.domain.Video;
import ucr.if4100.sqlaccess.business.interfaces.IVideoBiz;
import ucr.if4100.sqlaccess.data.ArtistDataProvider;
import ucr.if4100.sqlaccess.data.VideoDataProvider;

/**
 *
 * @author fabian
 */
public class VideoBiz implements IVideoBiz {

    private VideoDataProvider _dataProvider;
    
    public VideoBiz(){
        this._dataProvider = new VideoDataProvider();
    }
    @Override
    public List<Video> getVideos() {
       return this._dataProvider.getVideo();
    }

    @Override
    public Boolean insertVideo(String id, String title, String category, String url,String year) {
        Video newVideo = new Video(id, title, category, url, year);
        return _dataProvider.insertVideo(newVideo);
    }

    @Override
    public Boolean updateVideo(String id, String title, String category, String url,String year) {
        Video newVideo = new Video(id, title, category, url, year);
        return _dataProvider.updateVideo(newVideo);
    }

    @Override
    public Boolean deleteVideo(String id) {
         return _dataProvider.deleteVideo(id);
    }
    
}
