package descansoApp.interfaz;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import descansoApp.dominio.Evento;
import descansoApp.dominio.Sistema;
import descansoApp.dominio.Viaje;
import javax.swing.JOptionPane;


public class PnlItinerario extends javax.swing.JPanel {

    private Sistema modelo;
    private Viaje viaje;
    private JFrame miVentana;

    public PnlItinerario(Sistema unModelo, Viaje unViaje, JFrame unContenedor) {
        initComponents();
        pnlResultados.setOpaque(false);
        pnlResultados.setLayout(new BoxLayout(pnlResultados, BoxLayout.PAGE_AXIS));
        scroll.setOpaque(false);
        scroll.getViewport().setOpaque(false);
        scroll.setBorder(null);

        modelo = unModelo;
        viaje = unViaje;
        miVentana = unContenedor;

        lblNombre.setText(viaje.getNombre());

        cargarItinerario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVolver = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        pnlResultados = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnVolver.png"))); // NOI18N
        lblVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolverMouseClicked(evt);
            }
        });
        add(lblVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 25, -1, -1));

        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout pnlResultadosLayout = new javax.swing.GroupLayout(pnlResultados);
        pnlResultados.setLayout(pnlResultadosLayout);
        pnlResultadosLayout.setHorizontalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );
        pnlResultadosLayout.setVerticalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 354, Short.MAX_VALUE)
        );

        scroll.setViewportView(pnlResultados);

        add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 440, 190));

        lblNombre.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(51, 51, 51));
        lblNombre.setText("Nombre del Viaje");
        add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 19, 410, 30));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/Itinerario.png"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        miVentana.remove(this);
        miVentana.add(new PnlMisViajes(modelo, miVentana));
        miVentana.pack();
    }//GEN-LAST:event_lblVolverMouseClicked

    public void cargarItinerario() {
        pnlResultados.removeAll();
        pnlResultados.repaint();

        ArrayList<Evento> resultados = viaje.getItinerario();
        Collections.sort(resultados);

       
        if (resultados.size() > 0) {
            descansoApp.dominio.Ciudad ciudad = null;
            Calendar fecha = null;

            for (int i = 0; i < resultados.size(); i++) {

                Evento actual = resultados.get(i);

                if (actual.getCiudad() != ciudad) {
                    ciudad = actual.getCiudad();
                    PResultadoIt1 p = new PResultadoIt1(ciudad.getNombre());
                    pnlResultados.add(p);
                }

                if (!fechasIguales(actual.getFechaHoraI(), fecha)) {
                    fecha = actual.getFechaHoraI();
                    PResultadoIt2 p2 = new PResultadoIt2(actual.fechaInicioToString());
                    pnlResultados.add(p2);
                }

                PResultadoIt3 p3 = new PResultadoIt3(modelo, viaje, actual, miVentana, this);
                pnlResultados.add(p3);

                pnlResultados.setVisible(true);
                pnlResultados.revalidate();
                pnlResultados.repaint();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay eventos creados para el viaje.");
        }
    }
    
     public boolean fechasIguales(Calendar f1, Calendar f2){
        if (f1 == null && f2 != null) return false;
        if (f1 != null && f2 == null) return false;
        if (f1 == null && f2 == null) return true;
        
        if (f1.get(Calendar.DAY_OF_MONTH) == f2.get(Calendar.DAY_OF_MONTH))
            if (f1.get(Calendar.MONTH) == f2.get(Calendar.MONTH))
                if (f1.get((Calendar.YEAR)) == f1.get((Calendar.YEAR)))
                    return true;
        
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JPanel pnlResultados;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
