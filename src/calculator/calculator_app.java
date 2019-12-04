
package calculator;

/**
 *
 * @author IT-Laotelecom
 */
public class calculator_app extends javax.swing.JFrame {

    /**
     * Creates new form calculator_app
     */
    public calculator_app() {
        initComponents();
        ON_radio.setEnabled(false);
    }
    public void enable(){
        ON_radio.setEnabled(false);
        OFF_radio.setEnabled(true);
         monitor.setEnabled(true);
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        btn0.setEnabled(true);
        Delete_btn.setEnabled(true);
        Deleteall_btn.setEnabled(true);
        devide_btn.setEnabled(true);
        equal_btn.setEnabled(true);
        minus_btn.setEnabled(true);
        dot_btn.setEnabled(true);
        multiple_btn.setEnabled(true);
        plus_btn.setEnabled(true);
    }
    public void disabled(){
            
        monitor.setEnabled(false);
        ON_radio.setEnabled(true);
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        btn0.setEnabled(false);
        Delete_btn.setEnabled(false);
        Deleteall_btn.setEnabled(false);
        devide_btn.setEnabled(false);
        equal_btn.setEnabled(false);
        minus_btn.setEnabled(false);
        dot_btn.setEnabled(false);
        multiple_btn.setEnabled(false);
        plus_btn.setEnabled(false);
        
        
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton16 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        monitor = new javax.swing.JTextField();
        OFF_radio = new javax.swing.JRadioButton();
        ON_radio = new javax.swing.JRadioButton();
        Delete_btn = new javax.swing.JButton();
        Deleteall_btn = new javax.swing.JButton();
        minus_btn = new javax.swing.JButton();
        plus_btn = new javax.swing.JButton();
        devide_btn = new javax.swing.JButton();
        multiple_btn = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        equal_btn = new javax.swing.JButton();
        dot_btn = new javax.swing.JButton();
        result = new javax.swing.JLabel();

        jButton16.setText("+");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("calculator");
        setLocation(new java.awt.Point(500, 250));
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        monitor.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        monitor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        monitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monitorActionPerformed(evt);
            }
        });
        getContentPane().add(monitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 36, 243, 52));

        buttonGroup1.add(OFF_radio);
        OFF_radio.setText("OFF");
        OFF_radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OFF_radioActionPerformed(evt);
            }
        });
        getContentPane().add(OFF_radio, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 100, -1, 15));

        buttonGroup1.add(ON_radio);
        ON_radio.setText("ON");
        ON_radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ON_radioActionPerformed(evt);
            }
        });
        getContentPane().add(ON_radio, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 127, -1, 16));

        Delete_btn.setText("<==");
        Delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_btnActionPerformed(evt);
            }
        });
        getContentPane().add(Delete_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 100, 55, 46));

        Deleteall_btn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Deleteall_btn.setText("C");
        Deleteall_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Deleteall_btnActionPerformed(evt);
            }
        });
        getContentPane().add(Deleteall_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 100, 59, 45));

        minus_btn.setText("-");
        getContentPane().add(minus_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 152, 56, 46));

        plus_btn.setText("+");
        plus_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plus_btnActionPerformed(evt);
            }
        });
        getContentPane().add(plus_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 100, 56, 46));

        devide_btn.setText("/");
        getContentPane().add(devide_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 256, 56, 46));

        multiple_btn.setText("*");
        getContentPane().add(multiple_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 204, 56, 46));

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 152, 56, 46));

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 152, 56, 46));

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 152, 56, 46));

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 204, 56, 46));

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 204, 56, 46));

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 204, 56, 46));

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 256, 56, 46));

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 256, 56, 46));

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 256, 56, 46));

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 308, 56, 46));

        equal_btn.setText("=");
        equal_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equal_btnActionPerformed(evt);
            }
        });
        getContentPane().add(equal_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 308, 118, 46));

        dot_btn.setText(".");
        dot_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dot_btnActionPerformed(evt);
            }
        });
        getContentPane().add(dot_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 308, 56, 46));
        getContentPane().add(result, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 6, 106, 24));

        setBounds(0, 0, 266, 408);
    }// </editor-fold>//GEN-END:initComponents

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        monitor.setText(monitor.getText()+"3"); // button number 3
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        monitor.setText(monitor.getText()+"7"); // button number 7
    }//GEN-LAST:event_btn7ActionPerformed

    private void monitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monitorActionPerformed
        
    }//GEN-LAST:event_monitorActionPerformed

    private void OFF_radioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OFF_radioActionPerformed
        disabled();  // Off button
    }//GEN-LAST:event_OFF_radioActionPerformed

    private void ON_radioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ON_radioActionPerformed
        enable(); // On button
    }//GEN-LAST:event_ON_radioActionPerformed

    private void Delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Delete_btnActionPerformed

    private void Deleteall_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Deleteall_btnActionPerformed
        monitor.setText(" "); // delete button
    }//GEN-LAST:event_Deleteall_btnActionPerformed

    private void plus_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus_btnActionPerformed
        monitor.setText(monitor.getText()+"+"); // plus button
    }//GEN-LAST:event_plus_btnActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        monitor.setText(monitor.getText()+"8"); // bottun number8
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        monitor.setText(monitor.getText()+"9"); // button number 9
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        monitor.setText(monitor.getText()+"4"); // button number 4
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        monitor.setText(monitor.getText()+"5"); // button number 5
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        monitor.setText(monitor.getText()+"6"); // button number 6
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        monitor.setText(monitor.getText()+"1"); // button number 1
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        monitor.setText(monitor.getText()+"2"); // button number 2
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        monitor.setText(monitor.getText()+"0"); // button number 0
    }//GEN-LAST:event_btn0ActionPerformed

    private void dot_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dot_btnActionPerformed
        monitor.setText(monitor.getText()+"."); // point button
    }//GEN-LAST:event_dot_btnActionPerformed

    private void equal_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equal_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equal_btnActionPerformed

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
            java.util.logging.Logger.getLogger(calculator_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator_app().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete_btn;
    private javax.swing.JButton Deleteall_btn;
    private javax.swing.JRadioButton OFF_radio;
    private javax.swing.JRadioButton ON_radio;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton devide_btn;
    private javax.swing.JButton dot_btn;
    private javax.swing.JButton equal_btn;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton minus_btn;
    private javax.swing.JTextField monitor;
    private javax.swing.JButton multiple_btn;
    private javax.swing.JButton plus_btn;
    private javax.swing.JLabel result;
    // End of variables declaration//GEN-END:variables
}
