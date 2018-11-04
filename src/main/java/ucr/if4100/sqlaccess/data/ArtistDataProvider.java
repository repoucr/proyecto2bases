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
import ucr.if4100.domain.Artist;

/**
 *
 * @author Equipo
 */
public class ArtistDataProvider {

    public List<Artist> getArtist() {
        Connection conn = null;
        ResultSet queryResult = null;
        List<Artist> artists = new ArrayList<>();

        try {
            conn = DatabaseConnection.getDatabaseConnection();

            PreparedStatement getArtist = conn.prepareStatement("SELECT ID, firstName, lastName, nickname, nationality, birthday FROM artist");

            queryResult = getArtist.executeQuery();

            while (queryResult.next()) {
                Artist artist = new Artist();

                artist.setId(queryResult.getString("ID"));
                artist.setFirstName(queryResult.getString("firstName"));
                artist.setLastName(queryResult.getString("lastName"));
                artist.setNickName(queryResult.getString("nickname"));
                artist.setNationality(queryResult.getString("nationality"));
                artist.setBirthday(queryResult.getString("birthday"));

                artists.add(artist);
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

        return artists;

    }

    public boolean insertArtist(Artist newArtist) {
        Connection conn = null;
        Boolean wasSuccessfullyInserted = false;
        PreparedStatement insertArtist = null;
        try {
            conn = DatabaseConnection.getDatabaseConnection();

            String insertArtistStm = String.format("INSERT INTO ARTIST (ID, firstName, lastName, nickname, nationality, birthday) VALUES ('%s', '%s', '%s', '%s', '%s', '%s')",
                     newArtist.getId(),
                     newArtist.getFirstName(),
                     newArtist.getLastName(),
                     newArtist.getNickName(),
                     newArtist.getNationality(),
                     newArtist.getBirthday());

            insertArtist = conn.prepareStatement(insertArtistStm);
            int insertResult = insertArtist.executeUpdate();
            if (insertResult == 1) {
                wasSuccessfullyInserted = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ArtistDataProvider.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (insertArtist != null) {
                try {
                    insertArtist.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ArtistDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(ArtistDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return wasSuccessfullyInserted;
    }
    
    public boolean updateArtist(Artist updatedArtist) {
        Connection conn = null;
        Boolean wasSuccessfullyUpdated = false;
        PreparedStatement updateArtist = null;
        try {
            conn = DatabaseConnection.getDatabaseConnection();

            String updateArtistStm = String.format("UPDATE ARTIST SET firstName = '%s',SET lastName = '%s',SET nickname = '%s',SET nationality = '%s',SET birthday = '%s'WHERE ID = '%s'",
                 
                     updatedArtist.getFirstName(),
                     updatedArtist.getLastName(),
                     updatedArtist.getNickName(),
                     updatedArtist.getNationality(),
                     updatedArtist.getBirthday(),
                     updatedArtist.getId());

            updateArtist = conn.prepareStatement(updateArtistStm);
            int updateResult = updateArtist.executeUpdate();
            if (updateResult == 1) {
                wasSuccessfullyUpdated = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ArtistDataProvider.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (updateArtist != null) {
                try {
                    updateArtist.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ArtistDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(ArtistDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return wasSuccessfullyUpdated;
    }

    public boolean deleteArtist(String deletedArtist) {
        Connection conn = null;
        Boolean wasSuccessfullyDeleted = false;
        PreparedStatement deleteArtist = null;
        try {
            conn = DatabaseConnection.getDatabaseConnection();

            String deleteArtistStm = String.format("DELETE FROM ARTIST WHERE ID = '%s'",deletedArtist);
             
            deleteArtist = conn.prepareStatement(deleteArtistStm);
            int updateResult = deleteArtist.executeUpdate();
            if (updateResult == 1) {
                wasSuccessfullyDeleted = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ArtistDataProvider.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (deleteArtist != null) {
                try {
                    deleteArtist.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ArtistDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(ArtistDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return wasSuccessfullyDeleted;
    }

}
