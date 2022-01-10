/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiketBioskop;

import javax.swing.JOptionPane;

/**
 *
 * @author ninda
 */
public class FormBioskop extends javax.swing.JFrame {

    /**
     * Creates new form FormBioskop
     * @author ninda
     */
    public FormBioskop() {
        initComponents();
        rdgCaraBayar.add(tunai);
        rdgCaraBayar.add(bca);
        rdgCaraBayar.add(bni);
        rdgCaraBayar.add(mandiri);
        rdgCaraBayar.add(bri);
        rdgCaraBayar.add(ovo);
    }

    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdgCaraBayar = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        makmum = new javax.swing.JCheckBox();
        dearnathan = new javax.swing.JCheckBox();
        kkn = new javax.swing.JCheckBox();
        jailangkung = new javax.swing.JCheckBox();
        tiket1 = new javax.swing.JTextField();
        tiket2 = new javax.swing.JTextField();
        tiket3 = new javax.swing.JTextField();
        tiket4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        total = new javax.swing.JButton();
        ulang = new javax.swing.JButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        bayar = new javax.swing.JLabel();
        cara = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jRadioButton27 = new javax.swing.JRadioButton();
        jRadioButton28 = new javax.swing.JRadioButton();
        jRadioButton29 = new javax.swing.JRadioButton();
        jRadioButton30 = new javax.swing.JRadioButton();
        jRadioButton31 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        tunai = new javax.swing.JRadioButton();
        bca = new javax.swing.JRadioButton();
        bni = new javax.swing.JRadioButton();
        mandiri = new javax.swing.JRadioButton();
        bri = new javax.swing.JRadioButton();
        ovo = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel3.setText("SEDANG TAYANG");

