package descansoApp.interfaz;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import descansoApp.dominio.Sistema;
import java.awt.Cursor;

public class PnlInicio extends javax.swing.JPanel {

    private Sistema modelo;
    private JFrame padre;

    public PnlInicio(Sistema unModelo, JFrame miPadre) {
        initComponents();
        modelo = unModelo;
        padre = miPadre;       
        textIntroduccion.setText("Bienvenido a DescansoApp la aplicación que le permitirá recorrer Uruguay en breves minutos y así poder decidir las ciudades que desea visitar. No solo le permitimos conocer posibles destinos, sino que podrá ver distintas opciones de donde hospedarse, ir a comer, y algunos de los lugares más visitados como fiestas populares, paseos, entre otros. De esta forma podrá planificar y tener un completo registro del viaje que usted desea.");
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setBorder(null);
        textIntroduccion.setOpaque(false);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNuevoViaje = new javax.swing.JLabel();
        lblMisViajes = new javax.swing.JLabel();
        lblBuscar = new javax.swing.JLabel();
        lblCiudadesActuales = new javax.swing.JLabel();
        txtBuscador = new javax.swing.JTextField();
        lblBuscador = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textIntroduccion = new javax.swing.JTextArea();
        lblNuevaCiudad = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(840, 500));
        setLayout(null);

        lblNuevoViaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnNuevoViaje.png"))); // NOI18N
        lblNuevoViaje.setToolTipText("");
        lblNuevoViaje.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblNuevoViaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNuevoViaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNuevoViajeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNuevoViajeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNuevoViajeMouseExited(evt);
            }
        });
        add(lblNuevoViaje);
        lblNuevoViaje.setBounds(100, 290, 132, 40);

        lblMisViajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnMisViajes.png"))); // NOI18N
        lblMisViajes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMisViajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMisViajesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMisViajesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMisViajesMouseExited(evt);
            }
        });
        add(lblMisViajes);
        lblMisViajes.setBounds(100, 350, 132, 40);

        lblBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/Lupa.png"))); // NOI18N
        lblBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBuscarMouseEntered(evt);
            }
        });
        add(lblBuscar);
        lblBuscar.setBounds(720, 350, 20, 20);

        lblCiudadesActuales.setForeground(new java.awt.Color(0, 0, 0));
        lblCiudadesActuales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/Lupa.png"))); // NOI18N
        lblCiudadesActuales.setText("Para ver las posibles busquedas Click aqui.");
        lblCiudadesActuales.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblCiudadesActualesMouseMoved(evt);
            }
        });
        lblCiudadesActuales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCiudadesActualesMouseClicked(evt);
            }
        });
        add(lblCiudadesActuales);
        lblCiudadesActuales.setBounds(410, 380, 280, 17);

        txtBuscador.setBackground(new java.awt.Color(102, 102, 102));
        txtBuscador.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtBuscador.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscador.setBorder(null);
        txtBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscadorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscadorKeyTyped(evt);
            }
        });
        add(txtBuscador);
        txtBuscador.setBounds(370, 350, 340, 22);

        lblBuscador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/Buscador.png"))); // NOI18N
        add(lblBuscador);
        lblBuscador.setBounds(330, 260, 440, 160);

        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/Titulo.png"))); // NOI18N
        lblTitulo.setToolTipText("");
        add(lblTitulo);
        lblTitulo.setBounds(280, 50, 260, 60);

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("");
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        textIntroduccion.setEditable(false);
        textIntroduccion.setColumns(20);
        textIntroduccion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textIntroduccion.setForeground(new java.awt.Color(0, 0, 0));
        textIntroduccion.setLineWrap(true);
        textIntroduccion.setRows(4);
        textIntroduccion.setTabSize(4);
        textIntroduccion.setToolTipText("");
        textIntroduccion.setWrapStyleWord(true);
        textIntroduccion.setAutoscrolls(false);
        textIntroduccion.setBorder(null);
        textIntroduccion.setHighlighter(null);
        jScrollPane1.setViewportView(textIntroduccion);

        add(jScrollPane1);
        jScrollPane1.setBounds(80, 130, 690, 120);

        lblNuevaCiudad.setForeground(new java.awt.Color(0, 0, 0));
        lblNuevaCiudad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnPlus.png"))); // NOI18N
        lblNuevaCiudad.setText("Para agregar nuevas ciudades Click aqui.");
        lblNuevaCiudad.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblNuevaCiudadMouseMoved(evt);
            }
        });
        lblNuevaCiudad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNuevaCiudadMouseClicked(evt);
            }
        });
        add(lblNuevaCiudad);
        lblNuevaCiudad.setBounds(250, 450, 260, 18);

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/FondoInicio.png"))); // NOI18N
        lblImagen.setPreferredSize(new java.awt.Dimension(800, 450));
        lblImagen.setVerifyInputWhenFocusTarget(false);
        add(lblImagen);
        lblImagen.setBounds(0, 0, 840, 500);
    }// </editor-fold>//GEN-END:initComponents

    private void lblNuevoViajeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevoViajeMouseEntered
        lblNuevoViaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnNuevoViajeON.png")));
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        lblNuevoViaje.setCursor(cursor);
    }//GEN-LAST:event_lblNuevoViajeMouseEntered

    private void lblNuevoViajeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevoViajeMouseExited
        lblNuevoViaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnNuevoViaje.png")));
    }//GEN-LAST:event_lblNuevoViajeMouseExited

    private void lblMisViajesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisViajesMouseEntered
        lblMisViajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnMisViajesON.png")));
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        lblMisViajes.setCursor(cursor);
    }//GEN-LAST:event_lblMisViajesMouseEntered

    private void lblMisViajesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisViajesMouseExited
        lblMisViajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnMisViajes.png")));
    }//GEN-LAST:event_lblMisViajesMouseExited

    private void lblNuevoViajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevoViajeMouseClicked
        PopUp p = new PopUp();
        p.add(new PnlNuevoViaje(modelo, p, null));
        p.pack();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }//GEN-LAST:event_lblNuevoViajeMouseClicked

    private void lblMisViajesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisViajesMouseClicked
        if(modelo.getListaViajes().isEmpty()){
            JOptionPane.showMessageDialog(padre, "No hay viajes ingresados.");
        }
        else{
            PopUp p= new PopUp();
            p.add(new PnlMisViajes(modelo, p));
            p.pack();
            p.setLocationRelativeTo(null);
            p.setVisible(true);
        }
    }//GEN-LAST:event_lblMisViajesMouseClicked

    private void lblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseClicked
        buscar();
    }//GEN-LAST:event_lblBuscarMouseClicked

    private void txtBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscadorKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            buscar();
        }
    }//GEN-LAST:event_txtBuscadorKeyReleased

    private void lblBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseEntered
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        lblBuscar.setCursor(cursor);
    }//GEN-LAST:event_lblBuscarMouseEntered

    private void txtBuscadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscadorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscadorKeyTyped

    private void lblCiudadesActualesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCiudadesActualesMouseMoved
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        lblCiudadesActuales.setCursor(cursor);
    }//GEN-LAST:event_lblCiudadesActualesMouseMoved

    private void lblCiudadesActualesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCiudadesActualesMouseClicked
        if(modelo.getListaCiudades().isEmpty()){
            JOptionPane.showMessageDialog(padre, "No hay busquedas posibles.");
        }
        else{
            PopUp p= new PopUp();
            p.add(new PnlCiudadesActuales(modelo, p));
            p.pack();
            p.setLocationRelativeTo(null);
            p.setVisible(true);
        }
    }//GEN-LAST:event_lblCiudadesActualesMouseClicked

    private void lblNuevaCiudadMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevaCiudadMouseMoved
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        lblNuevaCiudad.setCursor(cursor);
    }//GEN-LAST:event_lblNuevaCiudadMouseMoved

    private void lblNuevaCiudadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevaCiudadMouseClicked
        padre.remove(this);
        padre.add(new PnlNuevaCiudad(modelo, padre), BorderLayout.WEST);
        padre.pack();
    }//GEN-LAST:event_lblNuevaCiudadMouseClicked

    private void buscar() {
        int cantidadLetrasPermitidas = 30;
        if (txtBuscador.getText().length() <= 3) {
            JOptionPane.showMessageDialog(this, "Debe ingresar una palabra clave (más de tres letras) en el cuadro de busqueda", "Busqueda Vacía", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(txtBuscador.getText().length() >cantidadLetrasPermitidas){
            JOptionPane.showMessageDialog(padre, "La busqueda puede contener hasta 30 caracteres.");
        }
        else {
            padre.remove(this);
            padre.add(new PnlResultadoBusqueda(modelo, padre, txtBuscador.getText()), BorderLayout.WEST);
            padre.pack();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscador;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCiudadesActuales;
    private javax.swing.JLabel lblImagen;
    public javax.swing.JLabel lblMisViajes;
    private javax.swing.JLabel lblNuevaCiudad;
    public javax.swing.JLabel lblNuevoViaje;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea textIntroduccion;
    private javax.swing.JTextField txtBuscador;
    // End of variables declaration//GEN-END:variables
}
