/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class RoundOneC_q2 extends javax.swing.JFrame {

    /**
     * Creates new form RoundOneC_q2
     */
    public RoundOneC_q2() {
        initComponents();
        star();
        this.setTitle("Round 1- Prime Number");
        setDefaultCloseOperation(0);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
       setBounds(0,0,screenSize.width, screenSize.height);
       setVisible(true);
       tablindcode.setEditable(false);
       view.setVisible(false);
       clear.setVisible(false);
       submit.setVisible(false);
       tv.setEditable(false);
       tv1.setEditable(false);
       tv2.setEditable(false);
       tv3.setEditable(false);
       dir.mkdir();
       tv.setVisible(false);
       tv1.setVisible(false);
       tv2.setVisible(false);
       tv3.setVisible(false);
//------------------------------------ to save the complete code dynamically--------------------------
       Login ob=new Login();
       new Thread(){
               @Override
            public void run() {
                super.run(); //To change body of generated methods, choose Tools | Templates.
                   
                while(true){
                    try {
                        sleep(1000);
                        
                        blindCode1=new FileWriter(new File(dir+"/blindcode1.doc"));
                        blindCode1.write("Team: "+ob.teamName+",  Selected Question 2,  Language: 'C'\n\n");
           


            switch(part1_code){
                case 1:
                blindCode1.write(s1);
                break;
                case 2:
                blindCode1.write(s2);
                break;
                case 3:
                blindCode1.write(s3);
                break;
                case 4:
                blindCode1.write(s4);
                break;
                case 5:
                blindCode1.write(s5);
                break;
                case 6:
                blindCode1.write(s6);
                break;
            }
            
            blindCode1.write("\n\n\n");
           switch(part2_code){
                case 1:
                blindCode1.write(s1);
                break;
                case 2:
                blindCode1.write(s2);
                break;
                case 3:
                blindCode1.write(s3);
                break;
                case 4:
                blindCode1.write(s4);
                break;
                case 5:
                blindCode1.write(s5);
                break;
                case 6:
                blindCode1.write(s6);
                break;
            }     
           
           blindCode1.write("\n\n\n");
           
            blindCode1.write(tablindcode.getText());
            
           blindCode1.write("\n\n\n"); 
           
            switch(part3_code){
                case 1:
                blindCode1.write(s1);
                break;
                case 2:
                blindCode1.write(s2);
                break;
                case 3:
                blindCode1.write(s3);
                break;
                case 4:
                blindCode1.write(s4);
                break;
                case 5:
                blindCode1.write(s5);
                break;
                case 6:
                blindCode1.write(s6);
                break;
            } 
            
                    } catch (InterruptedException ex) {
                        Logger.getLogger(RoundOneC_q1.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(RoundOneC_q1.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                    try {
                        blindCode1.close();
                    } catch (IOException ex) {
                        Logger.getLogger(RoundOneC_q1.class.getName()).log(Level.SEVERE, null, ex);
                    }
               }           
            }
               
               }.start();
           
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

        jPanel1 = new javax.swing.JPanel();
        p2 = new javax.swing.JLabel();
        p6 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        part1 = new javax.swing.JLabel();
        blindcode = new javax.swing.JLabel();
        part2 = new javax.swing.JLabel();
        part3 = new javax.swing.JLabel();
        lock = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        view = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        tv = new javax.swing.JTextField();
        tv1 = new javax.swing.JTextField();
        tv2 = new javax.swing.JTextField();
        tv3 = new javax.swing.JTextField();
        scrol = new javax.swing.JScrollPane();
        tablindcode = new javax.swing.JTextArea();
        title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(70, 23, 185));
        jPanel1.setLayout(null);

        p2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/images/C/round1/q2/2.jpg"))); // NOI18N
        p2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p2MouseClicked(evt);
            }
        });
        jPanel1.add(p2);
        p2.setBounds(970, 30, 370, 160);

        p6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/images/C/round1/q2/6.jpg"))); // NOI18N
        p6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p6MouseClicked(evt);
            }
        });
        jPanel1.add(p6);
        p6.setBounds(970, 390, 370, 160);

        p1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/images/C/round1/q2/1.jpg"))); // NOI18N
        p1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p1MouseClicked(evt);
            }
        });
        jPanel1.add(p1);
        p1.setBounds(590, 30, 370, 160);

        p3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/images/C/round1/q2/3.jpg"))); // NOI18N
        p3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p3MouseClicked(evt);
            }
        });
        jPanel1.add(p3);
        p3.setBounds(590, 210, 370, 160);

        p4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/images/C/round1/q2/4.jpg"))); // NOI18N
        p4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p4MouseClicked(evt);
            }
        });
        jPanel1.add(p4);
        p4.setBounds(970, 210, 370, 160);

        p5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/images/C/round1/q2/5.jpg"))); // NOI18N
        p5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p5MouseClicked(evt);
            }
        });
        jPanel1.add(p5);
        p5.setBounds(590, 390, 370, 160);

        part1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/images/C/round1/q2/part1.png"))); // NOI18N
        part1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                part1MouseClicked(evt);
            }
        });
        jPanel1.add(part1);
        part1.setBounds(50, 10, 360, 154);

        blindcode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/images/C/round1/q2/blind_code.png"))); // NOI18N
        jPanel1.add(blindcode);
        blindcode.setBounds(50, 330, 360, 150);

        part2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/images/C/round1/q2/part2.png"))); // NOI18N
        part2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                part2MouseClicked(evt);
            }
        });
        jPanel1.add(part2);
        part2.setBounds(50, 170, 360, 150);

        part3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/images/C/round1/q2/part3.png"))); // NOI18N
        part3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                part3MouseClicked(evt);
            }
        });
        jPanel1.add(part3);
        part3.setBounds(50, 490, 360, 150);

        lock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lock.setText("LOCK");
        lock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lockActionPerformed(evt);
            }
        });
        jPanel1.add(lock);
        lock.setBounds(440, 170, 110, 40);

        clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear);
        clear.setBounds(440, 440, 120, 40);

        view.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        view.setText("VIEW");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        jPanel1.add(view);
        view.setBounds(440, 330, 120, 40);

        submit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit);
        submit.setBounds(440, 590, 120, 40);

        tv.setText("clicked on");
        tv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tvActionPerformed(evt);
            }
        });
        jPanel1.add(tv);
        tv.setBounds(730, 680, 250, 20);

        tv1.setText("selected part");
        tv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tv1ActionPerformed(evt);
            }
        });
        jPanel1.add(tv1);
        tv1.setBounds(430, 90, 130, 20);

        tv2.setText("selected part");
        jPanel1.add(tv2);
        tv2.setBounds(439, 240, 130, 20);

        tv3.setText("selected part");
        jPanel1.add(tv3);
        tv3.setBounds(439, 520, 130, 20);

        tablindcode.setColumns(20);
        tablindcode.setForeground(new java.awt.Color(255, 255, 255));
        tablindcode.setRows(5);
        tablindcode.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tablindcode.setSelectedTextColor(new java.awt.Color(204, 255, 255));
        tablindcode.setSelectionColor(new java.awt.Color(204, 255, 255));
        scrol.setViewportView(tablindcode);

        jPanel1.add(scrol);
        scrol.setBounds(50, 330, 360, 150);

        title.setBackground(new java.awt.Color(0, 255, 204));
        title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title.setText("Round 1");
        jPanel1.add(title);
        title.setBounds(450, 10, 180, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MouseClicked
        // TODO add your handling code here:
        tv.setText("selected part 2");
        count=2;
    }//GEN-LAST:event_p2MouseClicked

    private void p6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p6MouseClicked
        // TODO add your handling code here:
        tv.setText("selected part 6");
        count=6;
    }//GEN-LAST:event_p6MouseClicked

    private void p1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1MouseClicked
        // TODO add your handling code here:
        tv.setText("selected part 1");
        count=1;
    }//GEN-LAST:event_p1MouseClicked

    private void p3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3MouseClicked
        // TODO add your handling code here:
        tv.setText("selected part 3");
        count=3;
    }//GEN-LAST:event_p3MouseClicked

    private void p4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p4MouseClicked
        // TODO add your handling code here:
        tv.setText("selected part 4");
        count=4;
    }//GEN-LAST:event_p4MouseClicked

    private void p5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5MouseClicked
        // TODO add your handling code here:
        tv.setText("selected part 5");
        count=5;
    }//GEN-LAST:event_p5MouseClicked

    private void part1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_part1MouseClicked
        // TODO add your handling code here:
        switch(count)
        {
            case 1:
            part1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/images/C/round1/q2/1.jpg")));

            break;
            case 2:
            part1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/images/C/round1/q2/2.jpg")));

            break;
            case 3:
            part1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/images/C/round1/q2/3.jpg")));

            break;
            case 4:
            part1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/images/C/round1/q2/4.jpg")));

            break;
            case 5:
            part1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/images/C/round1/q2/5.jpg")));

            break;
            case 6:
            part1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/images/C/round1/q2/6.jpg")));

            break;
        }
        tv1.setText("selected part:"+count);
        part1_code=count;
    }//GEN-LAST:event_part1MouseClicked

    private void part2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_part2MouseClicked
        // TODO add your handling code here:
        switch(count)
        {
            case 1:
            part2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/images/C/round1/q2/1.jpg")));

            break;
            case 2:
            part2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/images/C/round1/q2/2.jpg")));

            break;
            case 3:
            part2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/images/C/round1/q2/3.jpg")));

            break;
            case 4:
            part2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/images/C/round1/q2/4.jpg")));

            break;
            case 5:
            part2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/images/C/round1/q2/5.jpg")));

            break;
            case 6:
            part2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/images/C/round1/q2/6.jpg")));

            break;
        }
        tv2.setText("selected part:"+count);
        part2_code=count;
    }//GEN-LAST:event_part2MouseClicked

    private void part3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_part3MouseClicked
        // TODO add your handling code here:
        switch(count)
        {
            case 1:
            part3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/images/C/round1/q2/1.jpg")));

            break;
            case 2:
            part3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/images/C/round1/q2/2.jpg")));

            break;
            case 3:
            part3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/images/C/round1/q2/3.jpg")));

            break;
            case 4:
            part3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/images/C/round1/q2/4.jpg")));

            break;
            case 5:
            part3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/images/C/round1/q2/5.jpg")));

            break;
            case 6:
            part3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/images/C/round1/q2/6.jpg")));

            break;
        }
        tv3.setText("selected part:"+count);
        part3_code=count;
    }//GEN-LAST:event_part3MouseClicked

    private void lockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lockActionPerformed
        // TODO add your handling code here:
        lock.setVisible(false);
        JOptionPane.showMessageDialog(this, "Start Blind Coding now.");
        blindcode.setVisible(false);
        tablindcode.setEditable(true);
        view.setVisible(true);
        clear.setVisible(true);
        submit.setVisible(true);
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        tv.setVisible(false);
        count=0;
        
        try{
            Login fileName=new Login();
            osDoc=new FileWriter(new File(dir+"/"+fileName.teamName+"-Round 1.doc"),true);
            osC=new FileWriter(new File(dir+"/round1.c"),true);
            PrintWriter pwDoc= new PrintWriter(osDoc,false);
            PrintWriter pwC= new PrintWriter(osC,false);

            pwDoc.append("Team: "+fileName.teamName+" , Selects Question 2, Language: C"+"\n\n\n\n");

            pwDoc.append("----------------------------PART 1-----------------------------\n\n\n");

           switch(part1_code){
               case 1:
                pwDoc.append(s1);
                pwC.append(s1);
                break;
                case 2:
                pwDoc.append(s2);
                pwC.append(s2);
                break;
                case 3:
                pwDoc.append(s3);
                pwC.append(s3);
                break;
                case 4:
                pwDoc.append(s4);
                pwC.append(s4);
                break;
                case 5:
                pwDoc.append(s5);
                pwC.append(s5);
                break;
                case 6:
                pwDoc.append(s6);
                pwC.append(s6);
                break;
           }
           pwDoc.append("\n--------------------------------------------------------------\n\n\n\n\n");
           
           pwDoc.append("\n\n\n----------------------------PART 2-----------------------------\n\n\n");
           switch(part2_code){
               case 1:
                pwDoc.append(s1);
                pwC.append(s1);
                break;
                case 2:
                pwDoc.append(s2);
                pwC.append(s2);
                break;
                case 3:
                pwDoc.append(s3);
                pwC.append(s3);
                break;
                case 4:
                pwDoc.append(s4);
                pwC.append(s4);
                break;
                case 5:
                pwDoc.append(s5);
                pwC.append(s5);
                break;
                case 6:
                pwDoc.append(s6);
                pwC.append(s6);
                break;
           }
           pwDoc.append("\n--------------------------------------------------------------\n\n\n\n\n\n");
           
           
           
            osDoc.close();
            osC.close();
            pwDoc.close();
            pwC.close();
       }catch(Exception e)
       {
          
       }
    }//GEN-LAST:event_lockActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Your complete Blind Code cleared..");
        tablindcode.setText(null);
    }//GEN-LAST:event_clearActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
        submit.setVisible(true);
        countView++;
        if(countView>=3)
        {
            view.setVisible(false);
            clear.setVisible(false);
            JOptionPane.showMessageDialog(this, "Your VIEW clicks are completed.");
            ViewCodeTimer vc=new ViewCodeTimer();
            vc.setVisible(true);
            vc.show(part1,part2,tablindcode,part3);
            
        }
        else
        
        {
            ViewCodeTimer vc=new ViewCodeTimer();
            vc.setVisible(true);
            vc.show(part1,part2,tablindcode,part3);
        }
    }//GEN-LAST:event_viewActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);

        FinalView_CRound1 ob=new FinalView_CRound1();
        ob.setVisible(true);
        ob.View(part1, part2, tablindcode, part3);
        
        try{
            Login fileName=new Login();
            
           
            osDoc=new FileWriter(new File(dir+"/"+fileName.teamName+"-Round 1.doc"),true);
            osBat=new FileWriter(new File(dir+"/execute1.cmd"),true);
            osC=new FileWriter(new File(dir+"/round1.c"),true);
            osBat.write("@echo"+"\r\n"+"tcc round1.c"+"\r\npause\r\n"+"round1");
            PrintWriter pwDoc= new PrintWriter(osDoc,false);
            PrintWriter pwC= new PrintWriter(osC,false);
            PrintWriter pwBat= new PrintWriter(osBat,false);

            pwDoc.append("\n--------------------BLInD CODE BY THe TEAM---------------------\n");
            pwDoc.append(tablindcode.getText());
            pwC.append(tablindcode.getText());

            pwDoc.append("\n--------------------------------------------------------------\n\n\n\n\n\n\n");

            pwDoc.append("\n----------------------------PART 3-----------------------------\n\n\n");

            switch(part3_code){
                case 1:
                pwDoc.append(s1);
                pwC.append(s1);
                break;
                case 2:
                pwDoc.append(s2);
                pwC.append(s2);
                break;
                case 3:
                pwDoc.append(s3);
                pwC.append(s3);
                break;
                case 4:
                pwDoc.append(s4);
                pwC.append(s4);
                break;
                case 5:
                pwDoc.append(s5);
                pwC.append(s5);
                break;
                case 6:
                pwDoc.append(s6);
                pwC.append(s6);
                break;
            }
            pwDoc.append("\n--------------------------------------------------------------\n\n\n\n\n\n\n");
            
            
            osDoc.close();
            osC.close();
            osBat.close();
            pwDoc.close();
            pwC.close();

            pwBat.close();
        }catch(Exception e)
        {

        }


    }//GEN-LAST:event_submitActionPerformed

    private void tvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tvActionPerformed

    private void tv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tv1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tv1ActionPerformed

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
            java.util.logging.Logger.getLogger(RoundOneC_q2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoundOneC_q2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoundOneC_q2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoundOneC_q2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoundOneC_q2().setVisible(true);
            }
        });
    }
    
    static int count=0,countView=0;
    static int part1_code,part2_code,part3_code;
    static FileWriter osDoc,osC,osBat,blindCode1;
    File dir=new File("c:/SudoKodia");
    String s1="#include<stdio.h>\n" +
