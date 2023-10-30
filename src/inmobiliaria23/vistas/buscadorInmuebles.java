package inmobiliaria23.vistas;

import inmobiliaria23.accesoAdatos.*;
import inmobiliaria23.entidades.InternaljFrameImagen;
import inmobiliaria23.entidades.PropiedadInmueble;
import inmobiliaria23.entidades.panelesImagenes;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Administrador
 */
public class buscadorInmuebles extends InternaljFrameImagen {

    private panelesImagenes pi = new panelesImagenes();
    private PropiedadInmueble al = new PropiedadInmueble();
    private PropiedadInmuebleData PropieData = new PropiedadInmuebleData();
    private List<PropiedadInmueble> ListarInmuebles = new ArrayList<>();

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int col) {

            return false;

        }
    };

    public buscadorInmuebles() {
        initComponents();
        PropieData = new PropiedadInmuebleData();
        ListarInmuebles = PropieData.listarInmuebles();
        modelo = new DefaultTableModel();
        //insData = new InscripcionData();

        cargarComboTipo();
        cargarComboZona();
        armarCabecera();
        this.setSize(1024, 770);
        this.setImage("/inmobiliaria23/recursos/fondoMadera.jpg");
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextID = new javax.swing.JTextField();
        Titulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnActualizar = new inmobiliaria23.entidades.BotonVerde();
        botonAzul1 = new inmobiliaria23.entidades.BotonAzul();
        jLabel14 = new javax.swing.JLabel();
        ListadInmuebles = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Listados = new javax.swing.JTable();
        CombosPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxZona = new javax.swing.JComboBox<>();
        RangMinRangMax = new javax.swing.JPanel();
        spinnerRangoMin = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        spinnerRangoMax = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        spinnerSuperficie = new javax.swing.JSpinner();

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

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        btnActualizar.setBorder(null);
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/buscar-interna.png"))); // NOI18N
        btnActualizar.setText("BUSCAR");
        btnActualizar.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        btnActualizar.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel1.add(btnActualizar);

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 1000, 50));

        jLabel14.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel14.setText("Listados Inmuebles:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        Listados.setFont(new java.awt.Font("Roboto Cn", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(Listados);

        javax.swing.GroupLayout ListadInmueblesLayout = new javax.swing.GroupLayout(ListadInmuebles);
        ListadInmuebles.setLayout(ListadInmueblesLayout);
        ListadInmueblesLayout.setHorizontalGroup(
            ListadInmueblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListadInmueblesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 948, Short.MAX_VALUE)
                .addContainerGap())
        );
        ListadInmueblesLayout.setVerticalGroup(
            ListadInmueblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListadInmueblesLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(ListadInmuebles, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 960, 290));

        CombosPrincipal.setBackground(new java.awt.Color(51, 51, 51));
        CombosPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true), "Seleccionar los Itemes a buscar", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Roboto Bk", 1, 14), new java.awt.Color(255, 0, 51))); // NOI18N
        CombosPrincipal.setFont(new java.awt.Font("Roboto Cn", 0, 12)); // NOI18N
        CombosPrincipal.setOpaque(false);
        CombosPrincipal.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 5));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setText("Tipo:");
        CombosPrincipal.add(jLabel1);

        jComboBoxTipo.setFont(new java.awt.Font("Roboto Cn", 0, 12)); // NOI18N
        jComboBoxTipo.setToolTipText("");
        jComboBoxTipo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jComboBoxTipo.setPreferredSize(new java.awt.Dimension(110, 26));
        jComboBoxTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxTipoItemStateChanged(evt);
            }
        });
        CombosPrincipal.add(jComboBoxTipo);

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setText("Zona");
        CombosPrincipal.add(jLabel2);

        jComboBoxZona.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jComboBoxZona.setPreferredSize(new java.awt.Dimension(110, 26));
        jComboBoxZona.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxZonaItemStateChanged(evt);
            }
        });
        CombosPrincipal.add(jComboBoxZona);

        RangMinRangMax.setFont(new java.awt.Font("Roboto Cn", 0, 12)); // NOI18N
        RangMinRangMax.setOpaque(false);
        RangMinRangMax.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 5));
        CombosPrincipal.add(RangMinRangMax);

        getContentPane().add(CombosPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 440, 100));

        spinnerRangoMin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(spinnerRangoMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 110, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("Rango Min:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("Rango Max:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        spinnerRangoMax.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(spinnerRangoMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 110, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Superficie:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        spinnerSuperficie.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(spinnerSuperficie, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAzul1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAzul1ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_botonAzul1ActionPerformed

    private void jComboBoxTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxTipoItemStateChanged

       if (evt.getStateChange() == ItemEvent.SELECTED) {
            String tipoSeleccionado = (String) jComboBoxTipo.getSelectedItem();
            PropiedadInmueble propiedadSeleccionada = tipoToPropiedadInmueble.get(tipoSeleccionado);
            cargarTipo();
        }

    }//GEN-LAST:event_jComboBoxTipoItemStateChanged

    private void jComboBoxZonaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxZonaItemStateChanged
         if (evt.getStateChange() == ItemEvent.SELECTED) {
            String tipoSeleccionado = (String) jComboBoxZona.getSelectedItem();
            PropiedadInmueble propiedadSeleccionada = zonaToPropiedadInmueble.get(tipoSeleccionado);
            cargarTipo();
        }
    }//GEN-LAST:event_jComboBoxZonaItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CombosPrincipal;
    private javax.swing.JPanel ListadInmuebles;
    private javax.swing.JTable Listados;
    private javax.swing.JPanel RangMinRangMax;
    private javax.swing.JLabel Titulo;
    private inmobiliaria23.entidades.BotonAzul botonAzul1;
    private inmobiliaria23.entidades.BotonVerde btnActualizar;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JComboBox<String> jComboBoxZona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextID;
    private javax.swing.JSpinner spinnerRangoMax;
    private javax.swing.JSpinner spinnerRangoMin;
    private javax.swing.JSpinner spinnerSuperficie;
    // End of variables declaration//GEN-END:variables


// En tu clase, antes de cargar el JComboBox
    private Map<String, PropiedadInmueble> tipoToPropiedadInmueble = new HashMap<>();
    private Map<String, PropiedadInmueble> zonaToPropiedadInmueble = new HashMap<>();

    //CargaComboTipo inicio
    public void cargarComboTipo() {
        jComboBoxTipo.removeAllItems(); // Elimina todos los elementos existentes en el JComboBox

        Set<String> tipos = new TreeSet<>(); // Utiliza un TreeSet para mantenerlos en orden alfabético

        for (PropiedadInmueble item : ListarInmuebles) {
            String tipo = item.getTipoDeLocal();
            tipos.add(tipo); // Agrega el tipo al conjunto
            tipoToPropiedadInmueble.put(tipo, item); // Asocia el tipo con el objeto PropiedadInmueble
        }

        for (String tipo : tipos) {
            jComboBoxTipo.addItem(tipo); // Agrega los tipos al JComboBox en orden alfabético
        }

        jComboBoxTipo.setSelectedIndex(-1);
    }

    //CargaComboTipo fin
    //-----------------------
    //CargaComboZona inicio
    public void cargarComboZona() {
        jComboBoxZona.removeAllItems(); // Elimina todos los elementos existentes en el JComboBox

        Set<String> zonas = new TreeSet<>(); // Utiliza un TreeSet para mantenerlos en orden alfabético

        for (PropiedadInmueble item : ListarInmuebles) {
            String zona = item.getZona();
            zonas.add(zona); // Agrega el tipo al conjunto
            zonaToPropiedadInmueble.put(zona, item); // Asocia el tipo con el objeto PropiedadInmueble
        }

        for (String zona : zonas) {
            jComboBoxZona.addItem(zona); // Agrega los tipos al JComboBox en orden alfabético
        }

        jComboBoxZona.setSelectedIndex(-1);
    }
    //CargaComboZona inicio
    //---------------------------


//    public void cargarComboTipo(){
//        for (Tipo tipo: Tipo.values()){
//            jComboBoxTipo.addItem(tipo.name());
//            
//        }
//    }
    private void armarCabecera() {
        modelo.addColumn("Tipo Local");
        modelo.addColumn("Dirección");
        modelo.addColumn("Zona");
        modelo.addColumn("Superficie");
        modelo.addColumn("Precio base");
        modelo.addColumn("Características");
        modelo.addColumn("Accesibilidad");
       Listados.setModel(modelo);
        JTableHeader tableHeader = Listados.getTableHeader();
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) tableHeader.getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
    }

    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);

        }   }
