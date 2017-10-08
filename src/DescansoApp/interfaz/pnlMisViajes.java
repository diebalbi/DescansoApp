package descansoApp.interfaz;

import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import descansoApp.dominio.Sistema;
import descansoApp.dominio.Viaje;
import javax.swing.JOptionPane;

public class PnlMisViajes extends javax.swing.JPanel {

    private Sistema modelo;
    private JFrame miVentana;

    public PnlMisViajes(Sistema unModelo, JFrame unContenedor) {
        initComponents();
        pnlResultados.setOpaque(false);
        pnlResultados.setLayout(new BoxLayout(pnlResultados, BoxLayout.PAGE_AXIS));
        scroll.setOpaque(false);
        scroll.getViewport().setOpaque(false);
        scroll.setBorder(null);

        modelo = unModelo;
        miVentana = unContenedor;

        cargarViajes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        pnlResultados = new javax.swing.JPanel();
        lblFondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scroll.setAutoscrolls(true);
        scroll.setHorizontalScrollBar(null);
        scroll.setMaximumSize(new java.awt.Dimension(440, 195));
        scroll.setMinimumSize(new java.awt.Dimension(440, 195));
        scroll.setPreferredSize(new java.awt.Dimension(440, 195));

        javax.swing.GroupLayout pnlResultadosLayout = new javax.swing.GroupLayout(pnlResultados);
        pnlResultados.setLayout(pnlResultadosLayout);
        pnlResultadosLayout.setHorizontalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );
        pnlResultadosLayout.setVerticalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );

        scroll.setViewportView(pnlResultados);

        add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/MisViajes.png"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 280));
    }// </editor-fold>//GEN-END:initComponents

    private void cargarViajes() {
        pnlResultados.removeAll();
        pnlResultados.repaint();
        ArrayList<Viaje> resultados = modelo.getListaViajes();
        int cantResultados = resultados.size();
        if (cantResultados > 0) {
            for (int i = 0; i < cantResultados; i++) {
                PResultadoMisViajes p = new PResultadoMisViajes(modelo, resultados.get(i), miVentana, this);
                pnlResultados.add(p);
            }
            pnlResultados.setVisible(true);
            pnlResultados.revalidate();
            pnlResultados.repaint();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblFondo;
    private javax.swing.JPanel pnlResultados;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
