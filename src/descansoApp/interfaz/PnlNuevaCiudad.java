package descansoApp.interfaz;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import descansoApp.dominio.Sistema;
import java.awt.Cursor;

public class PnlNuevaCiudad extends javax.swing.JPanel {

    private Sistema modelo;
    private JFrame padre;

    public PnlNuevaCiudad(Sistema unModelo, JFrame unPadre) {
        initComponents();
        modelo = unModelo;
        padre = unPadre;       
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImagen = new javax.swing.JLabel();
        jFileChooser1 = new javax.swing.JFileChooser();

        setPreferredSize(new java.awt.Dimension(840, 500));
        setLayout(null);

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/FondoInicio.png"))); // NOI18N
        lblImagen.setPreferredSize(new java.awt.Dimension(800, 450));
        lblImagen.setVerifyInputWhenFocusTarget(false);
        add(lblImagen);
        lblImagen.setBounds(30, 20, 100, 70);
        add(jFileChooser1);
        jFileChooser1.setBounds(150, 70, 543, 326);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel lblImagen;
    // End of variables declaration//GEN-END:variables
}
