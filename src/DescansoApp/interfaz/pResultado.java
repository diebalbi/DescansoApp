package descansoApp.interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import descansoApp.dominio.Sistema;
import java.awt.Color;
import java.awt.Cursor;

public class pResultado extends javax.swing.JPanel {

    private JFrame ventana;
    private JPanel padre;
    private Sistema modelo;
    private descansoApp.dominio.Ciudad ciudad;
    
    public pResultado(Sistema unModelo, descansoApp.dominio.Ciudad unaCiudad, JFrame unaVentana, JPanel unPadre) {
        initComponents();
        modelo = unModelo;
        ciudad = unaCiudad;
        ventana = unaVentana;
        padre = unPadre;
        
        lblDes.setOpaque(false);
        scroll.setOpaque(false);
        scroll.getViewport().setOpaque(false);
        scroll.setBorder(null);
        
        lblNombre.setText(ciudad.getNombre());
        lblDes.setText(ciudad.getDescripcion());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        lblDes = new javax.swing.JTextArea();
        lblNombre = new javax.swing.JLabel();
        lblInformacion = new javax.swing.JLabel();

        setOpaque(false);

        lblDes.setEditable(false);
        lblDes.setColumns(20);
        lblDes.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lblDes.setForeground(new java.awt.Color(255, 255, 255));
        lblDes.setLineWrap(true);
        lblDes.setRows(5);
        lblDes.setWrapStyleWord(true);
        lblDes.setAutoscrolls(false);
        lblDes.setBorder(null);
        lblDes.setHighlighter(null);
        lblDes.setOpaque(false);
        scroll.setViewportView(lblDes);

        lblNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 204));
        lblNombre.setText("Nombre Ciudad");
        lblNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnPlus.png"))); // NOI18N
        lblInformacion.setText("Mas información");
        lblInformacion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblInformacionMouseMoved(evt);
            }
        });
        lblInformacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInformacionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblInformacionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInformacionMouseMoved
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        lblInformacion.setCursor(cursor);
    }//GEN-LAST:event_lblInformacionMouseMoved

    private void lblInformacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInformacionMouseClicked
        ventana.remove(padre);
        ventana.add(new pnlInformacionCiudad(modelo, ciudad, ventana));
        ventana.pack();
    }//GEN-LAST:event_lblInformacionMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea lblDes;
    private javax.swing.JLabel lblInformacion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
