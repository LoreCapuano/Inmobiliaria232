package inmobiliaria23.vistas;

import inmobiliaria23.accesoAdatos.PropietarioData;
import inmobiliaria23.entidades.InternaljFrameImagen;
import inmobiliaria23.entidades.Propietario;
import inmobiliaria23.entidades.panelesImagenes;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class registroPropietario extends InternaljFrameImagen {
    
    private panelesImagenes pi = new panelesImagenes();
    
    private DefaultTableModel modelo;
    public boolean isCellEditable(int f, int c){
        return false;
    }
    
    public registroPropietario() {
        initComponents();
        this.setSize(1024, 770);
        
        this.setImage("/inmobiliaria23/recursos/Image20231020111953.jpg");
//        jTablePropietario.getTableHeader().setFont(new Font("Roboto CD", Font.BOLD, 12));
//        jTablePropietario.getTableHeader().setOpaque(false);
//        jTablePropietario.getTableHeader().setBackground(new Color(32, 136, 203));
//        jTablePropietario.getTableHeader().setForeground(new Color(255, 255, 255));
//        jTablePropietario.setRowHeight(25);
        
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        armarCabecera();
        cargarListaPropietarios();
    }

    // Método para cargar datos de propietario a la jtPropietario
    private PropietarioData propietaData = new PropietarioData();
    private Propietario propietarioActual = null;

        
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextID = new javax.swing.JTextField();
        Titulo = new javax.swing.JLabel();
        DatosInquilinos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextIdPro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextDniPro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextCuitPro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanelDatosGarante = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePropietario = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jbNuevo = new inmobiliaria23.entidades.BotonNegro();
        jbModificar = new inmobiliaria23.entidades.BotonNegro();
        jbLimpiar = new inmobiliaria23.entidades.BotonNegro();
        jbBuscar = new inmobiliaria23.entidades.BotonNegro();
        jbEliminar = new inmobiliaria23.entidades.BotonRojo();
        jbGuardar = new inmobiliaria23.entidades.BotonVerde();
        jPanel2 = new javax.swing.JPanel();
        btnInmuebles = new inmobiliaria23.entidades.BotonNaranja();
        jbSalir = new inmobiliaria23.entidades.BotonAzul();
        jButtonBuscarXdni = new inmobiliaria23.entidades.BotonNegro();
        jButtonBuscarXid1 = new inmobiliaria23.entidades.BotonNegro();
        jLabel6 = new javax.swing.JLabel();
        jRadioEstadoPro = new javax.swing.JRadioButton();
        jTextTelefonosPro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextNombreApellidoPro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

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

        jTextIdPro.setBackground(new java.awt.Color(236, 226, 200));
        jTextIdPro.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextIdPro.setForeground(new java.awt.Color(51, 51, 51));
        jTextIdPro.setText(" ");
        jTextIdPro.setBorder(null);
        jTextIdPro.setPreferredSize(new java.awt.Dimension(165, 30));
        jTextIdPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdProActionPerformed(evt);
            }
        });
        DatosInquilinos.add(jTextIdPro);

        jLabel2.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel2.setText("DNI:");
        DatosInquilinos.add(jLabel2);

        jTextDniPro.setBackground(new java.awt.Color(236, 226, 200));
        jTextDniPro.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextDniPro.setForeground(new java.awt.Color(51, 51, 51));
        jTextDniPro.setText(" ");
        jTextDniPro.setBorder(null);
        jTextDniPro.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos.add(jTextDniPro);

        jLabel3.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel3.setText("Apellido:");
        DatosInquilinos.add(jLabel3);

        jTextCuitPro.setBackground(new java.awt.Color(236, 226, 200));
        jTextCuitPro.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextCuitPro.setForeground(new java.awt.Color(51, 51, 51));
        jTextCuitPro.setText(" ");
        jTextCuitPro.setBorder(null);
        jTextCuitPro.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos.add(jTextCuitPro);

        jLabel9.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel9.setText("Nombre y Apellido:");
        DatosInquilinos.add(jLabel9);

        getContentPane().add(DatosInquilinos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 180, 490));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel7.setText("Datos del Propietario");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel8.setText("Listados de Propietarios");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        jPanelDatosGarante.setOpaque(false);
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 1, 1);
        flowLayout1.setAlignOnBaseline(true);
        jPanelDatosGarante.setLayout(flowLayout1);

        jTablePropietario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jTablePropietario.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTablePropietario.setRowHeight(25);
        jTablePropietario.setSelectionBackground(new java.awt.Color(236, 226, 200));
        jTablePropietario.setShowVerticalLines(false);
        jTablePropietario.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTablePropietario);

        jPanelDatosGarante.add(jScrollPane1);

        getContentPane().add(jPanelDatosGarante, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 460, 340));

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

        jbGuardar.setBorder(null);
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/guardar.png"))); // NOI18N
        jbGuardar.setText("GUARDAR");
        jbGuardar.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jbGuardar.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel1.add(jbGuardar);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1000, 50));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 10));

        btnInmuebles.setBorder(null);
        btnInmuebles.setForeground(new java.awt.Color(51, 51, 51));
        btnInmuebles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/inmueble-menu-25.png"))); // NOI18N
        btnInmuebles.setText(" REGISTRAR INMUEBLE");
        btnInmuebles.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        btnInmuebles.setPreferredSize(new java.awt.Dimension(180, 30));
        btnInmuebles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInmueblesActionPerformed(evt);
            }
        });
        jPanel2.add(btnInmuebles);

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
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, -1, -1));
        getContentPane().add(jRadioEstadoPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, -1, -1));

        jTextTelefonosPro.setBackground(new java.awt.Color(236, 226, 200));
        jTextTelefonosPro.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextTelefonosPro.setForeground(new java.awt.Color(51, 51, 51));
        jTextTelefonosPro.setText(" ");
        jTextTelefonosPro.setBorder(null);
        jTextTelefonosPro.setPreferredSize(new java.awt.Dimension(165, 30));
        getContentPane().add(jTextTelefonosPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel5.setText("Teléfonos:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jTextNombreApellidoPro.setBackground(new java.awt.Color(236, 226, 200));
        jTextNombreApellidoPro.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextNombreApellidoPro.setForeground(new java.awt.Color(51, 51, 51));
        jTextNombreApellidoPro.setText(" ");
        jTextNombreApellidoPro.setBorder(null);
        jTextNombreApellidoPro.setPreferredSize(new java.awt.Dimension(165, 30));
        getContentPane().add(jTextNombreApellidoPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel4.setText("Domicilio Real:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        jTextIdPro.setText("");
        jTextDniPro.setText("");
        jTextCuitPro.setText("");
        jTextNombreApellidoPro.setText("");
        jTextTelefonosPro.setText("");

    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jTextIdProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdProActionPerformed

    private void btnInmueblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInmueblesActionPerformed
        RegistrarInmueble RInmueble = new RegistrarInmueble();
        RInmueble.setVisible(true);
        

    }//GEN-LAST:event_btnInmueblesActionPerformed
////
    private void jButtonBuscarXdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarXdniActionPerformed
        try {

            Integer ID = Integer.parseInt(jTextId.getText().trim());
            inquilinoActual = inquiData.buscarInquilinoPorid(ID);

            if (inquilinoActual != null) {
                jTextApellido.setText(inquilinoActual.getApellido());
                jTextNombre.setText(inquilinoActual.getNombre());
                jTextDni.setText(String.valueOf(inquilinoActual.getDni()));
                jTextCuit.setText(inquilinoActual.getCUIL());
                jTextTelefonos.setText(String.valueOf(inquilinoActual.getTel()));
                jTextLugarTrabajo.setText(inquilinoActual.getLugarDetrabajo());
                jTextAreaGarantes.setText(inquilinoActual.getGarante());
                if (inquilinoActual.isEstado()) {
                    jCBestado.setSelected(true);
                    jLabelEstado.setText("Activo");
                } else {
                    jCBestado.setSelected(false);
                    jLabelEstado.setText("Inactivo");
                }
            }
            /*else {
                JOptionPane.showMessageDialog(null, "No existe un inquilino con ese ID");
            }*/
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "ERROR, debe ingresar un numero de ID valido");
        }
    }//GEN-LAST:event_jButtonBuscarXdniActionPerformed

    private void jButtonBuscarXid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarXid1ActionPerformed
        try {

            Integer ID = Integer.parseInt(jTextId.getText().trim());
            inquilinoActual = inquiData.buscarInquilinoPorid(ID);

            if (inquilinoActual != null) {
                jTextApellido.setText(inquilinoActual.getApellido());
                jTextNombre.setText(inquilinoActual.getNombre());
                jTextDni.setText(String.valueOf(inquilinoActual.getDni()));
                jTextCuit.setText(inquilinoActual.getCUIL());
                jTextTelefonos.setText(String.valueOf(inquilinoActual.getTel()));
                jTextLugarTrabajo.setText(inquilinoActual.getLugarDetrabajo());
                jTextAreaGarantes.setText(inquilinoActual.getGarante());
                if (inquilinoActual.isEstado()) {
                    jCBestado.setSelected(true);
                    jLabelEstado.setText("Activo");
                } else {
                    jCBestado.setSelected(false);
                    jLabelEstado.setText("Inactivo");
                }
            }
            /*else {
                JOptionPane.showMessageDialog(null, "No existe un inquilino con ese ID");
            }*/
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "ERROR, debe ingresar un numero de ID valido");
        }
    }//GEN-LAST:event_jButtonBuscarXid1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DatosInquilinos;
    private javax.swing.JLabel Titulo;
    private inmobiliaria23.entidades.BotonNaranja btnInmuebles;
    private inmobiliaria23.entidades.BotonNegro jButtonBuscarXdni;
    private inmobiliaria23.entidades.BotonNegro jButtonBuscarXid1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanelDatosGarante;
    private javax.swing.JRadioButton jRadioEstadoPro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePropietario;
    private javax.swing.JTextField jTextCuitPro;
    private javax.swing.JTextField jTextDniPro;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextIdPro;
    private javax.swing.JTextField jTextNombreApellidoPro;
    private javax.swing.JTextField jTextTelefonosPro;
    private inmobiliaria23.entidades.BotonNegro jbBuscar;
    private inmobiliaria23.entidades.BotonRojo jbEliminar;
    private inmobiliaria23.entidades.BotonVerde jbGuardar;
    private inmobiliaria23.entidades.BotonNegro jbLimpiar;
    private inmobiliaria23.entidades.BotonNegro jbModificar;
    private inmobiliaria23.entidades.BotonNegro jbNuevo;
    private inmobiliaria23.entidades.BotonAzul jbSalir;
    // End of variables declaration//GEN-END:variables


    private void cargarListaPropietarios() {
        PropietarioData propietaData = new PropietarioData();
        List<Propietario> milista = propietaData.listarPropietarios();
        for (Propietario propietario : milista) {
            modelo.addRow(new Object[]{
                propietario.getId_propietario(),
                propietario.getNombre(),
                propietario.getApellido(),
                propietario.getDni(),
                propietario.getTel(),
                propietario.getDomicilio(),
                propietario.isEstado(),});
        }
    }
private void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("Dni");
        modelo.addColumn("Cuit");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Domicilio Real");
        modelo.addColumn("Telefono");
        modelo.addColumn("Estado");
        jtPropietario.setModel(modelo);
        JTableHeader tableHeader = jtPropietario.getTableHeader();
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) tableHeader.getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        Font headerFont = new Font("Roboto Cn", Font.BOLD, 12);
        headerRenderer.setFont(headerFont);
    }

private void borrarDatos() {

        int f = jtPropietario.getRowCount() - 1; //obtengo total de filas de la tabla

        for (; f >= 0; f--) { //recorro filas para borrar 1 por 1 en iteracion.

            modelo.removeRow(f);// remuevo valor por indice en la tabla "jcTable"
        }
    }
    
}



