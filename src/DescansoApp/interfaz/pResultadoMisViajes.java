package descansoApp.interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import descansoApp.dominio.Sistema;
import descansoApp.dominio.Viaje;
import java.awt.Cursor;

public class PResultadoMisViajes extends javax.swing.JPanel {

    private Sistema modelo;
    private Viaje viaje;
    private JFrame miVentana;
    private JPanel miPanel;
    
    public PResultadoMisViajes(Sistema unModelo, Viaje unViaje, JFrame unContenedorPrincipal, JPanel miContenedor) {
        initComponents();
        modelo = unModelo;
        viaje = unViaje;
        miVentana = unContenedorPrincipal;
        miPanel = miContenedor;
        
        lblNombre.setText(viaje.getNombre());
        lblFecha.setText(viaje.fechaToString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblEditar = new javax.swing.JLabel();

        setOpaque(false);

        lblNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 51, 204));
        lblNombre.setText("Nombre Viaje");
        lblNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblNombre.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblNombreMouseMoved(evt);
            }
        });
        lblNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNombreMouseClicked(evt);
            }
        });

        lblFecha.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblFecha.setText("Fecha");

        lblEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/Editar.png"))); // NOI18N
        lblEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblEditar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblEditarMouseMoved(evt);
            }
        });
        lblEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblNombre)
                .addGap(5, 5, 5)
                .addComponent(lblFecha)
                .addGap(5, 5, 5)
                .addComponent(lblEditar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblEditar))
            .addComponent(lblFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditarMouseClicked
        miVentana.remove(miPanel);
        miVentana.add(new PnlNuevoViaje(modelo, miVentana, viaje));
        miVentana.pack();
    }//GEN-LAST:event_lblEditarMouseClicked

    private void lblNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNombreMouseClicked
        miVentana.remove(miPanel);
        miVentana.add(new PnlItinerario(modelo, viaje, miVentana));
        miVentana.pack();
    }//GEN-LAST:event_lblNombreMouseClicked

    private void lblNombreMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNombreMouseMoved
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        lblNombre.setCursor(cursor);
    }//GEN-LAST:event_lblNombreMouseMoved

    private void lblEditarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditarMouseMoved
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        lblEditar.setCursor(cursor);
    }//GEN-LAST:event_lblEditarMouseMoved

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}
