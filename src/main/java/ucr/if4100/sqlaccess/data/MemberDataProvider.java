/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucr.if4100.sqlaccess.data;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ucr.if4100.domain.Members;

/**
 *
 * @author fabian
 */
public class MemberDataProvider {
        public List<Members> getMember() {
        Connection conn = null;
        ResultSet queryResult = null;
        List<Members> members = new ArrayList<>();

        try {
            conn = DatabaseConnection.getDatabaseConnection();

            PreparedStatement getMember = conn.prepareStatement("SELECT ID_artist, ID_band FROM member");

            queryResult = getMember.executeQuery();

            while (queryResult.next()) {
                Members member = new Members();

                member.setArtistID(queryResult.getString("ID_artist"));
                member.setBandID(queryResult.getString("ID_band"));
                

                members.add(member);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MemberDataProvider.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (queryResult != null) {
                try {
                    queryResult.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MemberDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MemberDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return members;

    }

    public boolean insertMember(Members newMember) {
        Connection conn = null;
        Boolean wasSuccessfullyInserted = false;
        PreparedStatement insertMember = null;
        try {
            conn = DatabaseConnection.getDatabaseConnection();

            String insertMemberStm = String.format("INSERT INTO member (ID_artist, ID_band) VALUES ('%s', '%s')",
                     newMember.getArtistID(),
                     newMember.getBandID());
                    

            insertMember = conn.prepareStatement(insertMemberStm);
            int insertResult = insertMember.executeUpdate();
            if (insertResult == 1) {
                wasSuccessfullyInserted = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MemberDataProvider.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (insertMember != null) {
                try {
                    insertMember.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MemberDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(MemberDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return wasSuccessfullyInserted;
    }


    public boolean deleteMember(String deletedMember) {
        Connection conn = null;
        Boolean wasSuccessfullyDeleted = false;
        PreparedStatement deleteMember = null;
        try {
            conn = DatabaseConnection.getDatabaseConnection();

            String deleteMemberStm = String.format("DELETE FROM member WHERE ID_artist = '%s' OR ID_Band = '%s'",deletedMember,deletedMember);
             
            deleteMember = conn.prepareStatement(deleteMemberStm);
            int updateResult = deleteMember.executeUpdate();
            if (updateResult == 1) {
                wasSuccessfullyDeleted = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MemberDataProvider.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (deleteMember != null) {
                try {
                    deleteMember.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MemberDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(MemberDataProvider.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return wasSuccessfullyDeleted;
    }
}
