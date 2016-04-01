/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author User
 */
public class RoundTwoQuestionsJava extends javax.swing.JFrame {

    /**
     * Creates new form RoundTwoQuestionsJava
     */
    public RoundTwoQuestionsJava() {
        initComponents();
        star();
        this.setTitle("Select a Question for Round 2");
        setDefaultCloseOperation(0);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
       setBounds(0,0,screenSize.width, screenSize.height);
       setVisible(true);
    }

    public void star(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/javaapplication2/images/extras/icon.png")));
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
        q1 = new javax.swing.JRadioButton();
        q2 = new javax.swing.JRadioButton();
        q3 = new javax.swing.JRadioButton();
        next = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(null);

        buttonGroup1.add(q1);
        q1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1.setText("Problem to apply Binary Search on a list of numbers.");
        jPanel1.add(q1);
        q1.setBounds(180, 190, 510, 60);

        buttonGroup1.add(q2);
        q2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q2.setText("Problem to apply Bubble Sort on a list of numbers.");
        jPanel1.add(q2);
        q2.setBounds(180, 270, 510, 60);

        buttonGroup1.add(q3);
        q3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q3.setText("Problem to find out the Transpose of a Matrix.");
        jPanel1.add(q3);
        q3.setBounds(180, 350, 510, 60);

        next.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel1.add(next);
        next.setBounds(810, 470, 110, 37);

        jLabel1.setBackground(new java.awt.Color(0, 255, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Round 2, Language: 'JAVA'");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(340, 10, 340, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1364, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        
        if(q1.isSelected())
        {
            this.setVisible(false);
            new RoundTwoJava_q1().setVisible(true);
        }

        if(q2.isSelected())
        {
            this.setVisible(false);
            new RoundTwoJava_q2().setVisible(true);
        }

        if(q3.isSelected())
        {
            this.setVisible(false);
            new RoundTwoJava_q3().setVisible(true);
        }
    }//GEN-LAST:event_nextActionPerformed

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
            java.util.logging.Logger.getLogger(RoundTwoQuestionsJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoundTwoQuestionsJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoundTwoQuestionsJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoundTwoQuestionsJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoundTwoQuestionsJava().setVisible(true);
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
