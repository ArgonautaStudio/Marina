/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import javax.swing.ImageIcon;

/**
 *
 * @author aleja
 */
public class Ventas extends javax.swing.JFrame {
    int x, y;
    /**
     * Creates new form Ventas
     */
    public Ventas() {
        initComponents(); 
        panel_bookOpciones.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_drag = new javax.swing.JPanel();
        btn_cerrar = new javax.swing.JButton();
        Drager = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        panel_pasos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fondo_pasos = new javax.swing.JLabel();
        panel_opciones = new javax.swing.JPanel();
        btn_terminos = new javax.swing.JButton();
        btn_cancelaciones = new javax.swing.JButton();
        btn_book = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        guy = new javax.swing.JLabel();
        icon_guy = new javax.swing.JLabel();
        box = new javax.swing.JLabel();
        panel_bookOpciones = new javax.swing.JPanel();
        input_infante = new javax.swing.JTextField();
        input_nino = new javax.swing.JTextField();
        input_adulto = new javax.swing.JTextField();
        btn_seguirComprando = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_siguiente = new javax.swing.JButton();
        btn_mx = new javax.swing.JButton();
        btn_usd = new javax.swing.JButton();
        btn_codigoPromocion = new javax.swing.JLabel();
        moneda = new javax.swing.JLabel();
        precioFinal = new javax.swing.JLabel();
        label_infanteTotal = new javax.swing.JLabel();
        label_ninoTotal = new javax.swing.JLabel();
        label_adultoTotal = new javax.swing.JLabel();
        fondito6 = new javax.swing.JLabel();
        fondito5 = new javax.swing.JLabel();
        fondito4 = new javax.swing.JLabel();
        fondito3 = new javax.swing.JLabel();
        fondito2 = new javax.swing.JLabel();
        fondito1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        panel_calendario = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1600, 850));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1600, 820));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_drag.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Btn_Cerrar_1_Normal.png"))); // NOI18N
        btn_cerrar.setContentAreaFilled(false);
        btn_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });
        panel_drag.add(btn_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 0, 50, 40));

        Drager.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Drager.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                DragerMouseDragged(evt);
            }
        });
        Drager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DragerMousePressed(evt);
            }
        });
        panel_drag.add(Drager, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1490, 40));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TB_Bar.jpg"))); // NOI18N
        BG.setPreferredSize(new java.awt.Dimension(1600, 42));
        panel_drag.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        getContentPane().add(panel_drag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 40));

        panel_pasos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BC_Icn_Divider.png"))); // NOI18N
        panel_pasos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 10, 20, -1));

        fondo_pasos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BC_Main_TopBar.png"))); // NOI18N
        fondo_pasos.setMaximumSize(new java.awt.Dimension(1300, 80));
        fondo_pasos.setMinimumSize(new java.awt.Dimension(1300, 80));
        fondo_pasos.setPreferredSize(new java.awt.Dimension(1300, 80));
        panel_pasos.add(fondo_pasos, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1320, 90));

        getContentPane().add(panel_pasos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 1300, 80));

        panel_opciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_terminos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Btn_TC_Static.png"))); // NOI18N
        btn_terminos.setBorderPainted(false);
        btn_terminos.setContentAreaFilled(false);
        btn_terminos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_terminos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_terminosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_terminosMouseExited(evt);
            }
        });
        btn_terminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_terminosActionPerformed(evt);
            }
        });
        panel_opciones.add(btn_terminos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 300, -1));

        btn_cancelaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Btn_Cancel_Static.png"))); // NOI18N
        btn_cancelaciones.setBorderPainted(false);
        btn_cancelaciones.setContentAreaFilled(false);
        btn_cancelaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cancelacionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cancelacionesMouseExited(evt);
            }
        });
        btn_cancelaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelacionesActionPerformed(evt);
            }
        });
        panel_opciones.add(btn_cancelaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 300, -1));

        btn_book.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Btn_Book_Static.png"))); // NOI18N
        btn_book.setBorderPainted(false);
        btn_book.setContentAreaFilled(false);
        btn_book.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_bookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_bookMouseExited(evt);
            }
        });
        btn_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bookActionPerformed(evt);
            }
        });
        panel_opciones.add(btn_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 300, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre de Usuario");
        panel_opciones.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        guy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BC_Icn_Contact_02.png"))); // NOI18N
        panel_opciones.add(guy, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 12, 70, 60));

        icon_guy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BC_Icn_ContactBubble.png"))); // NOI18N
        panel_opciones.add(icon_guy, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        box.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BC_Box_Left_Extended.png"))); // NOI18N
        box.setMaximumSize(new java.awt.Dimension(300, 830));
        box.setMinimumSize(new java.awt.Dimension(300, 830));
        box.setPreferredSize(new java.awt.Dimension(300, 830));
        panel_opciones.add(box, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 300, 870));

        getContentPane().add(panel_opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 300, 830));

        panel_bookOpciones.setBackground(new java.awt.Color(255, 255, 255));
        panel_bookOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        input_infante.setBackground(new java.awt.Color(240, 240, 240));
        input_infante.setFont(new java.awt.Font("Roboto", 0, 55)); // NOI18N
        input_infante.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_infante.setText("0");
        input_infante.setAutoscrolls(false);
        input_infante.setBorder(null);
        input_infante.setOpaque(false);
        panel_bookOpciones.add(input_infante, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 330, 60, 60));

        input_nino.setBackground(new java.awt.Color(240, 240, 240));
        input_nino.setFont(new java.awt.Font("Roboto", 0, 55)); // NOI18N
        input_nino.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_nino.setText("0");
        input_nino.setAutoscrolls(false);
        input_nino.setBorder(null);
        input_nino.setOpaque(false);
        panel_bookOpciones.add(input_nino, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 230, 60, 60));

        input_adulto.setBackground(new java.awt.Color(240, 240, 240));
        input_adulto.setFont(new java.awt.Font("Roboto", 0, 55)); // NOI18N
        input_adulto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_adulto.setText("0");
        input_adulto.setAutoscrolls(false);
        input_adulto.setBorder(null);
        input_adulto.setOpaque(false);
        panel_bookOpciones.add(input_adulto, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 130, 60, 60));

        btn_seguirComprando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Comprar.jpg"))); // NOI18N
        btn_seguirComprando.setBorderPainted(false);
        btn_seguirComprando.setContentAreaFilled(false);
        btn_seguirComprando.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_bookOpciones.add(btn_seguirComprando, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, 160, 50));

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Cancelar.jpg"))); // NOI18N
        btn_cancelar.setBorderPainted(false);
        btn_cancelar.setContentAreaFilled(false);
        btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_bookOpciones.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 670, 100, 50));

        btn_siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Siguiente.jpg"))); // NOI18N
        btn_siguiente.setBorderPainted(false);
        btn_siguiente.setContentAreaFilled(false);
        btn_siguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_bookOpciones.add(btn_siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 670, 100, 50));

        btn_mx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ag_btn_mx_select.png"))); // NOI18N
        btn_mx.setBorderPainted(false);
        btn_mx.setContentAreaFilled(false);
        btn_mx.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_bookOpciones.add(btn_mx, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 70, 40, 30));

        btn_usd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ag_btn_usd.png"))); // NOI18N
        btn_usd.setBorderPainted(false);
        btn_usd.setContentAreaFilled(false);
        btn_usd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_bookOpciones.add(btn_usd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 80, 50, 20));

        btn_codigoPromocion.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_codigoPromocion.setForeground(new java.awt.Color(51, 153, 255));
        btn_codigoPromocion.setText("Codigo de promocion");
        btn_codigoPromocion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_bookOpciones.add(btn_codigoPromocion, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 590, -1, -1));

        moneda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ag_btn_mx.png"))); // NOI18N
        moneda.setToolTipText("");
        panel_bookOpciones.add(moneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 560, -1, -1));

        precioFinal.setFont(new java.awt.Font("Roboto", 0, 62)); // NOI18N
        precioFinal.setText("$000.00");
        panel_bookOpciones.add(precioFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 520, -1, -1));

        label_infanteTotal.setFont(new java.awt.Font("Roboto", 0, 26)); // NOI18N
        label_infanteTotal.setForeground(new java.awt.Color(255, 255, 255));
        label_infanteTotal.setText("$0000");
        panel_bookOpciones.add(label_infanteTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 350, 80, -1));

        label_ninoTotal.setFont(new java.awt.Font("Roboto", 0, 26)); // NOI18N
        label_ninoTotal.setForeground(new java.awt.Color(255, 255, 255));
        label_ninoTotal.setText("$0000");
        panel_bookOpciones.add(label_ninoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 250, 80, -1));

        label_adultoTotal.setFont(new java.awt.Font("Roboto", 0, 26)); // NOI18N
        label_adultoTotal.setForeground(new java.awt.Color(255, 255, 255));
        label_adultoTotal.setText("$0000");
        panel_bookOpciones.add(label_adultoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 150, 80, -1));

        fondito6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ag_Btn_Price.jpg"))); // NOI18N
        panel_bookOpciones.add(fondito6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 320, -1, -1));

        fondito5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ag_Btn_Price.jpg"))); // NOI18N
        panel_bookOpciones.add(fondito5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 220, -1, -1));

        fondito4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ag_Btn_Price.jpg"))); // NOI18N
        panel_bookOpciones.add(fondito4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 120, -1, -1));

        fondito3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ag_Btn_Description.jpg"))); // NOI18N
        panel_bookOpciones.add(fondito3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 320, -1, -1));

        fondito2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ag_Btn_Description.jpg"))); // NOI18N
        panel_bookOpciones.add(fondito2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 220, -1, -1));

        fondito1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ag_Btn_Description.jpg"))); // NOI18N
        fondito1.setOpaque(true);
        panel_bookOpciones.add(fondito1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 120, -1, -1));

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel18.setText("Infante");
        panel_bookOpciones.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 320, -1, -1));

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel17.setText("Nino");
        panel_bookOpciones.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 220, -1, -1));

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel16.setText("Adulto");
        panel_bookOpciones.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, -1, -1));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel15.setText("x");
        panel_bookOpciones.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 360, 20, 20));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel14.setText("x");
        panel_bookOpciones.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 260, 20, 20));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel13.setText("x");
        panel_bookOpciones.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 150, 20, 20));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 123, 164));
        jLabel12.setText("Total");
        panel_bookOpciones.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 470, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 123, 164));
        jLabel11.setText("Hora");
        panel_bookOpciones.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 123, 164));
        jLabel10.setText("Precio");
        panel_bookOpciones.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 123, 164));
        jLabel9.setText("Dia");
        panel_bookOpciones.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ag_Box_Day.jpg"))); // NOI18N
        panel_bookOpciones.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 700, 470));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ag_Box_Hour.jpg"))); // NOI18N
        panel_bookOpciones.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, -1, -1));

        getContentPane().add(panel_bookOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 1300, 760));

        panel_calendario.setBackground(new java.awt.Color(255, 255, 255));
        panel_calendario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panel_calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 1300, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_bookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bookMouseEntered
        if (!this.panel_bookOpciones.isVisible()){
        ImageIcon img = new ImageIcon(getClass().getResource("/img/Btn_Book_Hover.png"));
        btn_book.setIcon(img);
        }
    }//GEN-LAST:event_btn_bookMouseEntered

    private void btn_bookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bookMouseExited
        if (!this.panel_bookOpciones.isVisible()){
        ImageIcon img = new ImageIcon(getClass().getResource("/img/Btn_Book_Static.png"));
        btn_book.setIcon(img);
        }
    }//GEN-LAST:event_btn_bookMouseExited

    private void btn_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookActionPerformed
        ImageIcon img = new ImageIcon(getClass().getResource("/img/Btn_Book_Active.png"));
        btn_book.setIcon(img); 
        panel_bookOpciones.setVisible(true);
    }//GEN-LAST:event_btn_bookActionPerformed

    private void btn_cancelacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelacionesActionPerformed
        ImageIcon img = new ImageIcon(getClass().getResource("/img/Btn_Cancel_Active.png"));
        btn_cancelaciones.setIcon(img);
    }//GEN-LAST:event_btn_cancelacionesActionPerformed

    private void btn_cancelacionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelacionesMouseEntered
        ImageIcon img = new ImageIcon(getClass().getResource("/img/Btn_Cancel_Hover.png"));
        btn_cancelaciones.setIcon(img);
    }//GEN-LAST:event_btn_cancelacionesMouseEntered

    private void btn_terminosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_terminosMouseExited
        ImageIcon img = new ImageIcon(getClass().getResource("/img/Btn_TC_Static.png"));
        btn_terminos.setIcon(img);
    }//GEN-LAST:event_btn_terminosMouseExited

    private void btn_terminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_terminosActionPerformed
        ImageIcon img = new ImageIcon(getClass().getResource("/img/Btn_TC_Active.png"));
        btn_terminos.setIcon(img);
    }//GEN-LAST:event_btn_terminosActionPerformed

    private void btn_terminosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_terminosMouseEntered
        ImageIcon img = new ImageIcon(getClass().getResource("/img/Btn_TC_Hover.png"));
        btn_terminos.setIcon(img);
    }//GEN-LAST:event_btn_terminosMouseEntered

    private void btn_cancelacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelacionesMouseExited
        // TODO add your handling code here: 
        ImageIcon img = new ImageIcon(getClass().getResource("/img/Btn_Cancel_Static.png"));
        btn_cancelaciones.setIcon(img);
    }//GEN-LAST:event_btn_cancelacionesMouseExited

    private void DragerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DragerMouseDragged
        // TODO add your handling code here:
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_DragerMouseDragged

    private void DragerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DragerMousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_DragerMousePressed

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
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel Drager;
    private javax.swing.JLabel box;
    private javax.swing.JButton btn_book;
    private javax.swing.JButton btn_cancelaciones;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JLabel btn_codigoPromocion;
    private javax.swing.JButton btn_mx;
    private javax.swing.JButton btn_seguirComprando;
    private javax.swing.JButton btn_siguiente;
    private javax.swing.JButton btn_terminos;
    private javax.swing.JButton btn_usd;
    private javax.swing.JLabel fondito1;
    private javax.swing.JLabel fondito2;
    private javax.swing.JLabel fondito3;
    private javax.swing.JLabel fondito4;
    private javax.swing.JLabel fondito5;
    private javax.swing.JLabel fondito6;
    private javax.swing.JLabel fondo_pasos;
    private javax.swing.JLabel guy;
    private javax.swing.JLabel icon_guy;
    private javax.swing.JTextField input_adulto;
    private javax.swing.JTextField input_infante;
    private javax.swing.JTextField input_nino;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel label_adultoTotal;
    private javax.swing.JLabel label_infanteTotal;
    private javax.swing.JLabel label_ninoTotal;
    private javax.swing.JLabel moneda;
    private javax.swing.JPanel panel_bookOpciones;
    private javax.swing.JPanel panel_calendario;
    private javax.swing.JPanel panel_drag;
    private javax.swing.JPanel panel_opciones;
    private javax.swing.JPanel panel_pasos;
    private javax.swing.JLabel precioFinal;
    // End of variables declaration//GEN-END:variables
}
