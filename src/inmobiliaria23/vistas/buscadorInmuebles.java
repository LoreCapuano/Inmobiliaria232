package inmobiliaria23.vistas;

import inmobiliaria23.entidades.InternaljFrameImagen;
import inmobiliaria23.entidades.panelesImagenes;
import java.awt.Image;

/**
 *
 * @author Administrador
 */
public class buscadorInmuebles extends InternaljFrameImagen {
    
    private panelesImagenes pi = new panelesImagenes();
    
    public buscadorInmuebles() {
        initComponents();
        this.setSize(1024, 770);
        
        this.setImage("/inmobiliaria23/recursos/FondoMadera.jpg");
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

        jTextID = new javax.swing.JTextField();
        Titulo = new javax.swing.JLabel();
        DatosInquilinos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextIdContratoAlq = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextIDInmuebleContratoAlq = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnBuscarInmuebles = new inmobiliaria23.entidades.BotonVerde();
        botonAzul1 = new inmobiliaria23.entidades.BotonAzul();
        DatosInquilinos1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextFechaIniContratoAlq1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFechaFinContratoAlq1 = new javax.swing.JTextField();
        DatosInquilinos2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextIDInquilinoContratoAlq1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextMontoPesosContratoAlq1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

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
        Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/seek.png"))); // NOI18N
        Titulo.setText("Buscador de Inmuebles Disponibles");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        DatosInquilinos.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        DatosInquilinos.setOpaque(false);
        DatosInquilinos.setPreferredSize(new java.awt.Dimension(500, 390));
        DatosInquilinos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel1.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel1.setText("ID:");
        DatosInquilinos.add(jLabel1);

        jTextIdContratoAlq.setBackground(new java.awt.Color(236, 226, 200));
        jTextIdContratoAlq.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextIdContratoAlq.setForeground(new java.awt.Color(51, 51, 51));
        jTextIdContratoAlq.setText(" ");
        jTextIdContratoAlq.setBorder(null);
        jTextIdContratoAlq.setPreferredSize(new java.awt.Dimension(165, 30));
        jTextIdContratoAlq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdContratoAlqActionPerformed(evt);
            }
        });
        DatosInquilinos.add(jTextIdContratoAlq);

        jLabel2.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel2.setText("Uso de Local:");
        DatosInquilinos.add(jLabel2);

        jTextIDInmuebleContratoAlq.setBackground(new java.awt.Color(236, 226, 200));
        jTextIDInmuebleContratoAlq.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextIDInmuebleContratoAlq.setForeground(new java.awt.Color(51, 51, 51));
        jTextIDInmuebleContratoAlq.setText(" ");
        jTextIDInmuebleContratoAlq.setBorder(null);
        jTextIDInmuebleContratoAlq.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos.add(jTextIDInmuebleContratoAlq);

        getContentPane().add(DatosInquilinos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 180, 140));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        btnBuscarInmuebles.setBorder(null);
        btnBuscarInmuebles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/buscar-interna.png"))); // NOI18N
        btnBuscarInmuebles.setText("BUSCAR");
        btnBuscarInmuebles.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        btnBuscarInmuebles.setPreferredSize(new java.awt.Dimension(120, 30));
        btnBuscarInmuebles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarInmueblesActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarInmuebles);

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
        jPanel1.add(botonAzul1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 1000, 50));

        DatosInquilinos1.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        DatosInquilinos1.setOpaque(false);
        DatosInquilinos1.setPreferredSize(new java.awt.Dimension(500, 390));
        DatosInquilinos1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel12.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel12.setText("Zona:");
        DatosInquilinos1.add(jLabel12);

        jTextFechaIniContratoAlq1.setBackground(new java.awt.Color(236, 226, 200));
        jTextFechaIniContratoAlq1.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextFechaIniContratoAlq1.setForeground(new java.awt.Color(51, 51, 51));
        jTextFechaIniContratoAlq1.setText(" ");
        jTextFechaIniContratoAlq1.setBorder(null);
        jTextFechaIniContratoAlq1.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos1.add(jTextFechaIniContratoAlq1);

        jLabel13.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel13.setText("Otros:");
        DatosInquilinos1.add(jLabel13);

        jTextFechaFinContratoAlq1.setBackground(new java.awt.Color(236, 226, 200));
        jTextFechaFinContratoAlq1.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextFechaFinContratoAlq1.setForeground(new java.awt.Color(51, 51, 51));
        jTextFechaFinContratoAlq1.setText(" ");
        jTextFechaFinContratoAlq1.setBorder(null);
        jTextFechaFinContratoAlq1.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos1.add(jTextFechaFinContratoAlq1);

        getContentPane().add(DatosInquilinos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 180, 140));

        DatosInquilinos2.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        DatosInquilinos2.setOpaque(false);
        DatosInquilinos2.setPreferredSize(new java.awt.Dimension(500, 390));
        DatosInquilinos2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel8.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel8.setText("Superficie Mínima:");
        DatosInquilinos2.add(jLabel8);

        jTextIDInquilinoContratoAlq1.setBackground(new java.awt.Color(236, 226, 200));
        jTextIDInquilinoContratoAlq1.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextIDInquilinoContratoAlq1.setForeground(new java.awt.Color(51, 51, 51));
        jTextIDInquilinoContratoAlq1.setText(" ");
        jTextIDInquilinoContratoAlq1.setBorder(null);
        jTextIDInquilinoContratoAlq1.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos2.add(jTextIDInquilinoContratoAlq1);

        jLabel11.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel11.setText("Valor Estimado:");
        DatosInquilinos2.add(jLabel11);

        jTextMontoPesosContratoAlq1.setBackground(new java.awt.Color(236, 226, 200));
        jTextMontoPesosContratoAlq1.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextMontoPesosContratoAlq1.setForeground(new java.awt.Color(51, 51, 51));
        jTextMontoPesosContratoAlq1.setText(" ");
        jTextMontoPesosContratoAlq1.setBorder(null);
        jTextMontoPesosContratoAlq1.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos2.add(jTextMontoPesosContratoAlq1);

        getContentPane().add(DatosInquilinos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 180, 140));

        jLabel14.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel14.setText("Imagen miniatura:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/sinimagen.jpg"))); // NOI18N
        jPanel2.add(jLabel6);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 340, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAzul1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAzul1ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_botonAzul1ActionPerformed

    private void jTextIdContratoAlqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdContratoAlqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdContratoAlqActionPerformed

    private void btnBuscarInmueblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarInmueblesActionPerformed
        mensajeBuscar buscarInmueble = new mensajeBuscar(null, true);
        buscarInmueble.setVisible(true);
    }//GEN-LAST:event_btnBuscarInmueblesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DatosInquilinos;
    private javax.swing.JPanel DatosInquilinos1;
    private javax.swing.JPanel DatosInquilinos2;
    private javax.swing.JLabel Titulo;
    private inmobiliaria23.entidades.BotonAzul botonAzul1;
    private inmobiliaria23.entidades.BotonVerde btnBuscarInmuebles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFechaFinContratoAlq1;
    private javax.swing.JTextField jTextFechaIniContratoAlq1;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextIDInmuebleContratoAlq;
    private javax.swing.JTextField jTextIDInquilinoContratoAlq1;
    private javax.swing.JTextField jTextIdContratoAlq;
    private javax.swing.JTextField jTextMontoPesosContratoAlq1;
    // End of variables declaration//GEN-END:variables
}
