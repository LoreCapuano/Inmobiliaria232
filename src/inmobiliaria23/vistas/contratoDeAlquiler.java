package inmobiliaria23.vistas;

import inmobiliaria23.accesoAdatos.ContratoAquilerData;
import inmobiliaria23.accesoAdatos.InquilinoData;
import inmobiliaria23.accesoAdatos.PropiedadInmuebleData;
import inmobiliaria23.entidades.ContratoAlquiler;
import inmobiliaria23.entidades.Inquilino;
import inmobiliaria23.entidades.InternaljFrameImagen;
import inmobiliaria23.entidades.PropiedadInmueble;
import inmobiliaria23.entidades.panelesImagenes;
import java.awt.Image;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
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
public class contratoDeAlquiler extends InternaljFrameImagen {

    private ContratoAquilerData contratodata = new ContratoAquilerData();
    private ContratoAlquiler contrato = null;
    private InquilinoData inquilino = new InquilinoData();
    private Inquilino obtengoId = new Inquilino();
    private PropiedadInmuebleData propiedad = new PropiedadInmuebleData();
    private PropiedadInmueble idpropiedad = new PropiedadInmueble();
    private panelesImagenes pi = new panelesImagenes();
    private DefaultTableModel modelo;
    private List<ContratoAlquiler> contratoslista;

