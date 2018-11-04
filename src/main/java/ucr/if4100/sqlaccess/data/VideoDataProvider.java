/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucr.if4100.sqlaccess.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ucr.if4100.domain.Video;

/**
 *
 * @author fabian
 */
public class VideoDataProvider {
    public List<Video> getVideo() {
        Connection conn = null;
        ResultSet queryResult = null;
        List<Video> videos = new ArrayList<>();

        try {
            conn = DatabaseConnection.getDatabaseConnection();

            PreparedStatement getArtist = conn.prepareStatement("SELECT ID, title, category, year, url FROM video");

            queryResult = getArtist.executeQuery();

            while (queryResult.next()) {
                    Video video = new Video();

                video.setId(queryResult.getString("ID"));
                video.setTitle(queryResult.getString("title"));
                video.setCategory(queryResult.getString("category"));
                video.setYear(queryResult.getString("year"));
                video.setUrl(queryResult.getString("url"));

                videos.add(video);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ArtistDataProvider.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (queryResult != null) {
                try {
                    queryResult.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ArtistDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ArtistDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return videos;

    }

    public boolean insertVideo(Video newVideo) {
        Connection conn = null;
        Boolean wasSuccessfullyInserted = false;
        PreparedStatement insertVideo = null;
        try {
            conn = DatabaseConnection.getDatabaseConnection();

            String insertArtistStm = String.format("INSERT INTO VIDEO (ID, title, category, year, url) VALUES ('%s', '%s', '%s', '%s', '%s')",
                     newVideo.getId(),
                     newVideo.getTitle(),
                     newVideo.getCategory(),
                     newVideo.getYear(),
                     newVideo.getUrl());

            insertVideo = conn.prepareStatement(insertArtistStm);
            int insertResult = insertVideo.executeUpdate();
            if (insertResult == 1) {
                wasSuccessfullyInserted = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VideoDataProvider.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (insertVideo != null) {
                try {
                    insertVideo.close();
                } catch (SQLException ex) {
                    Logger.getLogger(VideoDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(VideoDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return wasSuccessfullyInserted;
    }
    
    public boolean updateVideo(Video updatedVideo) {
        Connection conn = null;
        Boolean wasSuccessfullyUpdated = false;
        PreparedStatement updateVideo = null;
        try {
            conn = DatabaseConnection.getDatabaseConnection();

            String updateVideoStm = String.format("UPDATE VIDEO SET title = '%s',SET category = '%s',SET year = '%s',SET url = '%s' WHERE ID = '%s'",
                 
                     updatedVideo.getTitle(),
                     updatedVideo.getCategory(),
                     updatedVideo.getYear(),
                     updatedVideo.getUrl(),
                     updatedVideo.getId());

            updateVideo = conn.prepareStatement(updateVideoStm);
            int updateResult = updateVideo.executeUpdate();
            if (updateResult == 1) {
                wasSuccessfullyUpdated = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VideoDataProvider.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (updateVideo!= null) {
                try {
                    updateVideo.close();
                } catch (SQLException ex) {
                    Logger.getLogger(VideoDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(VideoDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return wasSuccessfullyUpdated;
    }

    public boolean deleteVideo(String deletedVideo) {
        Connection conn = null;
        Boolean wasSuccessfullyDeleted = false;
        PreparedStatement deleteVideo = null;
        try {
            conn = DatabaseConnection.getDatabaseConnection();

            String deleteVideoStm = String.format("DELETE FROM ARTIST WHERE ID = '%s'",deletedVideo);
             
            deleteVideo = conn.prepareStatement(deleteVideoStm);
            int updateResult = deleteVideo.executeUpdate();
            if (updateResult == 1) {
                wasSuccessfullyDeleted = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VideoDataProvider.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (deleteVideo != null) {
                try {
                    deleteVideo.close();
                } catch (SQLException ex) {
                    Logger.getLogger(VideoDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(VideoDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return wasSuccessfullyDeleted;
    }
}
