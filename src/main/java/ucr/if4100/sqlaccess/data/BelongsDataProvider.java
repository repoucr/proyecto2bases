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
import ucr.if4100.domain.Belongs;

/**
 *
 * @author fabian
 */
public class BelongsDataProvider {
    public List<Belongs> getBelongs() {
        Connection conn = null;
        ResultSet queryResult = null;
        List<Belongs> belongs = new ArrayList<>();

        try {
            conn = DatabaseConnection.getDatabaseConnection();

            PreparedStatement getBelongs = conn.prepareStatement("SELECT ID_playlist, ID_video, title FROM belongs");

            queryResult = getBelongs.executeQuery();

            while (queryResult.next()) {
                Belongs belong = new Belongs();

                belong.setPlaylistID(queryResult.getString("ID_playlist"));
                belong.setVideoID(queryResult.getString("ID_video"));
                belong.setTitle(queryResult.getString("title"));

                belongs.add(belong);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BelongsDataProvider.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (queryResult != null) {
                try {
                    queryResult.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BelongsDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BelongsDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return belongs;

    }

    public boolean insertBelongs(Belongs newBelong) {
        Connection conn = null;
        Boolean wasSuccessfullyInserted = false;
        PreparedStatement insertBelong = null;
        try {
            conn = DatabaseConnection.getDatabaseConnection();

            String insertBelongsStm = String.format("INSERT INTO belongs (ID_playlist, ID_video, title) VALUES ('%s', '%s', '%s')",
                     newBelong.getPlaylistID(),
                     newBelong.getVideoID(),
                     newBelong.getTitle());
                    

            insertBelong = conn.prepareStatement(insertBelongsStm);
            int insertResult = insertBelong.executeUpdate();
            if (insertResult == 1) {
                wasSuccessfullyInserted = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BelongsDataProvider.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (insertBelong != null) {
                try {
                    insertBelong.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BelongsDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(BelongsDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return wasSuccessfullyInserted;
    }


    public boolean deleteBelons(String deletedBelongs) {
        Connection conn = null;
        Boolean wasSuccessfullyDeleted = false;
        PreparedStatement deleteBelongs = null;
        try {
            conn = DatabaseConnection.getDatabaseConnection();

            String deleteBelongsStm = String.format("DELETE FROM belongs WHERE ID_playlist = '%s' OR ID_Video = '%s'",deletedBelongs,deletedBelongs);
             
            deleteBelongs = conn.prepareStatement(deleteBelongsStm);
            int updateResult = deleteBelongs.executeUpdate();
            if (updateResult == 1) {
                wasSuccessfullyDeleted = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BelongsDataProvider.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (deleteBelongs != null) {
                try {
                    deleteBelongs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BelongsDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(BelongsDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return wasSuccessfullyDeleted;
    }
}
