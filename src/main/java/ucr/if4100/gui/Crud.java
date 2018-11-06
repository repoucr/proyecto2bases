/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucr.if4100.gui;

import java.util.List;
import ucr.if4100.domain.Artist;
import ucr.if4100.domain.Band;
import ucr.if4100.domain.Members;
import ucr.if4100.domain.Video;
import ucr.if4100.sqlaccess.business.concrete.ArtistBiz;
import ucr.if4100.sqlaccess.business.concrete.BandBiz;
import ucr.if4100.sqlaccess.business.concrete.MemberBiz;
import ucr.if4100.sqlaccess.business.concrete.VideoBiz;
import ucr.if4100.sqlaccess.business.interfaces.IArtistBiz;

/**
 *
 *
 */
public class Crud extends javax.swing.JFrame {

    /**
     * Creates new form Crud2
     */
    ArtistBiz artistBiz = new ArtistBiz();
    BandBiz bandBiz = new BandBiz();
    MemberBiz memberBiz = new MemberBiz();
    VideoBiz videoBiz = new VideoBiz();

    public Crud() {
        initComponents();
        fillArtistTable();
        fillArtistListBandTable();
        fillBandTable();
        fillVideoTable();
        jButton1.setEnabled(false);
        refreshBandButton.setEnabled(false);

    }

    public void fillArtistTable() {
        List<Artist> artist = artistBiz.getArtists();
        String[][] arrayTableArtist = new String[artist.size()][6];
        for (int i = 0; i < artist.size(); i++) {
            arrayTableArtist[i][0] = artist.get(i).getId();
            arrayTableArtist[i][1] = artist.get(i).getFirstName();
            arrayTableArtist[i][2] = artist.get(i).getLastName();
            arrayTableArtist[i][3] = artist.get(i).getNickName();
            arrayTableArtist[i][4] = artist.get(i).getNationality();
            arrayTableArtist[i][5] = artist.get(i).getBirthday();
            deleteArtistTable.setModel(new javax.swing.table.DefaultTableModel(arrayTableArtist, new String[]{"ID", "First Name", "Last Name", "Nickname", "Nationality", "Birthday"}));
        }
    }

    private void fillBandTable() {
        List<Band> band = bandBiz.getBand();
        String[][] arrayTableBand = new String[band.size()][4];
        for (int i = 0; i < band.size(); i++) {
            arrayTableBand[i][0] = band.get(i).getId();
            arrayTableBand[i][1] = band.get(i).getName();
            arrayTableBand[i][2] = band.get(i).getCountry();
            arrayTableBand[i][3] = band.get(i).getFoundationDate();
            bandsTable.setModel(new javax.swing.table.DefaultTableModel(arrayTableBand, new String[]{"ID", "Name", "Country", "Fundation Date"}));
        }
    }

    private void fillArtistListBandTable() {
        List<Artist> artist = artistBiz.getArtists();
        String[][] arrayTableArtist = new String[artist.size()][4];
        for (int i = 0; i < artist.size(); i++) {
            arrayTableArtist[i][0] = artist.get(i).getId();
            arrayTableArtist[i][1] = artist.get(i).getFirstName();
            arrayTableArtist[i][2] = artist.get(i).getLastName();
            arrayTableArtist[i][3] = artist.get(i).getNickName();

            artistListBandTable.setModel(new javax.swing.table.DefaultTableModel(arrayTableArtist, new String[]{"ID", "First Name", "Last Name", "Nickname"}));
        }
    }

    private void fillBandMembersTable(String id) {
        List<Members> members = memberBiz.getMembers(id);
        String[][] arrayTableArtist = new String[members.size()][4];
        for (int i = 0; i < members.size(); i++) {
            List<Artist> artist = artistBiz.getArtists();
            for (int j = 0; j < artist.size(); j++) {
                if (members.get(i).getArtistID().equals(artist.get(j).getId())) {
                    arrayTableArtist[i][0] = artist.get(i).getId();
                    arrayTableArtist[i][1] = artist.get(i).getFirstName();
                    arrayTableArtist[i][2] = artist.get(i).getLastName();
                    arrayTableArtist[i][3] = artist.get(i).getNickName();
                }

            }
            bandMembersTable.setModel(new javax.swing.table.DefaultTableModel(arrayTableArtist, new String[]{"ID", "First Name", "Last Name", "Nickname"}));
        }
    }

