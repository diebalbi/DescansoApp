package descansoApp.interfaz;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import descansoApp.dominio.ComercioActividad;
import descansoApp.dominio.Sistema;
import java.awt.Color;
import java.awt.Cursor;

public class pResultadoDondeQue extends javax.swing.JPanel {

    private Sistema modelo;
    private ComercioActividad cA;
    private JPanel padre;
    private JFrame ventana;
    private descansoApp.dominio.Ciudad ciudad;
   
    public pResultadoDondeQue(Sistema unModelo, ComercioActividad unCA,  JFrame unaVentana, JPanel unPadre, descansoApp.dominio.Ciudad unaCiudad) {
        initComponents();
        txtDes.setOpaque(false);
        txtDes.setLayout(new BoxLayout(txtDes, BoxLayout.PAGE_AXIS));
        scroll.setOpaque(false);
        scroll.getViewport().setOpaque(false);
        scroll.setBorder(null);
        modelo = unModelo;
        cA = unCA;
        padre = unPadre;
        ventana = unaVentana;
        ciudad = unaCiudad;
        lblNombre.setText(unCA.getNombre());
        txtDes.setText(unCA.getDetalles());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        txtDes = new javax.swing.JTextArea();
        lblInformacion = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(545, 100));

        lblNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 204));
        lblNombre.setText("Nombre de DondeQue");
        lblNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtDes.setEditable(false);
        txtDes.setColumns(20);
        txtDes.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtDes.setForeground(new java.awt.Color(255, 255, 255));
        txtDes.setLineWrap(true);
        txtDes.setRows(5);
        txtDes.setWrapStyleWord(true);
        txtDes.setHighlighter(null);
        scroll.setViewportView(txtDes);

        lblInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnPlus.png"))); // NOI18N
        lblInformacion.setText("Mas informacion");
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
            .addComponent(scroll)
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
                .addGap(0, 0, 0)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblInformacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInformacionMouseClicked
        ventana.remove(padre);
        ventana.add(new pnlInformacionComercioActividad(modelo, cA, ventana,ciudad));
        ventana.pack();
    }//GEN-LAST:event_lblInformacionMouseClicked

    private void lblInformacionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInformacionMouseMoved
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        lblInformacion.setCursor(cursor);
    }//GEN-LAST:event_lblInformacionMouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblInformacion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTextArea txtDes;
    // End of variables declaration//GEN-END:variables
}
