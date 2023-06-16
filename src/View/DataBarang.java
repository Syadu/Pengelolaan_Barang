/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;


import Controller.ControllerBarang;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JTextField;


/**
 *
 * @author hp
 */
public class DataBarang extends javax.swing.JFrame {

    /**
     * Creates new form DataBarang
     */
    public DataBarang() {
        initComponents();
        ctBrg = new ControllerBarang(this);
        ctBrg.isiTable();
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
        MenuPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSupplier = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnBarang = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnKaryawan = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        txtStok = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelData = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtCariNama = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        MenuPanel.setBackground(new java.awt.Color(44, 62, 80));
        MenuPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.lightGray));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Downloads\\Product quality-bro (1).png")); // NOI18N

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Menu Tabel");

        btnSupplier.setBackground(new java.awt.Color(211, 84, 0));
        btnSupplier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSupplierMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSupplierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSupplierMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSupplierMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSupplierMouseReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Downloads\\20230521_161710.png")); // NOI18N
        jLabel10.setText("Supplier");

        javax.swing.GroupLayout btnSupplierLayout = new javax.swing.GroupLayout(btnSupplier);
        btnSupplier.setLayout(btnSupplierLayout);
        btnSupplierLayout.setHorizontalGroup(
            btnSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSupplierLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel10)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        btnSupplierLayout.setVerticalGroup(
            btnSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSupplierLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(14, 14, 14))
        );

        btnBarang.setBackground(new java.awt.Color(211, 84, 0));
        btnBarang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBarangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBarangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBarangMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBarangMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnBarangMouseReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Downloads\\20230521_161611.png")); // NOI18N
        jLabel9.setText("Barang");

        javax.swing.GroupLayout btnBarangLayout = new javax.swing.GroupLayout(btnBarang);
        btnBarang.setLayout(btnBarangLayout);
        btnBarangLayout.setHorizontalGroup(
            btnBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBarangLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnBarangLayout.setVerticalGroup(
            btnBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBarangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(14, 14, 14))
        );

        btnKaryawan.setBackground(new java.awt.Color(211, 84, 0));
        btnKaryawan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKaryawanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnKaryawanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnKaryawanMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnKaryawanMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnKaryawanMouseReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Downloads\\20230521_161750.png")); // NOI18N
        jLabel11.setText("Lokasi");

        javax.swing.GroupLayout btnKaryawanLayout = new javax.swing.GroupLayout(btnKaryawan);
        btnKaryawan.setLayout(btnKaryawanLayout);
        btnKaryawanLayout.setHorizontalGroup(
            btnKaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnKaryawanLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnKaryawanLayout.setVerticalGroup(
            btnKaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnKaryawanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(14, 14, 14))
        );

        btnLogOut.setBackground(new java.awt.Color(211, 84, 0));
        btnLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogOutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLogOutMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnLogOutMouseReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Downloads\\toppng.com-login-logout-white-icon-512x512 (1).png")); // NOI18N
        jLabel12.setText("Log Out");

        javax.swing.GroupLayout btnLogOutLayout = new javax.swing.GroupLayout(btnLogOut);
        btnLogOut.setLayout(btnLogOutLayout);
        btnLogOutLayout.setHorizontalGroup(
            btnLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLogOutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(18, 18, 18))
        );
        btnLogOutLayout.setVerticalGroup(
            btnLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLogOutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnKaryawan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(btnBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        MainPanel.setBackground(new java.awt.Color(44, 62, 80));
        MainPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.lightGray));
        MainPanel.setPreferredSize(new java.awt.Dimension(600, 472));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data Barang");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Barang");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Harga");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama Barang");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Stok");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        tabelData.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelData);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cari Nama");

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(btnSimpan)
                                .addGap(18, 18, 18)
                                .addComponent(btnHapus)
                                .addGap(18, 18, 18)
                                .addComponent(btnUbah)
                                .addGap(18, 18, 18)
                                .addComponent(btnReset))))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(txtCariNama, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCari))
                            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                                .addComponent(txtNama, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtHarga, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtStok, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(245, 245, 245))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(52, 52, 52)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCariNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnCari))
                .addGap(47, 47, 47)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnHapus)
                    .addComponent(btnUbah)
                    .addComponent(btnReset))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                    .addComponent(MenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        ctBrg.update();
        ctBrg.isiTable();
        ctBrg.reset();
    }//GEN-LAST:event_btnUbahActionPerformed

    
    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        ctBrg.insert();
        ctBrg.isiTable();
        ctBrg.reset();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void tabelDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDataMouseClicked
        // TODO add your handling code here:
        int row = tabelData.getSelectedRow();
        ctBrg.isiField(row);
    }//GEN-LAST:event_tabelDataMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        ctBrg.reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        ctBrg.delete();
        ctBrg.isiTable();
        ctBrg.reset();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        ctBrg.cari();
        ctBrg.reset();
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnBarangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBarangMouseEntered
        // TODO add your handling code here:
        btnBarang.setBackground(new Color(192, 57, 43));
    }//GEN-LAST:event_btnBarangMouseEntered

    private void btnBarangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBarangMouseExited
        // TODO add your handling code here:
        btnBarang.setBackground(new Color(211, 84, 0));
    }//GEN-LAST:event_btnBarangMouseExited

    private void btnBarangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBarangMousePressed
        // TODO add your handling code here:
        btnBarang.setBackground(new Color(211, 84, 0));
    }//GEN-LAST:event_btnBarangMousePressed

    private void btnBarangMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBarangMouseReleased
        // TODO add your handling code here:
        btnBarang.setBackground(new Color(211, 84, 0));
    }//GEN-LAST:event_btnBarangMouseReleased

    private void btnBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBarangMouseClicked
        // TODO add your handling code here:
        this.dispose();
        DataBarang db = new DataBarang();
        db.setVisible(true);
    }//GEN-LAST:event_btnBarangMouseClicked

    private void btnSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierMouseClicked
        // TODO add your handling code here:
        this.dispose();
        FormSupplier fs = new FormSupplier();
        fs.setVisible(true);
    }//GEN-LAST:event_btnSupplierMouseClicked

    private void btnLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseClicked
        // TODO add your handling code here:
        this.dispose();
        Login2 l = new Login2();
        l.setVisible(true);
    }//GEN-LAST:event_btnLogOutMouseClicked

    private void btnSupplierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierMouseEntered
        // TODO add your handling code here:
        btnSupplier.setBackground(new Color(192, 57, 43));
    }//GEN-LAST:event_btnSupplierMouseEntered

    private void btnSupplierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierMouseExited
        // TODO add your handling code here:
        btnSupplier.setBackground(new Color(211, 84, 0));
    }//GEN-LAST:event_btnSupplierMouseExited

    private void btnSupplierMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierMousePressed
        // TODO add your handling code here:
        btnSupplier.setBackground(new Color(211, 84, 0));
    }//GEN-LAST:event_btnSupplierMousePressed

    private void btnSupplierMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierMouseReleased
        // TODO add your handling code here:
        btnSupplier.setBackground(new Color(211, 84, 0));
    }//GEN-LAST:event_btnSupplierMouseReleased

    private void btnLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseEntered
        // TODO add your handling code here:
        btnLogOut.setBackground(new Color(192, 57, 43));
    }//GEN-LAST:event_btnLogOutMouseEntered

    private void btnLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseExited
        // TODO add your handling code here:
        btnLogOut.setBackground(new Color(211, 84, 0));
    }//GEN-LAST:event_btnLogOutMouseExited

    private void btnLogOutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMousePressed
        // TODO add your handling code here:
        btnLogOut.setBackground(new Color(211, 84, 0));
    }//GEN-LAST:event_btnLogOutMousePressed

    private void btnLogOutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseReleased
        // TODO add your handling code here:
        btnLogOut.setBackground(new Color(211, 84, 0));
    }//GEN-LAST:event_btnLogOutMouseReleased

    private void btnKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKaryawanMouseClicked
        // TODO add your handling code here:
        this.dispose();
        Lokasi lk = new Lokasi();
        lk.setVisible(true);
    }//GEN-LAST:event_btnKaryawanMouseClicked

    private void btnKaryawanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKaryawanMouseEntered
        // TODO add your handling code here:
        btnKaryawan.setBackground(new Color(192, 57, 43));
    }//GEN-LAST:event_btnKaryawanMouseEntered

    private void btnKaryawanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKaryawanMouseExited
        // TODO add your handling code here:
        btnKaryawan.setBackground(new Color(211, 84, 0));
    }//GEN-LAST:event_btnKaryawanMouseExited

    private void btnKaryawanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKaryawanMousePressed
        // TODO add your handling code here:
        btnKaryawan.setBackground(new Color(211, 84, 0));
    }//GEN-LAST:event_btnKaryawanMousePressed

    private void btnKaryawanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKaryawanMouseReleased
        // TODO add your handling code here:
        btnKaryawan.setBackground(new Color(211, 84, 0));
    }//GEN-LAST:event_btnKaryawanMouseReleased

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

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
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JPanel btnBarang;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JPanel btnKaryawan;
    private javax.swing.JPanel btnLogOut;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JPanel btnSupplier;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelData;
    private javax.swing.JTextField txtCariNama;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtStok;
    // End of variables declaration//GEN-END:variables
    ControllerBarang ctBrg;

    public JTable getTabelData() { 
        return tabelData;
    }
    
    public JTextField gettxtID()
    {
        return txtID;
    }
    public JTextField gettxtNama()
    {
        return txtNama;
    }
    public JTextField gettxtHarga()
    {
        return txtHarga;
    }
    public JTextField gettxtStok()
    {
        return txtStok;
    }
    public JTextField gettxtCariNama()
    {
        return txtCariNama;
    }   
}
