package inmobiliaria23.vistas;

import inmobiliaria23.accesoAdatos.InquilinoData;
import inmobiliaria23.accesoAdatos.PropiedadInmuebleData;
import inmobiliaria23.accesoAdatos.PropietarioData;
import inmobiliaria23.entidades.Inquilino;
import inmobiliaria23.entidades.InternaljFrameImagen;
import inmobiliaria23.entidades.PropiedadInmueble;
import inmobiliaria23.entidades.Propietario;
import inmobiliaria23.entidades.Tipo;
import inmobiliaria23.entidades.panelesImagenes;
import java.awt.Font;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class registroInmueble extends InternaljFrameImagen {

    private panelesImagenes pi = new panelesImagenes();
    private DefaultTableModel modelo;
//    private PropiedadInmuebleData inmuData=new PropiedadInmuebleData();
//    private PropiedadInmueble propiedad=new PropiedadInmueble();
//    private PropietarioData propData=new PropietarioData();
//    private Propietario prop=new Propietario();

    public registroInmueble() {
        initComponents();
        modelo = new DefaultTableModel();
        this.setSize(1024, 770);
        this.setImage("/inmobiliaria23/recursos/Image20231020111953.jpg");
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        cargarCabecera();
        cargarTabla();
        cargarCombo();

    }
    private PropiedadInmuebleData inmuData = new PropiedadInmuebleData();
    private PropiedadInmueble propiedadActual = new PropiedadInmueble();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextID = new javax.swing.JTextField();
        Titulo = new javax.swing.JLabel();
        DatosInquilinos = new javax.swing.JPanel();
        jLabelId = new javax.swing.JLabel();
        jTextId = new javax.swing.JTextField();
        jLabelIdPropietario = new javax.swing.JLabel();
        jTextPropietario = new javax.swing.JTextField();
        jLabelZona = new javax.swing.JLabel();
        jTextZona = new javax.swing.JTextField();
        jLabelDirecc = new javax.swing.JLabel();
        jTextDireccion = new javax.swing.JTextField();
        jLabelSuperf = new javax.swing.JLabel();
        jTextSuperficie = new javax.swing.JTextField();
        jLabelCaract = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaCaracteristicas = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jbtnAñadir = new inmobiliaria23.entidades.BotonNegro();
        jbModificar = new inmobiliaria23.entidades.BotonNegro();
        jbLimpiar1 = new inmobiliaria23.entidades.BotonNegro();
        jbBuscar = new inmobiliaria23.entidades.BotonNegro();
        jbEliminar = new inmobiliaria23.entidades.BotonRojo();
        botonVerde1 = new inmobiliaria23.entidades.BotonVerde();
        botonAzul1 = new inmobiliaria23.entidades.BotonAzul();
        jPanel2 = new javax.swing.JPanel();
        jLabelAccesibilidad = new javax.swing.JLabel();
        jTextAccesibilidad = new javax.swing.JTextField();
        jLabelPrecio = new javax.swing.JLabel();
        jTextPrecioBase = new javax.swing.JTextField();
        jLabelDisponib = new javax.swing.JLabel();
        jTextDisponibilidad = new javax.swing.JTextField();
        jCBestado = new javax.swing.JCheckBox();
        jLabelTipo = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableInmuebles = new javax.swing.JTable();

        jTextID.setBackground(new java.awt.Color(236, 226, 200));
        jTextID.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextID.setForeground(new java.awt.Color(51, 51, 51));
        jTextID.setText(" ");
        jTextID.setBorder(null);
        jTextID.setPreferredSize(new java.awt.Dimension(165, 30));

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Roboto Bk", 0, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(51, 51, 51));
        Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/inmueble-50.png"))); // NOI18N
        Titulo.setText("Registrar Inmuebles");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        DatosInquilinos.setFont(new java.awt.Font("Roboto Cn", 0, 12)); // NOI18N
        DatosInquilinos.setOpaque(false);
        DatosInquilinos.setPreferredSize(new java.awt.Dimension(500, 390));
        DatosInquilinos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabelId.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabelId.setText("ID:");
        DatosInquilinos.add(jLabelId);

        jTextId.setBackground(new java.awt.Color(236, 226, 200));
        jTextId.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jTextId.setForeground(new java.awt.Color(51, 51, 51));
        jTextId.setText(" ");
        jTextId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextId.setPreferredSize(new java.awt.Dimension(165, 30));
        jTextId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextIdKeyTyped(evt);
            }
        });
        DatosInquilinos.add(jTextId);

        jLabelIdPropietario.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabelIdPropietario.setText("ID PROPIETARIO:");
        DatosInquilinos.add(jLabelIdPropietario);

        jTextPropietario.setBackground(new java.awt.Color(236, 226, 200));
        jTextPropietario.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jTextPropietario.setForeground(new java.awt.Color(51, 51, 51));
        jTextPropietario.setText(" ");
        jTextPropietario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextPropietario.setPreferredSize(new java.awt.Dimension(165, 30));
        jTextPropietario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextPropietarioKeyTyped(evt);
            }
        });
        DatosInquilinos.add(jTextPropietario);

        jLabelZona.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabelZona.setText("Zona:");
        DatosInquilinos.add(jLabelZona);

        jTextZona.setBackground(new java.awt.Color(236, 226, 200));
        jTextZona.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jTextZona.setForeground(new java.awt.Color(51, 51, 51));
        jTextZona.setText(" ");
        jTextZona.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextZona.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos.add(jTextZona);

        jLabelDirecc.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabelDirecc.setText("Dirección:");
        DatosInquilinos.add(jLabelDirecc);

        jTextDireccion.setBackground(new java.awt.Color(236, 226, 200));
        jTextDireccion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jTextDireccion.setForeground(new java.awt.Color(51, 51, 51));
        jTextDireccion.setText(" ");
        jTextDireccion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextDireccion.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos.add(jTextDireccion);

        jLabelSuperf.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabelSuperf.setText("Superficie:");
        DatosInquilinos.add(jLabelSuperf);

        jTextSuperficie.setBackground(new java.awt.Color(236, 226, 200));
        jTextSuperficie.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jTextSuperficie.setForeground(new java.awt.Color(51, 51, 51));
        jTextSuperficie.setText(" ");
        jTextSuperficie.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextSuperficie.setPreferredSize(new java.awt.Dimension(165, 30));
        jTextSuperficie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextSuperficieKeyTyped(evt);
            }
        });
        DatosInquilinos.add(jTextSuperficie);

        jLabelCaract.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabelCaract.setText("Características:");
        DatosInquilinos.add(jLabelCaract);

        jTextAreaCaracteristicas.setBackground(new java.awt.Color(236, 226, 200));
        jTextAreaCaracteristicas.setColumns(20);
        jTextAreaCaracteristicas.setRows(5);
        jTextAreaCaracteristicas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPane1.setViewportView(jTextAreaCaracteristicas);

        DatosInquilinos.add(jScrollPane1);

        getContentPane().add(DatosInquilinos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 190, 480));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        jbtnAñadir.setBorder(null);
        jbtnAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/nuevo.png"))); // NOI18N
        jbtnAñadir.setText(" NUEVO");
        jbtnAñadir.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jbtnAñadir.setPreferredSize(new java.awt.Dimension(120, 30));
        jbtnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAñadirActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnAñadir);

        jbModificar.setBorder(null);
        jbModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/modificar.png"))); // NOI18N
        jbModificar.setText(" MODIFICAR");
        jbModificar.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jbModificar.setPreferredSize(new java.awt.Dimension(120, 30));
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jbModificar);

        jbLimpiar1.setBorder(null);
        jbLimpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/LimpiarCampos.png"))); // NOI18N
        jbLimpiar1.setText(" LIMPIAR");
        jbLimpiar1.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jbLimpiar1.setPreferredSize(new java.awt.Dimension(120, 30));
        jbLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbLimpiar1);

        jbBuscar.setBorder(null);
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/buscar-interna.png"))); // NOI18N
        jbBuscar.setText(" BUSCAR");
        jbBuscar.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jbBuscar.setPreferredSize(new java.awt.Dimension(120, 30));
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscar);

        jbEliminar.setBorder(null);
        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/delete.png"))); // NOI18N
        jbEliminar.setText("ELIMINAR");
        jbEliminar.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jbEliminar.setPreferredSize(new java.awt.Dimension(120, 30));
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEliminar);

        botonVerde1.setBorder(null);
        botonVerde1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/guardar.png"))); // NOI18N
        botonVerde1.setText("GUARDAR");
        botonVerde1.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        botonVerde1.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel1.add(botonVerde1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1000, 50));

        botonAzul1.setBorder(null);
        botonAzul1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/exits.png"))); // NOI18N
        botonAzul1.setText(" SALIR");
        botonAzul1.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        botonAzul1.setPreferredSize(new java.awt.Dimension(120, 30));
        botonAzul1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAzul1ActionPerformed(evt);
            }
        });
        getContentPane().add(botonAzul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 560, -1, -1));

        jPanel2.setFont(new java.awt.Font("Roboto Cn", 0, 12)); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 10));

        jLabelAccesibilidad.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabelAccesibilidad.setText("Accesibilidad:");
        jPanel2.add(jLabelAccesibilidad);

        jTextAccesibilidad.setBackground(new java.awt.Color(236, 226, 200));
        jTextAccesibilidad.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jTextAccesibilidad.setForeground(new java.awt.Color(51, 51, 51));
        jTextAccesibilidad.setText(" ");
        jTextAccesibilidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextAccesibilidad.setPreferredSize(new java.awt.Dimension(165, 30));
        jPanel2.add(jTextAccesibilidad);

        jLabelPrecio.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabelPrecio.setText("Precio Base:");
        jPanel2.add(jLabelPrecio);

        jTextPrecioBase.setBackground(new java.awt.Color(236, 226, 200));
        jTextPrecioBase.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jTextPrecioBase.setForeground(new java.awt.Color(51, 51, 51));
        jTextPrecioBase.setText(" ");
        jTextPrecioBase.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextPrecioBase.setPreferredSize(new java.awt.Dimension(165, 30));
        jTextPrecioBase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextPrecioBaseKeyTyped(evt);
            }
        });
        jPanel2.add(jTextPrecioBase);

        jLabelDisponib.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabelDisponib.setText("Disponibildad:");
        jPanel2.add(jLabelDisponib);

        jTextDisponibilidad.setEditable(false);
        jTextDisponibilidad.setBackground(new java.awt.Color(236, 226, 200));
        jTextDisponibilidad.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jTextDisponibilidad.setForeground(new java.awt.Color(51, 51, 51));
        jTextDisponibilidad.setText(" ");
        jTextDisponibilidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextDisponibilidad.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel2.add(jTextDisponibilidad);
        jPanel2.add(jCBestado);

        jLabelTipo.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabelTipo.setText("Tipo:");
        jPanel2.add(jLabelTipo);

        jComboBoxTipo.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));
        jComboBoxTipo.setBorder(null);
        jComboBoxTipo.setPreferredSize(new java.awt.Dimension(100, 35));
        jPanel2.add(jComboBoxTipo);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 190, 330));

        jLabel11.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, -1));

        jLabel12.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel12.setText("Propiedades Disponibles y su Propietario");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, -1, -1));

        jTableInmuebles.setAutoCreateRowSorter(true);
        jTableInmuebles.setBackground(new java.awt.Color(236, 226, 200));
        jTableInmuebles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableInmuebles.setFillsViewportHeight(true);
        jTableInmuebles.setPreferredSize(new java.awt.Dimension(450, 165));
        jTableInmuebles.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableInmuebles);

        jScrollPane3.setViewportView(jScrollPane2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 460, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAñadirActionPerformed
        propiedadActual = null;
        try {
            // Validación de campos numéricos
            if (!validarCampoNumerico(jTextPropietario)
                    || !validarCampoNumerico(jTextSuperficie)
                    || !validarCampoNumerico(jTextPrecioBase)) {
                return; // Sal del método si hay un campo no válido
            }
            // Validación de campos vacíos o selección no válida en el JComboBox
            if (jTextPropietario.getText().isEmpty()
                    || ((String) jComboBoxTipo.getSelectedItem()).equalsIgnoreCase("Seleccionar")
                    || jTextZona.getText().isEmpty()
                    || jTextDireccion.getText().isEmpty()
                    || jTextSuperficie.getText().isEmpty()
                    || jTextAreaCaracteristicas.getText().isEmpty()
                    || jTextAccesibilidad.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor complete todos los campos");
                return; // Sal del método si algún campo está vacío o no válido
            }
            // Crear una instancia de Propietario con el id
            int idPropietario = Integer.parseInt(jTextPropietario.getText());
            PropietarioData propData = new PropietarioData();
            Propietario propietario = propData.buscarPropietarioPorId(idPropietario);
            if (propietario == null) {

                //JOptionPane.showMessageDialog(this, "Error");
                return; // Sal del método si el propietario no existe

            }
            // Crear la instancia de PropiedadInmueble
            propiedadActual = new PropiedadInmueble(
                    propietario,
                    (String) jComboBoxTipo.getSelectedItem(),
                    jTextZona.getText(),
                    jTextDireccion.getText(),
                    Integer.parseInt(jTextSuperficie.getText().trim()),
                    jTextAreaCaracteristicas.getText(),
                    jTextAccesibilidad.getText(),
                    Float.parseFloat(jTextPrecioBase.getText().trim()),
                    jCBestado.isSelected()
            );

            // Agregar la propiedad inmueble
            inmuData.altaInmueble(propiedadActual);
            limpiarCampos();

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "ERROR: " + nfe.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

    public boolean validarCampoNumerico(JTextField textfield) {
        if (textfield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            textfield.requestFocus();
            return false;
        } else if (!textfield.getText().matches("^[0-9]+$")) {
            JOptionPane.showMessageDialog(null, "El campo solo puede contener números.", "Error", JOptionPane.ERROR_MESSAGE);
            textfield.setText("");
            textfield.requestFocus();
            return false;
        }
        return true;

    }//GEN-LAST:event_jbtnAñadirActionPerformed

    private void botonAzul1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAzul1ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_botonAzul1ActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        if (propiedadActual != null) {
            inmuData.bajaInmueble(propiedadActual.getIdInmueble());
            propiedadActual = null;
            limpiarCampos();

        } else {
            JOptionPane.showMessageDialog(this, "No hay un inmueble seleccionado para eliminar");
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiar1ActionPerformed
        jTextPropietario.setText("");
        jTextId.setText("");
        jComboBoxTipo.setSelectedItem(0);
        jTextZona.setText("");
        jTextDireccion.setText("");
        jTextSuperficie.setText("");
        jTextAreaCaracteristicas.setText("");
        jTextAccesibilidad.setText("");
        jTextPrecioBase.setText("");
        jCBestado.setSelected(false);

    }//GEN-LAST:event_jbLimpiar1ActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
       
        try {
            if (jTextPropietario.getText().isEmpty()
                    || jTextZona.getText().isEmpty()
                    || jTextDireccion.getText().isEmpty()
                    || jTextSuperficie.getText().isEmpty()
                    || jTextAreaCaracteristicas.getText().isEmpty()
                    || jTextAccesibilidad.getText().isEmpty()
                    || jTextPrecioBase.getText().isEmpty()
                    || !jCBestado.isSelected()
                    || ((String) jComboBoxTipo.getSelectedItem()).equalsIgnoreCase("Seleccionar")) {

                JOptionPane.showMessageDialog(this, "Por favor complete todos los campos");
                System.out.println(propiedadActual);
                System.out.println("***");
                return;
            }

            int idPropietario = Integer.parseInt(jTextPropietario.getText());
            PropietarioData propData = new PropietarioData();
            Propietario propietario = propData.buscarPropietarioPorId(idPropietario);
            System.out.println("Entro??");
            if (propietario != null) {
                propiedadActual.getIdInmueble();
                propiedadActual.setPropietario(propietario);
                propiedadActual.setZona(jTextZona.getText());
                propiedadActual.setDireccion(jTextDireccion.getText());
                propiedadActual.setSuperficie(Integer.parseInt(jTextSuperficie.getText()));
                propiedadActual.setCaracteristicas(jTextAreaCaracteristicas.getText());
                propiedadActual.setAccesibilidad(jTextAccesibilidad.getText());
                propiedadActual.setPrecioTasado(Float.parseFloat(jTextPrecioBase.getText()));
               
                if (propiedadActual != null) {
                    inmuData.modificarInmueble(propiedadActual);
                  
                    inmuData.modificarInmueble(propiedadActual);
                    System.out.println(propiedadActual);
                    System.out.println("modificada");
                }
                limpiarCampos();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error" + ex.getMessage());
        }


    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        try {

            Integer ID = Integer.parseInt(jTextId.getText().trim());
            propiedadActual = inmuData.buscarInmuebleXid(ID);
            //System.out.println(propiedadActual);
            if (propiedadActual != null) {
                jTextPropietario.setText(String.valueOf(propiedadActual.getPropietario().getId_propietario()));
                jComboBoxTipo.setSelectedItem((String) propiedadActual.getTipoDeLocal());
                jTextZona.setText(propiedadActual.getZona());
                jTextDireccion.setText(propiedadActual.getDireccion());
                jTextSuperficie.setText(String.valueOf(propiedadActual.getSuperficie()));
                jTextAreaCaracteristicas.setText(propiedadActual.getCaracteristicas());
                jTextAccesibilidad.setText(propiedadActual.getAccesibilidad());
                jTextPrecioBase.setText(String.valueOf(propiedadActual.getPrecioTasado()));
                jCBestado.setSelected(propiedadActual.getEstado());
                jTextDisponibilidad.setText(propiedadActual.getEstado() ? "ACTIVO" : "INACTIVO");

            } else {
                JOptionPane.showMessageDialog(null, "No se encontro una propiedad con ese ID");
                limpiarCampos();
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "ERROR, debe ingresar un numero de ID valido");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR" + e.getMessage());
        }

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jTextIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextIdKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Por favor, ingrese un ID tipo Numero");
        }
    }//GEN-LAST:event_jTextIdKeyTyped

    private void jTextPropietarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPropietarioKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Por favor, ingrese un ID tipo Numero");
        }
    }//GEN-LAST:event_jTextPropietarioKeyTyped

    private void jTextSuperficieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextSuperficieKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Por favor, ingrese un ID tipo Numero");
        }
    }//GEN-LAST:event_jTextSuperficieKeyTyped

    private void jTextPrecioBaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPrecioBaseKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Por favor, ingrese un precio en numeros");
        }
    }//GEN-LAST:event_jTextPrecioBaseKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DatosInquilinos;
    private javax.swing.JLabel Titulo;
    private inmobiliaria23.entidades.BotonAzul botonAzul1;
    private inmobiliaria23.entidades.BotonVerde botonVerde1;
    private javax.swing.JCheckBox jCBestado;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabelAccesibilidad;
    private javax.swing.JLabel jLabelCaract;
    private javax.swing.JLabel jLabelDirecc;
    private javax.swing.JLabel jLabelDisponib;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelIdPropietario;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelSuperf;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelZona;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableInmuebles;
    private javax.swing.JTextField jTextAccesibilidad;
    private javax.swing.JTextArea jTextAreaCaracteristicas;
    private javax.swing.JTextField jTextDireccion;
    private javax.swing.JTextField jTextDisponibilidad;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextId;
    private javax.swing.JTextField jTextPrecioBase;
    private javax.swing.JTextField jTextPropietario;
    private javax.swing.JTextField jTextSuperficie;
    private javax.swing.JTextField jTextZona;
    private inmobiliaria23.entidades.BotonNegro jbBuscar;
    private inmobiliaria23.entidades.BotonRojo jbEliminar;
    private inmobiliaria23.entidades.BotonNegro jbLimpiar1;
    private inmobiliaria23.entidades.BotonNegro jbModificar;
    private inmobiliaria23.entidades.BotonNegro jbtnAñadir;
    // End of variables declaration//GEN-END:variables
