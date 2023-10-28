package inmobiliaria23.vistas;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import inmobiliaria23.accesoAdatos.InquilinoData;
import inmobiliaria23.entidades.*;
import inmobiliaria23.entidades.InternaljFrameImagen;
import inmobiliaria23.entidades.panelesImagenes;
import java.awt.Font;
import java.awt.Image;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class registroInquilinoyGarante extends InternaljFrameImagen {

    private panelesImagenes pi = new panelesImagenes();
    private DefaultTableModel modelo;

    public boolean isCellEditable(int f, int c) {
        return false;
    }

    public registroInquilinoyGarante() {
        initComponents();
        modelo = new DefaultTableModel();
        this.setSize(1024, 768);
        this.setImage("/inmobiliaria23/recursos/Image20231020111953.jpg");
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);

        armarCabecera();
        cargarListaInquilinos();

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
        jTableInquilinos = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jbtnAñadir = new inmobiliaria23.entidades.BotonNegro();
        jbModificar = new inmobiliaria23.entidades.BotonNegro();
        jbLimpiar = new inmobiliaria23.entidades.BotonNegro();
        jbLBuscar = new inmobiliaria23.entidades.BotonNegro();
        jbEliminar = new inmobiliaria23.entidades.BotonRojo();
        jButtonGuardar = new inmobiliaria23.entidades.BotonVerde();
        botonAzul1 = new inmobiliaria23.entidades.BotonAzul();
        jCBestado = new javax.swing.JCheckBox();
        jLabelEstado = new javax.swing.JLabel();
        jButtonBuscarXid = new inmobiliaria23.entidades.BotonNegro();
        jButtonBuscarXdni = new inmobiliaria23.entidades.BotonNegro();

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
        jTextDni.setFont(new java.awt.Font("Roboto Cn", 1, 14)); // NOI18N
        jTextDni.setForeground(new java.awt.Color(51, 51, 51));
        jTextDni.setText(" ");
        jTextDni.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextDni.setPreferredSize(new java.awt.Dimension(165, 30));
        jTextDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDniActionPerformed(evt);
            }
        });
        jTextDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextDniKeyTyped(evt);
            }
        });
        DatosInquilinos.add(jTextDni);

        jLabel3.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel3.setText("CUIT:");
        DatosInquilinos.add(jLabel3);

        jTextCuit.setBackground(new java.awt.Color(236, 226, 200));
        jTextCuit.setFont(new java.awt.Font("Roboto Cn", 1, 14)); // NOI18N
        jTextCuit.setForeground(new java.awt.Color(51, 51, 51));
        jTextCuit.setText(" ");
        jTextCuit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextCuit.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos.add(jTextCuit);

        jLabel4.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel4.setText(" Apellido:");
        DatosInquilinos.add(jLabel4);

        jTextApellido.setBackground(new java.awt.Color(236, 226, 200));
        jTextApellido.setFont(new java.awt.Font("Roboto Cn", 1, 14)); // NOI18N
        jTextApellido.setForeground(new java.awt.Color(51, 51, 51));
        jTextApellido.setText(" ");
        jTextApellido.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextApellido.setPreferredSize(new java.awt.Dimension(165, 30));
        jTextApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextApellidoKeyTyped(evt);
            }
        });
        DatosInquilinos.add(jTextApellido);

        jLabel5.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel5.setText("Nombre");
        DatosInquilinos.add(jLabel5);

        jTextNombre.setBackground(new java.awt.Color(236, 226, 200));
        jTextNombre.setFont(new java.awt.Font("Roboto Cn", 1, 14)); // NOI18N
        jTextNombre.setForeground(new java.awt.Color(51, 51, 51));
        jTextNombre.setText(" ");
        jTextNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextNombre.setPreferredSize(new java.awt.Dimension(165, 30));
        jTextNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNombreKeyTyped(evt);
            }
        });
        DatosInquilinos.add(jTextNombre);

        jLabel6.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel6.setText("Lugar de Trabajo:");
        DatosInquilinos.add(jLabel6);

        jTextLugarTrabajo.setBackground(new java.awt.Color(236, 226, 200));
        jTextLugarTrabajo.setFont(new java.awt.Font("Roboto Cn", 1, 14)); // NOI18N
        jTextLugarTrabajo.setForeground(new java.awt.Color(51, 51, 51));
        jTextLugarTrabajo.setText(" ");
        jTextLugarTrabajo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextLugarTrabajo.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos.add(jTextLugarTrabajo);

        jLabel9.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel9.setText("Teléfonos:");
        DatosInquilinos.add(jLabel9);

        jTextTelefonos.setBackground(new java.awt.Color(236, 226, 200));
        jTextTelefonos.setFont(new java.awt.Font("Roboto Cn", 1, 14)); // NOI18N
        jTextTelefonos.setForeground(new java.awt.Color(51, 51, 51));
        jTextTelefonos.setText(" ");
        jTextTelefonos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
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

        jPanelDatosGarante.setBackground(new java.awt.Color(236, 226, 200));
        jPanelDatosGarante.setMinimumSize(new java.awt.Dimension(33, 33));
        jPanelDatosGarante.setVerifyInputWhenFocusTarget(false);

        jTextAreaGarantes.setBackground(new java.awt.Color(236, 226, 200));
        jTextAreaGarantes.setColumns(45);
        jTextAreaGarantes.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextAreaGarantes.setForeground(new java.awt.Color(51, 51, 51));
        jTextAreaGarantes.setLineWrap(true);
        jTextAreaGarantes.setRows(30);
        jTextAreaGarantes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(236, 226, 200), 1, true));
        jTextAreaGarantes.setPreferredSize(new java.awt.Dimension(497, 300));
        jScrollPane1.setViewportView(jTextAreaGarantes);

        jTableInquilinos.setFont (new java.awt.Font ("Roboto Cn",1,12));
        jTableInquilinos.setAutoCreateRowSorter(true);
        jTableInquilinos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableInquilinos);

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel10.setText("Listado de Inquilinos");

        javax.swing.GroupLayout jPanelDatosGaranteLayout = new javax.swing.GroupLayout(jPanelDatosGarante);
        jPanelDatosGarante.setLayout(jPanelDatosGaranteLayout);
        jPanelDatosGaranteLayout.setHorizontalGroup(
            jPanelDatosGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
            .addGroup(jPanelDatosGaranteLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelDatosGaranteLayout.setVerticalGroup(
            jPanelDatosGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosGaranteLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
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

        jbLBuscar.setBorder(null);
        jbLBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/modificar.png"))); // NOI18N
        jbLBuscar.setText("ACTUALIZAR");
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

        jButtonGuardar.setBorder(null);
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/guardar.png"))); // NOI18N
        jButtonGuardar.setText("GUARDAR");
        jButtonGuardar.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jButtonGuardar.setPreferredSize(new java.awt.Dimension(120, 30));
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardar);

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
        jLabelEstado.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        jLabelEstado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(jLabelEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 610, 90, 20));

        jButtonBuscarXid.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jButtonBuscarXid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/vistas/LupaInmobiliaria.png"))); // NOI18N
        jButtonBuscarXid.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonBuscarXid.setPreferredSize(new java.awt.Dimension(30, 30));
        jButtonBuscarXid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarXidActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarXid, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 40, 40));

        jButtonBuscarXdni.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jButtonBuscarXdni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/vistas/LupaInmobiliaria.png"))); // NOI18N
        jButtonBuscarXdni.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonBuscarXdni.setPreferredSize(new java.awt.Dimension(30, 30));
        jButtonBuscarXdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarXdniActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarXdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 40, 40));

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
        borrarDatos();
        cargarListaInquilinos();
