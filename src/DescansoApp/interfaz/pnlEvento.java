package descansoApp.interfaz;

import com.toedter.calendar.JTextFieldDateEditor;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import descansoApp.dominio.*;
import descansoApp.herramientas.Utilidades;
import java.awt.Cursor;

public class pnlEvento extends javax.swing.JPanel {

    private Viaje viaje;
    private Evento modEvento;
    private Ciudad ciudad;
    private JFrame miVentana;
    private Sistema modelo;

    public pnlEvento(Sistema unModelo, Viaje unViaje, descansoApp.dominio.Ciudad unaCiudad, Evento unEvento, JFrame unContenedor, boolean esNuevo) {
        initComponents();
        modelo = unModelo;
        viaje = unViaje;
        modEvento = unEvento;
        ciudad = unaCiudad;
        miVentana = unContenedor;
        restringirCampos();
        cargarEvento();
                
        if (esNuevo) {
            lblEliminar1.setVisible(false);
        } else {
            lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/ModificarEvento.png")));
        }
    }
    
    private void restringirCampos(){
        Utilidades.soloNumeros(txtHoraFHoras);
        Utilidades.soloNumeros(txtHoraFMinutos);
        Utilidades.soloNumeros(txtHoraIHoras);
        Utilidades.soloNumeros(txtHoraIMinutos);
        Utilidades.limitarNumeros(txtHoraFHoras, 2);
        Utilidades.limitarNumeros(txtHoraFMinutos, 2);
        Utilidades.limitarNumeros(txtHoraIHoras, 2);
        Utilidades.limitarNumeros(txtHoraIMinutos, 2);
        JTextFieldDateEditor editor = (JTextFieldDateEditor) dChosserFechaF.getDateEditor();
        editor.setEditable(false);
        JTextFieldDateEditor editor2 = (JTextFieldDateEditor) dChosserFechaI.getDateEditor();
        editor2.setEditable(false);
    }
    
