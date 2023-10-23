package inmobiliaria23.vistas;

import inmobiliaria23.accesoAdatos.InquilinoData;
import inmobiliaria23.entidades.*;
import inmobiliaria23.entidades.InternaljFrameImagen;
import inmobiliaria23.entidades.panelesImagenes;
import java.awt.Image;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;

public class registroInquilinoyGarante extends InternaljFrameImagen {

    private panelesImagenes pi = new panelesImagenes();

    public registroInquilinoyGarante() {
        initComponents();
        this.setSize(1024, 768);
        this.setImage("/inmobiliaria23/recursos/Image20231020111953.jpg");
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);

    }
    private InquilinoData inquiData = new InquilinoData();
    private Inquilino inquilinoActual = null;

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
        jTextCuit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextLugarTrabajo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextTelefonos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanelDatosGarante = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaGarantes = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelListadoInquilinos = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jbtnAñadir = new inmobiliaria23.entidades.BotonNegro();
        jbModificar = new inmobiliaria23.entidades.BotonNegro();
        jbLimpiar = new inmobiliaria23.entidades.BotonNegro();
        jbLBuscar = new inmobiliaria23.entidades.BotonNegro();
        jbEliminar = new inmobiliaria23.entidades.BotonRojo();
        botonVerde1 = new inmobiliaria23.entidades.BotonVerde();
        botonAzul1 = new inmobiliaria23.entidades.BotonAzul();
        jCBestado = new javax.swing.JCheckBox();
        jLabelEstado = new javax.swing.JLabel();
        jButtonBuscarXid = new inmobiliaria23.entidades.BotonNegro();
        botonNegro1 = new inmobiliaria23.entidades.BotonNegro();

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
        Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/propietario-50.png"))); // NOI18N
        Titulo.setText("Registrar Inquilinos y Garantes");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        DatosInquilinos.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        DatosInquilinos.setOpaque(false);
        DatosInquilinos.setPreferredSize(new java.awt.Dimension(500, 390));
        DatosInquilinos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel1.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel1.setText("ID:");
        DatosInquilinos.add(jLabel1);

        jTextId.setBackground(new java.awt.Color(236, 226, 200));
        jTextId.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextId.setForeground(new java.awt.Color(51, 51, 51));
        jTextId.setText(" ");
        jTextId.setBorder(null);
        jTextId.setPreferredSize(new java.awt.Dimension(165, 30));
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
        DatosInquilinos.add(jTextDni);

        jLabel3.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel3.setText("CUIT:");
        DatosInquilinos.add(jLabel3);

        jTextCuit.setBackground(new java.awt.Color(236, 226, 200));
        jTextCuit.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextCuit.setForeground(new java.awt.Color(51, 51, 51));
        jTextCuit.setText(" ");
        jTextCuit.setBorder(null);
        jTextCuit.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos.add(jTextCuit);

        jLabel4.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel4.setText(" Apellido:");
        DatosInquilinos.add(jLabel4);

        jTextApellido.setBackground(new java.awt.Color(236, 226, 200));
        jTextApellido.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextApellido.setForeground(new java.awt.Color(51, 51, 51));
        jTextApellido.setText(" ");
        jTextApellido.setBorder(null);
        jTextApellido.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos.add(jTextApellido);

        jLabel5.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel5.setText("Nombre");
        DatosInquilinos.add(jLabel5);

        jTextNombre.setBackground(new java.awt.Color(236, 226, 200));
        jTextNombre.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextNombre.setForeground(new java.awt.Color(51, 51, 51));
        jTextNombre.setText(" ");
        jTextNombre.setBorder(null);
        jTextNombre.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos.add(jTextNombre);

        jLabel6.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel6.setText("Lugar de Trabajo:");
        DatosInquilinos.add(jLabel6);

        jTextLugarTrabajo.setBackground(new java.awt.Color(236, 226, 200));
        jTextLugarTrabajo.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextLugarTrabajo.setForeground(new java.awt.Color(51, 51, 51));
        jTextLugarTrabajo.setText(" ");
        jTextLugarTrabajo.setBorder(null);
        jTextLugarTrabajo.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos.add(jTextLugarTrabajo);

        jLabel9.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel9.setText("Teléfonos:");
        DatosInquilinos.add(jLabel9);

        jTextTelefonos.setBackground(new java.awt.Color(236, 226, 200));
        jTextTelefonos.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextTelefonos.setForeground(new java.awt.Color(51, 51, 51));
        jTextTelefonos.setText(" ");
        jTextTelefonos.setBorder(null);
        jTextTelefonos.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos.add(jTextTelefonos);

        getContentPane().add(DatosInquilinos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 180, 470));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel7.setText("Datos del Inquilino");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel8.setText("Datos del Garante");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        jPanelDatosGarante.setOpaque(false);

        jTextAreaGarantes.setBackground(new java.awt.Color(236, 226, 200));
        jTextAreaGarantes.setColumns(45);
        jTextAreaGarantes.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextAreaGarantes.setForeground(new java.awt.Color(51, 51, 51));
        jTextAreaGarantes.setLineWrap(true);
        jTextAreaGarantes.setRows(30);
        jTextAreaGarantes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 226, 200)));
        jTextAreaGarantes.setPreferredSize(new java.awt.Dimension(497, 300));
        jScrollPane1.setViewportView(jTextAreaGarantes);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        jLabelListadoInquilinos.setText("Listado de Inquilinos");

        javax.swing.GroupLayout jPanelDatosGaranteLayout = new javax.swing.GroupLayout(jPanelDatosGarante);
        jPanelDatosGarante.setLayout(jPanelDatosGaranteLayout);
        jPanelDatosGaranteLayout.setHorizontalGroup(
            jPanelDatosGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
            .addGroup(jPanelDatosGaranteLayout.createSequentialGroup()
                .addComponent(jLabelListadoInquilinos)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelDatosGaranteLayout.setVerticalGroup(
            jPanelDatosGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosGaranteLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelListadoInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanelDatosGarante, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 510, 390));

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

        jbLBuscar.setBorder(null);
        jbLBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/buscar-interna.png"))); // NOI18N
        jbLBuscar.setText(" BUSCAR");
        jbLBuscar.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jbLBuscar.setPreferredSize(new java.awt.Dimension(120, 30));
        jbLBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbLBuscar);

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
        getContentPane().add(botonAzul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 640, -1, -1));

        jCBestado.setText("Estado");
        jCBestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBestadoActionPerformed(evt);
            }
        });
        getContentPane().add(jCBestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 610, 20, 20));

        jLabelEstado.setBackground(new java.awt.Color(0,0,0));

        jLabelEstado.setFont(new java.awt.Font ("Roboto Cn",1,18));
        jLabelEstado.setText("");
        getContentPane().add(jLabelEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 610, 90, 20));

        jButtonBuscarXid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/vistas/LupaInmobiliaria.png"))); // NOI18N
        jButtonBuscarXid.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonBuscarXid.setLabel("");
        jButtonBuscarXid.setPreferredSize(new java.awt.Dimension(30, 30));
        getContentPane().add(jButtonBuscarXid, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 40, 40));

        botonNegro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/vistas/pngwing.com2.png"))); // NOI18N
        botonNegro1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonNegro1.setPreferredSize(new java.awt.Dimension(30, 30));
        getContentPane().add(botonNegro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAñadirActionPerformed
        inquilinoActual = new Inquilino(
                jTextApellido.getText(),
                jTextNombre.getText(),
                parseDni(jTextDni.getText().trim()),
                jTextCuit.getText(),
                parseTelefonos(jTextTelefonos.getText().trim()),
                jTextLugarTrabajo.getText(),
                jTextAreaGarantes.getText(),
                jCBestado.isSelected()
        );
        try {
            if (jTextApellido.getText().isEmpty() || jTextNombre.getText().isEmpty() || jTextDni.getText().isEmpty()
                    || jTextCuit.getText().isEmpty() || jTextTelefonos.getText().isEmpty() || jTextLugarTrabajo.getText().isEmpty()
                    || jTextAreaGarantes.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor complete todos los campos");
            } else if (inquilinoActual.getDni() == -1 || inquilinoActual.getTel() == -1) {

                JOptionPane.showMessageDialog(this, "Solo puede ingresar numeros");

            } else {
                inquiData.nuevoInquilino(inquilinoActual);
                limpiarCampos();
            }

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "ERROR: " + "\n error:" + nfe.getMessage());
        }

    }//GEN-LAST:event_jbtnAñadirActionPerformed

    private int parseDni(String input) {
        try {
            return Integer.parseInt(input.trim());
        } catch (NumberFormatException e) {
            return -1; // Valor que indica que la conversión falló
        }
    }

    private int parseTelefonos(String input) {
        try {
            return Integer.parseInt(input.trim());
        } catch (NumberFormatException e) {
            return -1; // Valor que indica que la conversión falló
        }
    }
    private void jbLBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLBuscarActionPerformed

        mensajeBuscar buscardni = new mensajeBuscar(null, true);
        buscardni.setVisible(true);

    }//GEN-LAST:event_jbLBuscarActionPerformed

    private void botonAzul1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAzul1ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_botonAzul1ActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        if (inquilinoActual != null) {
            inquiData.bajaInquilino(inquilinoActual.getId_inquilino());
            inquilinoActual = null;
            limpiarCampos();

        } else {
            JOptionPane.showMessageDialog(this, "No hay un inquilino seleccionado para eliminar");
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        jTextId.setText("");
        jTextDni.setText("");
        jTextCuit.setText("");
        jTextApellido.setText("");
        jTextNombre.setText("");
        jTextLugarTrabajo.setText("");
        jTextTelefonos.setText("");
        jTextAreaGarantes.setText("");
        jCBestado.setSelected(false);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jCBestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBestadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DatosInquilinos;
    private javax.swing.JLabel Titulo;
    private inmobiliaria23.entidades.BotonAzul botonAzul1;
    private inmobiliaria23.entidades.BotonNegro botonNegro1;
    private inmobiliaria23.entidades.BotonVerde botonVerde1;
    private inmobiliaria23.entidades.BotonNegro jButtonBuscarXid;
    private javax.swing.JCheckBox jCBestado;
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
    private javax.swing.JLabel jLabelListadoInquilinos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDatosGarante;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JTextArea jTextAreaGarantes;
    private javax.swing.JTextField jTextCuit;
    private javax.swing.JTextField jTextDni;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextId;
    private javax.swing.JTextField jTextLugarTrabajo;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextTelefonos;
    private inmobiliaria23.entidades.BotonRojo jbEliminar;
    private inmobiliaria23.entidades.BotonNegro jbLBuscar;
    private inmobiliaria23.entidades.BotonNegro jbLimpiar;
    private inmobiliaria23.entidades.BotonNegro jbModificar;
    private inmobiliaria23.entidades.BotonNegro jbtnAñadir;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        jTextId.setText("");
        jTextDni.setText("");
        jTextCuit.setText("");
        jTextApellido.setText("");
        jTextNombre.setText("");
        jTextTelefonos.setText("");
        jTextLugarTrabajo.setText("");
        jTextAreaGarantes.setText("");
        jCBestado.setSelected(false);
    }

}