"void main()\n" +
"{\n" +
"   int n, i = 3, count, c;\n" +
"   printf(\"Enter the number of prime numbers required\\n\");",
            s2="#include<stdio.h>\n" +
"int main()\n" +
"{\n" +
"   int n, i = 3, count, c;\n" +
"   printf(\"Enter the number of prime numbers required\\n\");";
    
    
    String s3="  scanf(\"%d\",&n);\n" +
" \n" +
"   if ( n >= 1 )\n" +
"   {\n" +
"      printf(\"First %d prime numbers are :\\n\",n);\n" +
"      printf(\"2\\n\");\n" +
"   }";
    String s4="scanf(\"%d\",&n);\n" +
" \n" +
"   if ( n <= 1 )\n" +
"   {\n" +
"      printf(\"First %d prime numbers are :\\n\",n);\n" +
"      printf(\"2\\n\");\n" +
"   }",s5="     if ( c == i )\n" +
"      {\n" +
"         printf(\"%d\\n\",i);\n" +
"         count--;\n" +
"      }\n" +
"      i--;\n" +
"   } \n" +
"   return 0;",s6="     if ( c == i )\n" +
"      {\n" +
"         printf(\"%d\\n\",i);\n" +
"         count++;\n" +
"      }\n" +
"      i++;\n" +
"   } \n" +
"   return 0;\n" +
"}";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blindcode;
    private javax.swing.JButton clear;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lock;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p5;
    private javax.swing.JLabel p6;
    private javax.swing.JLabel part1;
    private javax.swing.JLabel part2;
    private javax.swing.JLabel part3;
    private javax.swing.JScrollPane scrol;
    private javax.swing.JButton submit;
    private javax.swing.JTextArea tablindcode;
    private javax.swing.JLabel title;
    private javax.swing.JTextField tv;
    private javax.swing.JTextField tv1;
    private javax.swing.JTextField tv2;
    private javax.swing.JTextField tv3;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
