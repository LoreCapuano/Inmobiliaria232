package inmobiliaria23.vistas;

import inmobiliaria23.accesoAdatos.PropiedadInmuebleData;
import inmobiliaria23.accesoAdatos.PropietarioData;
import inmobiliaria23.entidades.InternaljFrameImagen;
import inmobiliaria23.entidades.*;
import inmobiliaria23.entidades.panelesImagenes;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Administrador
 */
public class registroPropietario extends InternaljFrameImagen {
    
    private panelesImagenes pi = new panelesImagenes();
    
   private DefaultTableModel modelo = new DefaultTableModel();
   private DefaultTableModel modelo2= new DefaultTableModel();
    public boolean isCellEditable(int f, int c){
       return false;
    }
    
    public registroPropietario() {
        initComponents();
        modelo2 = (DefaultTableModel) jTablePropiedad.getModel();
        this.setSize(1024, 770);
        
        this.setImage("/inmobiliaria23/recursos/Image20231020111953.jpg");
        jTablePropietario.getTableHeader().setFont(new Font("Roboto CD", Font.BOLD, 12));
        jTablePropietario.getTableHeader().setOpaque(false);
        jTablePropietario.getTableHeader().setBackground(new Color(32, 136, 203));
        jTablePropietario.getTableHeader().setForeground(new Color(255, 255, 255));
        jTablePropietario.setRowHeight(25);
        
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        armarCabeceraPropietario();
        cargarListaPropietarios();
    }

    // Método para cargar datos de propietario a la jtPropietario
    //private PropietarioData propietaData = new PropietarioData();
    private Propietario propietarioActual = null;  
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextID = new javax.swing.JTextField();
        Titulo = new javax.swing.JLabel();
        DatosInquilinos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextDni = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextApellido = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextTelefonos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextDomicilio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jbNuevo = new inmobiliaria23.entidades.BotonNegro();
        jbModificar = new inmobiliaria23.entidades.BotonNegro();
        jbLimpiar = new inmobiliaria23.entidades.BotonNegro();
        jbActualizar = new inmobiliaria23.entidades.BotonNegro();
        jbEliminar = new inmobiliaria23.entidades.BotonRojo();
        jbGuardar = new inmobiliaria23.entidades.BotonVerde();
        jPanel2 = new javax.swing.JPanel();
        jbSalir = new inmobiliaria23.entidades.BotonAzul();
        jButtonBuscarXdni = new inmobiliaria23.entidades.BotonNegro();
        jButtonBuscarXid1 = new inmobiliaria23.entidades.BotonNegro();
        jLabel6 = new javax.swing.JLabel();
        jCBestado = new javax.swing.JRadioButton();
        jLabelEstado = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTablePropiedad = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePropietario = new javax.swing.JTable();

        jTextID.setBackground(new java.awt.Color(236, 226, 200));
        jTextID.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextID.setForeground(new java.awt.Color(51, 51, 51));
        jTextID.setText(" ");
        jTextID.setBorder(null);
        jTextID.setPreferredSize(new java.awt.Dimension(165, 30));

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setMaximizable(true);
        setResizable(true);
        setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        setPreferredSize(new java.awt.Dimension(120, 30));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Roboto Bk", 0, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(51, 51, 51));
        Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/propietario-50.png"))); // NOI18N
        Titulo.setText("Registrar Propietario");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        DatosInquilinos.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        DatosInquilinos.setOpaque(false);
        DatosInquilinos.setPreferredSize(new java.awt.Dimension(500, 390));
        DatosInquilinos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel1.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel1.setText("ID:");
        DatosInquilinos.add(jLabel1);

        jTextId.setBackground(new java.awt.Color(236, 226, 200));
        jTextId.setFont(new java.awt.Font("Roboto Cn", 1, 14)); // NOI18N
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

        jLabel2.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel2.setText("DNI:");
        DatosInquilinos.add(jLabel2);

