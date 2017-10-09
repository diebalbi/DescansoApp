package descansoApp.interfaz;
;
import descansoApp.dominio.Ciudad;
import javax.swing.*;
import descansoApp.dominio.Sistema;
import java.awt.Cursor;

public class PnlNuevaCiudad extends javax.swing.JPanel {
    private Sistema modelo;
    private JFrame padre;

    public PnlNuevaCiudad(Sistema unModelo, JFrame unPadre) {
        initComponents();
        modelo = unModelo;
        padre = unPadre;
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        buttonGroup1.add(jRadioButton3);
        jRadioButton1.setOpaque(false);
        jRadioButton2.setOpaque(false);
        jRadioButton3.setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblVolver = new javax.swing.JLabel();
        lblHome = new javax.swing.JLabel();
        lblNombreCiudad = new javax.swing.JLabel();
        lblGuardar = new javax.swing.JLabel();
        txtNombreCiudad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtInformacionGeneral = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtNombreActividad = new javax.swing.JTextField();
        txtHorario = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtUbicacion = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtWeb = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDetalles = new javax.swing.JTextArea();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        lblAgregarActividad = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();

        setPreferredSize(new java.awt.Dimension(840, 500));
        setLayout(null);

        lblVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnVolver.png"))); // NOI18N
        lblVolver.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblVolverMouseMoved(evt);
            }
        });
        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolverMouseClicked(evt);
            }
        });
        add(lblVolver);
        lblVolver.setBounds(30, 20, 30, 30);

        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnHome.png"))); // NOI18N
        lblHome.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblHomeMouseMoved(evt);
            }
        });
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeMouseClicked(evt);
            }
        });
        add(lblHome);
        lblHome.setBounds(65, 20, 30, 30);

        lblNombreCiudad.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
        lblNombreCiudad.setForeground(new java.awt.Color(51, 51, 51));
        lblNombreCiudad.setText("Nueva Ciudad");
        add(lblNombreCiudad);
        lblNombreCiudad.setBounds(100, 20, 300, 30);

        lblGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnGuardar.png"))); // NOI18N
        lblGuardar.setText("jLabel3");
        lblGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblGuardarMouseExited(evt);
            }
        });
        add(lblGuardar);
        lblGuardar.setBounds(680, 445, 130, 30);

        txtNombreCiudad.setBackground(new java.awt.Color(51, 51, 51));
        txtNombreCiudad.setForeground(new java.awt.Color(204, 204, 204));
        txtNombreCiudad.setBorder(null);
        txtNombreCiudad.setCaretColor(new java.awt.Color(204, 204, 204));
        txtNombreCiudad.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        add(txtNombreCiudad);
        txtNombreCiudad.setBounds(130, 90, 220, 15);

        jScrollPane1.setBorder(null);

        txtDescripcion.setBackground(new java.awt.Color(51, 51, 51));
        txtDescripcion.setColumns(20);
        txtDescripcion.setForeground(new java.awt.Color(204, 204, 204));
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        txtDescripcion.setWrapStyleWord(true);
        txtDescripcion.setBorder(null);
        txtDescripcion.setCaretColor(new java.awt.Color(204, 204, 204));
        txtDescripcion.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtDescripcion.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(txtDescripcion);

        add(jScrollPane1);
        jScrollPane1.setBounds(130, 120, 220, 80);

        jScrollPane2.setBorder(null);

        txtInformacionGeneral.setBackground(new java.awt.Color(51, 51, 51));
        txtInformacionGeneral.setColumns(20);
        txtInformacionGeneral.setForeground(new java.awt.Color(204, 204, 204));
        txtInformacionGeneral.setLineWrap(true);
        txtInformacionGeneral.setRows(5);
        txtInformacionGeneral.setWrapStyleWord(true);
        txtInformacionGeneral.setBorder(null);
        txtInformacionGeneral.setCaretColor(new java.awt.Color(204, 204, 204));
        txtInformacionGeneral.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtInformacionGeneral.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        jScrollPane2.setViewportView(txtInformacionGeneral);

        add(jScrollPane2);
        jScrollPane2.setBounds(500, 90, 310, 110);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre :");
        add(jLabel4);
        jLabel4.setBounds(40, 90, 150, 15);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Descripción :");
        add(jLabel5);
        jLabel5.setBounds(40, 120, 150, 15);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Información General :");
        add(jLabel6);
        jLabel6.setBounds(370, 90, 130, 15);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombre :");
        add(jLabel7);
        jLabel7.setBounds(40, 250, 60, 16);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Horario :");
        add(jLabel8);
        jLabel8.setBounds(40, 280, 60, 16);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Precio :");
        add(jLabel9);
        jLabel9.setBounds(40, 310, 50, 16);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Ubicación :");
        add(jLabel10);
        jLabel10.setBounds(40, 340, 80, 16);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Teléfono :");
        add(jLabel11);
        jLabel11.setBounds(370, 250, 60, 16);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Detalle :");
        add(jLabel12);
        jLabel12.setBounds(370, 310, 45, 16);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Categoria :");
        jLabel13.setToolTipText("");
        add(jLabel13);
        jLabel13.setBounds(40, 370, 70, 16);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Tipo :");
        add(jLabel14);
        jLabel14.setBounds(370, 280, 30, 15);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Actividad de la Ciudad");
        add(jLabel15);
        jLabel15.setBounds(30, 220, 280, 22);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Web :");
        add(jLabel16);
        jLabel16.setBounds(40, 400, 48, 16);

        txtNombreActividad.setBackground(new java.awt.Color(51, 51, 51));
        txtNombreActividad.setForeground(new java.awt.Color(204, 204, 204));
        txtNombreActividad.setBorder(null);
        txtNombreActividad.setCaretColor(new java.awt.Color(204, 204, 204));
        txtNombreActividad.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        add(txtNombreActividad);
        txtNombreActividad.setBounds(130, 250, 220, 15);

        txtHorario.setBackground(new java.awt.Color(51, 51, 51));
        txtHorario.setForeground(new java.awt.Color(204, 204, 204));
        txtHorario.setBorder(null);
        txtHorario.setCaretColor(new java.awt.Color(204, 204, 204));
        txtHorario.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        add(txtHorario);
        txtHorario.setBounds(130, 280, 220, 15);

        txtPrecio.setBackground(new java.awt.Color(51, 51, 51));
        txtPrecio.setForeground(new java.awt.Color(204, 204, 204));
        txtPrecio.setBorder(null);
        txtPrecio.setCaretColor(new java.awt.Color(204, 204, 204));
        txtPrecio.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        add(txtPrecio);
        txtPrecio.setBounds(130, 310, 220, 15);

        txtUbicacion.setBackground(new java.awt.Color(51, 51, 51));
        txtUbicacion.setForeground(new java.awt.Color(204, 204, 204));
        txtUbicacion.setBorder(null);
        txtUbicacion.setCaretColor(new java.awt.Color(204, 204, 204));
        txtUbicacion.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        add(txtUbicacion);
        txtUbicacion.setBounds(130, 340, 220, 15);

        txtCategoria.setBackground(new java.awt.Color(51, 51, 51));
        txtCategoria.setForeground(new java.awt.Color(204, 204, 204));
        txtCategoria.setBorder(null);
        txtCategoria.setCaretColor(new java.awt.Color(204, 204, 204));
        txtCategoria.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        add(txtCategoria);
        txtCategoria.setBounds(130, 370, 220, 15);

        txtWeb.setBackground(new java.awt.Color(51, 51, 51));
        txtWeb.setForeground(new java.awt.Color(204, 204, 204));
        txtWeb.setBorder(null);
        txtWeb.setCaretColor(new java.awt.Color(204, 204, 204));
        txtWeb.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        add(txtWeb);
        txtWeb.setBounds(130, 400, 220, 15);

        txtTelefono.setBackground(new java.awt.Color(51, 51, 51));
        txtTelefono.setForeground(new java.awt.Color(204, 204, 204));
        txtTelefono.setBorder(null);
        txtTelefono.setCaretColor(new java.awt.Color(204, 204, 204));
        txtTelefono.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        add(txtTelefono);
        txtTelefono.setBounds(500, 250, 220, 15);

        jScrollPane3.setBorder(null);

        txtDetalles.setBackground(new java.awt.Color(51, 51, 51));
        txtDetalles.setColumns(20);
        txtDetalles.setForeground(new java.awt.Color(204, 204, 204));
        txtDetalles.setLineWrap(true);
        txtDetalles.setRows(5);
        txtDetalles.setWrapStyleWord(true);
        txtDetalles.setBorder(null);
        txtDetalles.setCaretColor(new java.awt.Color(204, 204, 204));
        txtDetalles.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtDetalles.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        jScrollPane3.setViewportView(txtDetalles);

        add(jScrollPane3);
        jScrollPane3.setBounds(500, 310, 310, 130);

        jRadioButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton1.setText("Alojamiento");
        add(jRadioButton1);
        jRadioButton1.setBounds(500, 280, 100, 15);

        jRadioButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton2.setText("Actividad");
        add(jRadioButton2);
        jRadioButton2.setBounds(610, 280, 100, 15);

        jRadioButton3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton3.setText("Gastronomia");
        add(jRadioButton3);
        jRadioButton3.setBounds(710, 280, 110, 15);

        lblAgregarActividad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblAgregarActividad.setForeground(new java.awt.Color(0, 0, 102));
        lblAgregarActividad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnPlus.png"))); // NOI18N
        lblAgregarActividad.setText("Agregar Actividad a la ciudad Click Aqui");
        lblAgregarActividad.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblAgregarActividadMouseMoved(evt);
            }
        });
        lblAgregarActividad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarActividadMouseClicked(evt);
            }
        });
        add(lblAgregarActividad);
        lblAgregarActividad.setBounds(40, 450, 320, 18);

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/NuevaCiudad.png"))); // NOI18N
        lblImagen.setPreferredSize(new java.awt.Dimension(800, 450));
        lblImagen.setVerifyInputWhenFocusTarget(false);
        add(lblImagen);
        lblImagen.setBounds(0, 0, 840, 500);
        add(jTabbedPane1);
        jTabbedPane1.setBounds(150, -30, 2, 4);
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarCampos(){
        txtCategoria.setText("");
        txtNombreActividad.setText("");
        txtPrecio.setText("");
        txtWeb.setText("");
        txtUbicacion.setText("");
        txtDetalles.setText("");
        txtTelefono.setText("");
        txtHorario.setText("");
    }
    
    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblGuardarMouseClicked

    private void lblGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseEntered
        lblGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnGuardarONN.png")));
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        lblGuardar.setCursor(cursor);
    }//GEN-LAST:event_lblGuardarMouseEntered

    private void lblGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseExited
        lblGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnGuardar.png")));
    }//GEN-LAST:event_lblGuardarMouseExited

    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
        padre.remove(this);
        padre.add(new PnlInicio(modelo, padre));
        padre.pack();
    }//GEN-LAST:event_lblHomeMouseClicked

    private void lblHomeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseMoved
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        lblHome.setCursor(cursor);
    }//GEN-LAST:event_lblHomeMouseMoved

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        padre.remove(this);
        padre.add(new PnlInicio(modelo,padre));
        padre.pack();
    }//GEN-LAST:event_lblVolverMouseClicked

    private void lblVolverMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseMoved
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        lblVolver.setCursor(cursor);
    }//GEN-LAST:event_lblVolverMouseMoved

    private void lblAgregarActividadMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarActividadMouseMoved
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        lblAgregarActividad.setCursor(cursor);
    }//GEN-LAST:event_lblAgregarActividadMouseMoved

    private void lblAgregarActividadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarActividadMouseClicked
        JOptionPane.showMessageDialog(null, "Ya se esta por agregar la activida :D");
    }//GEN-LAST:event_lblAgregarActividadMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAgregarActividad;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNombreCiudad;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextArea txtDetalles;
    private javax.swing.JTextField txtHorario;
    private javax.swing.JTextArea txtInformacionGeneral;
    private javax.swing.JTextField txtNombreActividad;
    private javax.swing.JTextField txtNombreCiudad;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUbicacion;
    private javax.swing.JTextField txtWeb;
    // End of variables declaration//GEN-END:variables
}
