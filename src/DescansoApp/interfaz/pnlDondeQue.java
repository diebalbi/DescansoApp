package descansoApp.interfaz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import descansoApp.dominio.ComercioActividad;
import descansoApp.dominio.Sistema;
import descansoApp.herramientas.TipoCA;
import java.awt.Cursor;
import javax.swing.JComponent;

public class PnlDondeQue extends javax.swing.JPanel {

    private Sistema modelo;
    private descansoApp.dominio.Ciudad ciudad;
    private JFrame padre;
    ArrayList<ComercioActividad> lista;
    ArrayList<String> filtros;

    public PnlDondeQue(Sistema unModelo, descansoApp.dominio.Ciudad unaCiudad, JFrame unPadre, TipoCA unTipo) {
        initComponents();
        pnlResultados.setOpaque(false);
        pnlResultados.setLayout(new BoxLayout(pnlResultados, BoxLayout.PAGE_AXIS));
        scroll.setOpaque(false);
        scroll.getViewport().setOpaque(false);
        scroll.setBorder(null);
        scroll2.setOpaque(false);
        scroll2.getViewport().setOpaque(false);
        scroll2.setBorder(null);
        ((JComponent) lstFiltros.getCellRenderer()).setOpaque(false);
        modelo = unModelo;
        ciudad = unaCiudad;
        padre = unPadre;
        filtros = new ArrayList<>();
        switch (unTipo) {
            case alojamiento:
                lista = ciudad.getAlojamientos();
                lblTitulo.setText("¿Dónde Dormir?");
                break;
            case estGastronomico:
                lista = ciudad.getEstGastronomicos();
                lblTitulo.setText("¿Dónde Comer?");
                break;
            case actividad:
                lista = ciudad.getActividades();
                lblTitulo.setText("¿Qué hacer?");
                break;
            default:
                break;
        }

        Collections.sort(lista);

        cargar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVolver = new javax.swing.JLabel();
        scroll2 = new javax.swing.JScrollPane();
        lstFiltros = new javax.swing.JList();
        scroll = new javax.swing.JScrollPane();
        pnlResultados = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        add(lblVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 38, 30, 30));

        scroll2.setHorizontalScrollBar(null);

        lstFiltros.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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
        lstFiltros.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstFiltrosValueChanged(evt);
            }
        });
        scroll2.setViewportView(lstFiltros);

        add(scroll2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 140, 370));

        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout pnlResultadosLayout = new javax.swing.GroupLayout(pnlResultados);
        pnlResultados.setLayout(pnlResultadosLayout);
        pnlResultadosLayout.setHorizontalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
        );
        pnlResultadosLayout.setVerticalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        scroll.setViewportView(pnlResultados);

        add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 620, 370));

        lblTitulo.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("TITULO");
        add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 36, 240, 30));

        lblInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnHome.png"))); // NOI18N
        lblInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInicioMouseEntered(evt);
            }
        });
        add(lblInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 38, 30, 30));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/Fondo.png"))); // NOI18N
        lblFondo.setMaximumSize(new java.awt.Dimension(840, 500));
        lblFondo.setMinimumSize(new java.awt.Dimension(840, 500));
        lblFondo.setName(""); // NOI18N
        lblFondo.setPreferredSize(new java.awt.Dimension(840, 500));
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void lstFiltrosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstFiltrosValueChanged
        pnlResultados.removeAll();
        pnlResultados.repaint();
        Iterator<ComercioActividad> it = lista.iterator();
        while (it.hasNext()) {
            ComercioActividad actual = it.next();
            if (filtros.get(lstFiltros.getSelectedIndex()).equals(actual.getCategoria())) {
                PResultadoDondeQue p = new PResultadoDondeQue(modelo, actual, padre, this, ciudad);
                pnlResultados.add(p);
            }
        }
        pnlResultados.setVisible(true);
        pnlResultados.revalidate();
        pnlResultados.repaint();
    }//GEN-LAST:event_lstFiltrosValueChanged

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        padre.remove(this);
        padre.add(new PnlInformacionCiudad(modelo, ciudad, padre));
        padre.pack();
    }//GEN-LAST:event_lblVolverMouseClicked

    private void lblInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseClicked
        padre.remove(this);
        padre.add(new PnlInicio(modelo, padre));
        padre.pack();
    }//GEN-LAST:event_lblInicioMouseClicked

    private void lblInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseEntered
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        lblInicio.setCursor(cursor);
    }//GEN-LAST:event_lblInicioMouseEntered

    private void lblVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseEntered
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        lblVolver.setCursor(cursor);
    }//GEN-LAST:event_lblVolverMouseEntered

    private void cargar() {
        int cantResultados = lista.size();
        if (cantResultados > 0) {
            for (int i = 0; i < cantResultados; i++) {
                if (!filtros.contains(lista.get(i).getCategoria())) {
                    filtros.add(lista.get(i).getCategoria());
                }
            }
        } 
        Collections.sort(filtros);
        lstFiltros.setListData(filtros.toArray());
        lstFiltros.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JList lstFiltros;
    private javax.swing.JPanel pnlResultados;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JScrollPane scroll2;
    // End of variables declaration//GEN-END:variables
}
