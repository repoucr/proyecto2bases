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
import ucr.if4100.domain.Release;

/**
 *
 * @author fabian
 */
public class ReleaseDataProvider {
    public List<Release> getRelease() {
        Connection conn = null;
        ResultSet queryResult = null;
        List<Release> releases = new ArrayList<>();

        try {
            conn = DatabaseConnection.getDatabaseConnection();

            PreparedStatement getRelease = conn.prepareStatement("SELECT ID_artist, ID_video FROM release");

            queryResult = getRelease.executeQuery();

            while (queryResult.next()) {
                Release release = new Release();

                release.setArtistID(queryResult.getString("ID_artist"));
                release.setVideoID(queryResult.getString("ID_video"));
                

                releases.add(release);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReleaseDataProvider.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (queryResult != null) {
                try {
                    queryResult.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ReleaseDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ReleaseDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return releases;

    }

    public boolean insertRelease(Release newRelease) {
        Connection conn = null;
        Boolean wasSuccessfullyInserted = false;
        PreparedStatement insertRelease = null;
        try {
            conn = DatabaseConnection.getDatabaseConnection();

            String insertReleaseStm = String.format("INSERT INTO release (ID_artist, ID_video) VALUES ('%s', '%s')",
                     newRelease.getArtistID(),
                     newRelease.getVideoID());
                    

            insertRelease = conn.prepareStatement(insertReleaseStm);
            int insertResult = insertRelease.executeUpdate();
            if (insertResult == 1) {
                wasSuccessfullyInserted = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReleaseDataProvider.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (insertRelease != null) {
                try {
                    insertRelease.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ReleaseDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(ReleaseDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return wasSuccessfullyInserted;
    }


    public boolean deleteRelease(String deletedRelease) {
        Connection conn = null;
        Boolean wasSuccessfullyDeleted = false;
        PreparedStatement deleteRelease = null;
        try {
            conn = DatabaseConnection.getDatabaseConnection();

            String deleteReleaseStm = String.format("DELETE FROM release WHERE ID_artist = '%s' OR ID_Video = '%s'",deletedRelease,deletedRelease);
             
            deleteRelease = conn.prepareStatement(deleteReleaseStm);
            int updateResult = deleteRelease.executeUpdate();
            if (updateResult == 1) {
                wasSuccessfullyDeleted = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReleaseDataProvider.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (deleteRelease != null) {
                try {
                    deleteRelease.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ReleaseDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(ReleaseDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return wasSuccessfullyDeleted;
    }
}
