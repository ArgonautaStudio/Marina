/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows; 

import javax.swing.*;




/**
 *
 * @author aleja
 */
public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */ 
    int x,y; 
    int cont = 0 ; 
    public LogIn() {
        initComponents();  
        AWTUtilities.setOpaque(this, false);
        this.setLocationRelativeTo(null);  
        panelLogin.setVisible(false); 
        panelChangeSignin.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGeneral = new javax.swing.JPanel();
        panelLogin = new javax.swing.JPanel();
        jtext_id = new javax.swing.JTextField();
        jtext_contrasenaId = new javax.swing.JTextField();
        jlabel_unlock1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton_login = new javax.swing.JButton();
        jlabel_line4 = new javax.swing.JLabel();
        jlabel_line7 = new javax.swing.JLabel();
        jlabel_personp = new javax.swing.JLabel();
        jlabel_fondo2 = new javax.swing.JLabel();
        panelSignin = new javax.swing.JPanel();
        jtext_usuario = new javax.swing.JTextField();
        jtext_confirmar = new javax.swing.JTextField();
        jtext_contrasenaAdmin = new javax.swing.JTextField();
        jtext_contrasena = new javax.swing.JTextField();
        jlabel_unlock = new javax.swing.JLabel();
        jlabel_lock = new javax.swing.JLabel();
        jlabel_key = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton_signIn = new javax.swing.JButton();
        jlabel_line = new javax.swing.JLabel();
        jlabel_line1 = new javax.swing.JLabel();
        jlabel_line2 = new javax.swing.JLabel();
        jlabel_line3 = new javax.swing.JLabel();
        jlabel_personplus = new javax.swing.JLabel();
        jRadioButton_admin = new javax.swing.JRadioButton();
        jRadioButton_vendedor = new javax.swing.JRadioButton();
        jlabel_fondo1 = new javax.swing.JLabel();
        jLabel_dragger = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jLabel_signIn = new javax.swing.JLabel();
        jlabel_fondo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        panelChangeSignin = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel_changeSingin = new javax.swing.JLabel();
        panelChangeLogin = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_changeLogin = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.white);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelGeneral.setLayout(null);

        panelLogin.setLayout(null);

        jtext_id.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jtext_id.setForeground(new java.awt.Color(147, 149, 152));
        jtext_id.setText("Id");
        jtext_id.setBorder(null);
        jtext_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtext_idMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jtext_idMouseExited(evt);
            }
        });
        panelLogin.add(jtext_id);
        jtext_id.setBounds(0, 20, 370, 30);

        jtext_contrasenaId.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jtext_contrasenaId.setForeground(new java.awt.Color(147, 149, 152));
        jtext_contrasenaId.setText("Contrasena");
        jtext_contrasenaId.setBorder(null);
        panelLogin.add(jtext_contrasenaId);
        jtext_contrasenaId.setBounds(0, 80, 370, 30);

        jlabel_unlock1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Bt_Lock.png"))); // NOI18N
        panelLogin.add(jlabel_unlock1);
        jlabel_unlock1.setBounds(390, 70, 17, 30);

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(241, 242, 242));
        jLabel3.setText("Log in");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelLogin.add(jLabel3);
        jLabel3.setBounds(290, 190, 60, 30);

        jButton_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Btn_SignIn.png"))); // NOI18N
        jButton_login.setToolTipText("");
        jButton_login.setBorder(null);
        jButton_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginActionPerformed(evt);
            }
        });
        panelLogin.add(jButton_login);
        jButton_login.setBounds(230, 180, 180, 50);

        jlabel_line4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Bt_Line.png"))); // NOI18N
        panelLogin.add(jlabel_line4);
        jlabel_line4.setBounds(0, 40, 410, 30);

        jlabel_line7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Bt_Line.png"))); // NOI18N
        panelLogin.add(jlabel_line7);
        jlabel_line7.setBounds(0, 100, 410, 30);

        jlabel_personp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Bt_PersonPlus.png"))); // NOI18N
        panelLogin.add(jlabel_personp);
        jlabel_personp.setBounds(390, 10, 20, 30);

        jlabel_fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Box.jpg"))); // NOI18N
        jlabel_fondo2.setText("jLabel3");
        panelLogin.add(jlabel_fondo2);
        jlabel_fondo2.setBounds(-20, 0, 460, 320);

        panelGeneral.add(panelLogin);
        panelLogin.setBounds(60, 170, 440, 240);

        panelSignin.setLayout(null);

        jtext_usuario.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jtext_usuario.setForeground(new java.awt.Color(147, 149, 152));
        jtext_usuario.setText("Usuario");
        jtext_usuario.setBorder(null);
        jtext_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtext_usuarioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jtext_usuarioMouseExited(evt);
            }
        });
        panelSignin.add(jtext_usuario);
        jtext_usuario.setBounds(0, 20, 370, 30);

        jtext_confirmar.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jtext_confirmar.setForeground(new java.awt.Color(147, 149, 152));
        jtext_confirmar.setText("Confirmar contrasena");
        jtext_confirmar.setBorder(null);
        panelSignin.add(jtext_confirmar);
        jtext_confirmar.setBounds(0, 140, 370, 30);

        jtext_contrasenaAdmin.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jtext_contrasenaAdmin.setForeground(new java.awt.Color(147, 149, 152));
        jtext_contrasenaAdmin.setText("Contrasena administrador");
        jtext_contrasenaAdmin.setBorder(null);
        jtext_contrasenaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtext_contrasenaAdminActionPerformed(evt);
            }
        });
        panelSignin.add(jtext_contrasenaAdmin);
        jtext_contrasenaAdmin.setBounds(0, 200, 370, 30);

        jtext_contrasena.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jtext_contrasena.setForeground(new java.awt.Color(147, 149, 152));
        jtext_contrasena.setText("Contrasena");
        jtext_contrasena.setBorder(null);
        panelSignin.add(jtext_contrasena);
        jtext_contrasena.setBounds(0, 80, 370, 30);

        jlabel_unlock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Bt_Unlock.png"))); // NOI18N
        panelSignin.add(jlabel_unlock);
        jlabel_unlock.setBounds(390, 70, 24, 30);

        jlabel_lock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Bt_Lock.png"))); // NOI18N
        panelSignin.add(jlabel_lock);
        jlabel_lock.setBounds(390, 130, 20, 30);

        jlabel_key.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Bt_Key.png"))); // NOI18N
        panelSignin.add(jlabel_key);
        jlabel_key.setBounds(380, 200, 24, 30);

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(241, 242, 242));
        jLabel2.setText("Sign in");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSignin.add(jLabel2);
        jLabel2.setBounds(290, 270, 60, 30);

        jButton_signIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Btn_SignIn.png"))); // NOI18N
        jButton_signIn.setToolTipText("");
        jButton_signIn.setBorder(null);
        jButton_signIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_signInActionPerformed(evt);
            }
        });
        panelSignin.add(jButton_signIn);
        jButton_signIn.setBounds(230, 260, 180, 50);

        jlabel_line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Bt_Line.png"))); // NOI18N
        panelSignin.add(jlabel_line);
        jlabel_line.setBounds(0, 40, 410, 30);

        jlabel_line1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Bt_Line.png"))); // NOI18N
        panelSignin.add(jlabel_line1);
        jlabel_line1.setBounds(0, 220, 410, 30);

        jlabel_line2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Bt_Line.png"))); // NOI18N
        panelSignin.add(jlabel_line2);
        jlabel_line2.setBounds(0, 160, 410, 30);

        jlabel_line3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Bt_Line.png"))); // NOI18N
        panelSignin.add(jlabel_line3);
        jlabel_line3.setBounds(0, 100, 410, 30);

        jlabel_personplus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Bt_PersonPlus.png"))); // NOI18N
        panelSignin.add(jlabel_personplus);
        jlabel_personplus.setBounds(390, 10, 20, 30);

        jRadioButton_admin.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton_admin.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jRadioButton_admin.setForeground(new java.awt.Color(147, 149, 152));
        jRadioButton_admin.setText("Administrador");
        jRadioButton_admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSignin.add(jRadioButton_admin);
        jRadioButton_admin.setBounds(0, 270, 100, 23);

        jRadioButton_vendedor.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton_vendedor.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jRadioButton_vendedor.setForeground(new java.awt.Color(147, 149, 152));
        jRadioButton_vendedor.setText("Vendedor");
        jRadioButton_vendedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSignin.add(jRadioButton_vendedor);
        jRadioButton_vendedor.setBounds(100, 270, 80, 23);

        jlabel_fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Box.jpg"))); // NOI18N
        jlabel_fondo1.setText("jLabel3");
        panelSignin.add(jlabel_fondo1);
        jlabel_fondo1.setBounds(-20, 0, 460, 320);

        panelGeneral.add(panelSignin);
        panelSignin.setBounds(60, 170, 440, 320);

        jLabel_dragger.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel_draggerMouseDragged(evt);
            }
        });
        jLabel_dragger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_draggerMousePressed(evt);
            }
        });
        panelGeneral.add(jLabel_dragger);
        jLabel_dragger.setBounds(0, 0, 510, 30);

        jLabel_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Bt_Cerrar.png"))); // NOI18N
        jLabel_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseExited(evt);
            }
        });
        panelGeneral.add(jLabel_close);
        jLabel_close.setBounds(520, 0, 20, 30);

        jLabel_signIn.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        jLabel_signIn.setForeground(new java.awt.Color(0, 123, 164));
        jLabel_signIn.setText("SIGN IN");
        panelGeneral.add(jLabel_signIn);
        jLabel_signIn.setBounds(60, 100, 110, 40);

        jlabel_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Box.jpg"))); // NOI18N
        jlabel_fondo.setText("jLabel3");
        panelGeneral.add(jlabel_fondo);
        jlabel_fondo.setBounds(0, 0, 540, 500);

        getContentPane().add(panelGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 35, 540, 495));

        jPanel4.setLayout(null);

        panelChangeSignin.setBackground(new java.awt.Color(0, 169, 207));
        panelChangeSignin.setOpaque(false);
        panelChangeSignin.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(241, 242, 242));
        jLabel7.setText("experencias.");
        panelChangeSignin.add(jLabel7);
        jLabel7.setBounds(20, 100, 320, 40);

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(241, 242, 242));
        jLabel8.setText("En Marina Punta del Este Proveemos las mejores ");
        panelChangeSignin.add(jLabel8);
        jLabel8.setBounds(20, 80, 320, 40);

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(241, 242, 242));
        jLabel9.setText("¿Tienes ya una cuenta?");
        panelChangeSignin.add(jLabel9);
        jLabel9.setBounds(20, 50, 210, 40);

        jLabel_changeSingin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Bt_LogIn_02.png"))); // NOI18N
        jLabel_changeSingin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_changeSingin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_changeSinginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_changeSinginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_changeSinginMouseExited(evt);
            }
        });
        panelChangeSignin.add(jLabel_changeSingin);
        jLabel_changeSingin.setBounds(20, 130, 190, 60);

        jPanel4.add(panelChangeSignin);
        panelChangeSignin.setBounds(40, 100, 330, 190);

        panelChangeLogin.setBackground(new java.awt.Color(0, 169, 207));
        panelChangeLogin.setOpaque(false);
        panelChangeLogin.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(241, 242, 242));
        jLabel6.setText("experencias.");
        panelChangeLogin.add(jLabel6);
        jLabel6.setBounds(20, 100, 320, 40);

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(241, 242, 242));
        jLabel4.setText("En Marina Punta del Este Proveemos las mejores ");
        panelChangeLogin.add(jLabel4);
        jLabel4.setBounds(20, 80, 320, 40);

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(241, 242, 242));
        jLabel5.setText("¿Tienes ya una cuenta?");
        panelChangeLogin.add(jLabel5);
        jLabel5.setBounds(20, 50, 210, 40);

        jLabel_changeLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Bt_LogIn_02.png"))); // NOI18N
        jLabel_changeLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_changeLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_changeLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_changeLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_changeLoginMouseExited(evt);
            }
        });
        panelChangeLogin.add(jLabel_changeLogin);
        jLabel_changeLogin.setBounds(20, 130, 190, 60);

        jPanel4.add(panelChangeLogin);
        panelChangeLogin.setBounds(620, 100, 330, 190);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Background.png"))); // NOI18N
        background.setText("jLabel4");
        jPanel4.add(background);
        background.setBounds(0, 0, 1001, 420);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 64, 1000, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_signInActionPerformed
     
    }//GEN-LAST:event_jButton_signInActionPerformed

    private void jLabel_draggerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_draggerMouseDragged
        // TODO add your handling code here: 
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jLabel_draggerMouseDragged

    private void jLabel_draggerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_draggerMousePressed
        // TODO add your handling code here: 
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabel_draggerMousePressed

    private void jtext_contrasenaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtext_contrasenaAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtext_contrasenaAdminActionPerformed

    private void jtext_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtext_usuarioMouseClicked
        // TODO add your handling code here: 
        jtext_usuario.setText(""); 
        
    }//GEN-LAST:event_jtext_usuarioMouseClicked

    private void jtext_usuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtext_usuarioMouseExited
        // TODO add your handling code here: 
        
    }//GEN-LAST:event_jtext_usuarioMouseExited

    private void jLabel_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseEntered
        // TODO add your handling code here: 
        ImageIcon img = new ImageIcon(getClass().getResource("/img/SI_Bt_Cerrar_Selec.png")); 
        jLabel_close.setIcon(img);
    }//GEN-LAST:event_jLabel_closeMouseEntered

    private void jLabel_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseExited
        // TODO add your handling code here:
        ImageIcon img = new ImageIcon(getClass().getResource("/img/SI_Bt_Cerrar.png")); 
        jLabel_close.setIcon(img);
    }//GEN-LAST:event_jLabel_closeMouseExited

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        // TODO add your handling code here: 
        System.exit(0);
    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void jLabel_changeLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_changeLoginMouseClicked
        // TODO add your handling code here: 
        
        Animacion.Animacion.mover_derecha(101, 450, 25, 35, panelGeneral); 
        panelChangeLogin.setVisible(false);
        panelChangeSignin.setVisible(true);
        panelSignin.setVisible(false); 
        panelLogin.setVisible(true);
        jLabel_signIn.setText("LOG IN");  
        
    }//GEN-LAST:event_jLabel_changeLoginMouseClicked

    private void jLabel_changeLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_changeLoginMouseEntered
        // TODO add your handling code here: 
    }//GEN-LAST:event_jLabel_changeLoginMouseEntered

    private void jLabel_changeLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_changeLoginMouseExited
        // TODO add your handling code here: 
    }//GEN-LAST:event_jLabel_changeLoginMouseExited

    private void jtext_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtext_idMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtext_idMouseClicked

    private void jtext_idMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtext_idMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jtext_idMouseExited

    private void jButton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_loginActionPerformed

    private void jLabel_changeSinginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_changeSinginMouseClicked
        // TODO add your handling code here: 
        
        Animacion.Animacion.mover_izquierda(450, 50 , 25, 35, panelGeneral); 
        panelChangeLogin.setVisible(true); 
        panelChangeSignin.setVisible(false);
        panelSignin.setVisible(true); 
        panelLogin.setVisible(false);
        jLabel_signIn.setText("SIGN IN"); 
        
    }//GEN-LAST:event_jLabel_changeSinginMouseClicked

    private void jLabel_changeSinginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_changeSinginMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_changeSinginMouseEntered

    private void jLabel_changeSinginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_changeSinginMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_changeSinginMouseExited

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold> 
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        }); 
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton_login;
    private javax.swing.JButton jButton_signIn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_changeLogin;
    private javax.swing.JLabel jLabel_changeSingin;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_dragger;
    private javax.swing.JLabel jLabel_signIn;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton_admin;
    private javax.swing.JRadioButton jRadioButton_vendedor;
    private javax.swing.JLabel jlabel_fondo;
    private javax.swing.JLabel jlabel_fondo1;
    private javax.swing.JLabel jlabel_fondo2;
    private javax.swing.JLabel jlabel_key;
    private javax.swing.JLabel jlabel_line;
    private javax.swing.JLabel jlabel_line1;
    private javax.swing.JLabel jlabel_line2;
    private javax.swing.JLabel jlabel_line3;
    private javax.swing.JLabel jlabel_line4;
    private javax.swing.JLabel jlabel_line7;
    private javax.swing.JLabel jlabel_lock;
    private javax.swing.JLabel jlabel_personp;
    private javax.swing.JLabel jlabel_personplus;
    private javax.swing.JLabel jlabel_unlock;
    private javax.swing.JLabel jlabel_unlock1;
    private javax.swing.JTextField jtext_confirmar;
    private javax.swing.JTextField jtext_contrasena;
    private javax.swing.JTextField jtext_contrasenaAdmin;
    private javax.swing.JTextField jtext_contrasenaId;
    private javax.swing.JTextField jtext_id;
    private javax.swing.JTextField jtext_usuario;
    private javax.swing.JPanel panelChangeLogin;
    private javax.swing.JPanel panelChangeSignin;
    private javax.swing.JPanel panelGeneral;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelSignin;
    // End of variables declaration//GEN-END:variables
}