    private void fillVideoTable() {
        List<Video> videos = videoBiz.getVideos();
        String[][] arrayTableVideo = new String[videos.size()][5];
        for (int i = 0; i < videos.size(); i++) {
            arrayTableVideo[i][0] = videos.get(i).getId();
            arrayTableVideo[i][1] = videos.get(i).getTitle();
            arrayTableVideo[i][2] = videos.get(i).getCategory();
            arrayTableVideo[i][3] = videos.get(i).getUrl();
            arrayTableVideo[i][4] = videos.get(i).getYear();

            videoTable.setModel(new javax.swing.table.DefaultTableModel(arrayTableVideo, new String[]{"ID", "Title", "Category", "URL", "Year"}));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        playlistTable = new javax.swing.JTable();
        label20 = new java.awt.Label();
        jScrollPane9 = new javax.swing.JScrollPane();
        addVideoList = new javax.swing.JList<>();
        label21 = new java.awt.Label();
        idPlaylistTextfield = new javax.swing.JTextField();
        label22 = new java.awt.Label();
        namePlaylistTextfield = new javax.swing.JTextField();
        label23 = new java.awt.Label();
        addVideoToPlaylistButton = new javax.swing.JButton();
        createPlaylistButton = new javax.swing.JButton();
        deleteVideoFromPlaylistButton = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        deleteVideoList = new javax.swing.JList<>();
        cleanPlaylistButton = new javax.swing.JButton();
        refreshPlaylistButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bandsTable = new javax.swing.JTable();
        label6 = new java.awt.Label();
        idBandTextField = new javax.swing.JTextField();
        label7 = new java.awt.Label();
        bandNameTextField = new javax.swing.JTextField();
        label8 = new java.awt.Label();
        countryBandTextField = new javax.swing.JTextField();
        label10 = new java.awt.Label();
        createBandButton = new javax.swing.JButton();
        deleteBandButton = new javax.swing.JButton();
        label11 = new java.awt.Label();
        addBandButton = new javax.swing.JButton();
        label12 = new java.awt.Label();
        foundationDateTextField = new javax.swing.JTextField();
        cleanBandButton = new javax.swing.JButton();
        refreshBandButton = new javax.swing.JButton();
        deleteBandMemberButton = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        bandMembersTable = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        artistListBandTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        deleteArtistTable = new javax.swing.JTable();
        deleteArtistButton = new javax.swing.JButton();
        addArtistButton = new javax.swing.JButton();
        idArtistTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        firstNameTextField = new javax.swing.JTextField();
        nicknameTextField = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        Nationality = new javax.swing.JLabel();
        countryTextField = new javax.swing.JTextField();
        birthdayTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cleanArtistButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        videoTable = new javax.swing.JTable();
        label13 = new java.awt.Label();
        deleteArtistVideoButton = new javax.swing.JButton();
        label14 = new java.awt.Label();
        label15 = new java.awt.Label();
        idVideoTextField = new javax.swing.JTextField();
        label16 = new java.awt.Label();
        nameVideoTextField = new javax.swing.JTextField();
        label17 = new java.awt.Label();
        categoryVideoTextField = new javax.swing.JTextField();
        label18 = new java.awt.Label();
        urlVideoTextField = new javax.swing.JTextField();
        label19 = new java.awt.Label();
        yearVideoTextField = new javax.swing.JTextField();
        addNewVideoButton = new javax.swing.JButton();
        addVideoButton = new javax.swing.JButton();
        cleanVideoButton = new javax.swing.JButton();
        refreshPlaylistButton1 = new javax.swing.JButton();
        deleteVideoButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1049, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane7.setBackground(new java.awt.Color(51, 0, 51));
        jTabbedPane7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane7MouseClicked(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        playlistTable.setForeground(new java.awt.Color(204, 0, 204));
        playlistTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ));
        playlistTable.setGridColor(new java.awt.Color(213, 213, 213));
        playlistTable.setName(""); // NOI18N
        playlistTable.setRowHeight(1);
        playlistTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        playlistTable.setSelectionForeground(new java.awt.Color(204, 0, 204));
        jScrollPane8.setViewportView(playlistTable);
        playlistTable.getAccessibleContext().setAccessibleName("");

        label20.setForeground(new java.awt.Color(147, 62, 197));
        label20.setText("Video(s)");

        addVideoList.setForeground(new java.awt.Color(147, 62, 197));
        addVideoList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        addVideoList.setSelectionBackground(new java.awt.Color(255, 255, 255));
        addVideoList.setSelectionForeground(new java.awt.Color(204, 0, 204));
        jScrollPane9.setViewportView(addVideoList);

        label21.setForeground(new java.awt.Color(147, 62, 197));
        label21.setText("Videos");

        idPlaylistTextfield.setForeground(new java.awt.Color(204, 0, 204));
        idPlaylistTextfield.setToolTipText("ID");
        idPlaylistTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPlaylistTextfieldActionPerformed(evt);
            }
        });

        label22.setForeground(new java.awt.Color(147, 62, 197));
        label22.setText("ID");

        namePlaylistTextfield.setForeground(new java.awt.Color(204, 0, 204));
        namePlaylistTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namePlaylistTextfieldActionPerformed(evt);
            }
        });

        label23.setForeground(new java.awt.Color(147, 62, 197));
        label23.setText("Title");

        addVideoToPlaylistButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus.png"))); // NOI18N
        addVideoToPlaylistButton.setContentAreaFilled(false);
        addVideoToPlaylistButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVideoToPlaylistButtonActionPerformed(evt);
            }
        });

        createPlaylistButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/success.png"))); // NOI18N
        createPlaylistButton.setContentAreaFilled(false);
        createPlaylistButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPlaylistButtonActionPerformed(evt);
            }
        });

        deleteVideoFromPlaylistButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbish-bin-delete-button.png"))); // NOI18N
        deleteVideoFromPlaylistButton.setToolTipText("");
        deleteVideoFromPlaylistButton.setContentAreaFilled(false);
        deleteVideoFromPlaylistButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteVideoFromPlaylistButtonActionPerformed(evt);
            }
        });

        deleteVideoList.setForeground(new java.awt.Color(147, 62, 197));
        deleteVideoList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        deleteVideoList.setSelectionBackground(new java.awt.Color(255, 255, 255));
        deleteVideoList.setSelectionForeground(new java.awt.Color(204, 0, 204));
        jScrollPane10.setViewportView(deleteVideoList);

        cleanPlaylistButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sweep.png"))); // NOI18N
        cleanPlaylistButton.setContentAreaFilled(false);

        refreshPlaylistButton.setBackground(new java.awt.Color(255, 255, 255));
        refreshPlaylistButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/refresh.png"))); // NOI18N
        refreshPlaylistButton.setContentAreaFilled(false);
        refreshPlaylistButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshPlaylistButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label20, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(deleteVideoFromPlaylistButton))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(addVideoToPlaylistButton)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idPlaylistTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label23, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namePlaylistTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cleanPlaylistButton))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(refreshPlaylistButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(createPlaylistButton)))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(label21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(label22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idPlaylistTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(cleanPlaylistButton)))
                        .addGap(15, 15, 15)
                        .addComponent(label23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(namePlaylistTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(createPlaylistButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(refreshPlaylistButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(label20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteVideoFromPlaylistButton)
                    .addComponent(addVideoToPlaylistButton))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jTabbedPane7.addTab("Playlist", jPanel5);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bandsTable.setForeground(new java.awt.Color(204, 0, 204));
        bandsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Country", "Fundation Date"
            }
        ));
        bandsTable.setFillsViewportHeight(true);
        bandsTable.setGridColor(new java.awt.Color(213, 213, 213));
        bandsTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        bandsTable.setSelectionForeground(new java.awt.Color(204, 0, 204));
        bandsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bandsTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(bandsTable);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 301, 202));

        label6.setForeground(new java.awt.Color(147, 62, 197));
        label6.setText("ID");
        jPanel4.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, -1, -1));

        idBandTextField.setForeground(new java.awt.Color(204, 0, 204));
        idBandTextField.setToolTipText("ID");
        idBandTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idBandTextFieldActionPerformed(evt);
            }
        });
        jPanel4.add(idBandTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, 178, -1));

        label7.setForeground(new java.awt.Color(147, 62, 197));
        label7.setText("Band name");
        jPanel4.add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, -1, -1));

        bandNameTextField.setForeground(new java.awt.Color(204, 0, 204));
        bandNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bandNameTextFieldActionPerformed(evt);
            }
        });
        jPanel4.add(bandNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 178, -1));

        label8.setForeground(new java.awt.Color(147, 62, 197));
        label8.setText("Country");
        jPanel4.add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 180, -1, -1));

        countryBandTextField.setForeground(new java.awt.Color(204, 0, 204));
        countryBandTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryBandTextFieldActionPerformed(evt);
            }
        });
        jPanel4.add(countryBandTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 210, 178, -1));

        label10.setForeground(new java.awt.Color(147, 62, 197));
        label10.setText("Fundation date");
        jPanel4.add(label10, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 240, -1, -1));

        createBandButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/success.png"))); // NOI18N
        createBandButton.setToolTipText("Click to create a band.");
        createBandButton.setContentAreaFilled(false);
        createBandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBandButtonActionPerformed(evt);
            }
        });
        jPanel4.add(createBandButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 300, -1, -1));

        deleteBandButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbish-bin-delete-button.png"))); // NOI18N
        deleteBandButton.setContentAreaFilled(false);
        deleteBandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBandButtonActionPerformed(evt);
            }
        });
        jPanel4.add(deleteBandButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        label11.setForeground(new java.awt.Color(147, 62, 197));
        label11.setText("Members");
        jPanel4.add(label11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        addBandButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus.png"))); // NOI18N
        addBandButton.setContentAreaFilled(false);
        addBandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBandButtonActionPerformed(evt);
            }
        });
        jPanel4.add(addBandButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, -1, -1));

        label12.setForeground(new java.awt.Color(147, 62, 197));
        label12.setText("Artists ");
        jPanel4.add(label12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, -1));

        foundationDateTextField.setForeground(new java.awt.Color(204, 0, 204));
        foundationDateTextField.setToolTipText("");
        jPanel4.add(foundationDateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 270, 180, -1));

        cleanBandButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sweep.png"))); // NOI18N
        cleanBandButton.setContentAreaFilled(false);
        cleanBandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanBandButtonActionPerformed(evt);
            }
        });
        jPanel4.add(cleanBandButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 70, -1, -1));

        refreshBandButton.setBackground(new java.awt.Color(255, 255, 255));
        refreshBandButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/refresh.png"))); // NOI18N
        refreshBandButton.setContentAreaFilled(false);
        refreshBandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBandButtonActionPerformed(evt);
            }
        });
        jPanel4.add(refreshBandButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 300, -1, -1));

        deleteBandMemberButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbish-bin-delete-button.png"))); // NOI18N
        deleteBandMemberButton.setContentAreaFilled(false);
        deleteBandMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBandMemberButtonActionPerformed(evt);
            }
        });
        jPanel4.add(deleteBandMemberButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, 50));

        bandMembersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "First Name", "Last Name", "Nickname"
            }
        ));
        bandMembersTable.setFillsViewportHeight(true);
        jScrollPane11.setViewportView(bandMembersTable);

        jPanel4.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 300, 100));

        artistListBandTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "First Name", "Last Name", "Nickname"
            }
        ));
        artistListBandTable.setFillsViewportHeight(true);
        jScrollPane13.setViewportView(artistListBandTable);

        jPanel4.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 300, 340));

        jTabbedPane7.addTab("Band", jPanel4);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        deleteArtistTable.setForeground(new java.awt.Color(147, 62, 197));
        deleteArtistTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "First name", "Last name", "Nickname", "Nationality", "Birthday"
            }
        ));
        deleteArtistTable.setFillsViewportHeight(true);
        deleteArtistTable.setGridColor(new java.awt.Color(213, 213, 213));
        deleteArtistTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        deleteArtistTable.setSelectionForeground(new java.awt.Color(204, 0, 204));
        deleteArtistTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteArtistTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(deleteArtistTable);

        deleteArtistButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbish-bin-delete-button.png"))); // NOI18N
        deleteArtistButton.setContentAreaFilled(false);
        deleteArtistButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteArtistButtonActionPerformed(evt);
            }
        });

        addArtistButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/success.png"))); // NOI18N
        addArtistButton.setContentAreaFilled(false);
        addArtistButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addArtistButtonActionPerformed(evt);
            }
        });

        idArtistTextField.setForeground(new java.awt.Color(204, 0, 204));
        idArtistTextField.setToolTipText("ID");
        idArtistTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idArtistTextFieldActionPerformed(evt);
            }
        });

        lastNameTextField.setForeground(new java.awt.Color(204, 0, 204));
        lastNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTextFieldActionPerformed(evt);
            }
        });

        firstNameTextField.setForeground(new java.awt.Color(204, 0, 204));
        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });

        nicknameTextField.setForeground(new java.awt.Color(204, 0, 204));
        nicknameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicknameTextFieldActionPerformed(evt);
            }
        });

        label1.setForeground(new java.awt.Color(147, 62, 197));
        label1.setText("ID");

        label2.setForeground(new java.awt.Color(147, 62, 197));
        label2.setText("First name");

        label3.setForeground(new java.awt.Color(147, 62, 197));
        label3.setText("Last name");

        label4.setForeground(new java.awt.Color(147, 62, 197));
        label4.setText("Birthday");

        label5.setForeground(new java.awt.Color(147, 62, 197));
        label5.setText("Nickname");

        Nationality.setForeground(new java.awt.Color(147, 62, 197));
        Nationality.setText("Nationality");

        countryTextField.setForeground(new java.awt.Color(204, 0, 204));

        birthdayTextField.setForeground(new java.awt.Color(204, 0, 204));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/refresh.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cleanArtistButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sweep.png"))); // NOI18N
        cleanArtistButton.setContentAreaFilled(false);
        cleanArtistButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanArtistButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(deleteArtistButton)
                        .addGap(108, 108, 108)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(birthdayTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(Nationality)
                            .addComponent(countryTextField)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idArtistTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nicknameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(cleanArtistButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(addArtistButton)
                        .addGap(360, 360, 360))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idArtistTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(cleanArtistButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)
                        .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nicknameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Nationality)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(countryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(birthdayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addArtistButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteArtistButton)))
                .addGap(0, 69, Short.MAX_VALUE))
        );

        jTabbedPane7.addTab("Artist", jPanel3);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        videoTable.setForeground(new java.awt.Color(204, 0, 204));
        videoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Title", "URL", "Year"
            }
        ));
        videoTable.setFillsViewportHeight(true);
        videoTable.setGridColor(new java.awt.Color(213, 213, 213));
        videoTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        videoTable.setSelectionForeground(new java.awt.Color(204, 0, 204));
        videoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                videoTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(videoTable);
        if (videoTable.getColumnModel().getColumnCount() > 0) {
            videoTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel6.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 300, 200));

        label13.setForeground(new java.awt.Color(147, 62, 197));
        label13.setText("Artists & Bands ");
        jPanel6.add(label13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        deleteArtistVideoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbish-bin-delete-button.png"))); // NOI18N
        deleteArtistVideoButton.setContentAreaFilled(false);
        deleteArtistVideoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteArtistVideoButtonActionPerformed(evt);
            }
        });
        jPanel6.add(deleteArtistVideoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        label14.setForeground(new java.awt.Color(147, 62, 197));
        label14.setText("Artists & bands");
        jPanel6.add(label14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        label15.setForeground(new java.awt.Color(147, 62, 197));
        label15.setText("ID");
        jPanel6.add(label15, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, -1, -1));

        idVideoTextField.setForeground(new java.awt.Color(204, 0, 204));
        idVideoTextField.setToolTipText("ID");
        idVideoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idVideoTextFieldActionPerformed(evt);
            }
        });
        jPanel6.add(idVideoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 70, 178, -1));

        label16.setForeground(new java.awt.Color(147, 62, 197));
        label16.setText("Title");
        jPanel6.add(label16, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 100, -1, -1));

        nameVideoTextField.setForeground(new java.awt.Color(204, 0, 204));
        nameVideoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameVideoTextFieldActionPerformed(evt);
            }
        });
        jPanel6.add(nameVideoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, 178, -1));

        label17.setForeground(new java.awt.Color(147, 62, 197));
        label17.setText("Category");
        jPanel6.add(label17, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, -1, -1));

        categoryVideoTextField.setForeground(new java.awt.Color(204, 0, 204));
        categoryVideoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryVideoTextFieldActionPerformed(evt);
            }
        });
        jPanel6.add(categoryVideoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, 178, -1));

        label18.setForeground(new java.awt.Color(147, 62, 197));
        label18.setText("URL");
        jPanel6.add(label18, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, -1, -1));

        urlVideoTextField.setForeground(new java.awt.Color(204, 0, 204));
        urlVideoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urlVideoTextFieldActionPerformed(evt);
            }
        });
        jPanel6.add(urlVideoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 270, 178, -1));

        label19.setForeground(new java.awt.Color(147, 62, 197));
        label19.setText("Year");
        jPanel6.add(label19, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 310, -1, -1));

        yearVideoTextField.setForeground(new java.awt.Color(204, 0, 204));
        yearVideoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearVideoTextFieldActionPerformed(evt);
            }
        });
        jPanel6.add(yearVideoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 340, 59, -1));

        addNewVideoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/success.png"))); // NOI18N
        addNewVideoButton.setContentAreaFilled(false);
        addNewVideoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewVideoButtonActionPerformed(evt);
            }
        });
        jPanel6.add(addNewVideoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 370, -1, -1));

        addVideoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus.png"))); // NOI18N
        addVideoButton.setContentAreaFilled(false);
        addVideoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVideoButtonActionPerformed(evt);
            }
        });
        jPanel6.add(addVideoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, -1, -1));

        cleanVideoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sweep.png"))); // NOI18N
        cleanVideoButton.setContentAreaFilled(false);
        cleanVideoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanVideoButtonActionPerformed(evt);
            }
        });
        jPanel6.add(cleanVideoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 50, -1, -1));

        refreshPlaylistButton1.setBackground(new java.awt.Color(255, 255, 255));
        refreshPlaylistButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/refresh.png"))); // NOI18N
        refreshPlaylistButton1.setContentAreaFilled(false);
        refreshPlaylistButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshPlaylistButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(refreshPlaylistButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 370, -1, -1));

        deleteVideoButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbish-bin-delete-button.png"))); // NOI18N
        deleteVideoButton1.setContentAreaFilled(false);
        deleteVideoButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteVideoButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(deleteVideoButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setFillsViewportHeight(true);
        jScrollPane3.setViewportView(jTable1);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 300, 110));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setFillsViewportHeight(true);
        jScrollPane4.setViewportView(jTable2);

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 300, 290));

        jTabbedPane7.addTab("Video", jPanel6);

        getContentPane().add(jTabbedPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 556));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idPlaylistTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPlaylistTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPlaylistTextfieldActionPerformed

    private void namePlaylistTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namePlaylistTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namePlaylistTextfieldActionPerformed

    private void createPlaylistButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPlaylistButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createPlaylistButtonActionPerformed

    private void deleteVideoFromPlaylistButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteVideoFromPlaylistButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteVideoFromPlaylistButtonActionPerformed

    private void deleteArtistVideoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteArtistVideoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteArtistVideoButtonActionPerformed

    private void idVideoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idVideoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idVideoTextFieldActionPerformed

    private void nameVideoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameVideoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameVideoTextFieldActionPerformed

    private void categoryVideoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryVideoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryVideoTextFieldActionPerformed

    private void urlVideoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urlVideoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urlVideoTextFieldActionPerformed

    private void yearVideoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearVideoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearVideoTextFieldActionPerformed

    private void addNewVideoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewVideoButtonActionPerformed
        videoBiz.insertVideo(idVideoTextField.getText().toString(), nameVideoTextField.getText().toString(), categoryVideoTextField.getText().toString(), urlVideoTextField.getText().toString(), yearVideoTextField.getText().toString());
        fillVideoTable();
        idVideoTextField.setText("");
        nameVideoTextField.setText("");
        categoryVideoTextField.setText("");
        urlVideoTextField.setText("");
        yearVideoTextField.setText("");

    }//GEN-LAST:event_addNewVideoButtonActionPerformed

    private void deleteArtistButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteArtistButtonActionPerformed
        artistBiz.deleteArtist((deleteArtistTable.getValueAt(deleteArtistTable.getSelectedRow(), 0).toString()));
        fillArtistTable();
        fillArtistListBandTable();
        idArtistTextField.setEnabled(true);
        idArtistTextField.setText("");
        firstNameTextField.setText("");
        lastNameTextField.setText("");
        nicknameTextField.setText("");
        countryTextField.setText("");
        birthdayTextField.setText("");
    }//GEN-LAST:event_deleteArtistButtonActionPerformed

    private void addArtistButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addArtistButtonActionPerformed
        artistBiz.insertArtist(idArtistTextField.getText().toString(), firstNameTextField.getText().toString(), lastNameTextField.getText().toString(), nicknameTextField.getText().toString(), countryTextField.getText().toString(), birthdayTextField.getText().toString());
        fillArtistTable();
        fillArtistListBandTable();
        idArtistTextField.setText("");
        firstNameTextField.setText("");
        lastNameTextField.setText("");
        nicknameTextField.setText("");
        countryTextField.setText("");
        birthdayTextField.setText("");
    }//GEN-LAST:event_addArtistButtonActionPerformed

    private void idArtistTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idArtistTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idArtistTextFieldActionPerformed

    private void lastNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTextFieldActionPerformed

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextFieldActionPerformed

    private void nicknameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicknameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nicknameTextFieldActionPerformed

    private void idBandTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idBandTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idBandTextFieldActionPerformed

    private void bandNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bandNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bandNameTextFieldActionPerformed

    private void countryBandTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryBandTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryBandTextFieldActionPerformed

    private void createBandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBandButtonActionPerformed

        bandBiz.insertBand(idBandTextField.getText(), bandNameTextField.getText(), foundationDateTextField.getText(), countryBandTextField.getText());
        idBandTextField.setText("");
        bandNameTextField.setText("");
        countryBandTextField.setText("");
        foundationDateTextField.setText("");
        fillBandTable();
    }//GEN-LAST:event_createBandButtonActionPerformed

    private void deleteBandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBandButtonActionPerformed
        bandBiz.deleteBand(bandsTable.getValueAt(bandsTable.getSelectedRow(), 0).toString());
        idBandTextField.setEnabled(true);
        idBandTextField.setText("");
        bandNameTextField.setText("");
        countryBandTextField.setText("");
        foundationDateTextField.setText("");
        refreshBandButton.setEnabled(false);
        createBandButton.setEnabled(true);
        fillBandTable();
    }//GEN-LAST:event_deleteBandButtonActionPerformed

    private void addBandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBandButtonActionPerformed
        memberBiz.insertMembers(artistListBandTable.getValueAt(artistListBandTable.getSelectedRow(), 0).toString(), idBandTextField.getText().toString());
        fillBandMembersTable(idBandTextField.getText());
    }//GEN-LAST:event_addBandButtonActionPerformed

    private void jTabbedPane7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane7MouseClicked

    }//GEN-LAST:event_jTabbedPane7MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        artistBiz.updateArtist(idArtistTextField.getText(), firstNameTextField.getText(), lastNameTextField.getText(), nicknameTextField.getText(), countryTextField.getText(), birthdayTextField.getText());
        fillArtistTable();
        fillArtistListBandTable();
        idArtistTextField.setText("");
        firstNameTextField.setText("");
        lastNameTextField.setText("");
        nicknameTextField.setText("");
        countryTextField.setText("");
        birthdayTextField.setText("");
        idArtistTextField.setEnabled(true);
        addArtistButton.setEnabled(true);
        jButton1.setEnabled(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void deleteArtistTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteArtistTableMouseClicked
        jButton1.setEnabled(true);
        idArtistTextField.setText(deleteArtistTable.getValueAt(deleteArtistTable.getSelectedRow(), 0).toString());
        firstNameTextField.setText(deleteArtistTable.getValueAt(deleteArtistTable.getSelectedRow(), 1).toString());
        lastNameTextField.setText(deleteArtistTable.getValueAt(deleteArtistTable.getSelectedRow(), 2).toString());
        nicknameTextField.setText(deleteArtistTable.getValueAt(deleteArtistTable.getSelectedRow(), 3).toString());
        countryTextField.setText(deleteArtistTable.getValueAt(deleteArtistTable.getSelectedRow(), 4).toString());
        birthdayTextField.setText(deleteArtistTable.getValueAt(deleteArtistTable.getSelectedRow(), 5).toString());
        idArtistTextField.setEnabled(false);
        addArtistButton.setEnabled(false);

    }//GEN-LAST:event_deleteArtistTableMouseClicked

    private void cleanArtistButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanArtistButtonActionPerformed
        // TODO add your handling code here:
        idArtistTextField.setText("");
        firstNameTextField.setText("");
        lastNameTextField.setText("");
        nicknameTextField.setText("");
        countryTextField.setText("");
        birthdayTextField.setText("");
        idArtistTextField.setEnabled(true);
        addArtistButton.setEnabled(true);
        jButton1.setEnabled(false);
    }//GEN-LAST:event_cleanArtistButtonActionPerformed

    private void cleanVideoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanVideoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cleanVideoButtonActionPerformed

    private void cleanBandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanBandButtonActionPerformed

        idBandTextField.setEnabled(true);
        idBandTextField.setText("");
        bandNameTextField.setText("");
        countryBandTextField.setText("");
        foundationDateTextField.setText("");
        refreshBandButton.setEnabled(false);
        createBandButton.setEnabled(true);

    }//GEN-LAST:event_cleanBandButtonActionPerformed

    private void refreshBandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBandButtonActionPerformed
        bandBiz.updateBand(idBandTextField.getText(), bandNameTextField.getText(), foundationDateTextField.getText(), countryBandTextField.getText());
        idBandTextField.setEnabled(true);
        idBandTextField.setText("");
        bandNameTextField.setText("");
        countryBandTextField.setText("");
        foundationDateTextField.setText("");
        refreshBandButton.setEnabled(false);
        createBandButton.setEnabled(true);
        fillBandTable();
    }//GEN-LAST:event_refreshBandButtonActionPerformed

    private void refreshPlaylistButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshPlaylistButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshPlaylistButtonActionPerformed

    private void refreshPlaylistButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshPlaylistButton1ActionPerformed
        videoBiz.updateVideo(idVideoTextField.getText().toString(), nameVideoTextField.getText().toString(), categoryVideoTextField.getText().toString(), urlVideoTextField.getText().toString(), yearVideoTextField.getText().toString());
        idVideoTextField.setText("");
        nameVideoTextField.setText("");
        categoryVideoTextField.setText("");
        urlVideoTextField.setText("");
        yearVideoTextField.setText("");
        addNewVideoButton.setEnabled(true);
        fillVideoTable();
    }//GEN-LAST:event_refreshPlaylistButton1ActionPerformed

    private void bandsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bandsTableMouseClicked
        fillBandMembersTable(bandsTable.getValueAt(bandsTable.getSelectedRow(), 0).toString());
        idBandTextField.setEnabled(false);
        idBandTextField.setText(bandsTable.getValueAt(bandsTable.getSelectedRow(), 0).toString());
        bandNameTextField.setText(bandsTable.getValueAt(bandsTable.getSelectedRow(), 1).toString());
        countryBandTextField.setText(bandsTable.getValueAt(bandsTable.getSelectedRow(), 2).toString());
        foundationDateTextField.setText(bandsTable.getValueAt(bandsTable.getSelectedRow(), 3).toString());
        refreshBandButton.setEnabled(true);
        createBandButton.setEnabled(false);
    }//GEN-LAST:event_bandsTableMouseClicked

    private void deleteVideoButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteVideoButton1ActionPerformed
        videoBiz.deleteVideo(idVideoTextField.getText().toString());
        idVideoTextField.setText("");
        nameVideoTextField.setText("");
        categoryVideoTextField.setText("");
        urlVideoTextField.setText("");
        yearVideoTextField.setText("");
        fillVideoTable();
    }//GEN-LAST:event_deleteVideoButton1ActionPerformed

    private void addVideoToPlaylistButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVideoToPlaylistButtonActionPerformed

    }//GEN-LAST:event_addVideoToPlaylistButtonActionPerformed

    private void deleteBandMemberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBandMemberButtonActionPerformed

    }//GEN-LAST:event_deleteBandMemberButtonActionPerformed

    private void addVideoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVideoButtonActionPerformed
        videoBiz.insertVideo(idVideoTextField.getText().toString(), nameVideoTextField.getText().toString(), categoryVideoTextField.getText().toString(), urlVideoTextField.getText().toString(), yearVideoTextField.getText().toString());
        idVideoTextField.setText("");
        nameVideoTextField.setText("");
        categoryVideoTextField.setText("");
        urlVideoTextField.setText("");
        yearVideoTextField.setText("");
        fillVideoTable();
    }//GEN-LAST:event_addVideoButtonActionPerformed

    private void videoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_videoTableMouseClicked
        idVideoTextField.setText(videoTable.getValueAt(videoTable.getSelectedRow(), 0).toString());
        nameVideoTextField.setText(videoTable.getValueAt(videoTable.getSelectedRow(), 1).toString());
        categoryVideoTextField.setText(videoTable.getValueAt(videoTable.getSelectedRow(), 2).toString());
        urlVideoTextField.setText(videoTable.getValueAt(videoTable.getSelectedRow(), 3).toString());
        yearVideoTextField.setText(videoTable.getValueAt(videoTable.getSelectedRow(), 4).toString());
        addNewVideoButton.setEnabled(false);
    }//GEN-LAST:event_videoTableMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nationality;
    private javax.swing.JButton addArtistButton;
    private javax.swing.JButton addBandButton;
    private javax.swing.JButton addNewVideoButton;
    private javax.swing.JButton addVideoButton;
    private javax.swing.JList<String> addVideoList;
    private javax.swing.JButton addVideoToPlaylistButton;
    private javax.swing.JTable artistListBandTable;
    private javax.swing.JTable bandMembersTable;
    private javax.swing.JTextField bandNameTextField;
    private javax.swing.JTable bandsTable;
    private javax.swing.JTextField birthdayTextField;
    private javax.swing.JTextField categoryVideoTextField;
    private javax.swing.JButton cleanArtistButton;
    private javax.swing.JButton cleanBandButton;
    private javax.swing.JButton cleanPlaylistButton;
    private javax.swing.JButton cleanVideoButton;
    private javax.swing.JTextField countryBandTextField;
    private javax.swing.JTextField countryTextField;
    private javax.swing.JButton createBandButton;
    private javax.swing.JButton createPlaylistButton;
    private javax.swing.JButton deleteArtistButton;
    private javax.swing.JTable deleteArtistTable;
    private javax.swing.JButton deleteArtistVideoButton;
    private javax.swing.JButton deleteBandButton;
    private javax.swing.JButton deleteBandMemberButton;
    private javax.swing.JButton deleteVideoButton1;
    private javax.swing.JButton deleteVideoFromPlaylistButton;
    private javax.swing.JList<String> deleteVideoList;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JTextField foundationDateTextField;
    private javax.swing.JTextField idArtistTextField;
    private javax.swing.JTextField idBandTextField;
    private javax.swing.JTextField idPlaylistTextfield;
    private javax.swing.JTextField idVideoTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label13;
    private java.awt.Label label14;
    private java.awt.Label label15;
    private java.awt.Label label16;
    private java.awt.Label label17;
    private java.awt.Label label18;
    private java.awt.Label label19;
    private java.awt.Label label2;
    private java.awt.Label label20;
    private java.awt.Label label21;
    private java.awt.Label label22;
    private java.awt.Label label23;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JTextField namePlaylistTextfield;
    private javax.swing.JTextField nameVideoTextField;
    private javax.swing.JTextField nicknameTextField;
    private javax.swing.JTable playlistTable;
    private javax.swing.JButton refreshBandButton;
    private javax.swing.JButton refreshPlaylistButton;
    private javax.swing.JButton refreshPlaylistButton1;
    private javax.swing.JTextField urlVideoTextField;
    private javax.swing.JTable videoTable;
    private javax.swing.JTextField yearVideoTextField;
    // End of variables declaration//GEN-END:variables

}