    private void cargarEvento() {
            txtNombre.setText(modEvento.getNombre());
            txtDescripcion.setText(modEvento.getDescripcion());
            txtHoraIHoras.setText("" + modEvento.getFechaHoraI().get(Calendar.HOUR_OF_DAY));
            txtHoraIMinutos.setText("" + modEvento.getFechaHoraI().get(Calendar.MINUTE));
            txtHoraFHoras.setText("" + modEvento.getFechaHoraF().get(Calendar.HOUR_OF_DAY));
            txtHoraFMinutos.setText("" + modEvento.getFechaHoraF().get(Calendar.MINUTE));
            txtUbicacion.setText(modEvento.getUbicacion());
            dChosserFechaI.setCalendar(modEvento.getFechaHoraI());
            dChosserFechaF.setCalendar(modEvento.getFechaHoraF());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtNombre = new javax.swing.JTextField();
        dChosserFechaI = new com.toedter.calendar.JDateChooser();
        dChosserFechaF = new com.toedter.calendar.JDateChooser();
        txtHoraIMinutos = new javax.swing.JFormattedTextField();
        txtUbicacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHoraFHoras = new javax.swing.JFormattedTextField();
        txtHoraIHoras = new javax.swing.JFormattedTextField();
        txtHoraFMinutos = new javax.swing.JFormattedTextField();
        lblGuardar = new javax.swing.JLabel();
        lblEliminar1 = new javax.swing.JLabel();
        lblVolver = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(490, 285));
        setMinimumSize(new java.awt.Dimension(490, 285));
        setPreferredSize(new java.awt.Dimension(490, 285));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 200, 150));

        txtNombre.setBackground(new java.awt.Color(51, 51, 51));
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setBorder(null);
        txtNombre.setCaretColor(new java.awt.Color(204, 204, 204));
        txtNombre.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 130, 18));

        dChosserFechaI.setBackground(new java.awt.Color(51, 51, 51));
        dChosserFechaI.setForeground(new java.awt.Color(102, 102, 102));
        add(dChosserFechaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 130, -1));

        dChosserFechaF.setBackground(new java.awt.Color(51, 51, 51));
        add(dChosserFechaF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 130, -1));

        txtHoraIMinutos.setBackground(new java.awt.Color(51, 51, 51));
        txtHoraIMinutos.setBorder(null);
        txtHoraIMinutos.setForeground(new java.awt.Color(204, 204, 204));
        txtHoraIMinutos.setCaretColor(new java.awt.Color(204, 204, 204));
        txtHoraIMinutos.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        add(txtHoraIMinutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 22, 18));

        txtUbicacion.setBackground(new java.awt.Color(51, 51, 51));
        txtUbicacion.setForeground(new java.awt.Color(204, 204, 204));
        txtUbicacion.setBorder(null);
        txtUbicacion.setCaretColor(new java.awt.Color(204, 204, 204));
        txtUbicacion.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        add(txtUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 130, 18));

        jLabel1.setText(" :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 120, 10, 20));

        jLabel5.setText(" :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 180, 10, 20));

        txtHoraFHoras.setBackground(new java.awt.Color(51, 51, 51));
        txtHoraFHoras.setBorder(null);
        txtHoraFHoras.setForeground(new java.awt.Color(204, 204, 204));
        txtHoraFHoras.setCaretColor(new java.awt.Color(204, 204, 204));
        txtHoraFHoras.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        add(txtHoraFHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 22, 18));

        txtHoraIHoras.setBackground(new java.awt.Color(51, 51, 51));
        txtHoraIHoras.setBorder(null);
        txtHoraIHoras.setForeground(new java.awt.Color(204, 204, 204));
        txtHoraIHoras.setCaretColor(new java.awt.Color(204, 204, 204));
        txtHoraIHoras.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        add(txtHoraIHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 22, 18));

        txtHoraFMinutos.setBackground(new java.awt.Color(51, 51, 51));
        txtHoraFMinutos.setBorder(null);
        txtHoraFMinutos.setForeground(new java.awt.Color(204, 204, 204));
        txtHoraFMinutos.setCaretColor(new java.awt.Color(204, 204, 204));
        txtHoraFMinutos.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        add(txtHoraFMinutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 22, 18));

        lblGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnGuardar.png"))); // NOI18N
        lblGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblGuardar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblGuardarMouseMoved(evt);
            }
        });
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
        add(lblGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 250, -1, 30));

        lblEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/Eliminar.png"))); // NOI18N
        lblEliminar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblEliminar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEliminar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEliminar1MouseEntered(evt);
            }
        });
        add(lblEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, 30));

        lblVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnVolver.png"))); // NOI18N
        lblVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVolverMouseEntered(evt);
            }
        });
        add(lblVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 28, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/AgregarEvento.png"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void lblGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseEntered
        lblGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnGuardarONN.png")));
    }//GEN-LAST:event_lblGuardarMouseEntered

    private void lblGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseExited
        lblGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnGuardar.png")));
    }//GEN-LAST:event_lblGuardarMouseExited

    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseClicked
        if (txtNombre.getText().length() > 0 && txtUbicacion.getText().length() > 0 && txtDescripcion.getText().length() > 0
                && txtHoraIHoras.getText().length() > 0 && txtHoraIMinutos.getText().length() > 0 && txtHoraFHoras.getText().length() > 0
                && txtHoraFMinutos.getText().length() > 0 && dChosserFechaI != null && dChosserFechaF != null) {

            Evento evento;
            if (modEvento == null) {
                evento = new Evento();
            } else {
                evento = modEvento;
            }

            evento.setNombre(txtNombre.getText());
            evento.setUbicacion(txtUbicacion.getText());
            evento.setDescripcion(txtDescripcion.getText());
            evento.setCiudad(ciudad);

            int hIHoras = Integer.parseInt(txtHoraIHoras.getText());
            int hIMinutos = Integer.parseInt(txtHoraIMinutos.getText());
            int hFHoras = Integer.parseInt(txtHoraFHoras.getText());
            int hFMinutos = Integer.parseInt(txtHoraFMinutos.getText());

            if ((hIHoras >= 0 && hIHoras <= 23) && (hFHoras >= 0 && hFHoras <= 23)) {
                if((hIMinutos >= 0 && hIMinutos <= 59) && (hFMinutos >= 0 && hFMinutos <= 59)){
                    Calendar cFechaI = dChosserFechaI.getCalendar();
                    Calendar cFechaF = dChosserFechaF.getCalendar();

                    cFechaI.set(Calendar.HOUR_OF_DAY, hIHoras);
                    cFechaI.set(Calendar.MINUTE, hIMinutos);
                    cFechaF.set(Calendar.HOUR_OF_DAY, hFHoras);
                    cFechaF.set(Calendar.MINUTE, hFMinutos);

                    try {
                        evento.setFechaHoraI(cFechaI);
                        evento.setFechaHoraF(cFechaI, cFechaF);

                        if (modEvento == null) {
                            viaje.agregarEvento(evento);
                            miVentana.dispose();
                        } else {
                            miVentana.remove(this);
                            miVentana.add(new pnlItinerario(modelo, viaje, miVentana));
                            miVentana.pack();
                        }

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "Los minutos deben ser un numero entre 0 y 59.", "Error", JOptionPane.ERROR_MESSAGE);      
                }
            } else {
                JOptionPane.showMessageDialog(this, "La hora debe ser un numero entre 0 y 24.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_lblGuardarMouseClicked
  
    private void lblEliminar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminar1MouseClicked
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el evento?", "Eliminar Evento", JOptionPane.OK_CANCEL_OPTION);
        if (respuesta == JOptionPane.OK_OPTION) {
            viaje.eliminarEvento(modEvento);
            miVentana.remove(this);
            miVentana.add(new pnlItinerario(modelo, viaje, miVentana));
            miVentana.pack();
        }
    }//GEN-LAST:event_lblEliminar1MouseClicked

    private void lblEliminar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminar1MouseEntered
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        lblEliminar1.setCursor(cursor);        
    }//GEN-LAST:event_lblEliminar1MouseEntered

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        miVentana.remove(this);
        miVentana.add(new pnlItinerario(modelo, viaje, miVentana));
        miVentana.pack();
    }//GEN-LAST:event_lblVolverMouseClicked

    private void lblVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseEntered
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        lblVolver.setCursor(cursor);
    }//GEN-LAST:event_lblVolverMouseEntered

    private void lblGuardarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseMoved
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        lblGuardar.setCursor(cursor);
    }//GEN-LAST:event_lblGuardarMouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dChosserFechaF;
    private com.toedter.calendar.JDateChooser dChosserFechaI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEliminar1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JFormattedTextField txtHoraFHoras;
    private javax.swing.JFormattedTextField txtHoraFMinutos;
    private javax.swing.JFormattedTextField txtHoraIHoras;
    private javax.swing.JFormattedTextField txtHoraIMinutos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
