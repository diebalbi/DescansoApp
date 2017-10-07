package descansoApp.interfaz;

import descansoApp.dominio.Ciudad;
import java.util.ArrayList;
import javax.swing.JFrame;
import descansoApp.dominio.Sistema;
import java.util.Collections;
import javax.swing.JComponent;

public class pnlCiudadesActuales extends javax.swing.JPanel {

    private Sistema modelo;
    private JFrame miVentana;
    private ArrayList<Ciudad> ciudades;
    ArrayList<String> filtros;

    public pnlCiudadesActuales(Sistema unModelo, JFrame unContenedor) {
        initComponents();
        modelo = unModelo;
        miVentana = unContenedor;
        ciudades = modelo.getListaCiudades();
        scroll2.setOpaque(false);
        scroll2.getViewport().setOpaque(false);
        scroll2.setBorder(null);
        ((JComponent) lstFiltros.getCellRenderer()).setOpaque(false);
        filtros = new ArrayList<>();
        cargar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll2 = new javax.swing.JScrollPane();
        lstFiltros = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scroll2.setHorizontalScrollBar(null);

        lstFiltros.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lstFiltros.setForeground(new java.awt.Color(51, 102, 255));
        lstFiltros.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstFiltros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstFiltros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lstFiltros.setOpaque(false);
        lstFiltros.setSelectionBackground(new java.awt.Color(0, 0, 0));
        lstFiltros.setSelectionForeground(new java.awt.Color(153, 153, 153));
        lstFiltros.setValueIsAdjusting(true);
        scroll2.setViewportView(lstFiltros);

        add(scroll2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 320, 200));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ciudades actuales");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 19, -1, 30));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/Itinerario.png"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 280));
    }// </editor-fold>//GEN-END:initComponents

    private void cargar() {
        int cantResultados = ciudades.size();
        if (cantResultados > 0) {
            for (int i = 0; i < cantResultados; i++) {
                if (!filtros.contains(ciudades.get(i))) {
                    filtros.add(ciudades.get(i).getNombre());
                }
            }
        } 
        Collections.sort(filtros);
        lstFiltros.setListData(filtros.toArray());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JList lstFiltros;
    private javax.swing.JScrollPane scroll2;
    // End of variables declaration//GEN-END:variables
}