        jTextDni.setBackground(new java.awt.Color(236, 226, 200));
        jTextDni.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextDni.setForeground(new java.awt.Color(51, 51, 51));
        jTextDni.setText(" ");
        jTextDni.setBorder(null);
        jTextDni.setPreferredSize(new java.awt.Dimension(165, 30));
        jTextDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextDniKeyTyped(evt);
            }
        });
        DatosInquilinos.add(jTextDni);

        jLabel3.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel3.setText("Apellido:");
        DatosInquilinos.add(jLabel3);

        jTextApellido.setBackground(new java.awt.Color(236, 226, 200));
        jTextApellido.setFont(new java.awt.Font("Roboto Cn", 1, 14)); // NOI18N
        jTextApellido.setForeground(new java.awt.Color(51, 51, 51));
        jTextApellido.setText(" ");
        jTextApellido.setBorder(null);
        jTextApellido.setPreferredSize(new java.awt.Dimension(165, 30));
        jTextApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextApellidoKeyTyped(evt);
            }
        });
        DatosInquilinos.add(jTextApellido);

        jLabel9.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel9.setText("Nombre :");
        DatosInquilinos.add(jLabel9);

        jTextNombre.setBackground(new java.awt.Color(236, 226, 200));
        jTextNombre.setFont(new java.awt.Font("Roboto Cn", 1, 14)); // NOI18N
        jTextNombre.setForeground(new java.awt.Color(51, 51, 51));
        jTextNombre.setText(" ");
        jTextNombre.setBorder(null);
        jTextNombre.setPreferredSize(new java.awt.Dimension(165, 30));
        jTextNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNombreKeyTyped(evt);
            }
        });
        DatosInquilinos.add(jTextNombre);

        jLabel5.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel5.setText("Teléfonos:");
        DatosInquilinos.add(jLabel5);

        jTextTelefonos.setBackground(new java.awt.Color(236, 226, 200));
        jTextTelefonos.setFont(new java.awt.Font("Roboto Cn", 1, 14)); // NOI18N
        jTextTelefonos.setForeground(new java.awt.Color(51, 51, 51));
        jTextTelefonos.setText(" ");
        jTextTelefonos.setBorder(null);
        jTextTelefonos.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos.add(jTextTelefonos);

        jLabel4.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel4.setText("Domicilio Real:");
        DatosInquilinos.add(jLabel4);

        jTextDomicilio.setBackground(new java.awt.Color(236, 226, 200));
        jTextDomicilio.setFont(new java.awt.Font("Roboto Cn", 1, 14)); // NOI18N
        jTextDomicilio.setForeground(new java.awt.Color(51, 51, 51));
        jTextDomicilio.setText(" ");
        jTextDomicilio.setBorder(null);
        jTextDomicilio.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos.add(jTextDomicilio);

        getContentPane().add(DatosInquilinos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 180, 390));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel7.setText("Datos del Propietario");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel8.setText("Listados de Propietarios");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        jbNuevo.setBorder(null);
        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/nuevo.png"))); // NOI18N
        jbNuevo.setText(" NUEVO");
        jbNuevo.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jbNuevo.setPreferredSize(new java.awt.Dimension(120, 30));
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jbNuevo);

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

        jbLimpiar.setBorder(null);
        jbLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/LimpiarCampos.png"))); // NOI18N
        jbLimpiar.setText(" LIMPIAR");
        jbLimpiar.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jbLimpiar.setPreferredSize(new java.awt.Dimension(120, 30));
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jbLimpiar);

        jbActualizar.setBorder(null);
        jbActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/modificar_1.png"))); // NOI18N
        jbActualizar.setText("ACTUALIZAR");
        jbActualizar.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jbActualizar.setPreferredSize(new java.awt.Dimension(120, 30));
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jbActualizar);

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

        jbGuardar.setBorder(null);
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/guardar.png"))); // NOI18N
        jbGuardar.setText("GUARDAR");
        jbGuardar.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jbGuardar.setPreferredSize(new java.awt.Dimension(120, 30));
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbGuardar);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1000, 50));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 10));

        jbSalir.setBorder(null);
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/exits.png"))); // NOI18N
        jbSalir.setText(" SALIR");
        jbSalir.setFocusable(false);
        jbSalir.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jbSalir.setPreferredSize(new java.awt.Dimension(120, 30));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel2.add(jbSalir);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, 340, 50));

        jButtonBuscarXdni.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jButtonBuscarXdni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/vistas/LupaInmobiliaria.png"))); // NOI18N
        jButtonBuscarXdni.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonBuscarXdni.setPreferredSize(new java.awt.Dimension(30, 30));
        jButtonBuscarXdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarXdniActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarXdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 40, 40));

        jButtonBuscarXid1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jButtonBuscarXid1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/vistas/LupaInmobiliaria.png"))); // NOI18N
        jButtonBuscarXid1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonBuscarXid1.setPreferredSize(new java.awt.Dimension(30, 30));
        jButtonBuscarXid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarXid1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarXid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 40, 40));

        jLabel6.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel6.setText("Estado:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, -1, -1));
        getContentPane().add(jCBestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 590, -1, -1));

        jLabelEstado.setFont(new java.awt.Font("Roboto Black", 1, 11)); // NOI18N
        jLabelEstado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(jLabelEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 590, 80, 30));

        jTablePropiedad.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        jTablePropiedad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Propiedad", "Tipo", "Zona", "Dirección", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePropiedad.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jTablePropiedad);
        if (jTablePropiedad.getColumnModel().getColumnCount() > 0) {
            jTablePropiedad.getColumnModel().getColumn(1).setResizable(false);
            jTablePropiedad.getColumnModel().getColumn(3).setResizable(false);
        }

        jScrollPane2.setViewportView(jScrollPane4);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 460, 150));

        jTablePropietario.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        jTablePropietario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTablePropietario);

        jScrollPane1.setViewportView(jScrollPane3);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 460, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
      int confirmacion = JOptionPane.showConfirmDialog(
                null,
                "¿Está seguro de que desea salir?",
                "Confirmar Salida",
                JOptionPane.YES_NO_OPTION
        );

        if (confirmacion == JOptionPane.YES_OPTION) {
            dispose(); 
        }
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jButtonBuscarXid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarXid1ActionPerformed
        try {

            int ID = Integer.parseInt(jTextId.getText().trim());
            PropietarioData propietaData = new PropietarioData();
            propietarioActual = propietaData.buscarPropietarioPorId(ID);

            if (propietarioActual != null) {
                jTextApellido.setText(propietarioActual.getApellido());
                jTextNombre.setText(propietarioActual.getNombre());
                jTextDni.setText(String.valueOf(propietarioActual.getDni()));
                jTextTelefonos.setText(String.valueOf(propietarioActual.getTel()));
                jTextDomicilio.setText(propietarioActual.getDomicilio());
                if (propietarioActual.isEstado()) {
                    jCBestado.setSelected(true);
                    jLabelEstado.setText("Activo");
                } else {
                    jCBestado.setSelected(false);
                    jLabelEstado.setText("Inactivo");
                }
                borrarDatosPropiedad();
                cargarListaPropiedad(propietarioActual);
            }
            /*else {
                JOptionPane.showMessageDialog(null, "No existe un inquilino con ese ID");
            }*/
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "ERROR, debe ingresar un numero de ID valido");
        }
    }//GEN-LAST:event_jButtonBuscarXid1ActionPerformed

    private void jButtonBuscarXdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarXdniActionPerformed
        try {

            int dni = Integer.parseInt(jTextDni.getText().trim());
            PropietarioData propietaData = new PropietarioData();
            propietarioActual = propietaData.buscarPropietarioPorDni(dni);

            if (propietarioActual != null) {
                jTextId.setText(String.valueOf(propietarioActual.getId_propietario()));
                jTextApellido.setText(propietarioActual.getApellido());
                jTextNombre.setText(propietarioActual.getNombre());
                jTextDni.setText(String.valueOf(propietarioActual.getDni()));
                jTextTelefonos.setText(String.valueOf(propietarioActual.getTel()));
                jTextDomicilio.setText(propietarioActual.getDomicilio());
                if (propietarioActual.isEstado()) {
                    jCBestado.setSelected(true);
                    jLabelEstado.setText("Activo");
                } else {
                    jCBestado.setSelected(false);
                    jLabelEstado.setText("Inactivo");
                }
                borrarDatosPropiedad();                   
                cargarListaPropiedad(propietarioActual);
            }
//            borrarDatosPropiedad();                   
//            cargarListaPropiedad(propietarioActual);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "ERROR, debe ingresar un numero de DNI valido");
        }

    }//GEN-LAST:event_jButtonBuscarXdniActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        PropietarioData propietaData=new PropietarioData();
        try {
            String dniStr = jTextDni.getText();
            String telStr = jTextTelefonos.getText();
           //int dni = Integer.parseInt(jTextDni.getText());
            //String nombre = jTnombre.getText();
            propietarioActual.getId_propietario();
            propietarioActual.setDni (Integer.parseInt (jTextDni.getText()));
            propietarioActual.setApellido(jTextApellido.getText());
            propietarioActual.setNombre(jTextNombre.getText());
            propietarioActual.setTel(Integer.parseInt (jTextTelefonos.getText()));
            propietarioActual.setDomicilio(jTextDomicilio.getText());
            propietarioActual.setEstado(jCBestado.isSelected());
            

            if (jTextId.getText().isEmpty()||jTextDni.getText().isEmpty()||jTextApellido.getText().isEmpty() 
                    || jTextNombre.getText().isEmpty()
                    ||jTextNombre.getText().isEmpty()||jTextTelefonos.getText().isEmpty()
                    ||jTextDomicilio.getText().isEmpty()||jCBestado.isSelected()) {
                JOptionPane.showMessageDialog(this, "Por favor complete todos los campos");
                return;
            }
            if (!dniStr.matches("\\d+")||!telStr.matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "El campo año debe contener solo numeros");
            }
            Integer dni = Integer.parseInt(dniStr);
            Integer telefono = Integer.parseInt (telStr);
            
            
            if (propietarioActual == null) {
               propietaData.modificarPropietario(propietarioActual);

            } else {

                propietarioActual.getId_propietario();
                propietarioActual.setDni(propietarioActual.getDni());
                propietarioActual.setApellido(propietarioActual.getApellido());
                propietarioActual.setNombre(propietarioActual.getNombre());
                propietarioActual.setTel(propietarioActual.getTel());
                propietarioActual.setDomicilio(propietarioActual.getDomicilio());
                propietarioActual.setEstado(propietarioActual.isEstado());
                
                                
                propietaData.modificarPropietario(propietarioActual);

            }
            limpiarCampos();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debes ingresar un año valido");

    }                                           
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        jTextId.setText("");
        jTextDni.setText("");
        jTextApellido.setText("");
        jTextNombre.setText("");
        jTextDomicilio.setText("");
        jTextTelefonos.setText("");
        jCBestado.setSelected(false);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
      if (propietarioActual != null) {
            PropietarioData propietaData = new PropietarioData();
            propietaData.bajaPropietario(propietarioActual.getId_propietario());
            propietarioActual = null;
            limpiarCampos();

        } else {
            JOptionPane.showMessageDialog(this, "No hay un Propietario seleccionado para eliminar");
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        PropietarioData propietaData=new PropietarioData();
        propietarioActual = new Propietario(
                jTextApellido.getText(),
                jTextNombre.getText(),
                Integer.parseInt(jTextDni.getText().trim()),
                Integer.parseInt(jTextTelefonos.getText().trim()),
                jTextDomicilio.getText(),
                jCBestado.isSelected()
        );
        try {
            if (jTextDni.getText().isEmpty() || jTextApellido.getText().isEmpty() || jTextNombre.getText().isEmpty()
                    || jTextTelefonos.getText().isEmpty() || jTextDomicilio.getText().isEmpty()||jCBestado.isSelected()) {
                JOptionPane.showMessageDialog(this, "Por favor complete todos los campos");
            } else if (propietarioActual.getDni() == -1 ||propietarioActual.getTel() == -1) {

                JOptionPane.showMessageDialog(this, "Solo puede ingresar numeros");

            } else {
                propietaData.nuevoPropietario(propietarioActual);
                limpiarCampos();
            }

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "ERROR: " + "\n error:" + nfe.getMessage());
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jTextApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextApellidoKeyTyped

        char validad = evt.getKeyChar();
        if (Character.isDigit(validad)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Solo es posible ingresar Letras");
        }


    }//GEN-LAST:event_jTextApellidoKeyTyped

    private void jTextNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreKeyTyped
       char validad = evt.getKeyChar();
        if (Character.isDigit(validad)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Solo es posible ingresar Letras");
        }
    }//GEN-LAST:event_jTextNombreKeyTyped

    private void jTextIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextIdKeyTyped
     char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Por favor, ingrese un ID tipo Numero");
        }
    }//GEN-LAST:event_jTextIdKeyTyped

    private void jTextDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDniKeyTyped
       char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Solo puede ingresar Números de documentos");
        }
    }//GEN-LAST:event_jTextDniKeyTyped

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
         borrarDatos();
        cargarListaPropietarios();
    }//GEN-LAST:event_jbActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DatosInquilinos;
    private javax.swing.JLabel Titulo;
    private inmobiliaria23.entidades.BotonNegro jButtonBuscarXdni;
    private inmobiliaria23.entidades.BotonNegro jButtonBuscarXid1;
    private javax.swing.JRadioButton jCBestado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTablePropiedad;
    private javax.swing.JTable jTablePropietario;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JTextField jTextDni;
    private javax.swing.JTextField jTextDomicilio;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextId;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextTelefonos;
    private inmobiliaria23.entidades.BotonNegro jbActualizar;
    private inmobiliaria23.entidades.BotonRojo jbEliminar;
    private inmobiliaria23.entidades.BotonVerde jbGuardar;
    private inmobiliaria23.entidades.BotonNegro jbLimpiar;
    private inmobiliaria23.entidades.BotonNegro jbModificar;
    private inmobiliaria23.entidades.BotonNegro jbNuevo;
    private inmobiliaria23.entidades.BotonAzul jbSalir;
    // End of variables declaration//GEN-END:variables

