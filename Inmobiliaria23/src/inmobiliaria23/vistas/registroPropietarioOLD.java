/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria23.vistas;

import inmobiliaria23.entidades.InternaljFrameImagen;
import inmobiliaria23.entidades.panelesImagenes;

/**
 *
 * @author Administrador
 */
public class registroPropietarioOLD extends InternaljFrameImagen {

    private panelesImagenes pi = new panelesImagenes();

    public registroPropietarioOLD() {
        initComponents();
        this.setSize(1024, 768);

        this.setImage("/inmobiliaria23/recursos/FondoNaranja.jpg");
        //this.setImage("/inmobiliaria23/recursos/FondoGrandiet.jpg");
        //this.setImage("/inmobiliaria23/recursos/FondoMadera.jpg");

        //Oculta la barra superior
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DatosInquilinos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextDni = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextNombreApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextLugarTrabajo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextTlefonos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jRadioEstadoPro = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jbtnAñadir = new inmobiliaria23.entidades.BotonNegro();
        jbModificar = new inmobiliaria23.entidades.BotonNegro();
        jbLimpiar1 = new inmobiliaria23.entidades.BotonNegro();
        jbLimpiar = new inmobiliaria23.entidades.BotonNegro();
        jbEliminar = new inmobiliaria23.entidades.BotonRojo();
        botonVerde1 = new inmobiliaria23.entidades.BotonVerde();

        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(383, 394));

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

        jLabel4.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel4.setText("Nombre y Apellido:");
        DatosInquilinos.add(jLabel4);

        jTextNombreApellido.setBackground(new java.awt.Color(236, 226, 200));
        jTextNombreApellido.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextNombreApellido.setForeground(new java.awt.Color(51, 51, 51));
        jTextNombreApellido.setText(" ");
        jTextNombreApellido.setBorder(null);
        jTextNombreApellido.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos.add(jTextNombreApellido);

        jLabel5.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel5.setText("Domicilio Real:");
        DatosInquilinos.add(jLabel5);

        jTextLugarTrabajo.setBackground(new java.awt.Color(236, 226, 200));
        jTextLugarTrabajo.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextLugarTrabajo.setForeground(new java.awt.Color(51, 51, 51));
        jTextLugarTrabajo.setText(" ");
        jTextLugarTrabajo.setBorder(null);
        jTextLugarTrabajo.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos.add(jTextLugarTrabajo);

        jLabel6.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel6.setText("Teléfonos:");
        DatosInquilinos.add(jLabel6);

        jTextTlefonos.setBackground(new java.awt.Color(236, 226, 200));
        jTextTlefonos.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextTlefonos.setForeground(new java.awt.Color(51, 51, 51));
        jTextTlefonos.setText(" ");
        jTextTlefonos.setBorder(null);
        jTextTlefonos.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos.add(jTextTlefonos);

        jLabel7.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel7.setText("Teléfonos:");
        DatosInquilinos.add(jLabel7);

        jRadioEstadoPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioEstadoProActionPerformed(evt);
            }
        });
        DatosInquilinos.add(jRadioEstadoPro);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        jbtnAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/nuevo.png"))); // NOI18N
        jbtnAñadir.setText(" NUEVO");
        jbtnAñadir.setFont(new java.awt.Font("Roboto Cn", 0, 12)); // NOI18N
        jbtnAñadir.setPreferredSize(new java.awt.Dimension(120, 30));
        jbtnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAñadirActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnAñadir);

        jbModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/modificar.png"))); // NOI18N
        jbModificar.setText(" MODIFICAR");
        jbModificar.setFont(new java.awt.Font("Roboto Cn", 0, 12)); // NOI18N
        jbModificar.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel1.add(jbModificar);

        jbLimpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/LimpiarCampos.png"))); // NOI18N
        jbLimpiar1.setText(" LIMPIAR");
        jbLimpiar1.setFont(new java.awt.Font("Roboto Cn", 0, 12)); // NOI18N
        jbLimpiar1.setPreferredSize(new java.awt.Dimension(120, 30));
        jbLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbLimpiar1);

        jbLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/buscar-interna.png"))); // NOI18N
        jbLimpiar.setText(" BUSCAR");
        jbLimpiar.setFont(new java.awt.Font("Roboto Cn", 0, 12)); // NOI18N
        jbLimpiar.setPreferredSize(new java.awt.Dimension(120, 30));
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jbLimpiar);

        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/delete.png"))); // NOI18N
        jbEliminar.setText("ELIMINAR");
        jbEliminar.setPreferredSize(new java.awt.Dimension(120, 30));
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEliminar);

        botonVerde1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/guardar.png"))); // NOI18N
        botonVerde1.setText("GUARDAR");
        botonVerde1.setFont(new java.awt.Font("Roboto Cn", 0, 12)); // NOI18N
        botonVerde1.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel1.add(botonVerde1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(DatosInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(826, 826, 826))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DatosInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioEstadoProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioEstadoProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioEstadoProActionPerformed

    private void jbtnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAñadirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnAñadirActionPerformed

    private void jbLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiar1ActionPerformed
        jTextId.setText("");
        jTextDni.setText("");

        jTextNombreApellido.setText("");
        jTextLugarTrabajo.setText("");
        jTextTlefonos.setText("");

    }//GEN-LAST:event_jbLimpiar1ActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed

    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

    }//GEN-LAST:event_jbEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DatosInquilinos;
    private inmobiliaria23.entidades.BotonVerde botonVerde1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioEstadoPro;
    private javax.swing.JTextField jTextDni;
    private javax.swing.JTextField jTextId;
    private javax.swing.JTextField jTextLugarTrabajo;
    private javax.swing.JTextField jTextNombreApellido;
    private javax.swing.JTextField jTextTlefonos;
    private inmobiliaria23.entidades.BotonRojo jbEliminar;
    private inmobiliaria23.entidades.BotonNegro jbLimpiar;
    private inmobiliaria23.entidades.BotonNegro jbLimpiar1;
    private inmobiliaria23.entidades.BotonNegro jbModificar;
    private inmobiliaria23.entidades.BotonNegro jbtnAñadir;
    // End of variables declaration//GEN-END:variables
}
