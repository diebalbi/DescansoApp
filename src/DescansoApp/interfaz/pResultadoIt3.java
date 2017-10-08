package descansoApp.interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import descansoApp.dominio.Evento;
import descansoApp.dominio.Sistema;
import descansoApp.dominio.Viaje;
import java.awt.Cursor;

public class PResultadoIt3 extends javax.swing.JPanel {

    private Evento evento;
    private Viaje viaje;
    private JFrame miVentana;
    private JPanel miPanel;
    private Sistema modelo;

    public PResultadoIt3(Sistema unModelo,Viaje unViaje, Evento unEvento, JFrame miContenedorPrincipal, JPanel miContenedor) {
        initComponents();
        modelo= unModelo;
        evento = unEvento;
        viaje = unViaje;
        miVentana = miContenedorPrincipal;
        miPanel = miContenedor;

        lblHora.setText(evento.horaInicioToString());
        lblNombre.setText(evento.getNombre());
        lblUbicacion.setText("(" + evento.getUbicacion() + ")");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHora = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblUbicacion = new javax.swing.JLabel();
        lblEditar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);

        lblHora.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lblHora.setText("18:00 hs");

        lblNombre.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 51, 204));
        lblNombre.setText("Nombre del Evento");
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

        lblUbicacion.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblUbicacion.setText("(Ubicacion)");

        lblEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/Editar.png"))); // NOI18N
        lblEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEditarMouseEntered(evt);
            }
        });

        jLabel1.setText("Hora inicio:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUbicacion)
                .addGap(18, 18, 18)
                .addComponent(lblEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblHora)
                .addComponent(lblNombre)
                .addComponent(lblUbicacion)
                .addComponent(jLabel1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditarMouseClicked
        miVentana.remove(miPanel);
        miVentana.add(new PnlEvento(modelo, viaje, evento.getCiudad(), evento, miVentana, false));
        miVentana.pack();
    }//GEN-LAST:event_lblEditarMouseClicked

    private void lblNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNombreMouseClicked
        miVentana.remove(miPanel);
        miVentana.add(new PnlInformacionEvento(modelo, viaje, evento, miVentana));
        miVentana.pack();        
    }//GEN-LAST:event_lblNombreMouseClicked

    private void lblEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditarMouseEntered
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        lblEditar.setCursor(cursor);
    }//GEN-LAST:event_lblEditarMouseEntered

    private void lblNombreMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNombreMouseMoved
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        lblNombre.setCursor(cursor);
    }//GEN-LAST:event_lblNombreMouseMoved

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblUbicacion;
    // End of variables declaration//GEN-END:variables
}
