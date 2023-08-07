/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.oxgui1;

/**
 *
 * @author minnie
 */
public class OXGameUI extends javax.swing.JFrame {

    /**
     * Creates new form OXGameUI
     */
    public OXGameUI() {
        initComponents();
        this.o = new Player('O');
        this.x = new Player('X');
        showWelcome();
        newBoard();
        showBoard();
        showTurn();
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
        btnTable2 = new javax.swing.JButton();
        btnTable3 = new javax.swing.JButton();
        btnTable1 = new javax.swing.JButton();
        btnTable4 = new javax.swing.JButton();
        btnTable5 = new javax.swing.JButton();
        btnTable6 = new javax.swing.JButton();
        btnTable7 = new javax.swing.JButton();
        btnTable8 = new javax.swing.JButton();
        btnTable9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnNewGame = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(223, 223, 238));

        btnTable2.setFont(new java.awt.Font("Palatino", 1, 48)); // NOI18N
        btnTable2.setText("-");
        btnTable2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable2ActionPerformed(evt);
            }
        });

        btnTable3.setFont(new java.awt.Font("Palatino", 1, 48)); // NOI18N
        btnTable3.setText("-");
        btnTable3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable3ActionPerformed(evt);
            }
        });

        btnTable1.setFont(new java.awt.Font("Palatino", 1, 48)); // NOI18N
        btnTable1.setText("-");
        btnTable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable1ActionPerformed(evt);
            }
        });

        btnTable4.setFont(new java.awt.Font("Palatino", 1, 48)); // NOI18N
        btnTable4.setText("-");
        btnTable4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable4ActionPerformed(evt);
            }
        });

        btnTable5.setFont(new java.awt.Font("Palatino", 1, 48)); // NOI18N
        btnTable5.setText("-");
        btnTable5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable5ActionPerformed(evt);
            }
        });

        btnTable6.setFont(new java.awt.Font("Palatino", 1, 48)); // NOI18N
        btnTable6.setText("-");
        btnTable6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable6ActionPerformed(evt);
            }
        });

        btnTable7.setFont(new java.awt.Font("Palatino", 1, 48)); // NOI18N
        btnTable7.setText("-");
        btnTable7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable7ActionPerformed(evt);
            }
        });

        btnTable8.setFont(new java.awt.Font("Palatino", 1, 48)); // NOI18N
        btnTable8.setText("-");
        btnTable8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable8ActionPerformed(evt);
            }
        });

        btnTable9.setFont(new java.awt.Font("Palatino", 1, 48)); // NOI18N
        btnTable9.setText("-");
        btnTable9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTable7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTable4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTable2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTable3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTable5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTable6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTable8, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTable9, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTable2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTable3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTable4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTable5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTable6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTable7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTable8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTable9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 226));

        jLabel1.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        jLabel1.setText("PLAYER  X");

        jLabel2.setBackground(new java.awt.Color(195, 226, 233));
        jLabel2.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        jLabel2.setText("PLAYER O");

        btnNewGame.setBackground(new java.awt.Color(255, 225, 135));
        btnNewGame.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        btnNewGame.setText("NEW GAME");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNewGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnNewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel3.setBackground(new java.awt.Color(252, 229, 229));

        txtMessage.setBackground(new java.awt.Color(241, 229, 229));
        txtMessage.setFont(new java.awt.Font("Palatino", 1, 36)); // NOI18N
        txtMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMessage.setText("WELCOME OX GAME");
        txtMessage.setToolTipText("");
        txtMessage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable1ActionPerformed
       row = 1;
       col = 1;
       process();
    }//GEN-LAST:event_btnTable1ActionPerformed


    private void btnTable4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable4ActionPerformed
       row = 2;
       col = 1;
       process();
    }//GEN-LAST:event_btnTable4ActionPerformed

    private void btnTable5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable5ActionPerformed
       row = 2;
       col = 2;
       process();
    }//GEN-LAST:event_btnTable5ActionPerformed

    private void btnTable6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable6ActionPerformed
       row = 2;
       col = 3;
       process();
    }//GEN-LAST:event_btnTable6ActionPerformed

    private void btnTable7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable7ActionPerformed
       row = 3;
       col = 1;
       process();
    }//GEN-LAST:event_btnTable7ActionPerformed

    private void btnTable8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable8ActionPerformed
       row = 3;
       col = 2;
       process();
    }//GEN-LAST:event_btnTable8ActionPerformed

    private void btnTable9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable9ActionPerformed
       row = 3;
       col = 3;
       process();
    }//GEN-LAST:event_btnTable9ActionPerformed

    private void btnTable2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable2ActionPerformed
       row = 1;
       col = 2;
       process();
    }//GEN-LAST:event_btnTable2ActionPerformed

    private void btnTable3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable3ActionPerformed
       row = 1;
       col = 3;
       process();
    }//GEN-LAST:event_btnTable3ActionPerformed

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
            java.util.logging.Logger.getLogger(OXGameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OXGameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OXGameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OXGameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OXGameUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNewGame;
    private javax.swing.JButton btnTable1;
    private javax.swing.JButton btnTable2;
    private javax.swing.JButton btnTable3;
    private javax.swing.JButton btnTable4;
    private javax.swing.JButton btnTable5;
    private javax.swing.JButton btnTable6;
    private javax.swing.JButton btnTable7;
    private javax.swing.JButton btnTable8;
    private javax.swing.JButton btnTable9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txtMessage;
    // End of variables declaration//GEN-END:variables
 
    private Player o;
    private Player x;
    private int row;
    private int col;
    private Board board;

    private void showWelcome() {
        txtMessage.setText(" WELCOME OX GAME ");
    }

    private void newBoard() {
        board = new Board(o,x);
       
    }

    private void showBoard() {
        char[][] table = board.getTable();
        btnTable1.setText(table[0][0]+ "");
        btnTable2.setText(table[0][1]+ "");
        btnTable3.setText(table[0][2]+ "");
        btnTable4.setText(table[1][0]+ "");
        btnTable5.setText(table[1][1]+ "");
        btnTable6.setText(table[1][2]+ "");
        btnTable7.setText(table[2][0]+ "");
        btnTable8.setText(table[2][1]+ "");
        btnTable9.setText(table[2][2]+ "");
        


    }

    private void showTurn() {
        txtMessage.setText("Turn " + board.getCurrentPlayer().getSymbol());
    }
    
    private void process() {
        board.setRowCol(row, col);
        showBoard();
        showTurn();
    }
}
