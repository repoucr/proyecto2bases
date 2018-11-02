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
public interface IVideoBiz {
    
    List<Video> getVideos();
    
    Boolean insertVideo(String id,String title,String category,String url,List artistList);
    Boolean updateVideo(String id,String title,String category,String url,List artistList);
    Boolean deleteVideo(String id);
}