    public contratoDeAlquiler() {
        initComponents();
        this.setSize(1024, 770);


        this.setImage("/inmobiliaria23/recursos/Image20231020111953.jpg");

        
        this.setImage("/inmobiliaria23/recursos/FondoMadera.jpg");

        //this.setImage("/inmobiliaria23/recursos/FondoGrandiet.jpg");
        //this.setImage("/inmobiliaria23/recursos/FondoMadera.jpg");

        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        modelo = new DefaultTableModel();

        armarCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextID = new javax.swing.JTextField();
        Titulo = new javax.swing.JLabel();
        DatosInquilinos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextIdContratoAlq = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextIDInmuebleContratoAlq = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextIDInquilinoContratoAlq = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jbNuevo = new inmobiliaria23.entidades.BotonNegro();
        jbRenovar = new inmobiliaria23.entidades.BotonNegro();
        jbLimpiar = new inmobiliaria23.entidades.BotonNegro();
        jbBuscar = new inmobiliaria23.entidades.BotonNegro();
        jbRescindir = new inmobiliaria23.entidades.BotonRojo();
        jbGuardar = new inmobiliaria23.entidades.BotonVerde();
        jbSalir = new inmobiliaria23.entidades.BotonAzul();
        jLabel11 = new javax.swing.JLabel();

        jTextDetalles = new javax.swing.JTextField();

        jTextMontoPesosContratoAlq = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jDateChooserfechaInicio = new org.netbeans.modules.form.InvalidComponent();
        jLabel13 = new javax.swing.JLabel();
        jDateChooserfechaFin = new org.netbeans.modules.form.InvalidComponent();
        jLabelDetalles = new javax.swing.JLabel();
        jTextFielddetalle = new javax.swing.JTextField();

        jLabel14 = new javax.swing.JLabel();
        jTextestado = new javax.swing.JTextField();
        jLabelListaContratosXestado = new javax.swing.JLabel();
        jButtonContratosDadosDeBaja = new inmobiliaria23.entidades.BotonNegro();
        jBugttonContratosActivos = new inmobiliaria23.entidades.BotonNegro();
        jButtonContratosRenovados = new inmobiliaria23.entidades.BotonNegro();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableContratos = new javax.swing.JTable();
        jDateChooserfechaFin = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jDateChooserfechaInicio = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jTextMontoPesosContratoAlq = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

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
        Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/Contracts.png"))); // NOI18N
        Titulo.setText("Contrato Alquiler");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        DatosInquilinos.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        DatosInquilinos.setOpaque(false);
        DatosInquilinos.setPreferredSize(new java.awt.Dimension(500, 390));
        DatosInquilinos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel1.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel1.setText("ID Contrato:");
        DatosInquilinos.add(jLabel1);

        jTextIdContratoAlq.setBackground(new java.awt.Color(236, 226, 200));
        jTextIdContratoAlq.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jTextIdContratoAlq.setForeground(new java.awt.Color(51, 51, 51));
        jTextIdContratoAlq.setText(" ");
        jTextIdContratoAlq.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextIdContratoAlq.setPreferredSize(new java.awt.Dimension(165, 30));
        jTextIdContratoAlq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdContratoAlqActionPerformed(evt);
            }
        });
        DatosInquilinos.add(jTextIdContratoAlq);

        jLabel2.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel2.setText("ID Inmueble:");
        DatosInquilinos.add(jLabel2);

        jTextIDInmuebleContratoAlq.setBackground(new java.awt.Color(236, 226, 200));
        jTextIDInmuebleContratoAlq.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jTextIDInmuebleContratoAlq.setForeground(new java.awt.Color(51, 51, 51));
        jTextIDInmuebleContratoAlq.setText(" ");
        jTextIDInmuebleContratoAlq.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextIDInmuebleContratoAlq.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos.add(jTextIDInmuebleContratoAlq);

        jLabel3.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel3.setText("ID Inquilino");
        DatosInquilinos.add(jLabel3);

        jTextIDInquilinoContratoAlq.setBackground(new java.awt.Color(236, 226, 200));
        jTextIDInquilinoContratoAlq.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jTextIDInquilinoContratoAlq.setForeground(new java.awt.Color(51, 51, 51));
        jTextIDInquilinoContratoAlq.setText(" ");
        jTextIDInquilinoContratoAlq.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextIDInquilinoContratoAlq.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos.add(jTextIDInquilinoContratoAlq);

        getContentPane().add(DatosInquilinos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 1010, 40));

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

        jbRenovar.setBorder(null);
        jbRenovar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/modificar.png"))); // NOI18N
        jbRenovar.setText("RENOVAR");
        jbRenovar.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jbRenovar.setPreferredSize(new java.awt.Dimension(120, 30));
        jbRenovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRenovarActionPerformed(evt);
            }
        });
        jPanel1.add(jbRenovar);

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

        jbRescindir.setBorder(null);
        jbRescindir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/delete.png"))); // NOI18N
        jbRescindir.setText("RESCINIDIR");
        jbRescindir.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jbRescindir.setPreferredSize(new java.awt.Dimension(120, 30));
        jbRescindir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRescindirActionPerformed(evt);
            }
        });
        jPanel1.add(jbRescindir);

        jbGuardar.setBorder(null);
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/guardar.png"))); // NOI18N
        jbGuardar.setText("GUARDAR");
        jbGuardar.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jbGuardar.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel1.add(jbGuardar);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1000, 50));

        jbSalir.setBorder(null);
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/exits.png"))); // NOI18N
        jbSalir.setText(" SALIR");
        jbSalir.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jbSalir.setPreferredSize(new java.awt.Dimension(120, 30));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 610, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel11.setText("Detalles");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));


        jTextDetalles.setBackground(new java.awt.Color(236, 226, 200));
        jTextDetalles.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextDetalles.setForeground(new java.awt.Color(51, 51, 51));
        jTextDetalles.setText(" ");
        jTextDetalles.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextDetalles.setPreferredSize(new java.awt.Dimension(165, 30));
        getContentPane().add(jTextDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 450, -1));

        jLabel11.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel11.setText("Monto en Pesos:");
        DatosInquilinos1.add(jLabel11);

        jTextMontoPesosContratoAlq.setBackground(new java.awt.Color(236, 226, 200));
        jTextMontoPesosContratoAlq.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextMontoPesosContratoAlq.setForeground(new java.awt.Color(51, 51, 51));
        jTextMontoPesosContratoAlq.setBorder(null);
        jTextMontoPesosContratoAlq.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos1.add(jTextMontoPesosContratoAlq);

        jLabel12.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel12.setText("Fecha Inicio:");
        DatosInquilinos1.add(jLabel12);

        DatosInquilinos1.add(jDateChooserfechaInicio);
        jDateChooserfechaInicio.getAccessibleContext().setAccessibleParent(jDateChooserfechaInicio);

        jLabel13.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel13.setText("Fecha Fin:");
        DatosInquilinos1.add(jLabel13);

        DatosInquilinos1.add(jDateChooserfechaFin);
        jDateChooserfechaFin.getAccessibleContext().setAccessibleParent(jDateChooserfechaFin);

        getContentPane().add(DatosInquilinos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 1000, 40));

        jLabelDetalles.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabelDetalles.setText("Detalles:");
        getContentPane().add(jLabelDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jTextFielddetalle.setBackground(new java.awt.Color(255, 204, 255));
        getContentPane().add(jTextFielddetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 440, -1));


        jLabel14.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel14.setText("Estado:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, -1, -1));

        jTextestado.setBackground(new java.awt.Color(236, 226, 200));
        jTextestado.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jTextestado.setForeground(new java.awt.Color(51, 51, 51));
        jTextestado.setText(" ");
        jTextestado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextestado.setPreferredSize(new java.awt.Dimension(30, 30));
        getContentPane().add(jTextestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, -1, -1));

        jLabelListaContratosXestado.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabelListaContratosXestado.setText("LISTA DE CONTRATOS SEGUN SU ESTADO");
        getContentPane().add(jLabelListaContratosXestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, -1, -1));

        jButtonContratosDadosDeBaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/buscar-interna.png"))); // NOI18N
        jButtonContratosDadosDeBaja.setText("CONTRATOS DADOS DE BAJA");
        jButtonContratosDadosDeBaja.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonContratosDadosDeBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContratosDadosDeBajaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonContratosDadosDeBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, -1, -1));

        jBugttonContratosActivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/buscar-interna.png"))); // NOI18N
        jBugttonContratosActivos.setText("CONTRATOS VIGENTES");
        jBugttonContratosActivos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBugttonContratosActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBugttonContratosActivosActionPerformed(evt);
            }
        });
        getContentPane().add(jBugttonContratosActivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        jButtonContratosRenovados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/buscar-interna.png"))); // NOI18N
        jButtonContratosRenovados.setText("CONTRATOS RENOVADOS");
        jButtonContratosRenovados.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonContratosRenovados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContratosRenovadosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonContratosRenovados, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, -1, -1));

        jTableContratos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableContratos);

        jScrollPane1.setViewportView(jScrollPane2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 690, 220));

        jDateChooserfechaFin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jDateChooserfechaFin.setPreferredSize(new java.awt.Dimension(95, 22));
        getContentPane().add(jDateChooserfechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, 160, -1));

        jLabel13.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel13.setText("Fecha Fin:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, -1, -1));

        jDateChooserfechaInicio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jDateChooserfechaInicio.setPreferredSize(new java.awt.Dimension(95, 22));
        getContentPane().add(jDateChooserfechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 160, -1));

        jLabel12.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel12.setText("Fecha Inicio:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        jTextMontoPesosContratoAlq.setBackground(new java.awt.Color(236, 226, 200));
        jTextMontoPesosContratoAlq.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jTextMontoPesosContratoAlq.setForeground(new java.awt.Color(51, 51, 51));
        jTextMontoPesosContratoAlq.setText(" ");
        jTextMontoPesosContratoAlq.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextMontoPesosContratoAlq.setPreferredSize(new java.awt.Dimension(165, 30));
        getContentPane().add(jTextMontoPesosContratoAlq, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        jLabel16.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel16.setText("Monto en Pesos:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        try {

            if (jTextDetalles.getText().isEmpty() || jTextIDInquilinoContratoAlq.getText().isEmpty() || jDateChooserfechaInicio.getDate() == null
                    || jDateChooserfechaFin.getDate() == null || jTextMontoPesosContratoAlq.getText().isEmpty()
                    || jTextIDInmuebleContratoAlq.getText().isEmpty() || jTextestado.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "debe completar todos los campos");

            } //            
            else if (!jDateChooserfechaInicio.getDate().after(Date.valueOf(LocalDate.now()))) {
                JOptionPane.showMessageDialog(this, "la fecha no puede ser puede ser anterior a la fecha de hoy");
            } else if (!jDateChooserfechaFin.getDate().after(Date.valueOf(LocalDate.now()))) {
                JOptionPane.showMessageDialog(this, "la fecha no puede ser puede ser anterior a la fecha de hoy");

            } else if (!jTextestado.getText().equalsIgnoreCase("0") && !jTextestado.getText().equalsIgnoreCase("1") && !jTextestado.getText().equalsIgnoreCase("2")) {

                JOptionPane.showMessageDialog(this, " el estado solo puede ser 0,1,2");
            } else {
                contrato = new ContratoAlquiler(inquilino.buscarInquilinoPorid(Integer.parseInt(jTextIDInquilinoContratoAlq.getText())),
                        jDateChooserfechaInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                        jDateChooserfechaFin.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                        Double.parseDouble(jTextMontoPesosContratoAlq.getText()),
                        propiedad.buscarInmuebleXid(Integer.parseInt(jTextIDInmuebleContratoAlq.getText())),
                        jTextDetalles.getText(), jTextestado.getText());

                contratodata.crearContrato(contrato);
                limpiar();
            }
        }//GEN-LAST:event_jbtnAñadirActionPerformed
        catch (NumberFormatException r) {
            JOptionPane.showMessageDialog(this, "debe poner valores correctos");
        } catch (NullPointerException r) {
//    JOptionPane.showMessageDialog(this, "no exiteeeeeeeeeeeeeeee" );

        }
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        if (jTextIdContratoAlq.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "introduzca un idcontrato para buscar");

        } else {
            try {
                ContratoAlquiler contrato = contratodata.buscarcontratoporid(Integer.parseInt(jTextIdContratoAlq.getText()));
               jTextIDInmuebleContratoAlq.setText(contrato.getIdpropiedad().getIdInmueble() + "");
                //jTextIDInmuebleContratoAlq.setText(String.valueOf(contrato.getId_contrato()));
                jTextIDInquilinoContratoAlq.setText(contrato.getInquilino().getId_inquilino() + "");
                //jTextIDInquilinoContratoAlq.setText(String.valueOf(contrato.getInquilino()));
                jTextMontoPesosContratoAlq.setText(contrato.getMontoAlquilerPesos() + "");
                jDateChooserfechaFin.setDate(Date.valueOf(contrato.getFechaFinal()));
                jDateChooserfechaInicio.setDate(Date.valueOf(contrato.getFechaInicio()));
                jTextestado.setText(contrato.getEstado());
                jTextDetalles.setText(contrato.getDetalles());

            } catch (NumberFormatException r) {

                JOptionPane.showMessageDialog(this, "introduzca un id formato numero");
            } catch (NullPointerException r) {
            }
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbRescindirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRescindirActionPerformed
if (jTextIdContratoAlq.getText().isEmpty() ){
            JOptionPane.showMessageDialog(this, "introduzca un idcontrato que quiere rescindir");
              
       
        }
        else {contratodata.rescindirContrato(Integer.parseInt(jTextIdContratoAlq.getText()));
        }
    }//GEN-LAST:event_jbRescindirActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        jTextIdContratoAlq.setText(null);
        jTextIDInmuebleContratoAlq.setText(null);
        jTextIDInquilinoContratoAlq.setText(null);
        jTextMontoPesosContratoAlq.setText(null);
        jDateChooserfechaFin.setDate(null);
        jDateChooserfechaInicio.setDate(null);
        jTextestado.setText(null);
        jTextDetalles.setText(null);
        
       borrarFilaTabla();

    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jTextIdContratoAlqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdContratoAlqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdContratoAlqActionPerformed

    private void jButtonContratosDadosDeBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContratosDadosDeBajaActionPerformed
        borrarFilaTabla();
        cargarcontratosrenovados();
    }//GEN-LAST:event_jButtonContratosDadosDeBajaActionPerformed

    private void jbRenovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRenovarActionPerformed
       if ( jTextIdContratoAlq.getText().isEmpty()){
            
            JOptionPane.showInternalMessageDialog(this, "no hay contrato en los campos" );
        }
        else {
            
            contratodata.renovarContrato(jDateChooserfechaInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                    jDateChooserfechaFin.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), 
                    Double.parseDouble(jTextMontoPesosContratoAlq.getText().trim()),Integer.parseInt(jTextIdContratoAlq.getText().trim()));
            jTextestado.setText("2");
        }
        borrarFilaTabla();
    }//GEN-LAST:event_jbRenovarActionPerformed

    private void jBugttonContratosActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBugttonContratosActivosActionPerformed
       borrarFilaTabla();
        cargarcontratosvigentes();
    }//GEN-LAST:event_jBugttonContratosActivosActionPerformed

    private void jButtonContratosRenovadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContratosRenovadosActionPerformed
        borrarFilaTabla();
        cargarcontratosrescindidos();
    }//GEN-LAST:event_jButtonContratosRenovadosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DatosInquilinos;
    private javax.swing.JLabel Titulo;

    private inmobiliaria23.entidades.BotonNegro jBugttonContratosActivos;
    private inmobiliaria23.entidades.BotonNegro jButtonContratosDadosDeBaja;
    private inmobiliaria23.entidades.BotonNegro jButtonContratosRenovados;
    private com.toedter.calendar.JDateChooser jDateChooserfechaFin;
    private com.toedter.calendar.JDateChooser jDateChooserfechaInicio;

    private org.netbeans.modules.form.InvalidComponent jDateChooserfechaFin;
    private org.netbeans.modules.form.InvalidComponent jDateChooserfechaInicio;

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelListaContratosXestado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableContratos;
    private javax.swing.JTextField jTextDetalles;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextIDInmuebleContratoAlq;
    private javax.swing.JTextField jTextIDInquilinoContratoAlq;
    private javax.swing.JTextField jTextIdContratoAlq;
    private javax.swing.JTextField jTextMontoPesosContratoAlq;
    private javax.swing.JTextField jTextestado;
    private inmobiliaria23.entidades.BotonNegro jbBuscar;
    private inmobiliaria23.entidades.BotonVerde jbGuardar;
    private inmobiliaria23.entidades.BotonNegro jbLimpiar;
    private inmobiliaria23.entidades.BotonNegro jbNuevo;
    private inmobiliaria23.entidades.BotonNegro jbRenovar;
    private inmobiliaria23.entidades.BotonRojo jbRescindir;
    private inmobiliaria23.entidades.BotonAzul jbSalir;
    // End of variables declaration//GEN-END:variables