private void cargarTabla() {
        
        List<PropiedadInmueble> listaInmuebles;
        boolean estado = true;

        listaInmuebles = inmuData.listarInmueblesDisponiblesYsuDueño(estado);
        for (PropiedadInmueble inmueble : listaInmuebles) {
            PropietarioData propData = new PropietarioData();
            Propietario prop = propData.buscarPropietarioPorId(inmueble.getPropietario().getId_propietario());
            modelo.addRow(new Object[]{
                inmueble.getIdInmueble(),
                inmueble.getDireccion(),
                inmueble.getZona(),
                inmueble.getSuperficie(),
                inmueble.getPrecioTasado(),
                prop.getId_propietario(),
                prop.getApellido(),
                prop.getNombre()});
        }
    }

    private void cargarCabecera() {
        modelo.addColumn("IdInmueble");
        modelo.addColumn("Dirección");
        modelo.addColumn("Zona");
        modelo.addColumn("Superficie");
        modelo.addColumn("Precio");
        modelo.addColumn("IdPropietario");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        jTableInmuebles.setModel(modelo);
        JTableHeader tableHeader = jTableInmuebles.getTableHeader();
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) tableHeader.getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        Font headerFont = new Font("Roboto Cn", Font.BOLD, 12);
        headerRenderer.setFont(headerFont);
    }

    private void cargarCombo() {

        for (Tipo tipo : Tipo.values()) {
            jComboBoxTipo.addItem(tipo.name());
        }
    }

    private void limpiarCampos() {
        jTextPropietario.setText("");
        jTextId.setText("");
        jComboBoxTipo.setSelectedItem(0);
        jTextZona.setText("");
        jTextDireccion.setText("");
        jTextSuperficie.setText("");
        jTextAreaCaracteristicas.setText("");
        jTextAccesibilidad.setText("");
        jTextPrecioBase.setText("");
        jCBestado.setSelected(false);
    }
}
