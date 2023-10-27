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


        this.setImage("/inmobiliaria23/recursos/FondoMadera.jpg");

        this.setImage("/inmobiliaria23/recursos/Image20231020111953.jpg");

        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        cargarCabecera();
        cargarTabla();
        cargarCombo();

    }
    private PropiedadInmuebleData inmuData = new PropiedadInmuebleData();
    private PropiedadInmueble propiedadActual = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextID = new javax.swing.JTextField();
        Titulo = new javax.swing.JLabel();
        DatosInquilinos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextPropietario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextZona = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextDireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextSuperficie = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
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
        jLabel4 = new javax.swing.JLabel();
        jTextAccesibilidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextPrecioBase = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextDisponibilidad = new javax.swing.JTextField();
        jCBestado = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jPanelImagen = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        NombrePropietario = new javax.swing.JLabel();
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

        jLabel1.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel1.setText("ID:");
        DatosInquilinos.add(jLabel1);

        jTextId.setEditable(false);
        jTextId.setBackground(new java.awt.Color(236, 226, 200));
        jTextId.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextId.setForeground(new java.awt.Color(51, 51, 51));
        jTextId.setText(" ");
        jTextId.setBorder(null);
        jTextId.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos.add(jTextId);

        jLabel6.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel6.setText("ID PROPIETARIO:");
        DatosInquilinos.add(jLabel6);

        jTextPropietario.setBackground(new java.awt.Color(236, 226, 200));
        jTextPropietario.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextPropietario.setForeground(new java.awt.Color(51, 51, 51));
        jTextPropietario.setText(" ");
        jTextPropietario.setBorder(null);
        jTextPropietario.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos.add(jTextPropietario);

        jLabel3.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel3.setText("Zona:");
        DatosInquilinos.add(jLabel3);

        jTextZona.setBackground(new java.awt.Color(236, 226, 200));
        jTextZona.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextZona.setForeground(new java.awt.Color(51, 51, 51));
        jTextZona.setText(" ");
        jTextZona.setBorder(null);
        jTextZona.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos.add(jTextZona);

        jLabel2.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel2.setText("Dirección:");
        DatosInquilinos.add(jLabel2);

        jTextDireccion.setBackground(new java.awt.Color(236, 226, 200));
        jTextDireccion.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextDireccion.setForeground(new java.awt.Color(51, 51, 51));
        jTextDireccion.setText(" ");
        jTextDireccion.setBorder(null);
        jTextDireccion.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos.add(jTextDireccion);

        jLabel7.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel7.setText("Superficie:");
        DatosInquilinos.add(jLabel7);

        jTextSuperficie.setBackground(new java.awt.Color(236, 226, 200));
        jTextSuperficie.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextSuperficie.setForeground(new java.awt.Color(51, 51, 51));
        jTextSuperficie.setText(" ");
        jTextSuperficie.setBorder(null);
        jTextSuperficie.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos.add(jTextSuperficie);

        jLabel9.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel9.setText("Características:");
        DatosInquilinos.add(jLabel9);

        jTextAreaCaracteristicas.setBackground(new java.awt.Color(236, 226, 200));
        jTextAreaCaracteristicas.setColumns(20);
        jTextAreaCaracteristicas.setRows(5);
        jTextAreaCaracteristicas.setBorder(null);
        jTextAreaCaracteristicas.setPreferredSize(new java.awt.Dimension(45, 90));
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

        jLabel4.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel4.setText("Accesibilidad:");
        jPanel2.add(jLabel4);

        jTextAccesibilidad.setBackground(new java.awt.Color(236, 226, 200));
        jTextAccesibilidad.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextAccesibilidad.setForeground(new java.awt.Color(51, 51, 51));
        jTextAccesibilidad.setText(" ");
        jTextAccesibilidad.setBorder(null);
        jTextAccesibilidad.setPreferredSize(new java.awt.Dimension(165, 30));
        jPanel2.add(jTextAccesibilidad);

        jLabel8.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel8.setText("Precio Base:");
        jPanel2.add(jLabel8);

        jTextPrecioBase.setBackground(new java.awt.Color(236, 226, 200));
        jTextPrecioBase.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextPrecioBase.setForeground(new java.awt.Color(51, 51, 51));
        jTextPrecioBase.setText(" ");
        jTextPrecioBase.setBorder(null);
        jTextPrecioBase.setPreferredSize(new java.awt.Dimension(165, 30));
        jPanel2.add(jTextPrecioBase);

        jLabel5.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel5.setText("Disponibildad:");
        jPanel2.add(jLabel5);

        jTextDisponibilidad.setEditable(false);
        jTextDisponibilidad.setBackground(new java.awt.Color(236, 226, 200));
        jTextDisponibilidad.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextDisponibilidad.setForeground(new java.awt.Color(51, 51, 51));
        jTextDisponibilidad.setText(" ");
        jTextDisponibilidad.setBorder(null);
        jTextDisponibilidad.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel2.add(jTextDisponibilidad);
        jPanel2.add(jCBestado);

        jLabel10.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel10.setText("Tipo:");
        jPanel2.add(jLabel10);

        jComboBoxTipo.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));
        jComboBoxTipo.setBorder(null);
        jComboBoxTipo.setPreferredSize(new java.awt.Dimension(100, 35));
        jPanel2.add(jComboBoxTipo);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 190, 330));

        jPanelImagen.setBackground(new java.awt.Color(236, 226, 200));
        jPanelImagen.setFont(new java.awt.Font("Roboto Cn", 0, 12)); // NOI18N
        jPanelImagen.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 10));
        getContentPane().add(jPanelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 460, 150));

        jLabel11.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel11.setText("Imagen Inmueble:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, -1));

        NombrePropietario.setFont(new java.awt.Font("Roboto Cn", 1, 12)); // NOI18N
        NombrePropietario.setText("Del propietario de: Fulano de tal");
        getContentPane().add(NombrePropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, -1, -1));

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
        jScrollPane2.setViewportView(jTableInmuebles);

        jScrollPane3.setViewportView(jScrollPane2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 460, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAñadirActionPerformed
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DatosInquilinos;
    private javax.swing.JLabel NombrePropietario;
    private javax.swing.JLabel Titulo;
    private inmobiliaria23.entidades.BotonAzul botonAzul1;
    private inmobiliaria23.entidades.BotonVerde botonVerde1;
    private javax.swing.JCheckBox jCBestado;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelImagen;
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
        //PropiedadInmuebleData inmuData = new PropiedadInmuebleData();
        //PropiedadInmueble propiedad = new PropiedadInmueble();

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