//        mensajeBuscar buscardni = new mensajeBuscar(null, true);
//        buscardni.setVisible(true);

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

    private void jTextDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDniActionPerformed

    private void jButtonBuscarXidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarXidActionPerformed
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
    }//GEN-LAST:event_jButtonBuscarXidActionPerformed

    private void jButtonBuscarXdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarXdniActionPerformed
        try {

            Integer dni = Integer.parseInt(jTextDni.getText().trim());
            inquilinoActual = inquiData.buscarInquilinoPorDni(dni);

            if (inquilinoActual != null) {
                jTextId.setText(String.valueOf(inquilinoActual.getId_inquilino()));
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
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "ERROR, debe ingresar un numero de DNI valido");

        }

    }//GEN-LAST:event_jButtonBuscarXdniActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        try {
            String dniStr = jTextDni.getText();
            //int dni = Integer.parseInt(jTextDni.getText());
            //String nombre = jTnombre.getText();
            inquilinoActual.getId_inquilino();
            inquilinoActual.setDni(Integer.parseInt(jTextDni.getText()));
            inquilinoActual.setCUIL(jTextCuit.getText());
            inquilinoActual.setApellido(jTextApellido.getText());
            inquilinoActual.setNombre(jTextNombre.getText());
            inquilinoActual.setLugarDetrabajo(jTextLugarTrabajo.getText());
            inquilinoActual.setTel(Integer.parseInt(jTextTelefonos.getText()));
            inquilinoActual.setEstado(jCBestado.isSelected());
            inquilinoActual.setGarante(jTextAreaGarantes.getText());
            //mateData.modificarMateria(materiaActual);

            if (jTextDni.getText().isEmpty() || jTextApellido.getText().isEmpty() || jTextNombre.getText().isEmpty()
                    || jTextLugarTrabajo.getText().isEmpty() || jTextTelefonos.getText().isEmpty()
                    || jTextAreaGarantes.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor complete todos los campos");
                return;
            }
            if (!dniStr.matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "El campo año debe contener solo numeros");
            }
            Integer dni = Integer.parseInt(dniStr);
            //boolean Estado = jCBestado.isSelected();
            inquilinoActual.setEstado(jCBestado.isSelected());
            if (inquilinoActual == null) {
                inquiData.modificarInquilino(inquilinoActual);

            } else {

                inquilinoActual.getId_inquilino();
                inquilinoActual.setDni(inquilinoActual.getDni());
                inquilinoActual.setCUIL(inquilinoActual.getCUIL());
                inquilinoActual.setApellido(inquilinoActual.getApellido());
                inquilinoActual.setNombre(inquilinoActual.getNombre());
                inquilinoActual.setLugarDetrabajo(inquilinoActual.getNombre());
                inquilinoActual.setTel(inquilinoActual.getTel());
                inquilinoActual.setEstado(inquilinoActual.isEstado());
                inquilinoActual.setGarante(inquilinoActual.getGarante());

                inquiData.modificarInquilino(inquilinoActual);

            }
            limpiarCampos();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debes ingresar un año valido");

        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
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
    }//GEN-LAST:event_jButtonGuardarActionPerformed
    }
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
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DatosInquilinos;
    private javax.swing.JLabel Titulo;
    private inmobiliaria23.entidades.BotonAzul botonAzul1;
    private inmobiliaria23.entidades.BotonNegro jButtonBuscarXdni;
    private inmobiliaria23.entidades.BotonNegro jButtonBuscarXid;
    private inmobiliaria23.entidades.BotonVerde jButtonGuardar;
    private javax.swing.JCheckBox jCBestado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanelDatosGarante;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableInquilinos;
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

    private void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("Dni");
        modelo.addColumn("Cuit");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Lugar de Trabajo");
        modelo.addColumn("Telefono");
        modelo.addColumn("Estado");
        jTableInquilinos.setModel(modelo);
        JTableHeader tableHeader = jTableInquilinos.getTableHeader();
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) tableHeader.getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        Font headerFont = new Font("Roboto Cn", Font.BOLD, 12);
        headerRenderer.setFont(headerFont);

    }

    private void cargarListaInquilinos() {
        InquilinoData inquiData = new InquilinoData();
        List<Inquilino> milista = inquiData.listarInquilinos();
        for (Inquilino inquilino : milista) {
            modelo.addRow(new Object[]{
                inquilino.getId_inquilino(),
                inquilino.getDni(),
                inquilino.getCUIL(),
                inquilino.getApellido(),
                inquilino.getNombre(),
                inquilino.getLugarDetrabajo(),
                inquilino.getTel(),
                inquilino.isEstado(),});
        }
    }

    private void borrarDatos() {

        int f = jTableInquilinos.getRowCount() - 1; //obtengo total de filas de la tabla

        for (; f >= 0; f--) { //recorro filas para borrar 1 por 1 en iteracion.

            modelo.removeRow(f);// remuevo valor por indice en la tabla "jcTable"
        }
    }

}
