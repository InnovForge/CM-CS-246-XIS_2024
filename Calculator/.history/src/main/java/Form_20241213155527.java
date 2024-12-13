
import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

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
    boolean checkCalcu = false;
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
    public void checkCalcu(String value) {
        if (checkCalcu == true) {
            if (value == ".") {
                if (!jTextFieldSoThu1.getText().contains(".")) {
                    jTextFieldSoThu1.setText(jTextFieldSoThu1.getText().concat("."));
                }

            } else {
                jTextFieldSoThu1.setText(jTextFieldSoThu1.getText().concat(String.valueOf(value)));
            }

        } else {
            if (value == ".") {
                if (!jTextFieldSoThu2.getText().contains(".")) {
                    jTextFieldSoThu2.setText(jTextFieldSoThu2.getText().concat("."));
                }
            } else {
                jTextFieldSoThu2.setText(jTextFieldSoThu2.getText().concat(String.valueOf(value)));
            }

        }
    }

    public Form() {
        initComponents();
        this.jLabelPHEPCONG.setFont(new Font("Arial", Font.PLAIN, 20));
        this.setTitle("Calculator");

        this.setLocationRelativeTo(null);

        jTextFieldSoThu1.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));

        jTextFieldSoThu2.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));

        ImageIcon image = new ImageIcon(getClass().getClassLoader().getResource("logo.png"));
        this.setIconImage(image.getImage());

        jLabel4.setText("About");
        jTextFieldSoThu1.setEditable(false);
        jTextFieldSoThu2.setEditable(false);
        jTextFieldSoThu1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                checkCalcu = false;
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Do nothing when focus is lost
                checkCalcu = true;
            }
        });
        jTextFieldSoThu2.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                System.out.println("FocusGaned11");
                checkCalcu = true;
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Do nothing when focus is lost
                System.out.println("Lost focus22");
                checkCalcu = false;
            }
        });
        SwingUtilities.invokeLater(() -> jTextFieldSoThu1.requestFocusInWindow());
        SwingUtilities.invokeLater(() -> jTextFieldSoThu2.requestFocusInWindow());

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

        jButton10 = new javax.swing.JButton();
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
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButtonXongj1 = new javax.swing.JButton();
        jButtonXongj2 = new javax.swing.JButton();
        jButtonAm = new javax.swing.JButton();

        jButton10.setText("jButton10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelPHEPCONG.setText("CALCULATOR");

        jLabel1.setText("Số Thứ Nhất");

        jLabel2.setText("Số Thứ Hai");

        jTextFieldSoThu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSoThu1ActionPerformed(evt);
            }
        });

        jTextFieldSoThu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSoThu2ActionPerformed(evt);
            }
        });

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

        jLabel4.setText("jLabel4");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton0.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButton19.setText(".");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButtonXongj1.setText("Xóa");
        jButtonXongj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXongj1ActionPerformed(evt);
            }
        });

        jButtonXongj2.setText("Xóa");
        jButtonXongj2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXongj2ActionPerformed(evt);
            }
        });

        jButtonAm.setText("(-)");
        jButtonAm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonAm)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelKQMAIN, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldSoThu2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonXongj2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jButtonNhapLai, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonNhan)
                                    .addComponent(jButtonTru, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonChia)
                                    .addComponent(jButtonCong)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(121, 121, 121)
                                .addComponent(jLabelPHEPCONG, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldSoThu1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonXongj1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabelPHEPCONG, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSoThu1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonXongj1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldSoThu2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonXongj2)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelKQMAIN, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCong, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonTru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonChia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNhapLai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAm)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSoThu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSoThu1ActionPerformed
       

    }//GEN-LAST:event_jTextFieldSoThu1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        JOptionPane.showMessageDialog(rootPane, "Team 3\n@NGUYEN DINH MINH HAI\n@NGUYEN TUONG HY (LEADER)\n@NGUYEN THANH NHAT\n@LUU DUC THANG\n@TRUONG THANH VY\n-----------\nCMU-CS-246-XIS-2024", "About", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        checkCalcu("4");

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        checkCalcu("9");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        checkCalcu("5");

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int dem = 0;
        checkCalcu("1");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        checkCalcu("2");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        checkCalcu("3");

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        checkCalcu("6");

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        checkCalcu("7");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        checkCalcu("8");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        checkCalcu("0");
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        checkCalcu(".");
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jTextFieldSoThu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSoThu2ActionPerformed
    }//GEN-LAST:event_jTextFieldSoThu2ActionPerformed

    private void jButtonXongj2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXongj2ActionPerformed
        // checkCalcu = false;
        String string = jTextFieldSoThu2.getText();
        jTextFieldSoThu2.setText("");
        for (int i = 0; i < string.length() - 1; i++) {
            jTextFieldSoThu2.setText(jTextFieldSoThu2.getText() + string.charAt(i));
        }
    }//GEN-LAST:event_jButtonXongj2ActionPerformed

    private void jButtonXongj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXongj1ActionPerformed
        //checkCalcu = true;
        String string = jTextFieldSoThu1.getText();
        jTextFieldSoThu1.setText("");
        for (int i = 0; i < string.length() - 1; i++) {
            jTextFieldSoThu1.setText(jTextFieldSoThu1.getText() + string.charAt(i));
        }
    }//GEN-LAST:event_jButtonXongj1ActionPerformed

    private void jButtonAmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAmActionPerformed
        if (checkCalcu == false) {
            double temp = Double.parseDouble(jTextFieldSoThu1.getText());
            temp *= -1;
            jTextFieldSoThu1.setText(String.valueOf(temp));
        } else {
            double temp = Double.parseDouble(jTextFieldSoThu2.getText());
            temp *= -1;
            jTextFieldSoThu2.setText(String.valueOf(temp));
        }
    }//GEN-LAST:event_jButtonAmActionPerformed

    private void jButtonCongActionPerformed(java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButtonCongActionPerformed
        //    System.out.println("Hello World!");
//        jTextFieldSoThu1.addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//                System.out.println("Hello World!");
//                checkC = true;
//                checkChia = true;
//                checkN = true;
//                checkT = true;
//            }
//        });
        try {

            operation = new Operation(Double.parseDouble(this.jTextFieldSoThu1.getText().trim()), Double.parseDouble(this.jTextFieldSoThu2.getText().trim()));
            this.jLabelKQMAIN.setText(operation.formatResult(operation.add()) + "");
        } catch (NumberFormatException e) {
            this.jLabelKQMAIN.setText("Nhập dữ liệu sai");
        }

    } // GEN-LAST:event_jButtonCongActionPerformed

    private void jButtonNhapLaiActionPerformed(java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButtonNhapLaiActionPerformed
        // TODO add your handling code here:
        this.jTextFieldSoThu1.setText("");
        this.jTextFieldSoThu2.setText("");
        jLabelKQMAIN.setText("");
        checkCalcu = false;
    } // GEN-LAST:event_jButtonNhapLaiActionPerformed

    private void jButtonTruActionPerformed(java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButtonTruActionPerformed
        try {

            operation = new Operation(Double.parseDouble(this.jTextFieldSoThu1.getText().trim()), Double.parseDouble(this.jTextFieldSoThu2.getText().trim()));
            this.jLabelKQMAIN.setText(operation.formatResult(operation.minus()) + "");

        } catch (NumberFormatException e) {
            this.jLabelKQMAIN.setText("Nhập dữ liệu sai");
        }
    } // GEN-LAST:event_jButtonTruActionPerformed
    boolean checkN = false;

    private void jButtonNhanActionPerformed(
            java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButtonNhanActionPerformed
        // TODO add your handling code here:

        try {

            operation = new Operation(Double.parseDouble(this.jTextFieldSoThu1.getText().trim()), Double.parseDouble(this.jTextFieldSoThu2.getText().trim()));
            this.jLabelKQMAIN.setText(operation.formatResult(operation.multiply()) + "");
            checkN = false;

        } catch (NumberFormatException e) {
            this.jLabelKQMAIN.setText("Nhập dữ liệu sai");
        }
    } // GEN-LAST:event_jButtonNhanActionPerformed

    private void jButtonChiaActionPerformed(
            java.awt.event.ActionEvent evt) {

        try {

            double a = Double.parseDouble(this.jTextFieldSoThu1.getText().trim());
            double b = Double.parseDouble(this.jTextFieldSoThu2.getText().trim());
            if (b == 0.0) {
                this.jLabelKQMAIN.setText("Không thể chia cho 0");
                // this.jTextFieldSoThu1.setText("");
                this.jTextFieldSoThu2.setText("");
            } else {
                operation = new Operation(Double.parseDouble(this.jTextFieldSoThu1.getText().trim()), Double.parseDouble(this.jTextFieldSoThu2.getText().trim()));
                this.jLabelKQMAIN.setText(operation.formatResult(operation.divide()) + "");
            }

        } catch (NumberFormatException e) {
            this.jLabelKQMAIN.setText("Nhập dữ liệu sai");
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
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonAm;
    private javax.swing.JButton jButtonChia;
    private javax.swing.JButton jButtonCong;
    private javax.swing.JButton jButtonNhan;
    private javax.swing.JButton jButtonNhapLai;
    private javax.swing.JButton jButtonTru;
    private javax.swing.JButton jButtonXongj1;
    private javax.swing.JButton jButtonXongj2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelKQMAIN;
    private javax.swing.JLabel jLabelPHEPCONG;
    private javax.swing.JTextField jTextFieldSoThu1;
    private javax.swing.JTextField jTextFieldSoThu2;
    // End of variables declaration//GEN-END:variables
}
