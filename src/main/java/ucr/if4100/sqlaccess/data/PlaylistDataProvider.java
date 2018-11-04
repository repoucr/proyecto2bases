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
import ucr.if4100.domain.Playlist;

/**
 *
 * @author fabian
 */
public class PlaylistDataProvider {
    
    public List<Playlist> getPlaylist() {
        Connection conn = null;
        ResultSet queryResult = null;
        List<Playlist> playlists = new ArrayList<>();

        try {
            conn = DatabaseConnection.getDatabaseConnection();

            PreparedStatement getPlaylist = conn.prepareStatement("SELECT ID, title FROM playlist");

            queryResult = getPlaylist.executeQuery();

            while (queryResult.next()) {
                Playlist playlist = new Playlist();

                playlist.setId(queryResult.getString("ID"));
                playlist.setTitle(queryResult.getString("title"));
                

                playlists.add(playlist);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PlaylistDataProvider.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (queryResult != null) {
                try {
                    queryResult.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PlaylistDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PlaylistDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return playlists;

    }

    public boolean insertPlaylist(Playlist newPlaylist) {
        Connection conn = null;
        Boolean wasSuccessfullyInserted = false;
        PreparedStatement insertPlaylist = null;
        try {
            conn = DatabaseConnection.getDatabaseConnection();

            String insertPlaylistStm = String.format("INSERT INTO playlist (ID, title) VALUES ('%s', '%s')",
                     newPlaylist.getId(),
                     newPlaylist.getTitle());
                    

            insertPlaylist = conn.prepareStatement(insertPlaylistStm);
            int insertResult = insertPlaylist.executeUpdate();
            if (insertResult == 1) {
                wasSuccessfullyInserted = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PlaylistDataProvider.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (insertPlaylist != null) {
                try {
                    insertPlaylist.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PlaylistDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(PlaylistDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return wasSuccessfullyInserted;
    }
    
    public boolean updatePlaylist(Playlist updatedPlaylist) {
        Connection conn = null;
        Boolean wasSuccessfullyUpdated = false;
        PreparedStatement updatePlaylist = null;
        try {
            conn = DatabaseConnection.getDatabaseConnection();

            String updatePlaylistStm = String.format("UPDATE PLAYLIST SET title = '%s'WHERE ID = '%s'",
                 
                     updatedPlaylist.getTitle(),
                     updatedPlaylist.getId());

            updatePlaylist = conn.prepareStatement(updatePlaylistStm);
            int updateResult = updatePlaylist.executeUpdate();
            if (updateResult == 1) {
                wasSuccessfullyUpdated = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PlaylistDataProvider.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (updatePlaylist != null) {
                try {
                    updatePlaylist.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PlaylistDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(PlaylistDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return wasSuccessfullyUpdated;
    }

    public boolean deletePlaylist(String deletedPlaylist) {
        Connection conn = null;
        Boolean wasSuccessfullyDeleted = false;
        PreparedStatement deletePlaylist = null;
        try {
            conn = DatabaseConnection.getDatabaseConnection();

            String deletePlaylistStm = String.format("DELETE FROM PLAYLIST WHERE ID = '%s'",deletedPlaylist);
             
            deletePlaylist = conn.prepareStatement(deletePlaylistStm);
            int updateResult = deletePlaylist.executeUpdate();
            if (updateResult == 1) {
                wasSuccessfullyDeleted = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PlaylistDataProvider.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (deletePlaylist != null) {
                try {
                    deletePlaylist.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PlaylistDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(PlaylistDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return wasSuccessfullyDeleted;
    }
}
