/**
 *
 * @author koonp@641102064111
 * Create on 2:17:13 PM Sep 14, 2022
 * This file is part of "phattara.scit402_calculator" Package (First).
 */
package errorDialog;
/**
 *
 * @author koonp
 */
public class Calc extends javax.swing.JDialog {

    /**
     * Creates new form Calc
     */
    public Calc(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        txtf_output = new javax.swing.JTextField();
        NumPanel = new javax.swing.JPanel();
        btn_empty = new javax.swing.JButton();
        btn_clr = new javax.swing.JButton();
        btn_del = new javax.swing.JButton();
        btn_divide = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_multiply = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_plus = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_subtract = new javax.swing.JButton();
        btn_change = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_dot = new javax.swing.JButton();
        btn_total = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculator");
        setBackground(new java.awt.Color(204, 255, 255));
        setResizable(false);

        txtf_output.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        txtf_output.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtf_output.setText("0.00");

        NumPanel.setBackground(new java.awt.Color(204, 255, 255));
        NumPanel.setLayout(new java.awt.GridLayout(5, 4));

        btn_empty.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_empty.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NumPanel.add(btn_empty);

        btn_clr.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_clr.setText("CLR");
        btn_clr.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_clr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clrActionPerformed(evt);
            }
        });
        NumPanel.add(btn_clr);

        btn_del.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_del.setText("<<");
        btn_del.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delActionPerformed(evt);
            }
        });
        NumPanel.add(btn_del);

        btn_divide.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_divide.setText("/");
        btn_divide.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divideActionPerformed(evt);
            }
        });
        NumPanel.add(btn_divide);

        btn_7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_7.setText("7");
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        NumPanel.add(btn_7);

        btn_8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_8.setText("8");
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        NumPanel.add(btn_8);

        btn_9.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_9.setText("9");
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        NumPanel.add(btn_9);

        btn_multiply.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_multiply.setText("*");
        btn_multiply.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplyActionPerformed(evt);
            }
        });
        NumPanel.add(btn_multiply);

        btn_4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_4.setText("4");
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        NumPanel.add(btn_4);

        btn_5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_5.setText("5");
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        NumPanel.add(btn_5);

        btn_6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_6.setText("6");
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        NumPanel.add(btn_6);

        btn_plus.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_plus.setText("+");
        btn_plus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_plusActionPerformed(evt);
            }
        });
        NumPanel.add(btn_plus);

        btn_1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_1.setText("1");
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        NumPanel.add(btn_1);

        btn_2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_2.setText("2");
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        NumPanel.add(btn_2);

        btn_3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_3.setText("3");
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        NumPanel.add(btn_3);

        btn_subtract.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_subtract.setText("-");
        btn_subtract.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_subtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subtractActionPerformed(evt);
            }
        });
        NumPanel.add(btn_subtract);

        btn_change.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_change.setText("+/-");
        btn_change.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_changeActionPerformed(evt);
            }
        });
        NumPanel.add(btn_change);

        btn_0.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_0.setText("0");
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        NumPanel.add(btn_0);

        btn_dot.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_dot.setText(".");
        btn_dot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dotActionPerformed(evt);
            }
        });
        NumPanel.add(btn_dot);

        btn_total.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_total.setText("=");
        btn_total.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_totalActionPerformed(evt);
            }
        });
        NumPanel.add(btn_total);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtf_output)
                    .addComponent(NumPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtf_output, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NumPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_clrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clrActionPerformed
        txtf_output.setText("0.00");
    }//GEN-LAST:event_btn_clrActionPerformed

    private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delActionPerformed
        if(!txtf_output.getText().equals("")&&!txtf_output.getText().equals("0.00")){
            txtf_output.setText(txtf_output.getText().substring(0,txtf_output.getText().length()-1));
        }
        if(txtf_output.getText().equals("")){
            txtf_output.setText("0.00");
        }
    }//GEN-LAST:event_btn_delActionPerformed

    private void btn_changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_changeActionPerformed
        // TODO add your handling code here:
        if(txtf_output.getText().startsWith("-")){
            txtf_output.setText(txtf_output.getText().substring(1, txtf_output.getText().length()));
        }else{
            if(!txtf_output.getText().equals("0.00")){
                txtf_output.setText("-"+txtf_output.getText());
            }
        }
    }//GEN-LAST:event_btn_changeActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        CalcController.addNumber(btn_0.getText(),txtf_output);
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        CalcController.addNumber(btn_1.getText(),txtf_output);
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        CalcController.addNumber(btn_2.getText(),txtf_output);
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        CalcController.addNumber(btn_3.getText(),txtf_output);
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        CalcController.addNumber(btn_4.getText(),txtf_output);
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        CalcController.addNumber(btn_5.getText(),txtf_output);
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        CalcController.addNumber(btn_6.getText(),txtf_output);
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        CalcController.addNumber(btn_7.getText(),txtf_output);
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        CalcController.addNumber(btn_8.getText(),txtf_output);
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        CalcController.addNumber(btn_9.getText(),txtf_output);
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_totalActionPerformed
        CalcController.addNumber(btn_total.getText(),txtf_output);
    }//GEN-LAST:event_btn_totalActionPerformed

    private void btn_subtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subtractActionPerformed
        CalcController.addNumber(btn_subtract.getText(),txtf_output);
    }//GEN-LAST:event_btn_subtractActionPerformed

    private void btn_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_plusActionPerformed
        CalcController.addNumber(btn_plus.getText(),txtf_output);
    }//GEN-LAST:event_btn_plusActionPerformed

    private void btn_multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplyActionPerformed
        CalcController.addNumber(btn_multiply.getText(),txtf_output);
    }//GEN-LAST:event_btn_multiplyActionPerformed

    private void btn_divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divideActionPerformed
        CalcController.addNumber(btn_divide.getText(),txtf_output);
    }//GEN-LAST:event_btn_divideActionPerformed

    private void btn_dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dotActionPerformed
        CalcController.addNumber(btn_dot.getText(),txtf_output);
    }//GEN-LAST:event_btn_dotActionPerformed

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
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Calc dialog = new Calc(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel NumPanel;
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_change;
    private javax.swing.JButton btn_clr;
    private javax.swing.JButton btn_del;
    private javax.swing.JButton btn_divide;
    private javax.swing.JButton btn_dot;
    private javax.swing.JButton btn_empty;
    private javax.swing.JButton btn_multiply;
    private javax.swing.JButton btn_plus;
    private javax.swing.JButton btn_subtract;
    private javax.swing.JButton btn_total;
    private javax.swing.JTextField txtf_output;
    // End of variables declaration//GEN-END:variables
}
