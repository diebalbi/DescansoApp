package descansoApp.interfaz;
;
import descansoApp.dominio.Ciudad;
import descansoApp.dominio.ComercioActividad;
import javax.swing.*;
import descansoApp.dominio.Sistema;
import descansoApp.herramientas.TipoCA;
import java.awt.Cursor;

public class PnlNuevaCiudad extends javax.swing.JPanel {
    private Sistema modelo;
    private JFrame padre;
    private Ciudad ciudad = new Ciudad();

    public PnlNuevaCiudad(Sistema unModelo, JFrame unPadre) {
        initComponents();
        modelo = unModelo;
        padre = unPadre;
        buttonGroup1.add(jRadioAlojamiento);
        buttonGroup1.add(jRadioActividad);
        buttonGroup1.add(jRadioGastronomia);
        jRadioAlojamiento.setOpaque(false);
        jRadioActividad.setOpaque(false);
        jRadioGastronomia.setOpaque(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblVolver = new javax.swing.JLabel();
        lblHome = new javax.swing.JLabel();
        lblNombreCiudad = new javax.swing.JLabel();
        lblGuardar = new javax.swing.JLabel();
        txtNombreCiudad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtInformacionGeneral = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtNombreActividad = new javax.swing.JTextField();
        txtHorario = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtUbicacion = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtWeb = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDetalles = new javax.swing.JTextArea();
        jRadioAlojamiento = new javax.swing.JRadioButton();
        jRadioActividad = new javax.swing.JRadioButton();
        jRadioGastronomia = new javax.swing.JRadioButton();
        lblAgregarActividad = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();

        setPreferredSize(new java.awt.Dimension(840, 500));
        setLayout(null);

        lblVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnVolver.png"))); // NOI18N
        lblVolver.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblVolverMouseMoved(evt);
            }
        });
        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolverMouseClicked(evt);
            }
        });
        add(lblVolver);
        lblVolver.setBounds(30, 20, 30, 30);

        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnHome.png"))); // NOI18N
        lblHome.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblHomeMouseMoved(evt);
            }
        });
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeMouseClicked(evt);
            }
        });
        add(lblHome);
        lblHome.setBounds(65, 20, 30, 30);

        lblNombreCiudad.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
        lblNombreCiudad.setForeground(new java.awt.Color(51, 51, 51));
        lblNombreCiudad.setText("Nueva Ciudad");
        add(lblNombreCiudad);
        lblNombreCiudad.setBounds(100, 20, 300, 30);

        lblGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnGuardar.png"))); // NOI18N
        lblGuardar.setText("jLabel3");
        lblGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblGuardarMouseExited(evt);
            }
        });
        add(lblGuardar);
        lblGuardar.setBounds(680, 445, 130, 30);

        txtNombreCiudad.setBackground(new java.awt.Color(51, 51, 51));
        txtNombreCiudad.setForeground(new java.awt.Color(204, 204, 204));
        txtNombreCiudad.setBorder(null);
        txtNombreCiudad.setCaretColor(new java.awt.Color(204, 204, 204));
        txtNombreCiudad.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtNombreCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreCiudadKeyTyped(evt);
            }
        });
        add(txtNombreCiudad);
        txtNombreCiudad.setBounds(130, 90, 230, 15);

        jScrollPane1.setBorder(null);

        txtDescripcion.setBackground(new java.awt.Color(51, 51, 51));
        txtDescripcion.setColumns(20);
        txtDescripcion.setForeground(new java.awt.Color(204, 204, 204));
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        txtDescripcion.setWrapStyleWord(true);
        txtDescripcion.setBorder(null);
        txtDescripcion.setCaretColor(new java.awt.Color(204, 204, 204));
        txtDescripcion.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtDescripcion.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(txtDescripcion);

        add(jScrollPane1);
        jScrollPane1.setBounds(130, 120, 230, 80);

        jScrollPane2.setBorder(null);

        txtInformacionGeneral.setBackground(new java.awt.Color(51, 51, 51));
        txtInformacionGeneral.setColumns(20);
        txtInformacionGeneral.setForeground(new java.awt.Color(204, 204, 204));
        txtInformacionGeneral.setLineWrap(true);
        txtInformacionGeneral.setRows(5);
        txtInformacionGeneral.setWrapStyleWord(true);
        txtInformacionGeneral.setBorder(null);
        txtInformacionGeneral.setCaretColor(new java.awt.Color(204, 204, 204));
        txtInformacionGeneral.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtInformacionGeneral.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        jScrollPane2.setViewportView(txtInformacionGeneral);

        add(jScrollPane2);
        jScrollPane2.setBounds(500, 90, 310, 110);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre :");
        add(jLabel4);
        jLabel4.setBounds(40, 90, 150, 15);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Descripción :");
        add(jLabel5);
        jLabel5.setBounds(40, 120, 150, 15);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Información General :");
        add(jLabel6);
        jLabel6.setBounds(370, 90, 130, 15);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombre :");
        add(jLabel7);
        jLabel7.setBounds(40, 250, 60, 16);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Horario :");
        add(jLabel8);
        jLabel8.setBounds(40, 280, 60, 16);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Precio :");
        add(jLabel9);
        jLabel9.setBounds(40, 310, 50, 16);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Ubicación :");
        add(jLabel10);
        jLabel10.setBounds(40, 340, 80, 16);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Teléfono :");
        add(jLabel11);
        jLabel11.setBounds(420, 250, 60, 16);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Detalle :");
        add(jLabel12);
        jLabel12.setBounds(420, 310, 45, 16);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Categoria :");
        jLabel13.setToolTipText("");
        add(jLabel13);
        jLabel13.setBounds(40, 370, 70, 16);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Tipo :");
        add(jLabel14);
        jLabel14.setBounds(420, 280, 30, 15);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Actividad de la Ciudad");
        add(jLabel15);
        jLabel15.setBounds(30, 220, 280, 22);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Web :");
        add(jLabel16);
        jLabel16.setBounds(40, 400, 48, 16);

        txtNombreActividad.setBackground(new java.awt.Color(51, 51, 51));
        txtNombreActividad.setForeground(new java.awt.Color(204, 204, 204));
        txtNombreActividad.setBorder(null);
        txtNombreActividad.setCaretColor(new java.awt.Color(204, 204, 204));
        txtNombreActividad.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtNombreActividad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreActividadKeyTyped(evt);
            }
        });
        add(txtNombreActividad);
        txtNombreActividad.setBounds(130, 250, 270, 15);

        txtHorario.setBackground(new java.awt.Color(51, 51, 51));
        txtHorario.setForeground(new java.awt.Color(204, 204, 204));
        txtHorario.setBorder(null);
        txtHorario.setCaretColor(new java.awt.Color(204, 204, 204));
        txtHorario.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtHorario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHorarioKeyTyped(evt);
            }
        });
        add(txtHorario);
        txtHorario.setBounds(130, 280, 270, 15);

        txtPrecio.setBackground(new java.awt.Color(51, 51, 51));
        txtPrecio.setForeground(new java.awt.Color(204, 204, 204));
        txtPrecio.setBorder(null);
        txtPrecio.setCaretColor(new java.awt.Color(204, 204, 204));
        txtPrecio.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        add(txtPrecio);
        txtPrecio.setBounds(130, 310, 270, 15);

        txtUbicacion.setBackground(new java.awt.Color(51, 51, 51));
        txtUbicacion.setForeground(new java.awt.Color(204, 204, 204));
        txtUbicacion.setBorder(null);
        txtUbicacion.setCaretColor(new java.awt.Color(204, 204, 204));
        txtUbicacion.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtUbicacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUbicacionKeyTyped(evt);
            }
        });
        add(txtUbicacion);
        txtUbicacion.setBounds(130, 340, 270, 15);

        txtCategoria.setBackground(new java.awt.Color(51, 51, 51));
        txtCategoria.setForeground(new java.awt.Color(204, 204, 204));
        txtCategoria.setBorder(null);
        txtCategoria.setCaretColor(new java.awt.Color(204, 204, 204));
        txtCategoria.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCategoriaKeyTyped(evt);
            }
        });
        add(txtCategoria);
        txtCategoria.setBounds(130, 370, 270, 15);

        txtWeb.setBackground(new java.awt.Color(51, 51, 51));
        txtWeb.setForeground(new java.awt.Color(204, 204, 204));
        txtWeb.setBorder(null);
        txtWeb.setCaretColor(new java.awt.Color(204, 204, 204));
        txtWeb.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        add(txtWeb);
        txtWeb.setBounds(130, 400, 270, 15);

        txtTelefono.setBackground(new java.awt.Color(51, 51, 51));
        txtTelefono.setForeground(new java.awt.Color(204, 204, 204));
        txtTelefono.setBorder(null);
        txtTelefono.setCaretColor(new java.awt.Color(204, 204, 204));
        txtTelefono.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        add(txtTelefono);
        txtTelefono.setBounds(500, 250, 220, 15);

        jScrollPane3.setBorder(null);

        txtDetalles.setBackground(new java.awt.Color(51, 51, 51));
        txtDetalles.setColumns(20);
        txtDetalles.setForeground(new java.awt.Color(204, 204, 204));
        txtDetalles.setLineWrap(true);
        txtDetalles.setRows(5);
        txtDetalles.setWrapStyleWord(true);
        txtDetalles.setBorder(null);
        txtDetalles.setCaretColor(new java.awt.Color(204, 204, 204));
        txtDetalles.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtDetalles.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        jScrollPane3.setViewportView(txtDetalles);

        add(jScrollPane3);
        jScrollPane3.setBounds(500, 310, 310, 130);

        jRadioAlojamiento.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jRadioAlojamiento.setForeground(new java.awt.Color(0, 0, 0));
        jRadioAlojamiento.setText("Alojamiento");
        add(jRadioAlojamiento);
        jRadioAlojamiento.setBounds(500, 280, 100, 15);

        jRadioActividad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jRadioActividad.setForeground(new java.awt.Color(0, 0, 0));
        jRadioActividad.setText("Actividad");
        add(jRadioActividad);
        jRadioActividad.setBounds(610, 280, 100, 15);

        jRadioGastronomia.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jRadioGastronomia.setForeground(new java.awt.Color(0, 0, 0));
        jRadioGastronomia.setText("Gastronomia");
        add(jRadioGastronomia);
        jRadioGastronomia.setBounds(710, 280, 110, 15);

        lblAgregarActividad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblAgregarActividad.setForeground(new java.awt.Color(0, 0, 102));
        lblAgregarActividad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnPlus.png"))); // NOI18N
        lblAgregarActividad.setText("Agregar Actividad a la ciudad Click Aqui");
        lblAgregarActividad.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblAgregarActividadMouseMoved(evt);
            }
        });
        lblAgregarActividad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarActividadMouseClicked(evt);
            }
        });
        add(lblAgregarActividad);
        lblAgregarActividad.setBounds(40, 450, 320, 18);

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/NuevaCiudad.png"))); // NOI18N
        lblImagen.setPreferredSize(new java.awt.Dimension(800, 450));
        lblImagen.setVerifyInputWhenFocusTarget(false);
        add(lblImagen);
        lblImagen.setBounds(0, 0, 840, 500);
        add(jTabbedPane1);
        jTabbedPane1.setBounds(150, -30, 2, 4);
    }// </editor-fold>//GEN-END:initComponents
    
    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseClicked
        if(hayCamposVaciosCiudad()){
            JOptionPane.showMessageDialog(null, "No pueden haber campos vacios de la ciudad.");
        }
        else if(txtNombreCiudad.getText().length() < 3){
            JOptionPane.showMessageDialog(null, "El nombre de la ciudad debe ser mayor a 3 caracteres.");
        }
        else{
            agregarInformacionCiudad();
            if(modelo.getListaCiudades().contains(ciudad)){
                JOptionPane.showMessageDialog(null, "La ciudad que desea agregar ya existe en el sistema.");
            }
            else if(noHayEventos()){
                JOptionPane.showMessageDialog(null, "Debe agregar al menos una actividad a la ciudad.");
            } else {
                modelo.agregarCiudad(ciudad);
                JOptionPane.showMessageDialog(null, "Se creo la ciudad "+ciudad.getNombre() +" satisfactoriamente.");
                padre.remove(this);
                padre.add(new PnlInicio(modelo, padre));
                padre.pack();
            }
        }
    }//GEN-LAST:event_lblGuardarMouseClicked

    private Boolean hayCamposVaciosCiudad(){
        return txtNombreCiudad.getText().isEmpty() || txtDescripcion.getText().isEmpty() || txtInformacionGeneral.getText().isEmpty();
    }
    
    private Boolean noHayEventos(){
        return ciudad.getActividades().isEmpty() && ciudad.getAlojamientos().isEmpty() && ciudad.getEstGastronomicos().isEmpty();
    }
    
    private void agregarInformacionCiudad(){
        ciudad.setNombre(txtNombreCiudad.getText());
        ciudad.setDescripcion(txtDescripcion.getText());
        ciudad.setInfoGral(txtInformacionGeneral.getText());
    }
    
    private void lblGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseEntered
        lblGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnGuardarONN.png")));
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        lblGuardar.setCursor(cursor);
    }//GEN-LAST:event_lblGuardarMouseEntered

    private void lblGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseExited
        lblGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnGuardar.png")));
    }//GEN-LAST:event_lblGuardarMouseExited

    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
        padre.remove(this);
        padre.add(new PnlInicio(modelo, padre));
        padre.pack();
    }//GEN-LAST:event_lblHomeMouseClicked

    private void lblHomeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseMoved
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        lblHome.setCursor(cursor);
    }//GEN-LAST:event_lblHomeMouseMoved

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        padre.remove(this);
        padre.add(new PnlInicio(modelo,padre));
        padre.pack();
    }//GEN-LAST:event_lblVolverMouseClicked

    private void lblVolverMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseMoved
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        lblVolver.setCursor(cursor);
    }//GEN-LAST:event_lblVolverMouseMoved

    private void lblAgregarActividadMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarActividadMouseMoved
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        lblAgregarActividad.setCursor(cursor);
    }//GEN-LAST:event_lblAgregarActividadMouseMoved

    private void lblAgregarActividadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarActividadMouseClicked
        if(hayCamposVaciosDeActividad()){
            JOptionPane.showMessageDialog(null, "Debe indicar el nombre de la actividad, ubicación, categoria y un detalle de la misma.");
        }
        else{
            TipoCA tipoDeActividad = obtenerActividad();
            
            if(tipoDeActividad == null){
                JOptionPane.showMessageDialog(null, "Debe seleccionar un Tipo de actividad");
            } else {
                ComercioActividad actividadCiudad = new ComercioActividad(txtNombreActividad.getText(),txtDetalles.getText(),
                tipoDeActividad,txtCategoria.getText(),txtHorario.getText(),txtUbicacion.getText(),txtTelefono.getText(),
                txtWeb.getText(),txtPrecio.getText());
                ciudad.agregarComercioActividad(tipoDeActividad, actividadCiudad);
                JOptionPane.showMessageDialog(null, "Se ha agregado la actividad "+actividadCiudad.getNombre()+" satisfactoriamente.");
                limpiarCampos();
            }
        }
    }//GEN-LAST:event_lblAgregarActividadMouseClicked

    private TipoCA obtenerActividad(){
        TipoCA tipoDeActividad = null;
        if(jRadioAlojamiento.isSelected()){
                tipoDeActividad = TipoCA.alojamiento;
        } else if(jRadioActividad.isSelected()){
                tipoDeActividad = TipoCA.actividad;
        } else if(jRadioGastronomia.isSelected()){
                tipoDeActividad = TipoCA.estGastronomico;
        }
        return tipoDeActividad;
    }
    
    private void limpiarCampos(){
        txtCategoria.setText("");
        txtNombreActividad.setText("");
        txtPrecio.setText("");
        txtWeb.setText("");
        txtUbicacion.setText("");
        txtDetalles.setText("");
        txtTelefono.setText("");
        txtHorario.setText("");
    }
    
    private void txtNombreCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCiudadKeyTyped
        int cantidadLetrasPermitidas = 30;
        if(txtNombreCiudad.getText().length() >cantidadLetrasPermitidas){
            JOptionPane.showMessageDialog(null, "El nombre de la ciudad puede tener hasta 30 caracteres.");
        }
    }//GEN-LAST:event_txtNombreCiudadKeyTyped

    private void txtNombreActividadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreActividadKeyTyped
        int cantidadLetrasPermitidas = 40;
        if(txtNombreActividad.getText().length() >cantidadLetrasPermitidas){
            JOptionPane.showMessageDialog(null, "El nombre de la actividad puede tener hasta 40 caracteres.");
        }
    }//GEN-LAST:event_txtNombreActividadKeyTyped

    private void txtHorarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHorarioKeyTyped
        int cantidadLetrasPermitidas = 30;
        if(txtHorario.getText().length() >cantidadLetrasPermitidas){
            JOptionPane.showMessageDialog(null, "El horario puede tener hasta 30 caracteres.");
        }
    }//GEN-LAST:event_txtHorarioKeyTyped

    private void txtCategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoriaKeyTyped
        int cantidadLetrasPermitidas = 30;
        if(txtCategoria.getText().length() >cantidadLetrasPermitidas){
            JOptionPane.showMessageDialog(null, "La categoria puede tener hasta 30 caracteres.");
        }
    }//GEN-LAST:event_txtCategoriaKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        int cantidadLetrasPermitidas = 30;
        if(txtTelefono.getText().length() >cantidadLetrasPermitidas){
            JOptionPane.showMessageDialog(null, "El teléfono puede tener hasta 30 caracteres.");
        }

    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtUbicacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUbicacionKeyTyped
        int cantidadLetrasPermitidas = 40;
        if(txtUbicacion.getText().length() >cantidadLetrasPermitidas){
            JOptionPane.showMessageDialog(null, "La ubicacion puede tener hasta 40 caracteres.");
        }
    }//GEN-LAST:event_txtUbicacionKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        int cantidadLetrasPermitidas = 30;
        if(txtPrecio.getText().length() >cantidadLetrasPermitidas){
            JOptionPane.showMessageDialog(null, "El precio puede tener hasta 30 caracteres.");
        }
    }//GEN-LAST:event_txtPrecioKeyTyped
    
    private boolean hayCamposVaciosDeActividad() {
        return txtCategoria.getText().isEmpty() || txtNombreActividad.getText().isEmpty() || txtUbicacion.getText().isEmpty()
               || txtDetalles.getText().isEmpty();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioActividad;
    private javax.swing.JRadioButton jRadioAlojamiento;
    private javax.swing.JRadioButton jRadioGastronomia;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAgregarActividad;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNombreCiudad;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextArea txtDetalles;
    private javax.swing.JTextField txtHorario;
    private javax.swing.JTextArea txtInformacionGeneral;
    private javax.swing.JTextField txtNombreActividad;
    private javax.swing.JTextField txtNombreCiudad;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUbicacion;
    private javax.swing.JTextField txtWeb;
    // End of variables declaration//GEN-END:variables
}