//Carga la tabla Tipo

      private void cargarTipo() {

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        String tipoSeleccionado = (String) jComboBoxTipo.getSelectedItem();
        PropiedadInmueble selecc = tipoToPropiedadInmueble.get(tipoSeleccionado);

        if (selecc != null) {
            List<PropiedadInmueble> ListaTipo = PropieData.listarInmueblesDisponiblesXTipo(selecc.getTipoDeLocal());
            for (PropiedadInmueble m : ListaTipo) {
                modelo.addRow(new Object[]{m.getTipoDeLocal(), m.getDireccion(), m.getZona(), m.getSuperficie(), m.getPrecioTasado(), m.getCaracteristicas(), m.getAccesibilidad()});
            }
        }

    }

    //Carga la tabla 
    private void cargarTipoZona() {

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        String tipoSeleccionado = (String) jComboBoxZona.getSelectedItem();
        PropiedadInmueble selecc = zonaToPropiedadInmueble.get(tipoSeleccionado);

        if (selecc != null) {
            List<PropiedadInmueble> ListaTipo = PropieData.buscarInmueblesPorZona(selecc.getZona());
            for (PropiedadInmueble m : ListaTipo) {
                modelo.addRow(new Object[]{m.getTipoDeLocal(), m.getDireccion(), m.getZona(), m.getSuperficie(), m.getPrecioTasado(), m.getCaracteristicas(), m.getAccesibilidad()});
            }
        }

    }
}
