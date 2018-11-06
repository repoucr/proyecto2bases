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
import ucr.if4100.domain.Band;


/**
 *
 */
public class BandDataProvider {

    public List<Band> getBand() {
        Connection conn = null;
        ResultSet queryResult = null;
        List<Band> bands = new ArrayList<>();

        try {
            conn = DatabaseConnection.getDatabaseConnection();

            PreparedStatement getBand = conn.prepareStatement("SELECT ID, name, foundationDate, country FROM band");

            queryResult = getBand.executeQuery();

            while (queryResult.next()) {
                Band band = new Band();

                band.setId(queryResult.getString("ID"));
                band.setName(queryResult.getString("name"));
                band.setFoundationDate(queryResult.getString("foundationDate"));
                band.setCountry(queryResult.getString("country"));

                bands.add(band);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BandDataProvider.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (queryResult != null) {
                try {
                    queryResult.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BandDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BandDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return bands;

    }

    public boolean insertBand(Band newBand) {
        Connection conn = null;
        Boolean wasSuccessfullyInserted = false;
        PreparedStatement insertBand = null;
        try {
            conn = DatabaseConnection.getDatabaseConnection();

            String insertBandStm = String.format("INSERT INTO band (ID, name, foundationDate, country) VALUES ('%s', '%s', '%s', '%s')",
                    newBand.getId(),
                    newBand.getName(),
                    newBand.getFoundationDate(),
                    newBand.getCountry());

            insertBand = conn.prepareStatement(insertBandStm);
            int insertResult = insertBand.executeUpdate();
            if (insertResult == 1) {
                wasSuccessfullyInserted = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BandDataProvider.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (insertBand != null) {
                try {
                    insertBand.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BandDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(BandDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return wasSuccessfullyInserted;
    }

    public boolean updateBand(Band updatedBand) {
        Connection conn = null;
        Boolean wasSuccessfullyUpdated = false;
        PreparedStatement updateBand = null;
        try {
            conn = DatabaseConnection.getDatabaseConnection();

            String updateBandStm = String.format("UPDATE BAND SET name = '%s',SET foundationDate = '%s',SET country = '%s','WHERE ID = '%s'",
                    updatedBand.getName(),
                    updatedBand.getFoundationDate(),
                    updatedBand.getCountry(),
                    updatedBand.getId());

                    updateBand = conn.prepareStatement(updateBandStm);
            int updateResult = updateBand.executeUpdate();
            if (updateResult == 1) {
                wasSuccessfullyUpdated = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BandDataProvider.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (updateBand != null) {
                try {
                    updateBand.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BandDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(BandDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return wasSuccessfullyUpdated;
    }

    public boolean deleteBand(String deletedband) {
        Connection conn = null;
        Boolean wasSuccessfullyDeleted = false;
        PreparedStatement deleteBand = null;
        try {
            conn = DatabaseConnection.getDatabaseConnection();

            String deleteBandStm = String.format("DELETE FROM BAND WHERE ID = '%s'", deletedband);

            deleteBand = conn.prepareStatement(deleteBandStm);
            int updateResult = deleteBand.executeUpdate();
            if (updateResult == 1) {
                wasSuccessfullyDeleted = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BandDataProvider.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (deleteBand != null) {
                try {
                    deleteBand.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BandDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(BandDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return wasSuccessfullyDeleted;
    }

}