private void limpiarCampos() {
        jTextId.setText("");
        jTextDni.setText("");
        jTextApellido.setText("");
        jTextNombre.setText("");
        jTextDomicilio.setText("");
        jTextTelefonos.setText("");
        jCBestado.setSelected(false);
    }
    
    
    private void cargarListaPropietarios() {
        PropietarioData propietaData = new PropietarioData();
        ArrayList<Propietario> milista = propietaData.listarPropietarios();
        if (!milista.isEmpty()) {
            for (Propietario propietario : milista) {
                modelo.addRow(new Object[]{
                    propietario.getId_propietario(),
                    propietario.getApellido(),
                    propietario.getNombre(),
                    propietario.getDni(),
                    propietario.getTel(),
                    propietario.getDomicilio(),
                    propietario.isEstado(),});
            }
        }
    }
    
    private void cargarListaPropiedad(Propietario p) {
         
        PropiedadInmueble propiedad = new PropiedadInmueble();
        PropiedadInmuebleData inmuData = new PropiedadInmuebleData();
        Propietario propietario = new Propietario();
        List<PropiedadInmueble> listaInmuebles = inmuData.ListarInmueblesPropios(p.getId_propietario());
        System.out.println(listaInmuebles.isEmpty());
//        if (!listaInmuebles.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Lista llena");
//        } else {
//            JOptionPane.showMessageDialog(null, "Lista vacia");
//        }
        listaInmuebles.forEach(inmueble -> {
            modelo2.addRow(new Object[]{
                inmueble.getIdInmueble(),
                inmueble.getTipoDeLocal(),
                inmueble.getZona(),
                inmueble.getDireccion(),
                inmueble.getEstado(),});
        });
        
//        for (PropiedadInmueble inmueble : listaInmuebles) {
//            modelo2.addRow(new Object[]{
//                inmueble.getIdInmueble(),
//                inmueble.getTipoDeLocal(),
//                inmueble.getZona(),
//                inmueble.getDireccion(),
//                inmueble.getEstado(),});
//
//        }
    }

private void armarCabeceraPropietario() {
        modelo.addColumn("ID");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Dni");
        modelo.addColumn("Telefono");
        modelo.addColumn("Domicilio");
        modelo.addColumn("Estado");
            
        JTableHeader tableHeader = jTablePropietario.getTableHeader();
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) tableHeader.getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        Font headerFont = new Font("Roboto Cn", Font.BOLD, 12);
        headerRenderer.setFont(headerFont);
        jTablePropietario.setModel(modelo); 
       
    }

private void borrarDatos() {

        int f = jTablePropietario.getRowCount() - 1; //obtengo total de filas de la tabla

        for (; f >= 0; f--) { //recorro filas para borrar 1 por 1 en iteracion.

            modelo.removeRow(f);// remuevo valor por indice en la tabla "jcTable"
        }
    }
    
    private void borrarDatosPropiedad() {

        int f = jTablePropiedad.getRowCount() - 1; //obtengo total de filas de la tabla

        for (; f >= 0; f--) { //recorro filas para borrar 1 por 1 en iteracion.

            modelo2.removeRow(f);// remuevo valor por indice en la tabla "jcTable"
        }
    }

}