        makmum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        makmum.setForeground(new java.awt.Color(51, 51, 51));
        makmum.setText("MAKMUM 2");
        makmum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makmumActionPerformed(evt);
            }
        });

        dearnathan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dearnathan.setForeground(new java.awt.Color(0, 51, 51));
        dearnathan.setText("DEAR NATHAN THANKYOU SALMA");
        dearnathan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dearnathanActionPerformed(evt);
            }
        });

        kkn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kkn.setForeground(new java.awt.Color(0, 51, 51));
        kkn.setText("KKN DESA PENARI");
        kkn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kknActionPerformed(evt);
            }
        });

        jailangkung.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jailangkung.setForeground(new java.awt.Color(0, 51, 51));
        jailangkung.setText("JAILANGKUNG 2");
        jailangkung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jailangkungActionPerformed(evt);
            }
        });

        tiket1.setEditable(false);
        tiket1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tiket1.setText("0");
        tiket1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiket1ActionPerformed(evt);
            }
        });

        tiket2.setEditable(false);
        tiket2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tiket2.setText("0");
        tiket2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiket2ActionPerformed(evt);
            }
        });

        tiket3.setEditable(false);
        tiket3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tiket3.setText("0");

        tiket4.setEditable(false);
        tiket4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tiket4.setText("0");

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel4.setText("TIKET");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 357, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
        );

        total.setBackground(new java.awt.Color(153, 255, 255));
        total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        total.setMnemonic('H');
        total.setText("TOTAL");
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });

        ulang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ulang.setMnemonic('K');
        ulang.setText("RESET");
        ulang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ulangActionPerformed(evt);
            }
        });

        jRadioButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton4.setText("12:00");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jRadioButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton5.setText("18:00");

        jRadioButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton6.setText("15:00");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jRadioButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton7.setText("21:00");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        bayar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bayar.setText("Rp. 0");

        cara.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cara.setText("METODE PEMBAYARAN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)))
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jLabel1.setText("BIOSKOP INDONESIA NEW");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jRadioButton20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton20.setText("12:00");
        jRadioButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton20ActionPerformed(evt);
            }
        });

        jRadioButton21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton21.setText("18:00");

        jRadioButton22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton22.setText("15:00");
        jRadioButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton22ActionPerformed(evt);
            }
        });

        jRadioButton23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton23.setText("21:00");
        jRadioButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton23ActionPerformed(evt);
            }
        });

        jRadioButton24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton24.setText("12:00");
        jRadioButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton24ActionPerformed(evt);
            }
        });

        jRadioButton25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton25.setText("18:00");

        jRadioButton26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton26.setText("15:00");
        jRadioButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton26ActionPerformed(evt);
            }
        });

        jRadioButton27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton27.setText("21:00");
        jRadioButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton27ActionPerformed(evt);
            }
        });

        jRadioButton28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton28.setText("15:00");
        jRadioButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton28ActionPerformed(evt);
            }
        });

        jRadioButton29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton29.setText("21:00");
        jRadioButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton29ActionPerformed(evt);
            }
        });

        jRadioButton30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton30.setText("12:00");
        jRadioButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton30ActionPerformed(evt);
            }
        });

        jRadioButton31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton31.setText("18:00");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("METODE PEMBAYARAN");

        rdgCaraBayar.add(tunai);
        tunai.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tunai.setText("Uang Tunai");
        tunai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tunaiActionPerformed(evt);
            }
        });

        rdgCaraBayar.add(bca);
        bca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bca.setText("Debit BCA");

        rdgCaraBayar.add(bni);
        bni.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bni.setText("Debit BNI");

        rdgCaraBayar.add(mandiri);
        mandiri.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mandiri.setText("Debit MANDIRI");
        mandiri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mandiriActionPerformed(evt);
            }
        });

        rdgCaraBayar.add(bri);
        bri.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bri.setText("Debit BRI");

        rdgCaraBayar.add(ovo);
        ovo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ovo.setText("OVO");
        ovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dearnathan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kkn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jailangkung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(jRadioButton4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton7))
                                .addComponent(makmum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton23))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton27))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton29))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tiket2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tiket1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tiket3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tiket4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(total))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cara)
                                .addGap(8, 8, 8))))
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tunai)
                                .addComponent(bni)
                                .addComponent(ovo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bca)
                                .addGap(10, 10, 10)))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bri)
                            .addComponent(mandiri)))
                    .addComponent(ulang))
                .addContainerGap(59, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(makmum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButton4)
                                    .addComponent(jRadioButton5)
                                    .addComponent(jRadioButton6)
                                    .addComponent(jRadioButton7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dearnathan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButton20)
                                    .addComponent(jRadioButton21)
                                    .addComponent(jRadioButton22)
                                    .addComponent(jRadioButton23))
                                .addGap(8, 8, 8)
                                .addComponent(kkn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButton24)
                                    .addComponent(jRadioButton25)
                                    .addComponent(jRadioButton26)
                                    .addComponent(jRadioButton27)
                                    .addComponent(tiket3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cara))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jailangkung, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButton30)
                                    .addComponent(jRadioButton31)
                                    .addComponent(jRadioButton28)
                                    .addComponent(jRadioButton29)
                                    .addComponent(tiket4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(total)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tiket1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tunai)
                                            .addComponent(mandiri))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bri))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addComponent(bca)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tiket2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bni))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ovo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(ulang)
                        .addGap(43, 43, 43))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kknActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kknActionPerformed
       
    if (kkn.isSelected()) {
        tiket3.setEditable(true);
        tiket3.setText("1");
    } else {
        tiket3.setEditable(false);
        tiket3.setText("0");
        }
    }//GEN-LAST:event_kknActionPerformed

    private void makmumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makmumActionPerformed
        
    if (makmum.isSelected()) {
        tiket1.setEditable(true);
        tiket1.setText("1");
    } else {
        tiket1.setEditable(false);
        tiket1.setText("0");
        }
    }//GEN-LAST:event_makmumActionPerformed

    private void dearnathanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dearnathanActionPerformed
        
    if (dearnathan.isSelected()) {
        tiket2.setEditable(true);
        tiket2.setText("1");
    } else {
        tiket2.setEditable(false);
        tiket2.setText("0");
        }
    }//GEN-LAST:event_dearnathanActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void tiket1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiket1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tiket1ActionPerformed

    private void jailangkungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jailangkungActionPerformed
        // TODO add your handling code here:
    if (jailangkung.isSelected()) {
        tiket4.setEditable(true);
        tiket4.setText("1");
    } else {
        tiket4.setEditable(false);
        tiket4.setText("0");
        }
    }//GEN-LAST:event_jailangkungActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
    boolean lDataOke = true;
       
    if (makmum.isSelected() && tiket1.getText() == " ")
        lDataOke = false;
    if (dearnathan.isSelected() && tiket2.getText() == " ")
        lDataOke = false;
    if (kkn.isSelected() && tiket3.getText() == " ")
        lDataOke = false;
    if (jailangkung.isSelected() && tiket4.getText() == " ")
        lDataOke = false;
       
    if (!lDataOke) {
        JOptionPane.showMessageDialog(this,
        "Data Dilengkapi dahulu");
    } else {
       
    int nfilm1 = Integer.parseInt(tiket1.getText());
    int nfilm2 = Integer.parseInt(tiket2.getText());
    int nfilm3 = Integer.parseInt(tiket3.getText());
    int nfilm4 = Integer.parseInt(tiket4.getText());
       
    int nTotal = (30000 * nfilm1)+
        (35000 * nfilm2)+(35000 * nfilm3)+(35000 * nfilm4);
        bayar.setText("Rp. "+nTotal);
       
    if (tunai.isSelected())
        cara.setText(tunai.getActionCommand());
    if (bca.isSelected())
        cara.setText(bca.getActionCommand());
    if (bni.isSelected())
        cara.setText(bni.getActionCommand());
    if (mandiri.isSelected())
        cara.setText(mandiri.getActionCommand());
    if (bri.isSelected())
        cara.setText(bri.getActionCommand());
    if (ovo.isSelected())
        cara.setText(ovo.getActionCommand());
}
    }//GEN-LAST:event_totalActionPerformed

    private void jRadioButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton20ActionPerformed

    private void jRadioButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton22ActionPerformed

    private void jRadioButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton23ActionPerformed

    private void jRadioButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton24ActionPerformed

    private void jRadioButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton26ActionPerformed

    private void jRadioButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton27ActionPerformed

    private void jRadioButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton28ActionPerformed

    private void jRadioButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton29ActionPerformed

    private void jRadioButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton30ActionPerformed

    private void ulangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ulangActionPerformed
        // TODO add your handling code here:
        makmum.setSelected(false);
        dearnathan.setSelected(false);
        kkn.setSelected(false);
        jailangkung.setSelected(false);
        tiket1.setText("0");
        tiket2.setText("0");
        tiket3.setText("0");
        tiket4.setText("0");
        tiket1.setEditable(false);
        tiket2.setEditable(false);
        tiket3.setEditable(false);
        tiket4.setEditable(false);
        tunai.setSelected(true);
        bayar.setText("Rp. 0");
        cara.setText("Cara Bayar");
    }//GEN-LAST:event_ulangActionPerformed

    private void mandiriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mandiriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mandiriActionPerformed

    private void ovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ovoActionPerformed

    private void tunaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tunaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tunaiActionPerformed

    private void tiket2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiket2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tiket2ActionPerformed

    /**
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
            java.util.logging.Logger.getLogger(FormBioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBioskop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bayar;
    private javax.swing.JRadioButton bca;
    private javax.swing.JRadioButton bni;
    private javax.swing.JRadioButton bri;
    private javax.swing.JLabel cara;
    private javax.swing.JCheckBox dearnathan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JCheckBox jailangkung;
    private javax.swing.JCheckBox kkn;
    private javax.swing.JCheckBox makmum;
    private javax.swing.JRadioButton mandiri;
    private javax.swing.JRadioButton ovo;
    private javax.swing.ButtonGroup rdgCaraBayar;
    private javax.swing.JTextField tiket1;
    private javax.swing.JTextField tiket2;
    private javax.swing.JTextField tiket3;
    private javax.swing.JTextField tiket4;
    private javax.swing.JButton total;
    private javax.swing.JRadioButton tunai;
    private javax.swing.JButton ulang;
    // End of variables declaration//GEN-END:variables
}