public void limpiar() {
        jTextIdContratoAlq.setText(null);
        jTextIDInmuebleContratoAlq.setText(null);
        jTextIDInquilinoContratoAlq.setText(null);
        jTextMontoPesosContratoAlq.setText(null);
        jDateChooserfechaInicio.setDate(null);
        jDateChooserfechaFin.setDate(null);
        jTextDetalles.setText(null);
        jTextestado.setText(null);
}

private void armarCabecera() {
        modelo.addColumn("IDcontrato");
        modelo.addColumn("IDinmueble");
        modelo.addColumn("IDinquilino");
        modelo.addColumn("Precio");
        modelo.addColumn("Fecha de inico");
        modelo.addColumn("Vencimiento");
        modelo.addColumn("Detalles");
        modelo.addColumn("Estado");
        jTableContratos.setModel(modelo);
        JTableHeader tableHeader = jTableContratos.getTableHeader();
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) tableHeader.getDefaultRenderer();
       headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
}
 private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);

        }
 }
 private void cargarcontratosvigentes() {
//    borrarFilaTabla();
        
        contratoslista = (List) contratodata.listarContratosVigentes(1);
        for (ContratoAlquiler m : contratoslista) {
            modelo.addRow(new Object[]{m.getId_contrato(), m.getIdpropiedad().getIdInmueble(), m.getInquilino().getId_inquilino(),m.getMontoAlquilerPesos(),m.getFechaInicio(),m.getFechaFinal(),m.getDetalles(),m.getEstado()});
        }
 }
 
 private void cargarcontratosrescindidos() {
//    borrarFilaTabla();
        
        contratoslista = (List) contratodata.listarContratosVigentes(0);
        for (ContratoAlquiler m : contratoslista) {
            modelo.addRow(new Object[]{m.getId_contrato(), m.getIdpropiedad(), m.getInquilino(),m.getMontoAlquilerPesos(),m.getFechaInicio(),m.getFechaFinal(),m.getDetalles(),m.getEstado()});
        }
}
 private void cargarcontratosrenovados() {
//    borrarFilaTabla();
        
        contratoslista = (List) contratodata.listarContratosVigentes(2);
        for (ContratoAlquiler m : contratoslista) {
            modelo.addRow(new Object[]{m.getId_contrato(), m.getIdpropiedad(), m.getInquilino(),m.getMontoAlquilerPesos(),m.getFechaInicio(),m.getFechaFinal(),m.getDetalles(),m.getEstado()});
        }
}
 
}
