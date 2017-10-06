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
        lblNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNombreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNombreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNombreMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(620, 620, 620))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNombreMouseClicked
        ventana.remove(padre);
        ventana.add(new pnlInformacionCiudad(modelo, ciudad, ventana));
        ventana.pack();
    }//GEN-LAST:event_lblNombreMouseClicked

    private void lblNombreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNombreMouseEntered
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        lblNombre.setCursor(cursor);
        lblNombre.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_lblNombreMouseEntered

    private void lblNombreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNombreMouseExited
        lblNombre.setForeground(Color.BLUE);
    }//GEN-LAST:event_lblNombreMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea lblDes;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
