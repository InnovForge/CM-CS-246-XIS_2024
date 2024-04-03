
import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license Click
 * nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this
 * template
 */
/**
 *
 * @author team3
 */
public class Form extends javax.swing.JFrame {

    Operation operation;
// NOTE: đề xuất cách dùng 
/*     try {
            double sum = 0.0;
            operation.setA(Double.parseDouble(this.jTextFieldSoThu1.getText()));
            operation.setB(Double.parseDouble(this.jTextFieldSoThu2.getText()));
            sum = operation.add();
            if (sum % 1 != 0) {
                this.jLabelKQMAIN.setText(sum + "");
            } else {
                this.jLabelKQMAIN.setText((int) sum + "");
            }
        } catch (NumberFormatException e) {
            this.jLabelKQMAIN.setText("Nhập dữ liệu sai!");
        }
     */
    public Form() {
        initComponents();
        this.jLabelPHEPCONG.setFont(new Font("Arial", Font.PLAIN, 20));
        this.setTitle("Calculator Group 3");

        this.setLocationRelativeTo(null);

        jTextFieldSoThu1.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));

        jTextFieldSoThu2.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));

        this.jButtonCong.setBackground(new Color(19, 161, 161));
        jButtonCong.setForeground(Color.WHITE);

        this.jButtonTru.setBackground(new Color(224, 16, 40));
        jButtonTru.setForeground(Color.WHITE);

        this.jButtonNhan.setBackground(new Color(136, 19, 168));
        jButtonNhan.setForeground(Color.WHITE);

        this.jButtonChia.setBackground(new Color(217, 237, 31));
        jButtonChia.setForeground(Color.BLACK);
        ImageIcon image = new ImageIcon(getClass().getClassLoader().getResource("logo.png"));
        this.setIconImage(image.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelPHEPCONG = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldSoThu1 = new javax.swing.JTextField();
        jTextFieldSoThu2 = new javax.swing.JTextField();
        jButtonCong = new javax.swing.JButton();
        jButtonNhapLai = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabelKQMAIN = new javax.swing.JLabel();
        jButtonTru = new javax.swing.JButton();
        jButtonNhan = new javax.swing.JButton();
        jButtonChia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelPHEPCONG.setText("CALCULATOR");

        jLabel1.setText("Số Thứ Nhất");

        jLabel2.setText("Số Thứ Hai");

        jButtonCong.setText("Cộng");
        jButtonCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCongActionPerformed(evt);
            }
        });

        jButtonNhapLai.setText("Nhập Lại");
        jButtonNhapLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNhapLaiActionPerformed(evt);
            }
        });

        jLabel3.setText("Kết quả:");

        jButtonTru.setText("Trừ");
        jButtonTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTruActionPerformed(evt);
            }
        });

        jButtonNhan.setText("Nhân");
        jButtonNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNhanActionPerformed(evt);
            }
        });

        jButtonChia.setText("Chia");
        jButtonChia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldSoThu2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldSoThu1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButtonCong)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonTru)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonNhan)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonNhapLai)
                                    .addComponent(jButtonChia)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabelPHEPCONG, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelKQMAIN, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabelPHEPCONG, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSoThu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSoThu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCong)
                    .addComponent(jButtonTru)
                    .addComponent(jButtonNhan)
                    .addComponent(jButtonChia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNhapLai)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelKQMAIN, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCongActionPerformed(java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButtonCongActionPerformed
        // TODO add your handling code here:
        try {
            operation = new Operation(
                    Double.parseDouble(jTextFieldSoThu1.getText()), Double.parseDouble(jTextFieldSoThu2.getText()));
            jLabelKQMAIN.setText(operation.add()+"");
        } catch (NumberFormatException e) {
            this.jLabelKQMAIN.setText("Nhập dữ liệu sai");
        }

    } // GEN-LAST:event_jButtonCongActionPerformed

    private void jButtonNhapLaiActionPerformed(java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButtonNhapLaiActionPerformed
        // TODO add your handling code here:
        this.jTextFieldSoThu1.setText("");
        this.jTextFieldSoThu2.setText("");
        jLabelKQMAIN.setText("");
    } // GEN-LAST:event_jButtonNhapLaiActionPerformed

    private void jButtonTruActionPerformed(java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButtonTruActionPerformed
        // TODO add your handling code here:
        try {
            operation = new Operation(Double.parseDouble(this.jTextFieldSoThu1.getText()),Double.parseDouble(this.jTextFieldSoThu2.getText()));
            this.jLabelKQMAIN.setText(operation.minus()+"");

        } catch (NumberFormatException e) {
            this.jLabelKQMAIN.setText("Nhập dữ liệu sai");
        }
    } // GEN-LAST:event_jButtonTruActionPerformed

    private void jButtonNhanActionPerformed(
            java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButtonNhanActionPerformed
        // TODO add your handling code here:
        try {
            operation = new Operation(Double.parseDouble(this.jTextFieldSoThu1.getText()),
            Double.parseDouble(this.jTextFieldSoThu2.getText()));
            this.jLabelKQMAIN.setText(operation.multiply()+"");

        } catch (NumberFormatException e) {
            this.jLabelKQMAIN.setText("Nhập dữ liệu sai");
        }
    } // GEN-LAST:event_jButtonNhanActionPerformed

    private void jButtonChiaActionPerformed(
            java.awt.event.ActionEvent evt) {
        try {
            double num1= Double.parseDouble(jTextFieldSoThu1.getText());
            double num2= Double.parseDouble(jTextFieldSoThu2.getText());
            double chia=0;
            if(num2==0){
                jLabelKQMAIN.setText("Cannot divide by zero");
            }
            else{
                chia=num1/num2;
                DecimalFormat df = new DecimalFormat("0.000");
                String formattedNumber = df.format(chia);
                jLabelKQMAIN.setText(formattedNumber+"");
            } 
        } catch (NumberFormatException e) {
            jLabelKQMAIN.setText("NHAP SAI DU LIEU !!");
        }
        // GEN-FIRST:event_jButtonChiaActionPerformed
        // TODO add your handling code here:
    } // GEN-LAST:event_jButtonChiaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        //(optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the
     * default look and feel. For details see
     * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info
                    : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChia;
    private javax.swing.JButton jButtonCong;
    private javax.swing.JButton jButtonNhan;
    private javax.swing.JButton jButtonNhapLai;
    private javax.swing.JButton jButtonTru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelKQMAIN;
    private javax.swing.JLabel jLabelPHEPCONG;
    private javax.swing.JTextField jTextFieldSoThu1;
    private javax.swing.JTextField jTextFieldSoThu2;
    // End of variables declaration//GEN-END:variables
}
