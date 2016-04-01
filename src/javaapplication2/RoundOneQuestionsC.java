/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;

/**
 *
 * @author User
 */
public class RoundOneQuestionsC extends javax.swing.JFrame {

    /**
     * Creates new form RoundOneQuestions
     */
    public RoundOneQuestionsC() {
        initComponents();
        star();
        this.setTitle("Select a Question for Round 1");
        setDefaultCloseOperation(0);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
       setBounds(0,0,screenSize.width, screenSize.height);
       setVisible(true);
       
       File sudokodia= new File("c:\\SudoKodia");
        deleteDirectory(sudokodia);
        
    }
    public void star(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/javaapplication2/images/extras/icon.png")));
    }

    
    static public boolean deleteDirectory(File path) {
    if( path.exists() ) {
      File[] files = path.listFiles();
      for(int i=0; i<files.length; i++) {
         if(files[i].isDirectory()) {
           deleteDirectory(files[i]);
         }
         else {
           files[i].delete();
         }
      }
    }
    return( path.delete() );
  }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        next = new javax.swing.JButton();
        q1 = new javax.swing.JRadioButton();
        q2 = new javax.swing.JRadioButton();
        q3 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(null);

        next.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel1.add(next);
        next.setBounds(920, 490, 150, 37);

        buttonGroup1.add(q1);
        q1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1.setText("Problem to check, if a number is ARMSTRONG Number or not.");
        q1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q1ActionPerformed(evt);
            }
        });
        jPanel1.add(q1);
        q1.setBounds(200, 190, 670, 50);

        buttonGroup1.add(q2);
        q2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q2.setText("Problem to find out first 'n' PRIME Numbers.");
        jPanel1.add(q2);
        q2.setBounds(200, 250, 670, 50);

        buttonGroup1.add(q3);
        q3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q3.setText("Problem to find out if entered String is Palindrome or not.");
        jPanel1.add(q3);
        q3.setBounds(200, 310, 670, 50);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Round 1, Language: 'C'");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(370, 10, 300, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        
       try{ if(q1.isSelected())
        {
            this.setVisible(false);
            new RoundOneC_q1().setVisible(true);
        }
        if(q2.isSelected())
        {
            this.setVisible(false);
            new RoundOneC_q2().setVisible(true);
        }
        if(q3.isSelected())
        {
            this.setVisible(false);
            new RoundOneC_q3().setVisible(true);
        }
       }catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_nextActionPerformed

    private void q1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q1ActionPerformed

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
            java.util.logging.Logger.getLogger(RoundOneQuestionsC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoundOneQuestionsC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoundOneQuestionsC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoundOneQuestionsC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoundOneQuestionsC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton next;
    private javax.swing.JRadioButton q1;
    private javax.swing.JRadioButton q2;
    private javax.swing.JRadioButton q3;
    // End of variables declaration//GEN-END:variables
}
