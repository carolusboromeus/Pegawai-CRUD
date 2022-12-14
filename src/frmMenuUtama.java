
public class frmMenuUtama extends javax.swing.JFrame {
    public frmMenuUtama() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        frmSubDepartemen = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuSubPegawai = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        frmSubPengguna = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        frmSubKeluar = new javax.swing.JMenuItem();
        subCetakPegawai = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");

        frmSubDepartemen.setText("Departement");
        frmSubDepartemen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmSubDepartemenActionPerformed(evt);
            }
        });
        jMenu1.add(frmSubDepartemen);
        jMenu1.add(jSeparator1);

        mnuSubPegawai.setText("Pegawai");
        mnuSubPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSubPegawaiActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSubPegawai);
        jMenu1.add(jSeparator2);

        frmSubPengguna.setText("Pengguna");
        frmSubPengguna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmSubPenggunaActionPerformed(evt);
            }
        });
        jMenu1.add(frmSubPengguna);
        jMenu1.add(jSeparator3);

        frmSubKeluar.setText("Keluar");
        frmSubKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmSubKeluarActionPerformed(evt);
            }
        });
        jMenu1.add(frmSubKeluar);

        jMenuBar1.add(jMenu1);

        subCetakPegawai.setText("Laporan");

        jMenuItem6.setText("Cetak Pegawai");
        subCetakPegawai.add(jMenuItem6);

        jMenuBar1.add(subCetakPegawai);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void frmSubDepartemenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmSubDepartemenActionPerformed
        // TODO add your handling code here:
        frmDepartemen objDepartemen = new frmDepartemen(); 
	objDepartemen.show();
    }//GEN-LAST:event_frmSubDepartemenActionPerformed

    private void mnuSubPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSubPegawaiActionPerformed
        // TODO add your handling code here:
        frmKaryawan objKaryawan = new frmKaryawan(); 
	objKaryawan.show();
    }//GEN-LAST:event_mnuSubPegawaiActionPerformed

    private void frmSubPenggunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmSubPenggunaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frmSubPenggunaActionPerformed

    private void frmSubKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmSubKeluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frmSubKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem frmSubDepartemen;
    private javax.swing.JMenuItem frmSubKeluar;
    private javax.swing.JMenuItem frmSubPengguna;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem mnuSubPegawai;
    private javax.swing.JMenu subCetakPegawai;
    // End of variables declaration//GEN-END:variables
}
