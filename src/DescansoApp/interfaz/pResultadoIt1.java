package descansoApp.interfaz;

public class PResultadoIt1 extends javax.swing.JPanel {

    public PResultadoIt1(String unaCiudad) {
        initComponents();
        lblNombre.setText(unaCiudad);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();

        setOpaque(false);

        lblNombre.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(51, 51, 51));
        lblNombre.setText("Nombre de Ciudad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblNombre)
                .addGap(0, 263, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNombre)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}
